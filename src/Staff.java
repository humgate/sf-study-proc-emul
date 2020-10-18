public interface Staff {

    void helpStudent(Student student);

    default void provideAdditionalMaterials() {
        System.out.println("Look for additional information on https://habr.com/ru/");
    }
}
