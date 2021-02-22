package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;

    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String eng = dummyDic.engToRus("latter");


        System.out.println("Неизвестное слово. " + eng);

    }
}
