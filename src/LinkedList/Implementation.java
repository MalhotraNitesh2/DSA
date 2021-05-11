package LinkedList;

public class Implementation {
    static class LinkList{
        Node head;
       static class Node{
            int data;
            Node next;
            Node(int d){
                data=d;
                next=null;
            }
        }
        static void display(Node node)
        {
             while(node !=null)
             {
                 System.out.println(node.data);
                 node =node.next;
             }
        }
    }
    public static void main(String[]arg)
    {
        LinkList ll= new LinkList();
        ll.head=new LinkList.Node(10);
        LinkList.Node second= new LinkList.Node(20);
        LinkList.Node third= new LinkList.Node(30);
        ll.head.next=second;
        second.next=third;
        third.next=null;
        LinkList.display(ll.head);
    }
}
