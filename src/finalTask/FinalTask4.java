package finalTask;

import java.util.Scanner;

/**
 * Итоговая задача №4
 * Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”.
 *
 *
 * У пользователя есть 3 попытки, чтобы отгадать загадку.
 *
 * Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
 *
 * Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
 *
 * Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
 *
 * Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны. Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
 *
 * Если пользователь, использовавший подсказку, ошибется,
 * вывести “Обидно, приходи в другой раз” и завершить работу.
 */

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
