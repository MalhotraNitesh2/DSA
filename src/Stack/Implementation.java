package Stack;

public class Implementation {
    static class Stack{
        int size=10;
        int [] arr;
        int top;
        Stack()
        {
            arr=new int [size];
            int top=-1;

        }
        void push(int x)
        {
            if(top==-size-1){
                System.out.println("SStack overflow");
                return;}
            top++;
            arr[top]=x;
        }
        void pop()
        {
            if(top==-1) {
                System.out.println("Stack underflow");
                return;
            }
            top--;
        }
        int Givetop(){
            if(top==-1)
            {
                System.out.println("Stack empty nothing to remove");
                return -1;
            }
            return arr[top];
        }
        boolean empty()
        {
             return (top==0);
        }

    }
    public static void main(String[] arg)
    {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println(s1.Givetop());
        System.out.print(s1.empty());



    }
}
