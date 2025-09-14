public class TilingProblem {

    public static int tilingProblem(int n) { // 2 X n (floor size.)

        // baseCase
        if (n == 0 || n == 1) {
            return 1;

        }

        // kaam
        // verticle choise
        int fnm1 = tilingProblem(n - 1);

        // horizontal choise.
        int fnm2 = tilingProblem(n - 2);

        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));

    }
}