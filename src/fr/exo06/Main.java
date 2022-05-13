package fr.exo06;

public class Main {
    public static void main(String[] args) {
        Person personne1 = new Person();

        personne1.sayHello();

        Student etudiant1 = new Student();
        etudiant1.setAge(15);
        etudiant1.sayHello();
        etudiant1.goToClass();
        etudiant1.displayAge();


        Teacher prof = new Teacher();

        System.out.println(prof);
        prof.setAge(40);
        prof.sayHello();
        prof.getAge();
        System.out.println("My age is " + prof.getAge() + " years old");
        prof.explain();
    }
}
