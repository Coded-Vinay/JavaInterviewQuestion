public class middleNode {

    public static void main(String[] args) {
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
           slow =  slow.next;
         fast =   fast.next.next;
        }
        System.out.println("Middlenode\s"+ slow.data);
    }
}
