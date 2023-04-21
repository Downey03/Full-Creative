import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Others {
    public static void main(String[] args) throws InterruptedException {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();

        stack.push(6);
        stack.push(5);
        stack.push(4);

        while (!stack.empty()){
            System.out.println(stack.pop());
        }

        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        deque.add(2);
        deque.addFirst(1);
        deque.addLast(3);

        while (!deque.isEmpty()){
            System.out.println(deque.pop());
        }

    }
}
