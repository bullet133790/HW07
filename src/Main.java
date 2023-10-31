import task1.Person;
import task2.Car;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("Andrew");
        person1.setLastName("Pupkin");
        person1.setAge(54);

        Person person2= new Person("Will","Smith");
        Person person3= new Person("Will","Smith",-65);

        System.out.println("Info about person 1:");
        System.out.println(person1.getinfo());

        System.out.println("Info about person 2:");

        System.out.println(person2.getinfo());

        System.out.println("Info about person 3:");
        System.out.println(person3.getinfo());





























    }

}