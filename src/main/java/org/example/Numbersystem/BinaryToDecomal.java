package org.example.Numbersystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class BinaryToDecomal {
    public static void main(String[] args)  {
//        String binary="010198";
//        int decimal = Integer.parseInt(binary, 2); // base 2
//        System.out.println("Decimal value: " + decimal);
        System.out.println(giveDecimal("1010"));
        System.out.println(giveDecimal("01011O"));
    }

    private static int giveDecimal(String number)   {
        int num=0;
        boolean b=checkNumber(number);
        if(b){
            num = Integer.parseInt(number, 2); // base 2
            return num ;
        }else {
            try {
                throw new NumberFormatException("For input string:"+number);
            }catch (NumberFormatException e){
                System.err.println("NumberFormatException : "+e.getMessage());
                return -1;
            }
        }
    }

    private static boolean checkNumber(String str) {
        boolean b=true;
        Map<Character,Integer> map = new HashMap<>();
        for (char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
           if(entry.getKey()=='0' || entry.getKey()=='1') {

           }else {
               b=false;
           }
        }
        return b;
    }
}
