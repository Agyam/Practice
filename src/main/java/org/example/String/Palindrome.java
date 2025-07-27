package org.example.String;

public class Palindrome {
//    public boolean palindrome(String s){
//
//    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Javavaj");
        if(sb.equals(sb.reverse())){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Is Not Palindrome");

        }

    }
//    public boolean palindrome(String s){
//        StringBuilder sb = new StringBuilder(s);
//        if(sb.equals(sb.reverse())){
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Palindrome p1 = new Palindrome();
//        System.out.println(p1.palindrome("Javavaj"));
//    }
}
