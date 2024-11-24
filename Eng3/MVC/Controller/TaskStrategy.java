package Controller;

import Model.TaskComponent;

interface TaskStrategy {
    void execute(TaskComponent rootTask);
}