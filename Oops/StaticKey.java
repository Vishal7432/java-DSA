package Oops;

public class StaticKey {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "SVN";

        Student s2 = new Student();

        Student s3 = new Student();
        s3.schoolName = "abcde";
        System.out.println(s2.schoolName);
    }
}

class Student {
    // Student class ke ander memory ek hi bar create hoga for percentage ke liye 
    static int percentege(int phy, int chem, int math) {
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
