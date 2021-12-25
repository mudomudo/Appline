package finalTask;

import java.util.Scanner;

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
