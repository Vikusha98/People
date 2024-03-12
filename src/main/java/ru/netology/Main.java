package ru.netology;

public class Main {
    public static void main(String[] args) {
        try {
            Person mom = new Person.PersonBuilder()
                    .setName("Анна")
                    .setSurname("Вольф")
                    .setAge(31)
                    .setAddress("Сидней")
                    .build();
            Person son = mom.newChildBuilder()
                    .setName("Антошка")
                    .build();
            System.out.println("У " + mom + " есть сын, " + son);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person.PersonBuilder builder = new Person.PersonBuilder();
            builder.build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person.PersonBuilder builder = new Person.PersonBuilder();
            builder.setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}