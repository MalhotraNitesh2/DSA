package LinkedList;

public class DetectLoop {
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
    }
     static boolean loopdetect(LinkedList.Node head){
        LinkedList.Node slow=head;
        LinkedList.Node fast=head;
        while(fast !=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
                return true;
        }
        return false;
    }

    public static void main(String[]arg) {
        LinkedList ll= new LinkedList();
        LinkedList.Node head= new LinkedList.Node(10);
        LinkedList.Node first= new LinkedList.Node(20);
        LinkedList.Node second= new LinkedList.Node(30);
        LinkedList.Node third= new LinkedList.Node(40);
        head.next=first;
        first.next=second;
        second.next=third;
        third.next=second;
        System.out.print(loopdetect(head));

    }
}
