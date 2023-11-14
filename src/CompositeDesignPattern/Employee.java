package CompositeDesignPattern;

public class Employee implements EmployeeComponent{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("The name of the employee is " + name + " and he earns " + salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
