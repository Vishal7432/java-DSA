import java.util.LinkedList;

public class ClassRoom {
    public static void main(String[] args) {

        // Create ll
        LinkedList<Integer> ll = new LinkedList<>();

        // Add ll
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        // 0->1->2
        System.out.println(ll);

        // remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
