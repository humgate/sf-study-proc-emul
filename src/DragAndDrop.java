public class DragAndDrop extends Task implements Autochecked {
    String [][] combinationsArray;

    public DragAndDrop(int number, String description, String[][] combinationsArray) {
        super(number, description);
        this.combinationsArray = combinationsArray;
    }
}
