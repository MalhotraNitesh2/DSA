package Queue;

public class ImplementationLL {
    static class Node{
        int data;
        Node next;
        Node(int key)
        {
            data=key;
            next=null;
        }
    }
    static class queue
    {
        Node front;
        Node back;
        queue()
        {
            front=null;
            back=null;
        }
        void push(int x)
        {
            Node n=new Node(x);
            if(front==null) {
            back=n;
            front=n;
            return;
            }
            back.next=n;
            back=n;
        }
        void pop()
        {
            if(front==null)
            {
                System.out.print("Queue is Empty");
                return;
            }
            else
            {
                Node todelete= front;
                front=front.next;
            }
        }
        int peek()
        {
            if(front==null)
            {
                System.out.print("Queue  empty");
                return -1;
            }
            return front.data;
        }
        

    }
    public static void main(String[] arg)
    {
        queue q=new queue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());

    }
}
