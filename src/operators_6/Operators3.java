package operators_6;

import java.util.Scanner;

public class Operators3 {
    public static void main(String[] args) {
        //выбираем опции конвертации
        Scanner scanner = new Scanner(System.in);
        System.out.println("варианты конвертации: 1 - расстояние, 2 - масса");
        int x = scanner.nextInt();
        //кол-во конвертируемых единиц
        double z;

        switch (x){
            case 1:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int distance = scanner.nextInt();
                System.out.println("Введите число:");
                z = scanner.nextDouble();
                switch (distance){
                    case 1:
                        System.out.println("метры - " + z);
                        System.out.println("мили - " + z*0.0006);
                        System.out.println("ярды - " + z*1.094);
                        System.out.println("фут - " + z*3.281);
                        break;
                    case 2:
                        System.out.println("метры - " + z/0.0006);
                        System.out.println("мили - " + z);
                        System.out.println("ярды - " + z*1760);
                        System.out.println("фут - " + z*5280);
                        break;
                    case 3:
                        System.out.println("метры - " + z/1.094);
                        System.out.println("мили - " + z/1760);
                        System.out.println("ярды - " + z);
                        System.out.println("фут - " + z*3);
                        break;
                    case 4:
                        System.out.println("метры - " + z/3.281);
                        System.out.println("мили - " + z/5280);
                        System.out.println("ярды - " + z/3);
                        System.out.println("фут - " + z);
                        break;
                }
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт");
                int weight = scanner.nextInt();
                System.out.println("Введите число:");
                z = scanner.nextDouble();
                switch (weight) {
                    case 1:
                        System.out.println("килограммы - " + z);
                        System.out.println("фунты - " + z*2.205);
                        break;
                    case 2:
                        System.out.println("килограммы - " + z/2.205);
                        System.out.println("фунты - " + z);
                        break;
                }
                break;
            default:
                System.out.println("Выберите одно из допустимых значений");
                break;
        }

    }
}
