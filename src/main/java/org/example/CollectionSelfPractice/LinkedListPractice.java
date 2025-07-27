package org.example.CollectionSelfPractice;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        addAndIterate(ll);
        addFirstAndLast(ll);
        removeFirstAndLast(ll);
        peekAndPool(ll);
    }

    private static void peekAndPool(LinkedList ll1) {
        LinkedList ll = new LinkedList(ll1);
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll.poll());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println(ll);
        System.out.println("===========================Use peek(), peekFirst(), peekLast(), poll(), pollFirst(), pollLast()=====================");
    }

    private static LinkedList removeFirstAndLast(LinkedList ll1) {
        LinkedList ll = new LinkedList(ll1);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        System.out.println("===========================Use removeFirst and removeLast=====================");
        return ll1;
    }

    private static LinkedList addFirstAndLast(LinkedList ll1) {
        LinkedList ll = new LinkedList(ll1);
        ll.addFirst("Jamtalia");
        ll.addLast("Jharsuguda");
        System.out.println(ll);
        System.out.println("===========================Use addFirst and addLast=====================");
        return ll;
    }

    private static LinkedList addAndIterate(LinkedList ll) {
//        Add 5 cities to a LinkedList<String> and print them using a for-each loop.
        ll.addAll(Arrays.asList("Sundargarh","Bhubaneswar","Bangalore","goa","Delhi"));
        for(Object o:ll){
            System.out.println(o);
        }
        System.out.println("===========================Add and Iterate=====================");
        return ll;
    }
}
