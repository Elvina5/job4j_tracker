package ru.job4j.inheritance;

public class Builder extends Engineer {

    public String project;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.project = project;
    }

    public String getProject() {
        return project;
    }
}
