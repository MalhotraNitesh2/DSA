package Strings;

public class BalancedNumber {
     static boolean bnumber(String s)
     {
         int length=s.length();
         int sumleft=0;
         int sumright=0;
         for(int i=0;i<length/2;i++)
         {
             sumleft= sumleft+s.charAt(i);
         }
         for(int i=length/2+1;i<length;i++)
         {
             sumright+=s.charAt(i);
         }
         if(sumleft==sumright){
             return true;}
         else{
         return false;}


     }

     public static void main(String[] arg)
     {
            String s="1234006";
             System.out.println(bnumber(s));

     }
}
