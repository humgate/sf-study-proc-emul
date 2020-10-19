//interface to be implemented in all classes encapsulating staff actors
public interface Staff {

    //must implement helping to student passed in the parameter
    void helpStudent(Student student);

    //implements additional materials providing
    default void provideAdditionalMaterials() {
        System.out.println("Look for additional information on https://habr.com/ru/");
    }
}
