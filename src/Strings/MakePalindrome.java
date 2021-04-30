package Strings;

public class MakePalindrome {
    static void removeElement(String s)
    {
        int len=s.length()-1;
        int low=0;
        int high=len;
         while(low<high) {

             if (s.charAt(low) == s.charAt(high))
             {
                 low++;
                 high--;
             }

         }

    }
    public static void main(String[] arg)
    {
        String s="aebcbda";
    }
}
