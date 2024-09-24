package task2.arrayStudent;

public class arrayStudent {

    private String name;
    private String id;

    public arrayStudent() {
        this.id = "unknown";
        this.name = "unknown";
    }

    public arrayStudent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Student:" + getId() + " " + getName());
    }


}
