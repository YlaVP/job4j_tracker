package ru.job4j.inheritance;

public class Builder extends Engineer{
    private String architecturalProject;

    public Builder(String name, String surname, String education, String birthday, int category, String architecturalProject) {
        super(name, surname, education, birthday, category);
        this.architecturalProject = architecturalProject;
    }

    public void build(){

    }
}
