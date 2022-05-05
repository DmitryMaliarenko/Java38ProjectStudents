package com.company;

import static com.company.OverloadMethod.areaOfACircle;
import static com.company.ArrayToString.arrayToString;
import static com.company.Recursion.recursion;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];                            //Задание №1 мин, макс, ср
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(arrayToString(array));

        double min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        double max = array[0];
        for (int num1 : array) {
            if (num1 > max) {
                max = num1;
            }
        }
        double average = (max - min) / 2;
        System.out.println("минимальное число массива - " + min);
        System.out.println("максимальное число массива - " + max);
        System.out.println("Среднее значение чисел массива - " + average + "\n");
//_____________________________________________________________________________________________

        int[] array1 = array;          //Задание №2 сортировка пузырьком, вставками
        int[] array2 = array;
        Sort.bubbleSort(array1);
        System.out.println("Вывод массива, отсортированного Пузырьком:\n" + arrayToString(array1) + "\n");

        Sort.insertionSort(array2);
        System.out.println("Вывод массива, отсортированного Вставками:\n" + arrayToString(array2) + "\n");
//______________________________________________________________________________________________

        int a = 3;           // Задание №3 Не простые (составные) числа
        int b = 120;
        System.out.println("Не простые числа в промежутке [3, 120]: ");
        for (int i = a; i <= b; i++) {
            if (IsPrime.isPrime(i)) {
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
//_____________________________________________________________________________________________

        int[] mass1 = new int[]{1, 5, 6, 7, 4, 6};    //Задание №4 Вхождения 2 в 1 (не доделал)
        int[] mass2 = new int[]{4, 5, 8, 7, 3, 1};
        int[] newMass = null;
        System.out.println("Массив 1: " + Arrays.toString(mass1));
        System.out.println("Массив 2: " + Arrays.toString(mass2));
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] == mass2[i]) {
                mass1[i] = mass1[i+1];
                newMass = new int[mass1.length - 1];
                for (int index = i; index < newMass.length; index++) {
                    newMass[index] = mass1[index];
                }

            }
        }
        System.out.println("New Array is: " + Arrays.toString(newMass) + "\n");
//_________________________________________________________________________________________________

        Scanner scanner = new Scanner(System.in);       //Рекурсия задание 1
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        System.out.println(recursion(n) + "\n");
//_________________________________________________________________________________________________

                                                         //Рекурсия задание 2 (не делал)
//_________________________________________________________________________________________________

        System.out.println(areaOfACircle(5));           //Перегрузка методов
        System.out.println(areaOfACircle(7,true));
        System.out.println(areaOfACircle(7.5,false));
    }
}

