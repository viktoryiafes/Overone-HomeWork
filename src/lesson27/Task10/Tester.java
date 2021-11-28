package lesson27.Task10;

public class Tester {
    private final String name;
    private final int id;


    public Tester(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
