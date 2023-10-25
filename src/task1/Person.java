package task1;

public class Person {
    private String name;
    private String lastName;
    private int age;




    public Person() {       // default constructor

    }

    public Person(String name, String lastName) {  // only name and last name
        this.name= name;
        this.lastName= lastName;

    }

    public Person(String name, String lastName, int age){
        this.name= name;
        this.lastName= lastName;
        this.age= age;

    }

        public String getName(){  // getter
        return name;
    }
    public void setName(String name) { // setter
        this.name = name;
    }

    public String getLastName() {  // getter
        return lastName;
    }

    public  void setLastName(String lastName){   // setter

        this.lastName= lastName;
    }



    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("invalid age");

        }
    }

    public  int getAge(){

        return age;
    }

    public void info(){
            System.out.println("Name:" + name);
            System.out.println("Lastname:" + lastName);
            System.out.println("Age:" + age);


        }
    public String getinfo() {
        return "Name: " + name + ", Last Name: " + lastName + ", Age: " + age ;
    }








}









