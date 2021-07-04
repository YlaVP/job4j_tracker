package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Anton");
        student.setSurname("Ivanov");
        student.setPatronyic("Ivanovich");
        student.setGroup(2);
        student.setDate(10092020);

        System.out.println("Student has a name, surname, patronyic - " + student.getName() + " " + student.getPatronyic() + " " + student.getSurname()
                + "\n Group: " + student.getGroup() + "\n Receipt date: " + student.getDate());

    }
}
