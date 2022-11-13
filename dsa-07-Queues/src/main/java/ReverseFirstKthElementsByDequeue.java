import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseFirstKthElementsByDequeue {
    public static void main(String[] args) {


        Queue<Integer> nums = new ArrayDeque<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println("Initial queue");
        System.out.println(nums);

        System.out.println("After reverse");
        reverseFirstKthElement(nums,3);
        System.out.println(nums);

    }
    public static Queue<Integer> reverseFirstKthElement(Queue<Integer> queue, int k){
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            deque.push(queue.poll());
        }
        while (!deque.isEmpty()){
            queue.add(deque.pop());
        }
        for (int i = 0; i <queue.size()-k ; i++) {
            queue.add(queue.poll());

        }
        return queue;
    }
}
