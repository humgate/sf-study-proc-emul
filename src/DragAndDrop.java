public class DragAndDrop extends Task implements Autochecked {
    String[][] combinationsArray;

    public DragAndDrop(int number, String description) {
        super(number, description);
        combinationsArray = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                this.combinationsArray[i][j] = "Значение таблицы " + i + " " + j;
            }
        }

    }
}

