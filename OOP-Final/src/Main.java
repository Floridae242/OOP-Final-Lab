public class Main {
    public static void main(String[] args) {

        oop.lab.Dog lucky = new oop.lab.Dog("Lucky", "Golden Retriever", 3, 25.0, "16:00");
        oop.lab.Cat mimi = new oop.lab.Cat("Mimi", "Persian", 2, 4.5, true);


        oop.lab.PetClinic clinic = new oop.lab.PetClinic();


        System.out.println("===== Welcome to The Ultimate Pet Clinic =====\n");


        System.out.println("[Action] Registering new pets...");
        clinic.addPet(lucky);
        System.out.println("- Added: " + lucky.getName() + " (" + lucky.getBreed() + ")");
        clinic.addPet(mimi);
        System.out.println("- Added: " + mimi.getName() + " (" + mimi.getBreed() + ")");


        System.out.println("\n----------------------------------------------");
        System.out.println("[1] Pet Information & Human Age Calculation");
        System.out.println("----------------------------------------------");
        lucky.displayPetInfo();
        System.out.println();
        mimi.displayPetInfo();


        System.out.println("\n----------------------------------------------");
        System.out.println("[2] Clinic Statistics");
        System.out.println("----------------------------------------------");
        System.out.println("Total pets registered: " + clinic.getTotalPets());
        System.out.printf("Average weight of pets in clinic: %.2f kg.%n", clinic.calculateAverageWeight());

        System.out.println("\n----------------------------------------------");
        System.out.println("[3] Starting Clinic Day (Polymorphism in Action)");
        System.out.println("----------------------------------------------");
        clinic.startClinicDay();


        System.out.println("----------------------------------------------");
        System.out.println("[4] Special Services (Interface Testing)");
        System.out.println("----------------------------------------------");

        System.out.println("[Service] Grooming Lucky...");
        clinic.provideGrooming(lucky);
        System.out.println();

        System.out.println("[Service] Training Lucky...");
        clinic.provideTraining(lucky);
        System.out.println();

        System.out.println("[Service] Grooming Mimi...");
        clinic.provideGrooming(mimi);
        System.out.println();

        System.out.println("[System] Note: Mimi is not Trainable.");
        System.out.println("----------------------------------------------");
    }
}
