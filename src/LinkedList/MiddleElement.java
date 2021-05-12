package LinkedList;

public class MiddleElement {
    static class LinkedList{
        static class
         Node{
            int data;
            Node next;
            Node(int key)
            {
                data=key;
                next=null;
            }
        }
        void middle(Node head)
        {
              Node slow=head;
              Node fast=head;
              while(fast!=null && fast.next!=null)
              {
                  slow=slow.next;
                  fast=fast.next.next;
              }
              System.out.print(slow.data);
        }
    }
    public static void main(String[] arg)
    {
        LinkedList ll=new LinkedList();
        LinkedList.Node head= new LinkedList.Node(10);
        LinkedList.Node second= new LinkedList.Node(20);
        head.next=second;
        LinkedList.Node third =new LinkedList.Node(30);
        LinkedList.Node fourth=new LinkedList.Node(40);
        LinkedList.Node fifth=new LinkedList.Node(50);
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=null;
        ll.middle(head);

    }
}
