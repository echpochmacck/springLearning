package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("AOP.aspects.MyPointCuts.allAddMethods()")
    public void beforeExceptionHandlingAdvice() {
        System.out.println("beforeExceptionHandlingAdvice: catch errors while get book");
        System.out.println("-------------------------------");
    }
}
