package Stack;

import java.util.Stack;

public class PrefixEvaluation {
    static Integer check(String str)
    {
         Stack<Integer> s1=new Stack<Integer>();
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) >='0' && str.charAt(i)<='9')
            {
                s1.push((int) str.charAt(i)-'0');
            }
            else
            {
                int op1=s1.peek();
                s1.pop();
                int op2=s1.peek();
                s1.pop();
                switch (str.charAt(i))
                {
                    case '+':
                        s1.push(op1+op2);
                        break;
                    case '*':
                        s1.push(op1*op2);
                        break;
                    case '/':
                        s1.push(op1/op2);
                        break;
                    case '-':
                        s1.push(op1-op2);
                        break;
                }


            }
        }
        return s1.peek();
    }
    public static void main(String[] arg)
    {
         String str="-+7*45+20";
         System.out.println(check(str));
    }
}
