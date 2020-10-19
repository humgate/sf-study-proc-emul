public abstract class Task {
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

    private int number;
    private String description;

    public Task (){
        number = 0;
        description = "Default description";
    }
}
