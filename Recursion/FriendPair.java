public class FriendPair {

    public static int friendPair(int n) {

        // BaseCase !
        if (n == 1 || n == 2) {
            return n;
        }

        // Choise
        // single
        int fnm1 = friendPair(n - 1);

        // Pair
        int fnm2 = friendPair(n - 2);

        int pairWays = (n - 1) * fnm2;

        // total Ways

        int totways = fnm1 + pairWays;
        return totways;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendPair(n));
    }
}