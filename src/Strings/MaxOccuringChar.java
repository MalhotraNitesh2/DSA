package Strings;

public class MaxOccuringChar {
    public static char check(String s)
    {
         int [] count=new int[256];
         int currmax=Integer.MIN_VALUE;
         for(int i=0;i<s.length();i++)
         {
             count[s.charAt(i)]++;
         }
         for(int i=0;i<256;i++)
         {
             currmax=Math.max(currmax,count[i]);
         }
         return s.charAt(currmax);
    }
    public static void main(String[]arg)
    {
        String s="testsample";
        System.out.println(check(s));
    }
}
