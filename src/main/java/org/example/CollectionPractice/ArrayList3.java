package org.example.CollectionPractice;

import java.util.*;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(101);
        al.add(102);
        al.add(103111);
        al.add(104);
        al.add(105);
        al.add(1060000);
        al.add(107);
        al.add(108);
        al.add(109);

        ArrayList al2 = new ArrayList();
        al2.add(1000);
        al2.add(1001);
        al2.add(1002);
        al2.add(1003111);
        al2.add(1004);
        al2.add(1005);
        al2.add(1060000);
        al2.add(107);
        al2.add(108);
        al2.add(109);

//        findSeparatedWay1(al, al2);
//        findSeparatedWay2(al, al2);
//        listreverse(al);
        HashsetPractice1();

    }

    private static void HashsetPractice1() {
        List<String> al1 = Arrays.asList("Agyam", "Aju", "Akash", "akash", "agyam", "Karuna","Karuna","karuna");
        System.out.println(al1);
        HashSet<String> hs = new HashSet<>();
        for (String s : al1) {
            hs.add(s.toLowerCase());
        }
        System.out.println(hs);
    }

    private static void listreverse(ArrayList al) {
        LinkedList list = new LinkedList(al);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    private static void findSeparatedWay2(ArrayList al, ArrayList al2) {

        Set set = new HashSet<>(al2);
//        find common
        set.retainAll(al);
//        merged collection
        al.addAll(al2);

//        remove common
        al.removeAll(set);
        System.out.println(al);
    }

    private static void findSeparatedWay1(ArrayList al, ArrayList al2) {
        ArrayList nal = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            if (al2.contains(al.get(i))) {
            } else {
                nal.add(al.get(i));
            }
        }

        for (int i = 0; i < al2.size(); i++) {
            if (al.contains(al2.get(i))) {
            } else {
                nal.add(al2.get(i));
            }
        }
        System.out.println(nal);
    }
}
