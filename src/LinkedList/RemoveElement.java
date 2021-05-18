package LinkedList;

public class RemoveElement {
    static class Linkedlist{
        static class Node{
            int data;
            Node next;
            Node(int key)
            {
                data=key;
                next=null;
            }
        }
        boolean check(Node head,int ans)
        {
            int curr=ans;
            Node temp=head;
            boolean flag=false;
            while(temp!= null)
            {
                if(temp.data==curr)
                    flag=true;
                temp=temp.next;
            }
            return flag;
        }
    }
    public static void main(String[] arg)
    {
        Linkedlist ll = new Linkedlist();
        Linkedlist.Node head =new Linkedlist.Node(10);
        Linkedlist.Node second =new Linkedlist.Node(20);
        Linkedlist.Node third =new Linkedlist.Node(30);
        Linkedlist.Node fourth =new Linkedlist.Node(40);
        Linkedlist.Node fifth =new Linkedlist.Node(50);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        System.out.print(ll.check(head,40));
    }
}
