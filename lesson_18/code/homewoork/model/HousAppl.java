package homewoork.model;

public class HousAppl {
    public static void main(String[] args) {

        Cat cat1 = new Cat( 1, "Koschka", 7, "Max", "Meikun", 0.40, 5.0 );
        Cat cat2 = new Cat(2, " Koschka",  5,"Bars", "Pers", 0.35, 3.5);
        Cat cat3 = new Cat(3, "Koschka", 4, "Jeni", "Sfinx", 0.29, 2.8);
        Dog dog1 = new Dog(4, "Sobaka", 5, "Graf", "Dobermann ", 1.10, 30.0 );
        Dog dog2 = new Dog(5, "Sobaka", 6, "Hanteer",  " Rotweiler", 1.05, 35.0);

         // Jisn v dome
        System.out.println(" Jisn v dome!");
        System.out.println("V dome jivut 3 koschki i 2 sobaki.");

        // Visivaem metod voice dlja kajdego jiwotnogo
        System.out.println(cat1.getName() + " maukaet : ");
        cat1.voice();
        System.out.println(cat2.getName() + " maukaet : ");
        cat2.voice();
        System.out.println(cat3.getName() + " maukaet : ");
        cat3.voice();
        System.out.println(dog1.getName() + " laet : ");
        dog1.voice();
        System.out.println(dog2.getName() + " laet : ");
        dog2.voice();

        System.out.println("Jisn v dome bet kluchom...");


    }
}
