package org.example;

import java.util.*;

public class HastSetStudy {
    public void hashSetEx1() {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for(int i =0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set);
    }

    public void hashLotto () {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
