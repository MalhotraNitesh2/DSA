package Strings;

public class Plaindrome {
    static boolean check(String s)
    {
        int len=s.length();
        int low=0;
        int high=len-1;
        while(low< high)
        {
            if(s.charAt(low)==s.charAt(high))
                return true;
            else
                break;
        }
        return false;
    }
    public static void main(String[] arg)
    {
        String s="abbac";
        System.out.print(check(s));
    }
}
