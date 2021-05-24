package Queue;

import java.util.Stack;

public  class QueueUsingStack {
    static class queue{
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();
        void push(int x)
        {
            s1.push(x);
        }
        int pop()
        {
            if(s1.empty() && s2.empty())
            {
                System.out.print("queue is empty");
            }
            if(s2.empty()){
                while(!s1.empty())
                {
                    s2.push(s1.peek());
                    s1.pop();
                }
            }
            int topval=s2.peek();
            s2.pop();
            return topval;
        }
    }
    public  static void main(String[] arg)
    {
       queue q=new queue();
       q.push(1);
       q.push(2);
       q.push(3);
       q.push(4);
       System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

    }
}
