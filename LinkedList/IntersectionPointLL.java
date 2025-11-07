public class IntersectionPointLL {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    // 🔹 Brute Force Method
    public Node getIntersectionNode(Node head1, Node head2) {
        // For each node in list2, check if it appears in list1
        while (head2 != null) {
            Node temp = head1;

            while (temp != null) {
                if (temp == head2) { // same node reference
                    return head2; // intersection found
                }
                temp = temp.next;
            }

            head2 = head2.next;
        }
        return null; // no intersection found
    }

    public static void main(String[] args) {
        IntersectionPointLL list = new IntersectionPointLL();

        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;

        Node intersectionPoint = list.getIntersectionNode(head1, head2);

        if (intersectionPoint == null) {
            System.out.print("No Intersection Point\n");
        } else {
            System.out.print("Intersection Point: " + intersectionPoint.data);
        }
    }
}
