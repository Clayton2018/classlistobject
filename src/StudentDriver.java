import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

    private static ArrayList<Student> studentNames = new ArrayList();

    public static void main(String[] args) {

        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);

    }

    private static void addStudents(ArrayList<Student> studentNames) {

        studentNames.add( new Student("Allan", "Red", 78));
        studentNames.add(new Student("Jorja", "Smith", 82));
        studentNames.add(new Student("Beth", "Tween", 77));

    }//end of add students

    private static void displayStudents(ArrayList<Student> studentNames) {

        for (Student student : studentNames){

            System.out.println(student);

        }

    }//end of display students
}
