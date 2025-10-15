import java.util.ArrayList;

public class ContainerMaxWater {

    public static int optimalSolu(ArrayList<Integer> height) {
        int maxWater = 0;

        int leftPointer = 0, rightPointer = height.size() - 1;

        while (leftPointer < rightPointer) {
            int wh = Math.min(height.get(leftPointer), height.get(rightPointer));
            int width = rightPointer - leftPointer;
            int Water = wh * width;
            maxWater = Math.max(maxWater, Water);

            if (leftPointer < rightPointer) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(optimalSolu(height));

        // Bruteforce Approach.
        // TC O(n^2)
        // int maxWater = 0;

        // for (int i = 0; i < height.size(); i++) {
        // for (int j = i + 1; j < height.size(); j++) {
        // int wh = Math.min(height.get(i), height.get(j));
        // int width = j - i;
        // int Water = wh * width;
        // maxWater = Math.max(maxWater, Water);
        // }
        // }
        // System.out.println(maxWater);
    }
}
