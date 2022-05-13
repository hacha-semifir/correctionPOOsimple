package fr.exo06;

public class Student extends Person{

    // Constructeur
    public Student() {
    }
    public Student(int age) {
        super(age);
    }

    // methodes
    public void goToClass() {
        System.out.println("I'm going to class");
    }

    public void displayAge() {
        System.out.println("My age is " + getAge() + " years old");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }


}

