package oop.lab;

public class Cat extends Pet implements Groomable {
    private boolean isIndoor;

    public Cat(String name, String breed, int age, double weight, boolean isIndoor) {
        super(name, breed, age, weight);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Meow~");
    }

    @Override
    public void performCheckup() {
        super.performCheckup();
        System.out.println(getName() + ": >> Checking dental health and fur quality.");
    }

    @Override
    public void shampooAndClip() {
        System.out.println(getName() + ": Shampooing and clipping fur... Done!");
    }
}
