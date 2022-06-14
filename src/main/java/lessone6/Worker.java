package lessone6;

public class Worker {

    String name;
    int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Worker(String name) {
        this(name, 0);
    }

    public void raiseSalary(int amount) {
        salary += amount;
    }

    public static void main(String[] args) {
        Worker worker1 = new Worker("Alex", 100);

        System.out.println(worker1.name);
        System.out.println(worker1.salary);
        worker1.raiseSalary(5);
        System.out.println(worker1.salary);

        Worker worker2 = new Worker("Max");

        System.out.println(worker2.name);
        System.out.println(worker2.salary);
        worker2.raiseSalary(1000);
        System.out.println(worker2.salary);
    }


}
