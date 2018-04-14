import java.io.*;
import java.util.*;

/**
 * @author Bhanuka Rathnayaka
 */

public class Main {
    static class output {
        private final PrintWriter writer;
        public output(OutputStream outputStream){ writer=new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream))); }
        public output(Writer writer){ this.writer=new PrintWriter(writer);}
        public void print(Object... objects){ for(int i=0;i<objects.length;i++){ if(i!=0){ writer.print(' ');} writer.print(objects[i]);}}
        public void println(Object... objects){ print(objects); writer.println();}
        public void print(int[] array){ for(int i=0; i<array.length; i++){ print(array[i] + " ");} println();}
        public void print(char[] array){ for(int i=0; i<array.length; i++){ print(array[i] + " ");} println();}
        public void print(int[][] array){ for(int i=0; i<array.length; i++){ for(int j=0; j<array[0].length; j++){ print(array[i][j] + " ");} println();} println();}
        public void print(char[][] array){ for(int i=0; i<array.length; i++){ for(int j=0; j<array[i].length; j++){ print(array[i][j] + " ");} println();} println();}
        public void close(){ writer.close();}
    }

    static class input{
        final private int BUFFER_SIZE = 1 << 16; private DataInputStream din; private byte[] buffer; private int bufferPointer, bytesRead;
		public input(){ din = new DataInputStream(System.in); buffer = new byte[BUFFER_SIZE]; bufferPointer = bytesRead = 0;}
		public input(InputStream inputStream){ din = new DataInputStream(inputStream); buffer = new byte[BUFFER_SIZE]; bufferPointer = bytesRead = 0;}
		public input(String file_name){ try{ din = new DataInputStream(new FileInputStream(file_name));} catch (FileNotFoundException e){ e.printStackTrace();} buffer = new byte[BUFFER_SIZE]; bufferPointer = bytesRead = 0;}
		public String nextLine(){ byte[] buf = new byte[64]; int cnt = 0, c; while ((c = read()) != -1){ if (c == '\n') break; buf[cnt++] = (byte) c;} return new String(buf, 0, cnt);}
		public int nextInt(){ int ret = 0; byte c = read(); while (c<=' ') c=read(); boolean neg=(c=='-'); if (neg) c=read(); do{ ret=ret*10+c - '0';} while ((c=read())>='0' && c<='9'); if(neg) return -ret; return ret;}
		public long nextLong(){ long ret=0; byte c=read(); while(c<=' ') c = read(); boolean neg = (c == '-'); if(neg) c = read(); do{ ret=ret*10+c-'0';}while((c=read())>='0' && c<='9');if(neg) return -ret;return ret;}
		public double nextDouble(){ double ret = 0, div = 1; byte c = read(); while (c <= ' ') c=read(); boolean neg = (c == '-'); if(neg) c = read(); do{ ret = ret * 10 + c - '0';}while ((c = read()) >= '0' && c <= '9');if(c == '.'){while ((c = read()) >= '0' && c <= '9'){ret += (c - '0') / (div *= 10);}}if(neg) return -ret; return ret;}
		public int[] nextIntArray(int size){ int[] ret=new int[size]; for (int i=0; i<size; i++){ ret[i]=nextInt();} return ret;}
		public long[] nextLongArray(int size){ long[] ret=new long[size]; for (int i=0; i<size; i++){ ret[i]=nextLong();} return ret;}
		public char[] nextCharArray(int size){ char[] ret=new char[size]; String str=nextLine(); int i=0; int j=0; while (size>j){ if(str.charAt(i) !=' '){ ret[j]=str.charAt(i); j++;} i++;} return ret;}
		public int[][] nextIntMatrix(int n, int m){ int[][] ret=new int[n][m]; for (int i=0; i<n; i++){ for (int j=0; j<m; j++){ ret[i][j]=nextInt();} } return ret;}
		public long[][] nextLongMatrix(int n, int m){ long[][] ret=new long[n][m]; for (int i=0; i<n; i++){ for (int j=0; j<m; j++){ ret[i][j]=nextLong();} } return ret;}
		public char[][] nextCharMatrix(int n, int m){ char[][] ret=new char[n][m]; for (int i=0; i<n; i++){ ret[i]=nextCharArray(m);} return ret;}
		private void fillBuffer(){ try{ bytesRead=din.read(buffer, bufferPointer=0, BUFFER_SIZE);} catch (IOException e){ e.printStackTrace();} if(bytesRead==-1) buffer[0]=-1;}
		private byte read(){ if(bufferPointer==bytesRead) fillBuffer(); return buffer[bufferPointer++];}
		public void close(){ if(din==null) return; try{ din.close();} catch (IOException e){ e.printStackTrace();}}
	}
 
	public static void main(String[] args){ InputStream inputStream=System.in; OutputStream outputStream=System.out; input in=new input(inputStream); output out=new output(outputStream); Solution solver=new Solution(); solver.solve(in, out); out.close();} 
 
	static class Solution{ private int in(int[] nums, int target){ for (int i=0; i<nums.length; i++) if(nums[i]==target) return i; return -1; } 
		private int in(long[] nums, long target){ for (int i=0; i<nums.length; i++) if(nums[i]==target) return i; return -1; } 
		private int in(char[] nums, char target){ for (int i=0; i<nums.length; i++) if(nums[i]==target) return i; return -1; } 
		private int in(String[] nums, String target){ for (int i=0; i<nums.length; i++) if(nums[i].equals(target)) return i; return -1; } 
		private int in(double[] nums, double target){ for (int i=0; i<nums.length; i++) if(nums[i]==target) return i; return -1; } 
		private int in(float[] nums, float target){ for (int i=0; i<nums.length; i++) if(nums[i]==target) return i; return -1; } 
		private int sum(int[] arr){ int total=0; for (int i=0; i<arr.length; i++) total+=arr[i]; return total; } 
		private long sum(long[] arr){ long total=0; for (int i=0; i<arr.length; i++) total+=arr[i]; return total; } 
		private float sum(float[] arr){ float total=0; for (int i=0; i<arr.length; i++) total+=arr[i]; return total; } 
		private double sum(double[] arr){ double total=0; for (int i=0; i<arr.length; i++) total+=arr[i]; return total; } 
		private int min(int num1, int num2){ if(num1>=num2) return num2; return num1; } 
		private long min(long num1, long num2){ if(num1>num2) return num2; return num1; } 
		private float min(float num1, float num2){ if(num1>num2) return num2; return num1; } 
		private double min(double num1, double num2){ if(num1>num2) return num2; return num1; } 
		private int min(int[] arr){ int minimum=arr[0]; for (int i=1; i<arr.length; i++) min(arr[i-1], arr[i]); return minimum; } 
		private long min(long[] arr){ long minimum=arr[0]; for (int i=1; i<arr.length; i++) min(arr[i-1], arr[i]); return minimum; } 
		private float min(float[] arr){ float minimum=arr[0]; for (int i=1; i<arr.length; i++) min(arr[i-1], arr[i]); return minimum; } 
		private double min(double[] arr){ double minimum=arr[0]; for (int i=1; i<arr.length; i++) min(arr[i-1], arr[i]); return minimum; } 
		private int max(int num1, int num2){ if(num1<=num2) return num2; return num1; } 
		private long max(long num1, long num2){ if(num1<num2) return num2; return num1; } 
		private float max(float num1, float num2){ if(num1<num2) return num2; return num1; } 
		private double max(double num1, double num2){ if(num1<num2) return num2; return num1; } 
		private int max(int[] arr){ int maximum=arr[0]; for (int i=1; i<arr.length; i++) max(arr[i-1], arr[i]); return maximum; } 
		private long max(long[] arr){ long maximum=arr[0]; for (int i=1; i<arr.length; i++) max(arr[i-1], arr[i]); return maximum; } 
		private float max(float[] arr){ float maximum=arr[0]; for (int i=1; i<arr.length; i++) max(arr[i-1], arr[i]); return maximum; } 
		private double max(double[] arr){ double maximum=arr[0]; for (int i=1; i<arr.length; i++) max(arr[i-1], arr[i]); return maximum; } 
		private int toInt(String str){ return Integer.parseInt(str);}
		private int toInt(long num){ return (int)num;}
		private int toInt(float num){ return (int)num;}
		private int toInt(double num){ return (int)num;}
		private double toDouble(String str){return Double.parseDouble(str);}
		private double toDouble(int num){ return (double)num;}
		private double toDouble(long num){ return (double)num;}
		private double toDouble(float num){ return (double)num;}
		private float toFloat(String str){return Float.parseFloat(str);}
		private float toFloat(int num){ return (float)num;}
		private float toFloat(long num){ return (float)num;}
		private float toFloat(double num){ return (float)num;}
		private long toLong(String str){return Long.parseLong(str);}
		private long toLong(int num){ return (long)num;}
		private long toLong(float num){ return (long)num;}
		private long toLong(double num){ return (long)num;}
		private String toString(int num){ return Integer.toString(num);}
		private String toString(long num){ return Long.toString(num);}
		private String toString(double num){ return Double.toString(num);}
		private String toString(float num){ return Float.toString(num);}
		private int abs(int num){if(num>=0) return num; return -num;}
		private long abs(long num){if(num>=0L) return num; return -num;}
		private float abs(float num){if(num>=0.00) return num; return -num;}
		private double abs(double num){if(num>=0.00) return num; return -num;}
		
		private void solve(input in, output out){
			
		} 
	} 
}
