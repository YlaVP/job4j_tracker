package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    public Surgeon(String name, String surname, String education, String birthday, String doctorsQualifications) {
        super(name, surname, education, birthday, doctorsQualifications);
    }

    public void operates() {

    }
}
