package org.example;

import java.util.*;

public class StackAndQueue {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public void staticStackEx1() {
        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른 후 =");
        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른 후 =");
        printStatus();

        goForward();
        System.out.println("= '앞으로' 버튼을 누른 후 =");
        printStatus();

        goURL("codechobo.com");
        System.out.println("= 새로운 주소로 이동 후 =");
        printStatus();
    }

    public static void printStatus() {
        System.out.println("back:"+ back);
        System.out.println("forward:"+ forward);
        System.out.println("현재화면은 '" + back.peek() + "'입니다.");
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }

    public static void goForward() {
        if(!forward.empty())
            back.push(forward.pop());
    }

    public static void goBack() {
        if(!back.empty())
            forward.push(back.pop());
    }

    public void expValidCheck(String expression) {
        Stack st = new Stack();
        System.out.println("expression:"+ expression);

        try {
            for(int i=0; i < expression.length();i++) {
                char ch = expression.charAt(i);

                if(ch =='(') {
                    st.push(ch+"");
                } else if (ch == ')') {
                    st.pop();
                }
            }

            if(st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }

    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;
    public void queueEx1() {



        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while(true) {
            System.out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if("".equals(input)) continue;

                if(input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input);

                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while(it.hasNext())
                        System.out.println(++i + "." + it.next());
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
        }
    }

    public static void save(String input) {
        if(!"".equals(input))
            q.offer(input);

        if(q.size() >MAX_SIZE)
            q.remove();
    }

    public void priorityQueueEx() {
        Queue pq = new PriorityQueue();
        pq.offer(3);
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);
        Object obj = null;

        while((obj = pq.poll()) != null)
            System.out.println(obj);
    }

}
