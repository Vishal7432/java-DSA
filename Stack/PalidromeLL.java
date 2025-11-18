package Stack;

import java.util.LinkedList;
import java.util.Stack;

public class PalidromeLL {

    public static boolean isPalidrome(LinkedList<Character> ll) {
        Stack<Character> ch = new Stack<>();
    }

    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();

        ll.addFirst('a');
        ll.addFirst('b');
        ll.addFirst('c');
        ll.addFirst('b');
        ll.addFirst('a');

        System.out.println(ll);

    }
}
