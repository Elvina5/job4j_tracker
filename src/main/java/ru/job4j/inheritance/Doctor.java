package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String skill;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.skill = skill;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }

    public String getSkill() {
        return skill;
    }
}
