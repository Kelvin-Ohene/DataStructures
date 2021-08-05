import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int queue_size = 12;
        ArrayBasedQueue<Integer> queue = new ArrayBasedQueue<>(queue_size);
        print(queue);

        // populate queue with random integers between 0 and 10 (inclusive)
        int[] added_elements = new int[12];
        for (int i = 0; i < 12; i++) {
            int element = (int) (Math.random() * 11);
            added_elements[i] = element;
            queue.enqueue(element);
        }

        print(queue);

        // print("Order of addition " + Arrays.toString(added_elements));

        // repetitive removal
        int[] removed = new int[queue.getSize()];
        for (int i = 0; i < queue_size; i++) {
            int element = queue.dequeue();
            removed[i] = element;
        }
        print("removed element" + Arrays.toString(removed));

        /**
         * Print the elements of the queue in the right order i.e. the head first, and
         * the tail last. In your codes to demonstrate your solution, ensure that the
         * head of the queue is in the middle of the array backing the queue.
         */
        // Put your codes here

        int queue_size1 = 7;
        ArrayBasedQueue<Integer> fq = new ArrayBasedQueue<>(queue_size1);

        fq.enqueue(10);
        fq.enqueue(1);
        fq.enqueue(9);
        fq.enqueue(0);
        fq.enqueue(8);
        fq.enqueue(6);
        fq.enqueue(67);
        print("intial enqueues " + fq);
        fq.dequeue();
        print("Output after first dequeue " + fq);
        fq.enqueue(22);
        print("output after last enqueue " + fq);

    }

    public static void print(Object o) {
        System.out.println(o.toString());
    }
}
