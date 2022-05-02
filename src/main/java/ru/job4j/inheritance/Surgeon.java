package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String diagnosis;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.diagnosis = diagnosis;
    }

    public String getSpeciality() {
        return diagnosis;
    }
}
