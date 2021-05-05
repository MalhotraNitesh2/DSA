package Strings;

import java.util.Arrays;

public class FirstNonRepeatingChar {
    public static char check(String s)
    {
        int res=0;
        int []count=new int[256];
        Arrays.fill(count,-1);
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(count[s.charAt(i)]==0){
                 res=i;  break;}
        }
        return s.charAt(res);

    }
    public static void main(String[]arg)
    {
        String s="acdac";
        System.out.println(check(s));
    }
}
