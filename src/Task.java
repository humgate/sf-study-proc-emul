// Base class encapsulate task in studying process
public abstract class Task {

    private int number;
    private String description;

    //Constructor required by the module task description
    public Task (){
        number = 0;
        description = "Default description";
    }

    public Task(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}