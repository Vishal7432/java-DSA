package Oops;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object called p1.
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen {
    // Prop + funx
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Students {
    String name;
    int age;
    float percentage; // CGPA

    void calcPercentage(int math, int phy, int chem) {
        percentage = (math + phy + chem) / 3;
    }
}