package Oops;

public class InterFaces {
    public static void main(String[] args) {
        Queen obj = new Queen();
        obj.move();

        Bear b = new Bear();
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
    eatVeg();

}

interface Carnivore {
    eatNonVeg();
}

class Bear implements Herbivore, Carnivore {
    public void omnivore() {
        System.out.println("Eat meat and grass both");
    }
}