package AOP.aspects;

import AOP.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.swing.plaf.synth.SynthUI;
import java.util.List;

@Component
@Aspect
public class UniversityLogginAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("Logging getting list of students");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.getFirst();
//        String name = firstStudent.getSurname();
//        name = "MR." + name;
//        firstStudent.setSurname(name);
//        Double avg = firstStudent.getAvgGrade();
//        avg = avg + 12;
//        firstStudent.setAvgGrade(avg);
//
//
//        System.out.println("Logging After getting list of students");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingStudentsLoggingAdvice: we got exception : " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsAdvice() {
        System.out.println("afterGetStudentsAdvice, Just @AFTER advice");
    }



}
