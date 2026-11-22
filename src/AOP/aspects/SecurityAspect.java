package AOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("AOP.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddSecurityAdvice(JoinPoint joinPoint) {
        System.out.println("beforeAddSecurityAdvice advice: permissions check");
        System.out.println("-------------------------------");
    }
}
