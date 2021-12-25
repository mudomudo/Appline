package arrays_3;

public class Arrays1 {
    public static void main(String[]args)
    {
        int[]array = {1,2,3,4,5};
        int i;
        int sum;
        int mid =array[((array.length - 1)+1)/2]; //формула действует если длина массива нечетное!

        i = array[0];
        array[0] = array[array.length - 1] ;      //смена первого и последнего элемента массива
        array[array.length - 1] = i;


        System.out.println("Значение последнего элемента в массиве после смены: "+ array[4]); //проверка операции смены

        sum = array[0] + mid;
        System.out.println("Сумма первого и среднего элемент: " + sum);

    }
}
