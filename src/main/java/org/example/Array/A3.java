package org.example.Array;

public class A3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arrRev = new int[10];
        int a = 100, sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = a++;
        }
        System.out.println("Array before reverse :");
        for(int i:arr){
            System.out.print(i+", ");
        }
        int index=0;
        for(int i=arr.length-1;i>=0;i--){
            arrRev[index++]=arr[i];
        }
        System.out.println();
        System.out.println("Array After reverse :");
        for(int i:arrRev){
            System.out.print(i+", ");
        }

    }
}
