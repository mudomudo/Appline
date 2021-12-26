package data_8;

import java.util.Scanner;

/**
 * Задача №11_Работа с данными
 * Напишите программу:
 *
 * Ввести первое  число с клавиатуры и записать его в строковую переменную.
 *
 * Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
 *
 * Сравнить 2 числа и вывести большее на экран .
 *
 * Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */

public class DataTypes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //пользователь вводит числа с клавиатуры
        System.out.print("Введите число: ");
        String x = scanner.nextLine();
        System.out.print("Введите число: ");
        int y = scanner.nextInt();

        //Приводим числа к одному типу
        double x1 = Double.parseDouble(x);


        //Выводим в консоль максимальное число
        System.out.print("Максимальное число: ");
        System.out.println(Math.max(x1,y));

        //Выводим в консоль минимальное число
        System.out.print("Минимальное число: ");
        System.out.println(Math.min(x1,y));

    }
}
