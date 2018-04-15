package FastIO;

import java.io.*;

public class input
{
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public input()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public input(InputStream inputStream){
        din = new DataInputStream(inputStream);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public input(String file_name)
    {
        try {
            din = new DataInputStream(new FileInputStream(file_name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String nextLine()
    {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1)
        {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt()
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
        {
            ret = ret * 10 + c - '0';
        }  while ((c = read()) >= '0' && c <= '9');

        if (neg)
            return -ret;
        return ret;
    }

    public long nextLong()
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }

    public double nextDouble()
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();

        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');

        if (c == '.')
        {
            while ((c = read()) >= '0' && c <= '9')
            {
                ret += (c - '0') / (div *= 10);
            }
        }

        if (neg)
            return -ret;
        return ret;
    }

    public int[] nextIntArray(int size) {
        int[] ret = new int[size];
        for (int i = 0; i < size; i++) {
            ret[i] = nextInt();
        }
        return ret;
    }

    public char[] nextCharArray(int size) {
        char[] ret = new char[size];
        String str = nextLine();
        int i=0;
        int j=0;
        while(size>j){
            if (str.charAt(i)!=' '){
                ret[j]=str.charAt(i);
                j++;
            }
            i++;
        }
        return ret;
    }

    public long[] nextLongArray(int size) {
        long[] ret = new long[size];
        for (int i = 0; i < size; i++) {
            ret[i] = nextLong();
        }
        return ret;
    }

    public double[] nextDoubleArray(int size) {
        double[] ret = new double[size];
        for (int i = 0; i < size; i++) {
            ret[i] = nextDouble();
        }
        return ret;
    }

    public String[] nextStringArray() {
        String[] ret = nextLine().split(" ");
        return ret;
    }

    public int[][] nextIntMatrix(int n, int m) {
        int[][] ret = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ret[i][j] = nextInt();
            }
        }
        return ret;
    }

    public char[][] nextCharMatrix(int n, int m) {
        char[][] ret = new char[n][m];
        for (int i = 0; i < n; i++) {
            ret[i] = nextCharArray(m);
        }
        return ret;
    }

    public double[][] nextDoubleMatrix(int n, int m) {
        double[][] ret = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ret[i][j] = nextDouble();
            }
        }
        return ret;
    }

    public long[][] nextLongMatrix(int n, int m) {
        long[][] ret = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ret[i][j] = nextLong();
            }
        }
        return ret;
    }

    public String[][] nextStringMatrix(int n, int m) {
        String[][] ret = new String[n][m];
        for (int i = 0; i < n; i++) {
            ret[i] = nextStringArray();
        }
        return ret;
    }

    private void fillBuffer()
    {
        try {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bytesRead == -1)
            buffer[0] = -1;
    }

    private byte read()
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }

    public void close()
    {
        if (din == null)
            return;
        try {
            din.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}