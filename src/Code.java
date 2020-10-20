public class Code extends Task {
    private String text;

    public Code(int number, String description) {
        super(number, description);
        text = "public static void main () {}";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
