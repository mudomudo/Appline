package finalTask;

import java.util.Scanner;

/**
 * Итоговая задача №2
 * Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.  Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’. Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке. Нужно найти неизвестное.
 *
 * Пример для теста работы программы:
 *
 * Ввод: x+5=7
 * Вывод: 2
 * Ввод: 3-x=9
 * Вывод: -6
 * Ввод: 3-3=x
 * Вывод: 0
 */

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввод: ");
        String line = scanner.nextLine();

        char[] equation = line.toCharArray();
        int x = line.indexOf('x');

        int result=0;
        int a = Character.getNumericValue(equation[0]);
        int b = Character.getNumericValue(equation[2]);
        int c = Character.getNumericValue(equation[4]);

        if (equation.length<6){

            if (equation[1]=='+'){
                switch (x) {
                    case (0):
                        result = c-b;
                        break;
                    case (2):
                        result = c-a;
                        break;
                    case (4):
                        result = a+b;
                        break;
                }
                System.out.println("Вывод: "+result);
            } else if (equation[1]=='-') {
                switch (x) {
                    case (0):
                        result = c+b;
                        break;
                    case (2):
                        result = a-c;
                        break;
                    case (4):
                        result = a-b;
                        break;
                }
                System.out.println("Вывод: "+result);
            } else {
                System.out.println("Вы ввели некорретный математический знак");
            }
        } else {
            System.out.println("Количество символов уравнения не должно превышать 5");
        }
    }
}
