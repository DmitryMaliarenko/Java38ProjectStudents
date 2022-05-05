package com.company.model;

public class Car implements Comparable<Car>{
    private String color;
    private int power;
    private String model;

    public Car(String color, int power, String model) {
        this.color = color;
        this.power = power;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model + " " + color + " " + power;
    }

    @Override
    public int compareTo(Car arg0) {
        int rez = this.model.compareTo(arg0.model);
        if (rez == 0) {
            rez = this.color.compareTo(arg0.color);
            if (rez == 0) {
                rez = this.power - arg0.power;
            }
        }
        return rez;
        //получаем значение рассчета
        //сравниваем с нулем
        //>0 || ==0  || <0
    }
}

//    @Override
//    public int compareTo(Car arg0) {
//        int rez = 0;
//        if( this.power == arg0.power) {
//            rez = 0;
//        }
//        if( this.power > arg0.power) {
//            rez = 1;
//        }
//        if( this.power < arg0.power) {
//            rez = -1;
//        }
//        return rez;
//        //return this.power - arg0.power;  //
//
//        //1 получаем значение расчета
//        //2 сравнение полученного результата с нулем
//        //3 >0 || = 0|| <0 ->
//    }