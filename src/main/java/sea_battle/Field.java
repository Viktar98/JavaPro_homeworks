package sea_battle;

public class Field {
    private Cell[][] field;
    private Cell cell;
    private String logo = "🌊";
    private String[] leftColomn = {(String) null + ' ', "🇦 ", "🇧 ", "🇨 ", "🇩 ", "🇪 ", "🇫 ", "🇬 ", "🇭 ", "🇮 ", "🇯 "};
    private String[] upLine = {(logo + ' '), "\uD835\uDFD9", "➋", "➌", "➍", "➎", "➏", "➐", "➑", "➒", "➓",};

    public Field() {
        field = new Cell[11][11];
        initEmpty();
    }

    private void initEmpty() {
        int i, j;
        for (i = 1; i < field.length; i++) {
            for (j = 0; j < field[i].length; j++) {
                field[0][j] = new Cell(upLine[j]);
                field[i][0] = new Cell(leftColomn[i]);
                field[i][j] = new Cell(C.EMPTY_CELL);
            }
        }
    }

    public void show() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(' ' + field[i][j].getCell_out());
            }
            System.out.println();
        }
    }


}
