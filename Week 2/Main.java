import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Worm snake = new Worm(new Color(255,255,255));
        snake.print();

        snake.move(new int[]{1, 2});
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
    Color colour;
    int[] pos;

    Worm(Color colour) {
        size = 5;
        name = "Wiggly Worm";
        this.colour = colour;
    }

    void print() {
        System.out.println("My name is " + name);
        System.out.println("I grow 1 cm each year and I am " + size + " Years old. Happy birthday to me.");
    }

    void move(int[] new_pos) {
        System.out.println("move() called");
        this.pos = new_pos;
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
