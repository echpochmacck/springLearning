package AOP;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends  AbstractLibrary{

    public void getBook() {
        System.out.println("Мы берем книгу из скул лайбрери " );
        System.out.println("-------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("мф вернули в скул лайбрери");
        return "WAR AND PEACE";

    }
    public void returnMagazine() {
        System.out.println("мф вернули magazine в скул лайбрери");
        System.out.println("-------------------------------");

    }

    public void getMagazine() {
        System.out.println("мф вернули журнал в  скул лайбрери");
        System.out.println("-------------------------------");

    }
    public void addBook(String personName, Book book) {
        System.out.println("We added book");
        System.out.println("-------------------------------");

    }
    public void addMagazine() {
        System.out.println("We added magazine");
        System.out.println("-------------------------------");

    }

}
