package org.example.Array;

public class A2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 100, sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = a++;
        }


        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
