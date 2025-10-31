public class RemoveCycle {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move 1 step
            fast = fast.next.next; // move 2 steps

            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // no cycle
    }

    public static void removeCyle() {
        // dedect cylce.
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if (fast == slow) {
                isCycle = true;
                break;
            }
        }

        if (isCycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null; // last Node

        while (slow != fast) {
            prev = fast;
            slow = slow.next; // +1
            fast = fast.next; // +1
        }

        // remove cycle -> last.next = null.
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->2
        System.out.println(isCycle());
        removeCyle();
        System.out.println(isCycle());
    }
}
