package practice.beverage;

import practice.beverage.model.Beer;
import practice.beverage.model.Beverage;

public class BeverageAppl {
    public static void main(String[] args) {

        Beverage  beverage = new Beverage();
        beverage.displayStock();
        System.out.println("----------------------------------------------------------");


        Beverage b1 = new Beverage("Moloko","box", 10);
        b1.toBuy("Moloko", "box", 20);
        b1.displayStock();
        System.out.println("----------------------------------------------------------");

        Beer beer = new Beer();
        beer.displayStock();
        System.out.println("----------------------------------------------------------");


        Beer b2 = new Beer("Avgustiner", "6 pack", 10, "Heles");
        b2.toBuy("Avgustiner", "6 pack", 10, "Heles");
        b2.displayStock();





    }
}
