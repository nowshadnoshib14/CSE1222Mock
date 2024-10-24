package q1;

public class TestWorker {
    public static void main(String[] args) {
         Worker worker = new Worker("Nowshad", 6500);
        System.out.println(worker.toString());

         Supervisor supervisor = new Supervisor("Kamal", 8000, "Sales");
        System.out.println(supervisor.toString());

         Director director = new Director("Nabil", 10000, "Marketing");
        System.out.println(director.toString());
    }
}