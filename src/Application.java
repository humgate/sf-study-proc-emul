import java.util.Random;
import java.util.Scanner;

//Application class implementing main program algorithms and implementing pswm
public class Application {

    final static int TASKS_AMOUNT = 31;
    final static int MENTORS_AMOUNT = 2;
    final static int STUDENT_AMOUNT = 8;

    static Task[] taskArr = new Task[TASKS_AMOUNT];
    static Student[] studentArr = new Student[STUDENT_AMOUNT];
    static Mentor[] mentorArr = new Mentor[MENTORS_AMOUNT];
    static Random rand = new Random();

    //Scanner object instance to read user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Creating the Tasks array
        initTasks();

        //Create mentors array
        initMentors();

        //Create students array
        initStudents();

        //Launch the process of solving tasks
        launchTasksProcessing();
    }

    //Create the Tasks array
    private static void initTasks() {
        for (int i = 0; i < TASKS_AMOUNT; i++) {
            switch (rand.nextInt(3)) {
                case (0) -> {
                    taskArr[i] = new Test(i + 1, "Test description");
                    System.out.println(taskArr[i].getNumber() + " " + taskArr[i].getDescription());
                }
                case (1) -> {
                    taskArr[i] = new DragAndDrop(i + 1, "DragAndDrop description");
                    System.out.println(taskArr[i].getNumber() + " " + taskArr[i].getDescription());
                }
                case (2) -> {
                    taskArr[i] = new Code(i + 1, "Code description");
                    System.out.println(taskArr[i].getNumber() + " " + taskArr[i].getDescription());
                }
                default -> {
                    taskArr[i] = new Test(i + 1, "Test description add.");
                    System.out.println(taskArr[i].getNumber() + " " + taskArr[i].getDescription());
                }
            }
        }
        //Pause program flow until any input from user. Needed to see the output above.
        System.out.println("Press any key to continue");
        scanner.nextLine();
    }

    //Create the Mentors array
    private static void initMentors() {
        mentorArr[0] = new Mentor("Ivan", "Ivanov",30, true);
        System.out.println(mentorArr[0].getName() + " " + mentorArr[0].getSurName());
        mentorArr[1] = new Mentor("John", "Doe",32, true);
        System.out.println(mentorArr[1].getName() + " " + mentorArr[1].getSurName());

        System.out.println("Press any key to continue");
        scanner.nextLine();
    }

    //Create the Students array
    private static void initStudents() {
        //Create students array
        for (int i = 0; i < STUDENT_AMOUNT ; i++) {
            studentArr[i] = new Student("Студ.имя" + i, "Фамилия" + i, 30+rand.nextInt(15),
                    mentorArr[i%2]);
            System.out.println(studentArr[i].getName() + " " + studentArr[i].getSurName());
        }
        System.out.println("Press any key to continue");
        scanner.nextLine();
    }

    //Launch the process of solving tasks by students including calls to mentors for checking code typed tasks
    private static void launchTasksProcessing () {
        int studentsDone = 0;
        int iterationsDone = 0;

        while (Student.getAllStudTasksCompleted() < STUDENT_AMOUNT*TASKS_AMOUNT)  {
            for (int i = 0; i < STUDENT_AMOUNT; i++) {
                if (!studentArr[i].isAllTasksCompleted()) {
                    studentArr[i].resolveTasks(rand.nextInt(TASKS_AMOUNT), taskArr);
                    if (studentArr[i].isAllTasksCompleted() ) {
                        studentsDone++;
                    }
                }
                iterationsDone++;
                System.out.println("Iteration " + iterationsDone + " done by all students. " + studentsDone +
                        " students finished all " + TASKS_AMOUNT +  " tasks. Total tasks done: " +
                        Student.getAllStudTasksCompleted() );

                //Pause program flow until any input from user. Needed to see the output above.
                System.out.println("Press any key to continue");
                scanner.nextLine();
            }
        }
    }
}
