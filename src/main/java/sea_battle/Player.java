package sea_battle;

public class Player {
    private String name;
    private Field own_field, enemy_field;
    private String logo;
    private Messages mess;

    public Player() {}

    public String getLogo() {
        return logo;
    }

    public void setLogo(int choice) {
        Messages m = new Messages();
        switch (choice) {
            case 1:
                this.logo = m.getCh1();
                break;
            case 2:
                this.logo = m.getCh2();
                break;
            case 3:
                this.logo = m.getCh3();
                break;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
}
