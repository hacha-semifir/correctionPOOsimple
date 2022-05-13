package fr.exo06;

import java.util.Objects;

public class Person {
    // Attributs
    protected int age;
    // Constructeurs
    public Person () {
    }
    public Person(int age) {
        this.setAge(age);
    }

    // Getters && setters
    public int getAge() {
        return this.age;
    }

    public void setAge(int n) {
        this.age = n;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}