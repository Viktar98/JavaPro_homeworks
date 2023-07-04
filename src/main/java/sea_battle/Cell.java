package sea_battle;

public class Cell {

    private C cell;
    private String cell_out;

    public Cell(C cell) {
        this.cell = cell;
        this.cell_out = cell.getCell();
    }

    public Cell(String cell_out) {
        this.cell_out = cell_out;
        this.cell = C.SERVICE_CELL;
    }

    public C getCell() {
        return cell;
    }

    public void setCell(C cell) {
        this.cell = cell;
    }

    public String getCell_out() {
        return cell_out;
    }
}
