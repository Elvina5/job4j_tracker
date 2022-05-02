package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String procedure;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.procedure = procedure;
    }

    public String getProcedure() {
        return procedure;
    }

}
