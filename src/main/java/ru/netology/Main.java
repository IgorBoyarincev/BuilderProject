package ru.netology;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .setName("Ivan")
                .setSurname("Ivanov")
                .setAge(40)
                .setCity("Moscow")
                .build();
        Person son = person.newChildBuilder()
                .setName("Anton")
                .build();
        System.out.println("У отца\n" + person + "\nесть сын\n" + son);

    }
}
