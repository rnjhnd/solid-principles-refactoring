package SRP;

public class PetDemo {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Skittle", "Luka");

        PetActions dog = new Dog();

        System.out.println("Pet Name: " + pet1.getPetName());
        System.out.println("Owner: " + pet1.getOwner());
        System.out.println(dog.makeSound());
        System.out.println(dog.eat());
    }
}