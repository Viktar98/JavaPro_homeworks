package homework_3;

public class Flag {
    private int id;
    private String name;
    private String logo;

    public Flag(int id, String name, String logo) {
        this.id = id;
        this.name = name;
        this.logo = logo;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String logo() {
        return logo;
    }
}
