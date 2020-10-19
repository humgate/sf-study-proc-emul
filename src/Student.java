//Student class encapsulates student actors in the studying process
public class Student extends Person{

    public Student(String name, String surName, int age) {
        super(name, surName, age);
    }

    @Override
    public String getGoal() {
        return "Obtain Java programmer knowledge and skills. ";
    }
}
