package cycle_7;

import java.util.Scanner;

/**
 * Задача №9_ Циклы
 * Напишите программу:
 *
 *
 * Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
 *
 * Посчитайте среднее арифметическое элементов массива.
 *
 * После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */

public class Cycle3 {
    public static void main(String[]args){
        double sum = 0;
        double average;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение опрелеяющее размерность массива: ");
        int AmountOfElements = scan.nextInt();
        double [] array = new double[AmountOfElements];
        for (int i =0; i<array.length;i++)
        {
            System.out.println("Присвойте значение " + i + " элементу массива: ");
            array[i] = scan.nextDouble();
        }
        for (int i =0; i<array.length;i++){
            sum= sum+array[i];
        }
        average = sum/array.length;
        //System.out.println("Среднее арифметическое: " + average);
        System.out.print("Итоговый массив:{ ");
        for (int i =0; i<array.length;i++)
        {
            System.out.print(array[i] * average + " ");
        }
        System.out.println("}");
    }
}
