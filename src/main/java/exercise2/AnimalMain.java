package exercise2;

public class AnimalMain {
    public static void main(String[] args) {

        Insect ladybug = new Ladybug("Mrs buggg", 6);
        System.out.println("Ladybug:");
        System.out.println("Color: " + ladybug.color());
        System.out.println("It's annoying: " + ladybug.isAnnoying());

        System.out.println("\n");
        Bird canary = new Canary("Rex");
        System.out.println("Canary:");
        System.out.println("It's food: " + canary.isFood());
        System.out.println("Name: " + canary.sayMyName());

        System.out.println("\n");
        Animal dog = new Dog();
        System.out.println("Dog:");
        System.out.println("Number of legs: " + dog.numberOfLegs());
        System.out.println("It's cute: " + dog.isCute());
    }
}
