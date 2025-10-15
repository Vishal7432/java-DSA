import java.util.ArrayList;

public class Practice {

    public static void main(String[] args) {

        // ClassName objName = new ClassName()
        // java Collection Framework

        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // Add Elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // list.add(1, 9);

        System.out.println(list.size());

        // Al size()
        // print ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // print Array List in reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Get Element
        // int element = list.get(2);
        // System.out.println(element);

        // // Delete
        // list.remove(2);
        // System.out.println(list);

        // Set element at Index
        // list.set(2, 10);
        // System.out.println(list);

        // Contain Element
        // System.out.println(list.contains(5));
        // System.out.println(list.contains(11));

        // Question : - Find maximum in an Arraylist

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
    }
}