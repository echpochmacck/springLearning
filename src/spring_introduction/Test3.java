package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Pet pet = new Dog();
        Person p = context.getBean("myPerson", Person.class);
        p.callYourPet();
//        System.out.println(p.getAge());
//        System.out.println(p.getName());
        context.close();
    }
}
