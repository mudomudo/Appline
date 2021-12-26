package finalTask;

import java.util.Scanner;

/**
 * Итоговая задача № 3
 * Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки. Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.
 *
 * Пример для теста работы программы:
 *
 * Количество строк: 3
 * Строка 1: привет
 * Строка 2: анализ
 * Строка 3: 111111111111
 * Ответ: привет
 */

public class FinalTask3 {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввыедите количество строк: ");
        int NumberOfLines = scan.nextInt();
        scan.nextLine();
        String[] wordsArr = new String[NumberOfLines];
        for (int j = 0; j < wordsArr.length; j++) {
            System.out.println("Введите cтроку " + x + ":");
            wordsArr[j] = scan.nextLine();
            x = x +1;
        }
        String maxUniqueWord = null;
        int uniqueSymbols = 0;
        for (String word : wordsArr) {
            int count = 0;
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        if (i == j) {
                            count++;
                        }
                        break;
                    }
                }
            }
            if (count > uniqueSymbols) {
                uniqueSymbols = count;
                maxUniqueWord = word;
            }
        }
        System.out.println("Количество строк: "+ NumberOfLines);
        for (int j = 0; j < wordsArr.length; j++) {
            System.out.println("Строка " + y + ": " + wordsArr[j]);
            y = y+1;
        }
        System.out.println("Ответ: " + maxUniqueWord);
    }
}
