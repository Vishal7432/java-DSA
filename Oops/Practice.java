package Oops;

public class Practice {
    public static void main(String[] args) {
        // Ans 1
        // Student s = new Student();
        // s.name = "Vishal";
        // s.marks = 91;
        // System.out.println("Student name- " + s.name + " : " + "Mark " + s.marks);

        // ans -2
        Person p = new Person();
        p.name = "Vishal";
        p.weight = 64;
        System.out.println("person name : " + p.name + "and Weight : " + p.weight);

        Student s = new Student();
        s.name = "Amit";

    }
}
// Question 1
// class Student {
// String name;
// int marks;
// }

// Question 2.
class Person {
    String name;
    int weight;
}

class Student extends Person {
    int rollNumber;
    String SchoolName;

}