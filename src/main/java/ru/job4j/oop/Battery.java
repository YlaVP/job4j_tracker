package ru.job4j.oop;

import java.util.jar.JarEntry;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another){
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(10);
        Battery secondBattery = new Battery(5);
        System.out.println("firstBattery : " + firstBattery.load + ". secondBattery : " + secondBattery.load);
        firstBattery.exchange(secondBattery);
        System.out.println("firstBattery : " + firstBattery.load + ". secondBattery : " + secondBattery.load);
    }
}
