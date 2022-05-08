package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup("581");
        student.setReceipt(new Date());

        System.out.println("Student - " + student.getFullName() + ". Date of receipt - " + student.getGroup() + " : group - " + student.getReceipt());
    }
}
