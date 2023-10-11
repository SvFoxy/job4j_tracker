package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare1 = new Hare();
        Wolf wolf1 = new Wolf();
        Fox fox1 = new Fox();
        Ball ball1 = new Ball();
        hare1.tryEat(ball1);
        wolf1.tryEat(ball1);
        fox1.tryEat(ball1);
    }
}
