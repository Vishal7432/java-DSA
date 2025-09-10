package Oops;

public class SuperKey {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);

    }
}

class Animals {
    String color;

    Animals() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animals {

    Horse() {
        super.color = "Blue";
        // super();
        System.out.println("Hosre costructor is called");
    }
}