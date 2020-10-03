package exercises.intermediate.exercise5;

public class Exercise5 {

    public static void main(String[] args) {
        Person person1 = new Person("pepito");
        System.out.println("We create a person called: " + person1.name);
        Person person2 = new Person("juan");
        System.out.println("We create a person called: " + person2.name);

        person1.name = "juanito";
        System.out.println("Now person1 is called: " + person1.name);
        person2.name = "pepe";
        System.out.println("Now person2 is called: " + person2.name);
    }

}
