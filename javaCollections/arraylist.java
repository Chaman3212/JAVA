package javaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist {
    static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(3);
        ar.add(4);
        System.out.println(ar);
        ar.remove(2);
        System.out.println(ar);

        Collection<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        ar.addAll(list);
        System.out.println(ar);
        ar.removeAll(list);



//        System.out.println(ar);
//        System.out.println(ar.contains(3));

    ArrayList<Integer> l1 = new ArrayList<>();
    l1.add(3);
    l1.add(1);
    l1.add(3);
    l1.add(23);
    l1.add(2);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);

    }
}
