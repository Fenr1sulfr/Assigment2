public class books {
    private String name;
    private String description;
    public books(String name, String description){
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "books{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
