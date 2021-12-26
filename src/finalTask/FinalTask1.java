package finalTask;

import java.util.Scanner;

/**
 * Итоговая задача №1
 * Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой. Пример для теста работы программы:
 *
 *
 * Курс доллара: 67,55
 * Количество рублей: 1000
 * Итого: 14,80 долларов
 */

public class FinalTask1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите курс доллара:");
        double Dollarrate = scan.nextDouble();
        System.out.println("Введите кол-во рублей, которое надо перести в доллары:");
        double AmontOfRubles  = scan.nextDouble();
        double result = AmontOfRubles/Dollarrate;
        System.out.println("Курс доллара: " + Dollarrate + "\nКоличество рублей: " + AmontOfRubles);
        System.out.printf("%s %.2f %s", "Итого:", result, "долларов");
    }
}
