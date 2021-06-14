package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String doctorsQualifications;

    public Doctor(String name, String surname, String education, String birthday, String doctorsQualifications) {
        super(name, surname, education, birthday);
        this.doctorsQualifications = doctorsQualifications;
    }

    public void heal() {

    }

}
