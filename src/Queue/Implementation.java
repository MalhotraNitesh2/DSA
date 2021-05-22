package Queue;

public class Implementation {
    static class Queue{
        int size=5;
        int arr[]=new int[size];
        int front,rear;
        Queue()
        {
            front=-1;
            rear=-1;
        }
        boolean isEmpty()
        {
            if(front==-1)
            {
                return true;
            }
            else
                return false;
        }
        boolean isFull()
        {
            if(front==0 &&  rear ==size-1)
            {
                return true;
            }
            else
                return false;
        }
        void enEqueue( int element)
        {
            if(isFull())
            {
                System.out.println("Queue full");
            }
            else
            {
                if(front==-1)
                    front=0;
            }
            rear++;
            arr[rear]=element;
            System.out.println("Number inserted is "+element);
        }
        int deQueue()
        {
            int element;
            if(isEmpty())
            {
                System.out.println("Queue is full");
                return -1;
            }
            else{
                element=arr[front];
                if(front>=rear)
                {
                    front=-1;
                    rear=-1;
                }
                else{
                    front++;
                }

            }
            return element;
        }
        void display()
        {
            int i;
            if(isEmpty())
            {
                System.out.print("Empty Queue");
            }
            else{
                System.out.println("Front index"+front);
                System.out.println("Items->");
                for( i=front;i<=rear;i++)
                {
                    System.out.println("Items"+arr[i]);
                }
               // System.out.println("Rear Index->"+arr[rear]);
            }
        }
    }
    public static void main(String[] arg)
    {
           Queue q=new Queue();
           q.enEqueue(10);
           q.enEqueue(20);
           q.enEqueue(30);
           q.enEqueue(40);
           q.deQueue();
           q.display();
    }
}
