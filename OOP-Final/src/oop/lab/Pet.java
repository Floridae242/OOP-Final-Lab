package oop.lab;

public class Pet {
    private String name;
    private String breed;
    private int age;
    private double weight;

    public Pet(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Some sound...");
    }

    public int getHumanAge() {
        return age * 7;
    }

    public void performCheckup() {
        System.out.println(name + ": Performing a standard checkup.");
    }

    public void displayPetInfo() {
        System.out.printf("Name: %s | Breed: %s | Age: %d | Weight: %.1f kg.%n", name, breed, age, weight);
        System.out.printf(">> %s's age in human years: %d years old.%n", name, getHumanAge());
    }
}
