package Strings;

import java.util.Arrays;

public class FristRepeatingChar {
    public static char  check(String s)
    {
        int res=Integer.MAX_VALUE;
        int[] count=new int[256];
        Arrays.fill(count,-1);
        for(int i=0;i<s.length();i++)
        {
               if(count[s.charAt(i)]==-1)
                   count[s.charAt(i)]=i;
               else
                   res=Math.min(res,count[s.charAt(i)]);
        }
        return s.charAt(res);
    }
    public static void main(String[] arg)
    {
            String s="abcbca";
           System.out.println( check(s));

    }
}
