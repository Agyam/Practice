package org.example.Array;

public class A1 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int a = 100;
        for(int i=0;i<10;i++){
            arr[i]=a++;
        }

        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int i=0;i<10;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
