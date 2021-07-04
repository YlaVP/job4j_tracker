package ru.job4j.pojo;

public class Student<receipt> {
    private String name;
    private String surname;
    private String patronyic;
    private int group;
    private receipt Date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronyic() {
        return patronyic;
    }

    public void setPatronyic(String patronyic) {
        this.patronyic = patronyic;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public receipt getDate() {
        return Date;
    }

    public void setDate(receipt date) {
        Date = date;
    }
}
