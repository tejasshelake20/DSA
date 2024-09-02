package QueueUsingStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
//            queue.add(1);
//            queue.add(2);
//            queue.add(3);
//            queue.add(4);
//        System.out.println(queue);

        QueueUsingStack obj = new QueueUsingStack();

//        obj.push(1);
//        obj.push(2);
//        obj.push(3);
//        obj.push(4);

        obj.pop();

        System.out.println(obj.peek());
        System.out.println(obj.empty());


    }
}

