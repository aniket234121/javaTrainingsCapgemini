package Collections;

import org.example.Employee;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>((Employee e1,Employee e2)->e1.getAge()-e2.getAge());
        Employee e1=new Employee(12,"ram",(byte)23);
        Employee e2=new Employee(13,"bob",(byte)34);
        Employee e3=new Employee(14,"alice",(byte)3);
        Employee e4=new Employee(15,"bob",(byte)90);
        priorityQueue.add(e1);
        priorityQueue.add(e2);
        priorityQueue.add(e3);
        priorityQueue.add(e4);
        System.out.println(priorityQueue);
    }
}
