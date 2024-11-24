package Controller;

import Model.TaskComponent;
import Model.TaskGroup;

public class RemoveTaskStrategy implements TaskStrategy {
    private TaskComponent taskToRemove;

    public RemoveTaskStrategy(TaskComponent taskToRemove) {
        this.taskToRemove = taskToRemove;
    }

    @Override
    public void execute(TaskComponent rootTask) {
        if (rootTask instanceof TaskGroup) {
            ((TaskGroup) rootTask).removeTask(taskToRemove);
        } else {
            System.out.println("Cannot remove tasks from a single task.");
        }
    }
}
