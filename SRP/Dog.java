package SRP;

public class Dog implements PetActions {

    @Override
    public String makeSound() {
        return "Woof, Woof";
    }

    @Override
    public String eat() {
        return "Eating bones";
    }
}