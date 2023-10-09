import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Worm snake = new Worm();
        snake.print();

        snake.move();
        snake.grow();
        snake.eat();
        snake.getSize();
        snake.setSize();
        snake.start();
    }
}

class Worm {
    int size;
    String name;
    Color color;

    Worm() {
        size = 5;
        name = "Wiggly Worm";
    }

    void print() {
        System.out.println("My name is " + name);
        System.out.println("I grow 1 cm each year and I am " + size + " Years old. Happy birthday to me.");
    }

    void move() {
        System.out.println("move() called");
    }

    void grow() {
        System.out.println("grow() called");
    }

    void eat() {
        System.out.println("eat() called");
    }

    void getSize() {
        System.out.println("getSize() called");
    }

    void setSize() {
        System.out.println("setSize() called");
    }

    void start() {
        System.out.println("start() called");
    }
}
