package cycle_7;

import java.util.Scanner;

/**
 * Задача №10_Циклы
 * Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
 * а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
 * Размерность матрицы задается пользователем.
 */

public class Cycle4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение опрелеяющее размерность массива(кол-во строк): ");
        int rows = scan.nextInt();
        System.out.println("Введите значение опрелеяющее размерность массива(кол-во столбцов): ");
        int colums = scan.nextInt();
        double[][] array = new double[rows][colums];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Присвойте значение  array[" + i + "][" + j +  "] +  элементу массива: ");
                array[i][j] = scan.nextDouble();
            }
        }
       for (int j =0; j < array[0].length; j++){
           System.out.println(array[0][j] * 3 + " ");
       }
    }
}
