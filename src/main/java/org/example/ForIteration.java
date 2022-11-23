package org.example;

import java.util.Scanner;

public class ForIteration {

    public void basicIteration() {
        for(int i =0; i <5; i++) {
            System.out.println("Hello world!");
        }
    }

    public void triangle() {
        int num = 0;

        System.out.print("How many lines with * do you want to print ?. >");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        for (int i=0;i<num;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
