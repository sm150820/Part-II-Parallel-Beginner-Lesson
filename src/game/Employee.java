public abstract class Employee {

    protected String name;
    protected int skill;
    protected int salary;

    public Employee(String name, int skill, int salary) {
        this.name = name;
        this.skill = skill;
        this.salary = salary;
    }

    public abstract int work();

    public int getSalary() {
        return salary;
    }
}