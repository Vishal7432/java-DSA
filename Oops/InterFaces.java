package Oops;

public class InterFaces {
    public static void main(String[] args) {
        Queen obj = new Queen();
        obj.move();

        Bear b = new Bear();
        b.eatVeg();
        b.eatNonVeg();
        b.omnivore();
    }
}

interface ChessPlay {
    void move();
}

class Queen implements ChessPlay {
    public void move() {
        System.out.println("UP, Down, Right, Left, Diagonal(All Direction !)");
    }
}

class Rook implements ChessPlay {
    public void move() {
        System.out.println("UP, Down, Right, Left");
    }
}

class King implements ChessPlay {
    public void move() {
        System.out.println("UP, Down, Right, Left, Diagonal(One Step all Direction !)");
    }
}

// multiple Inheritance !
interface Herbivore {
    void eatVeg();

}

interface Carnivore {
    void eatNonVeg();
}

class Bear implements Herbivore, Carnivore {

    @Override
    public void eatVeg() {
        System.out.println("beaer eat grass and fruits");
    }

    @Override
    public void eatNonVeg() {
        System.out.println("Beer eat meat");
    }

    public void omnivore() {
        System.out.println("Beer is an omnivore (eat veg and non-veg)");
    }
}