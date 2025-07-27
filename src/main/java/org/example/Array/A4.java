package org.example.Array;


import java.util.*;

public class A4 {
    public static void main(String[] args) {
        String[] arr = {"abc", "bca", "xyz", "zyx", "hello", "olleh", "test", "sett", "abc", "def"};









//        Map<String, List<String>> map = new HashMap<>();
//        int i=0;
//        int val = count(arr[i++]);
//        List<String> list = new ArrayList<>();
//        for(String s:arr){
//            if(val==count(s)){
//                list.add(s);
//            }
//        }
    }

    private static void way2(String[] arr){
        List<String> list = new ArrayList<>();
        Map<String,List<String>> maplist=new HashMap<>();
        Map<String, Integer> map = new HashMap<>();
        for(String s:arr){
            list.add(s);
        }
        ListIterator<String> litr= list.listIterator();
        while (litr.hasNext()){
            String s=litr.next();
            int i =count(s);
            map.put(s,i);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            Arrays.sort(arr);
        }

    }
// bca -> abc
    private static String sorted(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        for(char c:arr){
            sb.append(c);
        }
       return sb.toString();
    }

    private static int count(String s) {
        int i=0;
        for(char c:s.toCharArray()){
            i=i+c;
        }
        return i;
    }

    private static void way1(String[] arr){
        String[] arr1=new String[arr.length];
        int i=0;
        for(String s:arr){
            arr1[i++]=sorted(s);
        }
        List<String> list = new ArrayList<>();
        for(String s:arr1){
            list.add(s);
        }
        System.out.println(list);
    }
}
