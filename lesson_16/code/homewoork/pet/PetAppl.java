package homewoork.pet;

import homewoork.pet.model.Pet;

public class PetAppl {
    public static void main(String[] args) {

        Pet pet1 = new Pet(1, "Pferd ", 2, "Pegas ");
        Pet pet2 = new Pet(2, "Hund ", 3, "Baron");

        pet1.display();
        pet2.display();
        pet1.sleep();
        pet2.eat();
        pet1.play();
        pet2.walk();
        pet2.play();

        String name = pet1.getName();
        System.out.println(name);


    }
}
