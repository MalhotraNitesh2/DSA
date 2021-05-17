package LinkedList;

public class PalindromeLinkedList {
    static class LinkedList {
        static class Node {
            int data;
            Node next;

            Node(int key) {
                data = key;
                next = null;
            }
        }

        boolean checkPalindrome(Node head) {
            StringBuilder sb = new StringBuilder();
            Node temp = head;
            while (temp != null) {
                sb.append(temp.data);
                temp = temp.next;
            }
            int len = sb.length();
            String s = sb.toString();
            String r = sb.reverse().toString();
            return s.equals(r);
        }
    }

        public static void main(String[] arg) {
            LinkedList ll = new LinkedList();
            LinkedList.Node head = new LinkedList.Node(1);
            LinkedList.Node second = new LinkedList.Node(2);
            LinkedList.Node third = new LinkedList.Node(2);
            LinkedList.Node tail = new LinkedList.Node(3);
            head.next = second;
            second.next = third;
            third.next = tail;
            System.out.print(ll.checkPalindrome(head));
        }
    }

