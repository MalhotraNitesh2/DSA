package Stack;

import java.util.Stack;

public class BalancedParanthsis {
     static void checkbalanced(String str)
     {

         Stack<Character> st = new Stack<Character>();
         boolean ans=true;

         for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(')
             {

                 st.push(str.charAt(i));
             }
             else if(!st.empty()&& str.charAt(i)=='}' && st.peek()=='}')
             {
              st.pop();
            
             }
             else if(!st.empty()&&str.charAt(i)==']' && st.peek()==']')
             {
                 st.pop();
             }
             else if(!st.empty()&&str.charAt(i)==')' && st.peek()==')')
             {
                 st.pop();
             }
             else{
                 ans= false;
                 break;
             }
         }
         if(!st.empty())
         {
             ans=false;
         }
         else
             ans=true;

         System.out.println(ans);
     }
    public static void main(String[] arg)
    {
        String str ="{[()]}";
        checkbalanced(str);
    }
}
