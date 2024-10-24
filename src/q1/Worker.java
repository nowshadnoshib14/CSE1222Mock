package q1;

public class Worker {
    protected String name;
    protected double wage;

    public Worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Worker: Name = " + name + ", Wage = " + wage;
     }
}
