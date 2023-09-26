package StackImplemnttion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemovingElemntFromQ {

    public static void main(String[] args) {
        RemovingElemntFromQ solution = new RemovingElemntFromQ();
        Queue<Integer> queue = new LinkedList<>();
        int k = 3; // Replace with the desired value of K

        // Enqueue elements into the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("Original Queue: " + queue);

        // Modify the queue to reverse the first K elements
        Queue<Integer> modifiedQueue = solution.modifyQueue(queue, k);

        System.out.println("Queue after modifying to reverse the first " + k + " elements: " + modifiedQueue);
    }

    public  Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        if (q.isEmpty() || k <= 0 || k > q.size()) {
            // Invalid input
            return q;
        }

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }


        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }


        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }

        return q;
    }
}
