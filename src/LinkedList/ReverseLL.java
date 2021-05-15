package LinkedList;

public class ReverseLL {
    static class LinkedList{

        static class Node{
            int data;
            Node next;
            Node(int key)
            {
                data=key;
                next=null;
            }
        }
         static void reverse(Node head)
        {
            Node curr=head;
            Node prev=null;
            while(curr!=null)
            {
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
        }

    }
    public static void main(String[] arg)
    {
         LinkedList ll=new LinkedList();
        LinkedList.Node head=new LinkedList.Node(10);
        LinkedList.Node second=new LinkedList.Node(20);
        LinkedList.Node third=new LinkedList.Node(30);
        head.next=second;
        second.next=third;
        LinkedList.reverse(head);



    }
}
