import java.util.*;

class Solution {
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
    private long abs(long num){return Math.abs(num);}
    private float abs(float num){return Math.abs(num);}
    private double abs(double num){return Math.abs(num);}
    
    
