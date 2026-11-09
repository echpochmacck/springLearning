package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {


    private Pet pet;
    private String name;
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }
//
//    public Person() {
//        System.out.println("Person bean is created");
//    }


    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        this.pet.say();
    }

    @Autowired
    public void setPet(Pet pet) {
        System.out.println("set pet");
        this.pet = pet;
    }

}
