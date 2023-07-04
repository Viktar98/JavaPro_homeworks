package lesson5.sea_battle;

public class Flags {
    private int id;
    private String logo;
    private String str;
    public Flags(int id, String logo, String str) {
        this.id = id;
        this.logo = logo;
        this.str = str;
    }

    public int getId() {
        return id;
    }

    public String getLogo() {
        return logo;
    }
    public String getStr() {
        return str;
    }
}
