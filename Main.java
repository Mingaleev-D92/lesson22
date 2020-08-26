package ru.innopolis.university.mingaleev.homework_22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Андрей", 21));
        personList.add(new Person("Айрат", 22));
        personList.add(new Person("Александр", 23));
        personList.add(new Person("Анна", 24));
        personList.add(new Person("Аида", 25));

        personList.sort(new PersonSuperComparator());
        System.out.println(personList);

    }


}
