package operators_6;


import java.util.Scanner;

/**
 * Задача №5_ Операторы
 * Напишите простой калькулятор:
 *
 * Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
 * В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */

public class Operators2 {
    public static void main(String[] args) {
        //ввести 2 числа и символ с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число x: ");
        double x = scanner.nextDouble();
        System.out.print("введите число y: ");
        double y = scanner.nextDouble();
        System.out.print("введите арифметическое действие: ");
        String z = scanner.next();
        //калькулятор
        switch(z) {
            case "+":
                System.out.print(x+y);
                break;
            case "-":
                System.out.print(x-y);
                break;
            case "*":
                System.out.print(x*y);
                break;
            case "/":
                System.out.print(x/y);
                break;
            default:
                System.out.print("действие невозможно, введите одну из доступных операций: +, -, *, /");
                break;
        }
    }
}
