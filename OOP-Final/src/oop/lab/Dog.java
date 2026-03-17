package oop.lab;

public class Dog extends Pet implements Groomable, Trainable {
    private String lastWalkTime;

    public Dog(String name, String breed, int age, double weight, String lastWalkTime) {
        super(name, breed, age, weight);
        this.lastWalkTime = lastWalkTime;
    }

    public String getLastWalkTime() {
        return lastWalkTime;
    }

    public void setLastWalkTime(String lastWalkTime) {
        this.lastWalkTime = lastWalkTime;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Woof! Woof!");
    }

    @Override
    public void performCheckup() {
        super.performCheckup();
        System.out.println(getName() + ": >> Checking heartworm and joints.");
    }

    @Override
    public void shampooAndClip() {
        System.out.println(getName() + ": Shampooing and clipping fur... Done!");
    }

    @Override
    public void performTrick() {
        System.out.println(getName() + ": Performing a cool trick!");
    }
}
