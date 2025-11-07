public class MergeSortLL {
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

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head) {
        // base Case
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // left and right MS
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();

        ll.addFirst(1);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(4);
        ll.addFirst(5);

        // 5->4->3->2->1
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

        // TC-> O(n)
    }
}
