package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        SchoolLibrary lib = context.getBean("schoolLibrary", SchoolLibrary.class);
        String bookname = lib.returnBook();
        System.out.println(bookname + " Method ended");
        context.close();

    }
}
