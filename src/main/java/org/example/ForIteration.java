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

    public void enhancedForStatement() {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i=0;i<arr.length;i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        for (int tmp : arr) {
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum="+sum);
    }

    public void iterationWithName() {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        outer:
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료: 0)>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1<= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
                continue;
            }

            for (;;) {
                System.out.print("계산할 값을 입력하세요. (계산 종료: 0, 전체 종료: 99)>");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if(num == 0)
                    break;

                if(num==99)
                    break outer;

                switch (menu) {
                    case 1:
                        System.out.println("result=" + num*num);
                        break;
                    case 2:
                        System.out.println("result=" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result=" + Math.log(num));
                        break;
                }
            }
        }
    }
}
