package AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: start in library");
        Object result =null;
        try {
            result =  proceedingJoinPoint.proceed();
        }catch(Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение " + e);
//            result = "Неизвестное название книги";
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: end in library");
        return result;
    }
}
