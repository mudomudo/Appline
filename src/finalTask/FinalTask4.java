package finalTask;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s1 = "Заархивированный вирус";
        String s2 = "Подсказка";
        boolean exit1 = false;
        boolean exit2 = false;

        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Введите ответ: ");

        for(int i = 1; i <= 3; i++){
            if (exit1 == true || exit2 == true  )
                break;

            String answer1= scan.nextLine();
            if (answer1.equals(s2) && i==2){
                System.out.println("Подсказка уже не доступна");
                i = i - 1;
            }
            else if (answer1.equals(s2) && i==3){
                System.out.println("Подсказка уже не доступна");
                i = i - 1;
            }

            else
                switch (answer1){
                    case ("Заархивированный вирус"):
                        System.out.println ("Правильно!");
                        exit1 = true;
                        break;

                    case ("Подсказка"):
                        System.out.println ("Вирус в ZIP, или RAR, или RAR4 формате");
                        String answer2= scan.nextLine();
                        if (answer2.equals(s1)) {
                            System.out.println("Правильно!");
                            exit2 = true;
                            break;
                        }
                        else {
                            System.out.println("Обидно, приходи в другой раз");
                            exit2 = true;
                            break;
                        }

                    default:
                        if (i == 1){
                            System.out.println("Подумай еще!");
                        }
                        else if (i ==  2){
                            System.out.println("Подумай еще!");
                        }
                        else if (i ==3 ) {
                            System.out.println("Обидно, приходи в другой раз");
                        }
                }
        }
    }

}
