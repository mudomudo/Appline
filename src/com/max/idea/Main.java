package com.max.idea;

public class Main {

    public static void main(String[] args){
    int[] arr = {1,2,3,4,5};

    int tmp = arr[0];
    arr[0] = arr[4];
    arr[4] = tmp;

    int sum = arr[0]+arr[arr.length/2];
    System.out.println(sum);

    }
}
