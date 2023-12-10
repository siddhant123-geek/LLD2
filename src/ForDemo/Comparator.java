package ForDemo;

public class Comparator implements Comparable<Employee>, java.util.Comparator<Employee> {

    @Override
    // Method of comparator
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    // Method of Comparable
    public int compareTo(Employee o) {
        return 0;
    }
}
