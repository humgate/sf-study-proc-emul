//Test is a Task subtype containing several predefined answers to a question
public class Test extends Task implements Autochecked  {
    private String[] answersArray;

    public Test(int number, String description, String[] answersArray) {
        super(number, description);
        this.answersArray = answersArray;
    }

    //Constructor required by the module task description
    public Test(int number, String description) {
        super(number, description);
        this.answersArray = new String[]{"a", "b", "c"};
    }
}
