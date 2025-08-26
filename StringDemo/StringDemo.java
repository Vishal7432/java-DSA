package StringDemo;

public class StringDemo {

    public static void printLattters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {

        // String fullName = "TOny Stark";
        // System.out.println(fullName.length());

        String firstName = "Vishal ";
        String lastName = "Gupta";
        String fullName = firstName + lastName;
        printLattters(fullName);

        String str = "Apnacollage".replace("l", "");
        System.out.println(str);

    }
}
