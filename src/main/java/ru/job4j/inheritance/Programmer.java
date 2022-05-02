package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String programmingLanguage;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
