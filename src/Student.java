//Student class encapsulates student actors in the studying process
public class Student extends Person{

    private int tasksCompleted;
    private static int allStudTasksCompleted;
    private Mentor mentor;
    private boolean allTasksCompleted;

    public Student(String name, String surName, int age, Mentor mentor) {
        super(name, surName, age);
        this.mentor = mentor;
        tasksCompleted = 0;
        this.allTasksCompleted = false;
    }

    /* Resolves batch of tasks passed in parameters. Class instance this.tasksCompleted value must be less than
    amount of Tasks array parameter length, otherwise it means all tasks completed so class instance
    this.allTasksCompleted is set to true and no calls to the resolveTask method.
    */
    public void resolveTasks (int tasksToSolve, Task[] tasksArray) {
        for (int i = 0; i < tasksToSolve; i++) {
            if (tasksCompleted < tasksArray.length) {
                resolveTask(tasksArray[i + 1]);
            } else {
                allTasksCompleted = true;
                System.out.println("_resolvetasks method for student " + this.getName() + " " + this.getSurName() +
                        " ended up with all tasks completed.");
                break;
            }
        }
    }
    /* Resolves the task passed in the parameter. Checks that not all tasks completed by student. If so,
     calls Autochecked default method for Autochecked tasks or forwards the task to the mentor for chek.
     */
    private void resolveTask (Task task) {
        if (!allTasksCompleted) {
            if (task instanceof Autochecked) {
                ((Autochecked) task).autocheck();
            } else {
                boolean accepted = false;
                while (!accepted) {
                    accepted = mentor.checkTask(task);
                }
                tasksCompleted++;
                allStudTasksCompleted++;
            }
        } else {
            System.out.println("_resolvetask method cancelled for student " + this.getName() + " " + this.getSurName() +
                    ". All the tasks already completed.");
        }
    }

    @Override
    public String getGoal() {
        return "Obtain Java programmer knowledge and skills. ";
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }

    public void setTasksCompleted(int tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }

    public static int getAllStudTasksCompleted() {
        return allStudTasksCompleted;
    }

    public static void setAllStudTasksCompleted(int allStudTasksCompleted) {
        Student.allStudTasksCompleted = allStudTasksCompleted;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isAllTasksCompleted() {
        return allTasksCompleted;
    }

    public void setAllTasksCompleted(boolean allTasksCompleted) {
        this.allTasksCompleted = allTasksCompleted;
    }
}
