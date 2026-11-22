package AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

    @Pointcut("execution(* adasdasdd*(..))")
    public void allAddMethods() {}
}
