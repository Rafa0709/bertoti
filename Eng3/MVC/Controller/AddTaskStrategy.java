package Controller;

import Model.TaskComponent;
import Model.TaskGroup;

public class AddTaskStrategy implements TaskStrategy {
    private TaskComponent taskToAdd;

    public AddTaskStrategy(TaskComponent taskToAdd) {
        this.taskToAdd = taskToAdd;
    }

    @Override
    public void execute(TaskComponent rootTask) {
        if (rootTask instanceof TaskGroup) {
            ((TaskGroup) rootTask).addTask(taskToAdd);
        } else {
            System.out.println("Cannot add tasks to a single task.");
        }
    }
}