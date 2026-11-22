package AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Maxim smetain", 1, 5.6);
        Student st2 = new Student("Matvey smetain", 1, 2.6);
        Student st3 = new Student("Who smetain", 1, 3.6);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("INformation from method getStudents:");
        students.get(4);
        System.out.println(students);
        return students;
    }
}
