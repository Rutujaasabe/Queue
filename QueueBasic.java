package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // System.out.println(q);
        // // q.poll();
        // System.out.println(q.poll());
        // System.out.println(q);
        // System.out.println(q.remove(4));
        // System.out.println(q.remove(7));

        Queue<Integer> helper = new LinkedList<Integer>();
        while (q.size() > 0) {
            System.out.print(q.peek() + " ");
            helper.add(q.poll());
        }
        while (helper.size() > 0) {
            q.add(helper.poll());

        }
    }
}