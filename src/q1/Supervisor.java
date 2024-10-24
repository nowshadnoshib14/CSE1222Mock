package q1;

public class Supervisor extends Worker{
    protected String division;

    public Supervisor(String name, double wage, String division) {
        super(name, wage);
        this.division = division;
    }
    public String toString() {
        return "Supervisor: Name = " + name + ", Division = " + division + ", Wage = " + wage;
    }

}
