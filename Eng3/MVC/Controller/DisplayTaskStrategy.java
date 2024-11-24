package Controller;

import Model.TaskComponent;

public class DisplayTaskStrategy implements TaskStrategy {
    @Override
    public void execute(TaskComponent rootTask) {
        rootTask.display();
    }
}
