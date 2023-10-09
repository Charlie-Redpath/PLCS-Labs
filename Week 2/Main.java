import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Worm snake = new Worm();
        snake.print();

        snake.move();
        snake.grow();
        snake.eat();
        snake.getSize();
        snake.setSize(10);
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

    int getSize() {
        System.out.println("getSize() called");
        return this.size;
    }

    void setSize(int new_size) {
        System.out.println("setSize() called");
        this.size = new_size;
    }

    void start() {
        System.out.println("start() called");
    }
}
