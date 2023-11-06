package queue;

public class QueueArray {
    public static class Queuearr {
        int f = -1;
        int rear = -1;
        int arr[] = new int[100];
        int size = 0;

        public void add(int val) {
            if (rear == arr.length - 1) {
                System.out.println("queue full");
                return;
            }
            if (f == -1) {
                f = rear = 0;
                arr[0] = val;
            } else {
                arr[++rear] = val;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("empty");
                return -1;
            }
            f++;
            size--;
            return arr[f - 1];
        }

        public int peek() {
            return arr[f];
        }

        public void display() {
            if (size == 0) {
                System.out.println("empty queue");

            } else {
                for (int i = f; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queuearr q = new Queuearr();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());

    }
}
