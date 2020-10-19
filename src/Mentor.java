import java.util.Random;

// Class Mentor encapsulates the mentor actor
public class Mentor extends Person implements Staff{
    private boolean mentorMoodGood;
    private static Random rand;

    public Mentor(String name, String surName, int age, boolean mentorMoodGood) {
        super(name, surName, age);
        this.mentorMoodGood = true;
    }

    //Returns mentor mood based on the random number from 0 to 5000.
    public boolean isMentorMoodGood() {
        return mentorMoodGood = rand.nextInt(5000) > 1000;
    }

    //Returns mentor specific goal in the studying process
    @Override
    public String getGoal() {
        return "This is my additional job";
    }

    //Implements help action to a student in parameter
    @Override
    public void helpStudent(Student student) {
        System.out.println("Dear, " + student.getName() + "! Success is not final, failure is not fatal: it is the " +
                "courage to continue that counts. Winston Churchill.");
    }
    //Checks the code. Refreshes mentor moog state and then accepts or rejects the task based on it
    public boolean checkTask(Task task) {
        mentorMoodGood = rand.nextInt(5000) > 1000;
        if (mentorMoodGood) {
            System.out.println(" The task with number " + task.getNumber() + " accepted.");
            return true;
        } else {
            System.out.println(" The task with number " + task.getNumber() + " rejected.");
            return false;
        }
    }
}
