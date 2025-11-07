
public class PalindromeLL {

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

    // find mid node linkedList
    // slow - Fast Approach se

    public Node findMid(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next; // +2
        }
        return slow;
    }

    public boolean checkPalidrome() {
        if (head == null && head.next == null) {
            return true;
        }

        // Step1 - find mid
        Node midNode = findMid(head);

        // Step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // rigth half ka head
        Node lelf = head;

        // Step 3 Check left half and rigth half equals

        while (right != null && lelf != null) {
            if (lelf.data != right.data) {
                return false;
            }

            lelf = lelf.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeLL ll = new PalindromeLL();

        // ll.addLast(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);

        ll.addFirst(1);
        ll.addLast(1);
        ll.add(1, 2);

        ll.print(); // 1->2->3->4->5

        ;
        System.out.println(ll.checkPalidrome());
    }
}