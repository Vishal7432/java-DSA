public class DeleteNNode {
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

    public static void deleteNAfterM(int N, int M) {
        Node curr = head;

        while (curr != null) {
            // Step 1: Skip M nodes
            for (int i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }

            if (curr == null)
                return; // reached end

            // Step 2: Delete next N nodes
            Node temp = curr.next;
            for (int i = 1; i <= N && temp != null; i++) {
                temp = temp.next;
            }

            // Step 3: Connect current node to next of deleted part
            curr.next = temp;

            // Step 4: Move current pointer forward
            curr = temp;

        }
    }

    public static void main(String[] args) {
        DeleteNNode ll = new DeleteNNode();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(4);
        ll.addLast(8);
        ll.addLast(9);
        int N = 2, M = 2;
        ll.print();
        ll.deleteNAfterM(N, M);

        ll.print();
    }
}
