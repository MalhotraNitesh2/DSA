package Stack;

import java.util.Stack;

public class ReverseString {
     static String reverString(String s)
    {
        char[] reversestring =new char[s.length()];
        int len=  s.length();
        Stack<Character> s1= new Stack<>();
        for(int i=0;i<len;i++)
        {
              s1.push(s.charAt(i));
        }
        int i=0;
        while(!s1.empty())
        {
             reversestring[i++]=s1.pop();
        }
        return new String(reversestring);
    }
    public static void main(String[] arg)
    {
        String str="ulta ";
        System.out.println(reverString(str));

    }
}
