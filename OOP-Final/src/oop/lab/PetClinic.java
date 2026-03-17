package oop.lab;

import java.util.ArrayList;

public class PetClinic {
    private ArrayList<Pet> pets;

    public PetClinic() {
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet p) {
        pets.add(p);
    }

    public int getTotalPets() {
        return pets.size();
    }

    public void startClinicDay() {
        for (Pet pet : pets) {
            pet.makeSound();
            pet.performCheckup();
            System.out.println();
        }
    }

    public double calculateAverageWeight() {
        if (pets.isEmpty()) {
            return 0;
        }
        double totalWeight = 0;
        for (Pet pet : pets) {
            totalWeight += pet.getWeight();
        }
        return totalWeight / pets.size();
    }

    public void provideGrooming(Groomable p) {
        p.shampooAndClip();
    }

    public void provideTraining(Trainable p) {
        p.performTrick();
    }
}
