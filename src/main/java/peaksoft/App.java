package peaksoft;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean("person", Person.class);
        Horse horse = context.getBean("horse", Horse.class);
        person.setAnimal(horse);
        System.out.println(person);
        person.getAnimal().AnimalPrus();
        person.getAnimal().AnimalMinus();



    }
}
