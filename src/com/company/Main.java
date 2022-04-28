package com.company;

import com.company.model.Dog;
import com.company.model.Raccoon;
import com.company.util.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        Converter<String, Integer> converter = el -> el.toString();

        int age = 45;
        String ageStr = converter.convert(age);

        Converter<Raccoon, Dog> dogConverter = dog -> new Raccoon(dog.getName(), dog.getAge(), "Grey");

        Dog dog = new Dog("Шарик", 10, 10);
        Raccoon raccoon = dogConverter.convert(dog);

        System.out.println(raccoon.getColor() + " " + raccoon.getName() + " " + raccoon.getAge());

        List<String> strings = new ArrayList<>();
        strings.add("new");
        strings.add("hello");
        strings.add("by");
        strings.forEach(s -> {
            if(s.length() == 3) {
                System.out.println(s);
            }
        });

        strings.stream()                              //терминальный
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));


        Stream<String> listStream = strings.stream() //промежуточный
                .filter(s -> s.length() == 3);



        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        List<Raccoon> raccoonList = dogs.stream()
        dogs.stream()
                .map(dog1 -> dogConverter.convert(dog1))
                .collect(Collectors.toList());



//        System.out.println(Converter.isElement("111"));
//
//        String b = "qwerty";
//        Integer c = 5;
//        Object o;
//
//
//        print(b);
//        print(c);
//    }
//
//    public static void print(Object o) {
//        System.out.println(o);
    }
}
