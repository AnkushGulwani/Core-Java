class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void getDetails() {
        System.out.println("Name:" + name + ", Salary:" + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void getDetails() {
        System.out.println("Name:" + getName() + ", Salary:" + getSalary() + ", Department:" + department);
    }

}

public class Q4 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        emp.getDetails();
        Manager mng = new Manager("Bob", 80000, "IT");
        mng.getDetails();
    }
}
