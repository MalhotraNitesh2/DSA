package Stack;

import java.util.Stack;

public class PostfixEvaluation {
    static Integer checkpostfix(String str)
    {
        Stack<Integer> s1 =new Stack<Integer>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                s1.push(str.charAt(i)-'0');
            }
            else{
                int op2=s1.peek();
                s1.pop();
                int op1=s1.peek();
                s1.pop();
                switch (str.charAt(i))
                {
                    case '+':
                    {
                        s1.push(op1+op2);
                        break;
                    }
                    case '*':
                    {
                        s1.push(op1*op2);
                        break;
                    }
                    case '-':
                    {
                        s1.push(op1-op2);
                        break;
                    }
                    case '/':
                    {
                        s1.push(op1/op2);
                        break;
                    }
                }
            }
        }
        return s1.peek();
    }
    public static void main(String[] arg)
    {
        String str="46+2/5*7+";
        System.out.println(checkpostfix(str));
    }
}
