public class OddEvenList {
        public class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;
        public static Node tail;
        public static int size;

        // Method

        // Add LinkedList node in First
        public void addFirst(int data) {
            // step 1 = create new node
            Node newNode = new Node(data);
            size++;
            // if linkedlist is empty
            if (head == null) {
                head = tail = newNode;
                return;
            }

            // Step 2 - newNode next = head
            newNode.next = head; // link

            // step -3 head = newNode
            head = newNode;
        }

        // Add linkedlist node in Last
        public void addLast(int data) {
            // step 1 = create new node

            Node newNode = new Node(data);
            size++;

            // if Linkedlist is empty ho
            if (head == null) {
                head = tail = newNode;
                return;
            }
            // Step 2 - newNode next = tail
            tail.next = newNode;

            // tail = newNode
            tail = newNode;
        }

        // print linkedList node
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

    public void rearrangeEvenOdd() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        Node evenHead = null, evenTail = null;
        Node oddHeah = null, oddTail = null;

        Node curr = head;

        while (curr != null) {
            if (curr.data % 2 == 0) { // even node hai
                if (evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            } else { // Odd node hai
                if (oddHeah == null) {
                    oddHeah = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
            curr = curr.next;
        }
        // if no even nodes, return odd list
        if (evenHead == null) {
            return;
        }
        // connect even and odd lists
        evenTail.next = oddHeah;

        // mark end of list
        if (oddTail != null) {
            oddTail.next = null;
        }
    }

    public static void main(String[] args) {

        OddEvenList ll = new OddEvenList();
        ll.addFirst(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);
        ll.print();

        ll.rearrangeEvenOdd();
        ll.print();
    }
}
