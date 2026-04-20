import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private int cash;
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public Company(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public void hire(Employee employee) {
        employees.add(employee);
        cash -= employee.getSalary();
    }

    public void startProject(Project project) {
        projects.add(project);
    }

    public List<Project> getProjects() {
        return projects;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }
}