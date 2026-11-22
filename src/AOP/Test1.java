package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Book book = context.getBean("book", Book.class);
        SchoolLibrary lib2 = context.getBean("schoolLibrary", SchoolLibrary.class);
        lib2.addBook("Max", book);
        lib2.addMagazine();

        context.close();

    }
}
