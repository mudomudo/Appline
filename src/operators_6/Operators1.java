package operators_6;
import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
        //ввести 3 числа с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число x: ");
        double x = scanner.nextDouble();
        System.out.print("введите число y: ");
        double y = scanner.nextDouble();
        System.out.print("введите число z: ");
        double z = scanner.nextDouble();
        double avg = (x+y+z)/3;
        double div = Math.floor(avg/2);
        String answer = (div>3)?"Программа выполнена корректно":" ";
        System.out.println(answer);

    }
}
