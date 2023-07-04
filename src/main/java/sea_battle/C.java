package lesson5.sea_battle;

public enum C {
    SERVICE_CELL("null",false),
    EMPTY_CELL("\uD83D\uDFE9",true),
    HIDDEN_CELL("🟦",true),
    SHIP_CELL("⬛️",false),
    WOUNDED_SHIP_CELL("🟧",false),
    KILLED_SHIP_CELL("🟥",false),
    MISSED_SHOT_CELL("🐟",false);
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
