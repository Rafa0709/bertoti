package View;

import Model.TaskComponent;

public class TaskView {
    public void displayTasks(TaskComponent rootTask) {
        rootTask.display();
    }
}