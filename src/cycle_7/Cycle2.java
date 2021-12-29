package cycle_7;

import java.util.Scanner;

/**
 * Задача №8_ Циклы
 * Напишите программу, где пользователь вводит любое целое положительное число n.
 * А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */

public class Cycle2 {
    public static void main (String [] args){
        double sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        double positiveNumber = scan.nextDouble();
        for(int i =0;i < positiveNumber; i= i + 2){
                sum = sum +i;

        }
        System.out.println("Cумма всех нечетные чисел от 1 до введенного числа: " + sum);
    }
}
