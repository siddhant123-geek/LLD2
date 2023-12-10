package ProtoTypeDesignPattern;

public class Project implements ProjectProtoType {
    private String name;
    private int duration;

    public Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    @Override
    public ProjectProtoType clone() {
        return new Project(name, duration);
    }

    @Override
    public void display() {
        System.out.println("Name " + name);
        System.out.println("Duration " + duration);
    }
}
