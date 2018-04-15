package FastIO;

import java.io.*;

public class output {
    private final PrintWriter writer;

    public output(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public output(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(objects[i]);
        }
    }

    public void println(Object... objects) {
        print(objects);
        writer.println();
    }

    public void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            print(array[i]+" ");
        }
        println();
    }

    public void printArray(char[] array){
        for (int i=0; i<array.length; i++){
            print(array[i]+" ");
        }
        println();
    }

    public void printArray(long[] array){
        for (int i=0; i<array.length; i++){
            print(array[i]+" ");
        }
        println();
    }

    public void printArray(float[] array){
        for (int i=0; i<array.length; i++){
            print(array[i]+" ");
        }
        println();
    }

    public void printArray(double[] array){
        for (int i=0; i<array.length; i++){
            print(array[i]+" ");
        }
        println();
    }

    public void printArray(String[] array){
        for (int i=0; i<array.length; i++){
            print(array[i]+" ");
        }
        println();
    }

    public void printMatrix(int[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++) {
                print(array[i][j] + " ");
            }
            println();
        }
        println();
    }

    public void printMatrix(char[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                print(array[i][j]+" ");
            }
            println();
        }
        println();
    }

    public void printMatrix(long[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                print(array[i][j]+" ");
            }
            println();
        }
        println();
    }

    public void printMatrix(float[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                print(array[i][j]+" ");
            }
            println();
        }
        println();
    }

    public void printMatrix(double[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                print(array[i][j]+" ");
            }
            println();
        }
        println();
    }

    public void printMatrix(String[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                print(array[i][j]+" ");
            }
            println();
        }
        println();
    }

    public void close() {
        writer.close();
    }

}