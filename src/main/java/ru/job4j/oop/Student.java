package ru.job4j.oop;

public class Student {
    public void song() {
        System.out.println("I believe I can fly");

    }
    public void music(){
        System.out.println("Petay play the accordion");
    }

    public static void main(String[] args) {
        Student petay = new Student();
        petay.song();
        petay.song();
        petay.song();
        petay.music();
        petay.music();
        petay.music();
    }
}
