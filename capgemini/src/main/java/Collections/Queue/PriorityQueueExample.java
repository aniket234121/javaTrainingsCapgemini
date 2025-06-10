package Collections.Queue;

import UtilityClasses.Task;

import java.util.*;


class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        if (t1.priority != t2.priority) {
            return Integer.compare(t2.priority, t1.priority); // higher priority first

        } else {
            return Integer.compare(t1.duration, t2.duration); // shorter task first
        }
    }
}

public class PriorityQueueExample {
    public static void practice1() {
        //creating priority queue
        Queue<Integer> pq = new PriorityQueue<>();

        // collection creation
        List<Integer> list = new ArrayList<>(3);
        list.add(3);
        list.add(5);
        list.add(87);

        pq.add(45);
        pq.offer(34);

        pq.addAll(list);
        System.out.println("priority queue is Empty: " + pq.isEmpty());
        System.out.println(Arrays.toString(pq.toArray()));
        System.out.println("poll: " + pq.poll());
        System.out.println("size : " + pq.size());

    }

    public static void practice2() {
        // PriorityQueue with custom comparator
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(new TaskComparator());

        // Adding sample tasks
        taskQueue.add(new Task("T1", 3, 30));
        taskQueue.add(new Task("T2", 5, 20));
        taskQueue.add(new Task("T3", 5, 10));  // Same priority as T2, but shorter
        taskQueue.add(new Task("T4", 1, 60));

        System.out.println("Scheduling Tasks:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }

    public static void main(String[] args) {
        practice1();
        System.out.println("---------------------");
        practice2();
    }
}
