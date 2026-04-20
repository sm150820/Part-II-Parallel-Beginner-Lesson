import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private int requiredWork;
    private int progress;
    private ProjectStatus status;
    private List<Employee> employees = new ArrayList<>();

    public Project(String name, int requiredWork) {
        this.name = name;
        this.requiredWork = requiredWork;
        this.progress = 0;
        this.status = ProjectStatus.PLANNED;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void start() {
        if (status == ProjectStatus.PLANNED) {
            status = ProjectStatus.ACTIVE;
        }
    }

    public void workOneTurn() {
        if (status != ProjectStatus.ACTIVE) return;

        for (Employee e : employees) {
            progress += e.work();
        }

        if (progress >= requiredWork) {
            progress = requiredWork;
            status = ProjectStatus.FINISHED;
        }
    }

    public boolean isFinished() {
        return status == ProjectStatus.FINISHED;
    }

    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }

    public int getRequiredWork() {
        return requiredWork;
    }

    public ProjectStatus getStatus() {
        return status;
    }
}