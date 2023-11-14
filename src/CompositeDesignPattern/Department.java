package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Department implements EmployeeComponent {

    private String name;

    private List<EmployeeComponent> employeeComponentList;

    public Department(String name) {
        this.name = name;
        employeeComponentList = new ArrayList<>();
    }

    public void addMembers(EmployeeComponent employee) {
        employeeComponentList.add(employee);
    }


    @Override
    public void displayInfo() {
        System.out.println("Department name " + name);

        for(EmployeeComponent employeeComponent : employeeComponentList) {
            employeeComponent.displayInfo();
        }
    }

    @Override
    public double getSalary() {
        double totalSal = 0.0;

        for(EmployeeComponent employeeComponent : employeeComponentList) {
            totalSal += employeeComponent.getSalary();
        }

        return totalSal;
    }
}
