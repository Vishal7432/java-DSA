package Arrays;

import java.util.Scanner;

public class ArrayCC {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;   
        }
    }
    public static void main(String[] args) {
        // int marks [] = new int[50];

        // Scanner sc = new Scanner(System.in);
        // int phy;
        //phy = sc.nextInt();

        // marks[0] = sc.nextInt(); // phy
        // marks[1] = sc.nextInt(); //chem
        // marks[2] = sc.nextInt(); //math

        // System.out.println("phy - " + marks[0]);
        // System.out.println("chem - " + marks[1]);
        // System.out.println("math - " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2])/3;
        // System.out.println("percentage = " + percentage + "%");

        int marks[] = {97, 98, 99};
        update(marks);

        //print  our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.err.println();
    }
}
