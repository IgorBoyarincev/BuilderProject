package ru.netology;

import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private final OptionalInt maybeAge;
    private String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.maybeAge = OptionalInt.empty();
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.maybeAge = OptionalInt.of(age);
    }

    public boolean hasAge() {
        return maybeAge.isEmpty();
    }

    public boolean hasAddress() {
        boolean result = false;
        if (city != null) {
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return maybeAge;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(5)
                .setCity(city);
    }

    @Override
    public String toString() {
        return " {name=" + getName() + ",\n  surname=" + getSurname() +
                ",\n  age=" + getAge().orElseThrow() + ",\n  city=" + getCity() + "}";
    }
}
