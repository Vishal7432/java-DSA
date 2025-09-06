package Oops;

public class Inheritance {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();
        f.breathe();
        f.swin();
        // System.out.println(f);
    }
}

// Base Class
class Animals {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammals extends Animals {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animals {
    void swin() {
        System.out.println("swins");
    }
}

class Bird extends Animals {
    void fly() {
        System.out.println("flys");
    }
}

// multi level Inheritance
// class mammals extends Animals {
// int legs;
// }

// class dog extends mammals {
// String breed;
// }

// Derived Class

// class Fish extends Animals {
// int fins;

// void swin() {
// System.out.println("swins in water");
// }

// }