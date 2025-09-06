package Oops;

public class Polymorphism {
    public static void main(String[] args) {
        // calcutor calc = new calcutor();
        // System.out.println(calc.sum(2, 3));
        // System.out.println(calc.sum((float) 1.5, (float) 2.5));
        // System.out.println(calc.sum(2, 3, 6));

        // Dear obj = new Dear();
        // obj.eat();

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();

    }
}

// class Animals {
// void eat() {
// System.out.println("eat anything !");
// }
// }

class Dear {
    void eat() {
        System.out.println("eat grass!");
    }
}

class calcutor {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Abstract classes
abstract class Animals {
    void eat() {
        System.out.println("animals Eat.");
    }

    abstract void walk();
    // Eska koi parameter nahi hota hai
}

class Horse extends Animals {
    void walk() {
        System.out.println("walks on 4 lags");
    }
}

class Chicken extends Animals {
    void walk() {
        System.out.println(" walks on 2 legs");
    }
}