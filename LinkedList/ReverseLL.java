package LinkedList;

public class ReverseLL {

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

    // Add LinkedList in Middle any where

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i == idx-1; temp -> prev.
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Reverse LinkedList
    // Iterative Approach

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev; // this actual thing to revesre linkedList
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();

        // ll.print();
        ll.addLast(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print(); // 1->2->3->4->5

        ll.reverse();
        ll.print();

    }
}
