package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;


    public void giveNick(String nick) {
        this.name = nick;

    }

    public void show() {
        System.out.println("Cat is name " + name + ". " + " Cat is eating a " + food);

    }
    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.giveNick("Fofa");
        cat.eat("сhicken");
        cat.show();

    }

}
