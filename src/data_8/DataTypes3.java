package data_8;

import java.util.Scanner;

/**
 * Задача №13_ Работа с данными
 * Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
 *
 *
 * Выведите слова, состоящие только из латиницы.
 *
 * Выведите количество этих слов.
 */

public class DataTypes3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean flag = false;
        int counter = 0;

        String[] sepWords = str.split(" ");
        System.out.println("Слова, состоящие из латиницы: ");
        for (int i = 0; i < sepWords.length; i++) {
            char[] charArray = sepWords[i].toLowerCase().toCharArray();
            for(int j=0;j<charArray.length;j++) {
                flag = ((int) charArray[j] >= 97 & (int) charArray[j] <= 122);
                if (!flag) {break;}
            }
            if (flag == true) {
                System.out.println(sepWords[i]+" ");
                counter = ++counter;
            }
        }
        System.out.println();
        System.out.println("Количество латинских слов: ");
        System.out.println(counter);
    }
}
