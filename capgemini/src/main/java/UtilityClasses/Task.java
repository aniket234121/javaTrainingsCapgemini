package UtilityClasses;

public class Task {
    public String taskId;
    public int priority;
    public int duration;

    public Task(String taskId, int priority, int duration) {
        this.taskId = taskId;
        this.priority = priority;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + taskId + '\'' +
                ", priority=" + priority +
                ", duration=" + duration +
                '}';
    }
}