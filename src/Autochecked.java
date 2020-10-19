//Used to marks Tasks which get checked automatically.
public interface Autochecked {
    default void autocheck() {
        System.out.println("Задание выполнено");
    }
}
