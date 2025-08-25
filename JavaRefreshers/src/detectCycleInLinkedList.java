public class detectCycleInLinkedList {

    public static void main(String[] args) {
//Floyd’s Cycle Detection Algorithm
        class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next  = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // Create a cycle: node 5 points back to node 3
        head.next.next.next.next.next = head.next.next;


        Node slow = head;
        Node fast = head ;
        Boolean hascycle = false;

        while( fast != null && slow!= null){
            slow= slow.next;
            fast=fast.next.next;

            if(fast==slow){
                hascycle = true;
                System.out.println("Has Cycle\s" + hascycle);
                break;
            }
        }
    }


}
