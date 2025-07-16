package org.example.Numbersystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Modify 1
 * Convert Decimal to Binary
 * Input: 10 → Output: 1010
 */
public class DecimalaToBinary {
    public static void main(String[] args) {
       usingArray(10);
       withoutUsingArray(10);
       usingBitwiseOperator(10);

    }

    private static void usingBitwiseOperator(int i) {
        // to do
    }

    private static void withoutUsingArray(int i) {
        // to do
    }

    private static void usingArray(int value) { // 17 july 2025
//        initialization
        int i=0;
        int[] arr = new int[999];
//        finding the corosponding binary value
        while(value>=1){
            arr[i++]=value%2;
            value=value/2;
        }
//        printing in reverse
        for(int j=i-1;j>=0;j--){
            System.out.println(arr[j]);
        }
    }
}


