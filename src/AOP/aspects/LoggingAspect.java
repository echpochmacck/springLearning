package AOP.aspects;

import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* AOP.SchoolLibrary.*(..))")
//    private void allMethodsFromSchoolLibrary(){}
//    @Pointcut("execution(* AOP.SchoolLibrary.returnMagazine())")
//    private void returnMagazineFromSchoolLibrary(){}
//
//    @Pointcut("allMethodsFromSchoolLibrary() && !returnMagazineFromSchoolLibrary()")
//    private void allMethodsExceptReturnMagazine(){}
//
//    @Before("allMethodsExceptReturnMagazine()")
//    public void allMethodsAdvice() {
//        System.out.println("We called not returnMagazine method");
//    }


//
//    @Pointcut("execution(* AOP.SchoolLibrary.get*())")
//    private void allGetMethodsFromSchoolLibrary() {}
//
//    @Pointcut("execution(* AOP.SchoolLibrary.return*())")
//    private void allReturnMethodsFromSchoolLibrary() {}
//
//    @Pointcut("allGetMethodsFromSchoolLibrary() || allReturnMethodsFromSchoolLibrary()")
//    private void allGetAndReturnMethodsFromSchoolLibrary() {}
//
//    @Before("allGetMethodsFromSchoolLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("BeforeGetLogging: writing Log #1");
//    }
//    @Before("allReturnMethodsFromSchoolLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("BeforeReturnLogging: writing Log #2");
//    }
//
//
//    @Before("allGetAndReturnMethodsFromSchoolLibrary()")
//    public void beforeAllMethodsFromSchoolLibrary() {
//        System.out.println("BeforeReturnLogging: writing Log #3");
//    }


    @Before("AOP.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingBookAdive(JoinPoint joinPoint) {
        MethodSignature sig = (MethodSignature) joinPoint.getSignature();
        System.out.println("sig = " + sig);
        System.out.println("method = " + sig.getMethod());
        System.out.println("returnType = " + sig.getReturnType());
        System.out.println("methodName = " + sig.getName());

        if (sig.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj : args) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("информация о книге -" + myBook.getName() + "-" + myBook.getAuthor() );
                }else if(obj instanceof String) {
                    System.out.println("книгу добавляет "+ obj);
                }
            }
        }

        System.out.println("beforeAddLoggingBookAdive: логирование попытки получить книгу");
        System.out.println("-------------------------------");
    }

//    @Before("execution(public * returnBook())")
//    public void beforeReturnBook() {
//        System.out.println("BeforeReturnBookAdvice");
//    }
}
