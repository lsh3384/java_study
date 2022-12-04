package org.example;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Vector;

public class CollectionsFramework {
    public void arrayListEx1() {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);

        print(list1, list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i = list2.size() -1; i>=0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println();
    }

    public void arrayListEx2() {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();
        System.out.println(length);

        List list = new ArrayList(length/LIMIT + 10);

        for(int i = 0; i < length; i+=LIMIT) {
            if(i+LIMIT < length) {
                list.add(source.substring(i, i+LIMIT));
            }
            else {
                list.add(source.substring(i));
            }
        }

        for(int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void vectorEx1() {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize();
        System.out.println("=== After trimToSize ===");
        print(v);

        v.ensureCapacity(6);
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        v.setSize(7);
        System.out.println("=== After setSize(7) ===");
        print(v);

        v.clear();
        System.out.println("=== After clear() ===");
        print(v);
    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size: " + v.size());
        System.out.println("capacity: " + v.capacity());
    }

    public void arrayListLinkedListTest() {
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        System.out.println("= 순차적으로 추가하기 =");
        System.out.println("ArrayList : " + add1(al));
        System.out.println("LinkedList: " + add1(ll));

        System.out.println();
        System.out.println("= 중간에 추가하기 =");
        System.out.println("ArrayList : " + add2(al));
        System.out.println("LinkedList: " + add2(ll));

        System.out.println();
        System.out.println("= 중간에서 삭제하기 =");
        System.out.println("ArrayList : " + remove1(al));
        System.out.println("LinkedList: " + remove1(ll));

        System.out.println();
        System.out.println("= 순차적으로 삭제하기 =");
        System.out.println("ArrayList : " + remove2(al));
        System.out.println("LinkedList: " + remove2(ll));
    }

    public static long add1(List list) {
        long start = System.currentTimeMillis();
        for(int i=0; i<1000000;i++) list.add(i+"");
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long add2(List list) {
        long start = System.currentTimeMillis();
        for(int i=0; i<10000;i++) list.add(500, "X");
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove1(List list) {
        long start = System.currentTimeMillis();
        for(int i=list.size()-1; i >= 0; i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove2(List list) {
        long start = System.currentTimeMillis();
        for(int i=0; i<10000;i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}

