package com.company.model;

public class Room implements Comparable<Room>{
    private int lenght;
    private int widht;
    private int height;

    public Room(int lenght, int widht, int height) {
        this.lenght = lenght;
        this.widht = widht;
        this.height = height;
    }

    @Override
    public String toString() {
        return lenght + " " + widht + " " + height;
    }


    @Override
    public int compareTo(Room arg0) {
        return this.widht - arg0.widht;
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