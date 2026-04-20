public class Developer extends Employee {

    public Developer(String name, int skill, int salary) {
        super(name, skill, salary);
    }

    @Override
    public int work() {
        return skill * 2;
    }
}