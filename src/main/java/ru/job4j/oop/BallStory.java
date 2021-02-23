package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        hare.tryEat(ball);
        ball.run(hare);
        wolf.tryEat(ball);
        ball.run(wolf);
        fox.tryEat(ball);
        ball.eat(fox);
        ball.eatUp(ball);
    }
}
