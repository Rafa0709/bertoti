package Controller;

import Model.TaskComponent;

public class TaskController {
    private TaskStrategy strategy;

    public void setStrategy(TaskStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(TaskComponent rootTask) {
        if (strategy != null) {
            strategy.execute(rootTask);
        } else {
            System.out.println("No strategy set.");
        }
    }
}