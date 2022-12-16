package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorStudy {
    public void iteratorEx1() {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }

    public void listIteratorEx1() {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it = list.listIterator();

        while(it.hasNext()) {
            System.out.print(it.next());
        }

        System.out.println();

        while(it.hasPrevious()) {
            System.out.print(it.previous());
        }

        System.out.println();
    }

    public void iteratorEx2() {
        ArrayList original = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        for(int i =0; i < 10; i++) {
            original.add(i+"");
        }

        Iterator it = original.iterator();

        while(it.hasNext()) {
            copy1.add(it.next());
        }

        System.out.println("= Original에서 copy1로 복사(copy =");
        System.out.println("original:" + original);
        System.out.println("copy1:" + copy1);
        System.out.println();

        it = original.iterator();

        while(it.hasNext()) {
            copy2.add(it.next());
            it.remove();
        }

        System.out.println("= Original에서 copy2로 이동(move) =");
        System.out.println("original:" + original);
        System.out.println("copy2:"+ copy2);
    }
}
