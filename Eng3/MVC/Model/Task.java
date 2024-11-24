package Model;
public class Task implements TaskComponent {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("- Task: " + name);
    }
}