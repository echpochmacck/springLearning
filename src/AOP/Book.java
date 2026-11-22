package AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    private String name;

    @Value("Dostoevsky")
    private String author;

    @Value("1866")
    private int year;

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Value("Gambler")
    public void setName(String name) {
        this.name = name;
    }
}
