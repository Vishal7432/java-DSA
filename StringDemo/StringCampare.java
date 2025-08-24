package StringDemo;

public class StringCampare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("Sting is equals");
        } else {
            System.out.println("string are not equals");
        }
        if (s2 == s3) {
            System.out.println("Sting are equal");
        } else {
            System.out.println("String are not equals");
        }

        if (s1.equals(s3)) {
            System.out.println("string are equls");

        }
    }
}
