package queue;

public class QueueLL {
    public static class Node {
        int val;
        Node next;

        public static class Queue1 {
            Node head = null;
            Node tail = null;
            int size = 0;

            public void add(int x) {
                Node temp = new Node();
                temp.val = x;
                if (size == 0) {
                    temp = head;
                    temp = tail;
                } else {
                    tail.next = temp;
                    tail = temp;
                }
                size++;
            }

            public int peek() {
                if (size == 0) {
                    System.out.println("empty");
                    return -1;
                }
                return head.val;
            }

            public int remove() {
                if (size == 0) {
                    System.out.println("empty");
                    return -1;
                }
                int x = head.val;
                head = head.next;
                size--;
                return x;
            }

            public void display() {
                if (size == 0) {
                    System.out.println("empty");
                    return;
                }
                Node temp = head;
                while (temp != null) {
                    System.out.println(temp.val + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Queue1 ql = new Queue1();

        ql.add(1);
        ql.add(2);
        ql.add(3);
        ql.display();
        System.out.println(ql.peek());
    }
}
