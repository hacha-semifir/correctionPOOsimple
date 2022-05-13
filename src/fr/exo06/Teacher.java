package fr.exo06;

import java.util.Objects;

public class Teacher extends Person {
    // Attributs
    private  String subject;

    // Constructeur
    public Teacher() {
        this.subject= "sujet";
    }

    public Teacher(int age, String subject) {
        super(age);
        this.subject = subject;
    }

    // Getters et setters
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // methodes
    public void explain() {
        System.out.println("Explanation begins");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                '}';
    }


}
