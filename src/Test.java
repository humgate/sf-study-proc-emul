//Test is a Task subtype containing several predefined answers to a question
public class Test extends Task implements Autochecked  {
    private String[] answersArray;

    //Default constructor with no parameters
    public Test() {
        super(0, "A task");
        this.answersArray = new String[]{"a", "b", "c"};
    }

    //Constructor required by the module task description
    public Test(int number, String description) {
        super(number, description);
        this.answersArray = new String[]{"a", "b", "c"};
    }


}
