package com.company;

import com.company.base.Box;
import com.company.model.Car;
import com.company.model.Room;
import com.company.util.MaxPowerCarComparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(10.180);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(10.165);

        System.out.println(bigDecimal1.equals(bigDecimal2));

        System.out.println(bigDecimal1.compareTo(bigDecimal2));

        if (bigDecimal1.compareTo(bigDecimal2) == 0) {
            System.out.println("они равны");
        }

        Car car1 = new Car("gray", 250, "Ford");
        Car car2 = new Car("red", 300, "Opel");
        Car car3 = new Car("green", 200, "Oka");
        Car car4 = new Car("green", 100, "Oka");
        Car car5 = new Car("ellow", 300, "Opel");
        Car car6 = new Car("black", 350, "Ford");
        Car car7 = new Car("black", 300, "Ford");

        System.out.println(car1);

        System.out.println();

        List<Car> cars = new ArrayList<Car>() {{
            add(car1);
            add(car2);
            add(car3);
            add(car4);
            add(car5);
            add(car6);
            add(car7);
        }};

        cars.stream().sorted().forEach(car -> System.out.println(car));

        System.out.println();

        Comparator powerComparator = new MaxPowerCarComparator();
        cars.stream().sorted(powerComparator).forEach(car -> System.out.println(car));

        System.out.println();

//        cars.stream().sorted().forEach(car -> {
//            System.out.println(car);
//            //можно добавлять еще команды
//        });

//        List<Integer> numbers = new ArrayList<Integer>() {{
//            add(3);
//            add(10);
//            add(8);
//            add(6);
//        }};
//        numbers.stream().sorted().forEach(n -> System.out.println(n));
        Room room1 = new Room(2000, 3000, 2700);
        Room room2 = new Room(2500, 4000, 2650);
        Room room3 = new Room(3000, 3500, 2500);

        List<Room> rooms = new ArrayList<Room>() {{
            add(room1);
            add(room2);
            add(room3);
        }};

        rooms.stream().sorted().forEach(room -> System.out.println(room));

        System.out.println();

        Box<String> boxString = new Box<>("Hello");
        System.out.println(boxString.getT());

        Box<Integer> boxInteger = new Box<>(45);
        System.out.println(boxInteger.getT());

        List<Box> boxes = new ArrayList<Box>() {{
            add(boxString);
            add(boxInteger);
        }};
        boxes.stream().filter(b -> b.getT().equals("Hello")).forEach(b -> System.out.println(b));

    }
}
