import Controller.*;
import Model.*;
import View.TaskView;

class MVC {
    public static void main (String[] args){
        TaskGroup rootGroup = new TaskGroup("Project");
        TaskGroup subGroup = new TaskGroup("Development");
        Task task1 = new Task("Write code");
        Task task2 = new Task("Review code");

        subGroup.addTask(task1);
        rootGroup.addTask(subGroup);
        rootGroup.addTask(task2);

        TaskView view = new TaskView();

        TaskController controller = new TaskController();

        System.out.println("Initial Task List:");
        controller.setStrategy(new DisplayTaskStrategy());
        controller.executeStrategy(rootGroup);

        Task newTask = new Task("Test code");
        System.out.println("\nAdding a new task...");
        controller.setStrategy(new AddTaskStrategy(newTask));
        controller.executeStrategy(rootGroup);

        System.out.println("\nUpdated Task List:");
        controller.executeStrategy(rootGroup);

        System.out.println("\nRemoving a task...");
        controller.setStrategy(new RemoveTaskStrategy(task1));
        controller.executeStrategy(rootGroup);

        System.out.println("\nFinal Task List:");
        controller.executeStrategy(rootGroup);
        view.displayTasks(rootGroup);
    }
}