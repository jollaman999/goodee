package chap15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx1 {
    public static void main(String[] args) {
        String[] cars = {"소나타", "그랜저", "SM5", "K9"};
        Stack<String> stack = new Stack<>();

        for (String s : cars)
            stack.push(s);
        System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
        System.out.println(stack.peek());
        System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
        System.out.println(stack.pop());
        System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
        System.out.println(stack.peek());

        System.out.println("=======================");
        System.out.println(stack.size());

        for (int i = 0; i < stack.size(); i++)
            System.out.println(stack.pop());
        System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
        System.out.println(stack.peek());
        System.out.println("=======================");

        Queue<String> queue = new LinkedList<>();
        for (String s : cars)
            queue.offer(s);
        System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
        System.out.println(queue.peek());
        System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
        System.out.println(queue.poll());
        System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
        System.out.println(queue.peek());
        for (int i = 0; i < queue.size(); i++)
            System.out.println(queue.poll());
        System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
    }
}
