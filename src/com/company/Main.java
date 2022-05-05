package com.company;

import static com.company.EqualsMethods.equalsMethod;
import static com.company.EqualsMethods.equalsIgnoreCaseMethod;

public class Main {

    public static void main(String[] args) {
        String str11 = "Я изучаю Java";                 //Задание на 6 слайде
        String str22 = "скоро стану программистом";
        char s = str11.charAt(0);
        char[] dst = new char[19];
        str22.getChars(6, 25, dst, 0);
        System.out.println(s + " " + new String(dst) + "\n");
//____________________________________________________________________________________________________

        String str1 = "Все в этой жизни замечательно";         //Задание на 7 слайде
        String str2 = "Все в этой жизни замечательно";
        int lenght1 = str1.length();
        int lenght2 = str2.length();
        char[] strF1 = new char[5];
        char[] strF2 = new char[5];
        str1.getChars((lenght1 - 5), lenght1, strF1, 0);
        str2.getChars((lenght2 - 5), lenght2, strF2, 0);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(strF1);
        System.out.println(strF2);
        System.out.println("Возвращается значение: " + equalsMethod(str1, str2));
        System.out.println("Возвращается значение: " + equalsIgnoreCaseMethod(str1, str2));
        if (equalsMethod(str1, str2) && equalsIgnoreCaseMethod(str1, str2) == true) {
            System.out.println("Последние 5 символов совпадают\n");
        } else {
            System.out.println("Последние 5 символов не совпадают\n");
        }
//_______________________________________________________________________________________

        boolean str111 = str1.endsWith("мечательно");     //Задание на 8 слайде
        boolean str222 = str2.endsWith("мечательно");
        if (str111 == str222) {
            System.out.println("Строки заканчиваются одинаковыми подстроками");
        } else {
            System.out.println("Строки заканчиваются не одинаковыми подстроками");
        }

        int check1 = str1.indexOf("Я");
        int check2 = str2.indexOf("Я");
        if (check1 >0 && check2 > 0) {
            System.out.println("символ 'Я' существует в обоих строках\n");
        } else {
            System.out.println("символ 'Я' не существует в обоих строках\n");
        }
//______________________________________________________________________________________________

        String str4 = "25 + 40 = 65";                 //Задание на 13 слайде

        System.out.println(str4);

        StringBuilder sb1 = new StringBuilder(str4);
        System.out.println(sb1.replace(8,9,"равно"));

        System.out.println(str4);

        StringBuilder sb2 = new StringBuilder(str4);
        sb2.deleteCharAt(8);
        System.out.println(sb2.insert(8,"равно"));
    }
}
