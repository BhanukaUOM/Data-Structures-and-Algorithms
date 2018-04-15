package Functons;

import java.util.*;

public class Functions
{
    public int in(int[] nums, int target){ for (int i=0; i<nums.length; i++) if(nums[i]==target) return i; return -1; }
    public int in(long[] nums, long target){ for (int i=0; i<nums.length; i++) if(nums[i]==target) return i; return -1; }
    public int in(char[] nums, char target){ for (int i=0; i<nums.length; i++) if(nums[i]==target) return i; return -1; }
    public int in(String[] nums, String target){ for (int i=0; i<nums.length; i++) if(nums[i].equals(target)) return i; return -1; }
    public int in(double[] nums, double target){ for (int i=0; i<nums.length; i++) if(nums[i]==target) return i; return -1; }
    public int in(float[] nums, float target){ for (int i=0; i<nums.length; i++) if(nums[i]==target) return i; return -1; }
    public int sum(int[] arr){ int total=0; for (int i=0; i<arr.length; i++) total+=arr[i]; return total; }
    public long sum(long[] arr){ long total=0; for (int i=0; i<arr.length; i++) total+=arr[i]; return total; }
    public float sum(float[] arr){ float total=0; for (int i=0; i<arr.length; i++) total+=arr[i]; return total; }
    public double sum(double[] arr){ double total=0; for (int i=0; i<arr.length; i++) total+=arr[i]; return total; }
    public int min(int num1, int num2){ if(num1>=num2) return num2; return num1; }
    public long min(long num1, long num2){ if(num1>num2) return num2; return num1; }
    public float min(float num1, float num2){ if(num1>num2) return num2; return num1; }
    public double min(double num1, double num2){ if(num1>num2) return num2; return num1; }
    public int min(int[] arr){ int minimum=arr[0]; for (int i=1; i<arr.length; i++) min(arr[i-1], arr[i]); return minimum; }
    public long min(long[] arr){ long minimum=arr[0]; for (int i=1; i<arr.length; i++) min(arr[i-1], arr[i]); return minimum; }
    public float min(float[] arr){ float minimum=arr[0]; for (int i=1; i<arr.length; i++) min(arr[i-1], arr[i]); return minimum; }
    public double min(double[] arr){ double minimum=arr[0]; for (int i=1; i<arr.length; i++) min(arr[i-1], arr[i]); return minimum; }
    public int max(int num1, int num2){ if(num1<=num2) return num2; return num1; }
    public long max(long num1, long num2){ if(num1<num2) return num2; return num1; }
    public float max(float num1, float num2){ if(num1<num2) return num2; return num1; }
    public double max(double num1, double num2){ if(num1<num2) return num2; return num1; }
    public int max(int[] arr){ int maximum=arr[0]; for (int i=1; i<arr.length; i++) max(arr[i-1], arr[i]); return maximum; }
    public long max(long[] arr){ long maximum=arr[0]; for (int i=1; i<arr.length; i++) max(arr[i-1], arr[i]); return maximum; }
    public float max(float[] arr){ float maximum=arr[0]; for (int i=1; i<arr.length; i++) max(arr[i-1], arr[i]); return maximum; }
    public double max(double[] arr){ double maximum=arr[0]; for (int i=1; i<arr.length; i++) max(arr[i-1], arr[i]); return maximum; }
    public int toInt(String str){ return Integer.parseInt(str);}
    public int toInt(long num){ return (int)num;}
    public int toInt(float num){ return (int)num;}
    public int toInt(double num){ return (int)num;}
    public double toDouble(String str){return Double.parseDouble(str);}
    public double toDouble(int num){ return (double)num;}
    public double toDouble(long num){ return (double)num;}
    public double toDouble(float num){ return (double)num;}
    public float toFloat(String str){return Float.parseFloat(str);}
    public float toFloat(int num){ return (float)num;}
    public float toFloat(long num){ return (float)num;}
    public float toFloat(double num){ return (float)num;}
    public long toLong(String str){return Long.parseLong(str);}
    public long toLong(int num){ return (long)num;}
    public long toLong(float num){ return (long)num;}
    public long toLong(double num){ return (long)num;}
    public String toString(int num){ return Integer.toString(num);}
    public String toString(long num){ return Long.toString(num);}
    public String toString(double num){ return Double.toString(num);}
    public String toString(float num){ return Float.toString(num);}
    public long abs(long num){return Math.abs(num);}
    public float abs(float num){return Math.abs(num);}
    public double abs(double num){return Math.abs(num);}
}
