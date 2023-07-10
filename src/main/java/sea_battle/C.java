package sea_battle;

public enum C {
    SERVICE_CELL("null",false),
    EMPTY_CELL("🟩",true),
    HIDDEN_CELL("🟦",true),
    SHIP_CELL("⬛️",false),
    WOUNDED_SHIP_CELL("🟧",false),
    KILLED_SHIP_CELL("🟥",false),
    MISSED_SHOT_CELL("\uD83D\uDC1F",false);
    private String cell;
    private boolean free;

    C() {
    }

    C(String cell, boolean free) {
        this.cell = cell;
        this.free = free;
    }

    public String getCell() {
        return cell;
    }

    public boolean isFree() {
        return free;
    }
}
