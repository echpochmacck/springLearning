package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //    @Autowired
//    @Qualifier("dog")
    private Pet pet;
//    @Value("${person.name}")
    private String name;
//    @Value("${person.age}")
    private int age;

    @Autowired

    public Person(@Qualifier("dog")Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }
//
//    public Person() {
//        System.out.println("Person bean is created");
//    }


    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        this.pet.say();
    }

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("set pet");
        this.pet = pet;
    }

}
