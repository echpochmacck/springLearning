package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University un = context.getBean("university", University.class);
        un.addStudents();
        try {
            List<Student> students = un.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("WE caught excpetion in main method" + e);
        }

        context.close();

    }
}
