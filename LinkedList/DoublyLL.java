public class DoublyLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add Fisrt Node
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // print Doubly linkedlist
    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Doubly Linkrd List Is empty!");
        }
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove fisrt dll;
    public int removeFisrt() {

        if (head == null) {
            System.out.println("Doubly Linkrd List Is empty!");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // AddLast In doubly Linked List
    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    // Remoe Last in dll !
    public int removeLast() {
        if (head == null) {
            System.out.println("Dll is Empty!");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = tail.data;
            head = tail = null;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;

    }

    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);

        // ll.print();
        // System.out.println(size);

        // ll.removeFisrt();
        // ll.print();
        // System.out.println(size);
        ll.print();
        System.out.println(size);

        ll.removeLast();
        ll.print();
        System.out.println(size);
    }
}
