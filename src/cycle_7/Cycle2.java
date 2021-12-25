package cycle_7;

import java.util.Scanner;

public class Cycle2 {
    public static void main (String [] args){
        double sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        double positiveNumber = scan.nextDouble();
        for(int i =0;i < positiveNumber; i++){
            if (i%2!=0){
                sum = sum +i;
            }
        }
        System.out.println("Cумма всех нечетные чисел от 1 до введенного числа: " + sum);
    }
}
