package LinkedList;

import BSArray.floorAndCeil;

public class Practice {
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

    // Remove First in LinkedList
    public int removeFirst() {
        // Special Case-1
        if (size == 0) {
            System.out.print("LinkedList is empty!");
            return Integer.MIN_VALUE;
            // special case-2
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove Last in LinkedList
    public int removeLast() {
        // Special Case-1
        if (size == 0) {
            System.out.print("LinkedList is empty!");
            return Integer.MIN_VALUE;
            // special case-2
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size-2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Search (Itrerative) key val in LinkedList
    public int findKey(int key) {

        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.data == key) { // key found case
                return idx;
            }
            temp = temp.next;
            idx++;

        }
        return -1;

    }

    public static void main(String[] args) {
        Practice ll = new Practice(); // create your own linked list

        // ll.print();
        ll.addLast(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(4);
        // ll.print();
        ll.addLast(5);
        ll.add(2, 3);
        ll.print(); // 1->2->3->4->4->null;
        // System.out.println(size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(size);

        System.out.println(ll.findKey(3));
        System.out.println(ll.findKey(10));
    }
}
