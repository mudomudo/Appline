package data_8;

import java.util.Arrays;
import java.util.Random;

/**
 * Задача №14_ Работа с данными
 * Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
 *
 *
 * Выведите максимальный и минимальный элемент массива.
 *
 * Из максимального и минимального значения выведите наибольшее по модулю.
 */

public class DataTypes4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] someArray = new int[15];

        //вывод в консоль всех элементов массива
        for (int i = 0; i < someArray.length; i++) {
            int result = 20 - random.nextInt(40);
            someArray[i] = result;
            System.out.print(result+"; ");
        }
        System.out.println();

        //вывод в консоль максимального и минимального элементов
        int max = someArray[0];
        int min = someArray[0];
        for (int k=1;k<someArray.length;k++){
            max = Math.max(max,someArray[k]);
            min = Math.min(min,someArray[k]);
        }
        System.out.print("Максимальный элемент массива: ");
        System.out.println(max);
        System.out.print("Минимальный элемент массива: ");
        System.out.println(min);
        System.out.print("Наибольший элемент по модулю: ");
        System.out.println(Math.max(Math.abs(max),Math.abs(min)));
    }

}
