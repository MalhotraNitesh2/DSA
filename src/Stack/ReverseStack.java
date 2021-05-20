package Stack;

import java.util.Stack;

public class ReverseStack {
    static void insertAtBottom(Stack<Integer> st, int ele)
    {        if(st.empty())
             {
                 st.push(ele);
                 return;
             }

             int topele=st.peek();
             st.pop();
             insertAtBottom(st,ele);

             st.push(topele);
    }
     static Stack<Integer> reverseStack(Stack<Integer> st)
    {
         if(st.empty())
             return null;

         int ele=st.peek();
         st.pop();
         reverseStack(st);
         insertAtBottom(st,ele);

        return st;
    }
    public static void main(String[] arg)
    {
       Stack<Integer> st =new Stack<Integer>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       System.out.print(reverseStack(st));
    }
}
