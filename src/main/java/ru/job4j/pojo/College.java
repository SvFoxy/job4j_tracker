package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Иванов");
        student.setName("Иван");
        student.setPatronymic("Иванович");
        student.setGroup("23A");
        student.setReceiptDate(new Date());
        System.out.println(
                student.getSurname() + " " + student.getName() + " "
                + student.getPatronymic() + " зачислен в группу " + student.getGroup()
                + " c " + student.getReceiptDate());
    }
}
