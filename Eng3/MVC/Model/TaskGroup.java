package Model;

import java.util.ArrayList;
import java.util.List;

public class TaskGroup implements TaskComponent {
    private String groupName;
    private List<TaskComponent> tasks = new ArrayList<>();

    public TaskGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addTask(TaskComponent task) {
        tasks.add(task);
    }

    public void removeTask(TaskComponent task) {
        tasks.remove(task);
    }

    @Override
    public void display() {
        System.out.println("Task Group: " + groupName);
        for (TaskComponent task : tasks) {
            task.display();
        }
    }
}