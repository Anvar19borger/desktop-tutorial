package computer.practice.comp;

import computer.practice.comp.model.Computer;
import computer.practice.comp.model.Laptop12;

public class ComputeerAppl1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Computer[] shop = new Computer[4];
        System.out.println(shop);
        shop[0] = new Computer(" i5 ", 12, 512, " HP ");
        shop[1] = new Laptop12("i7", 16, 512, "Asus", 3, 2.1 );

        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);
            
        }
        
        Object computer12 = new Computer("i5 ", 12, 512, "HP");
        Object laptop12 = new Laptop12("i7", 16, 512, "Asus", 3, 2.1  );
        System.out.println();
        System.out.println(computer12);
        System.out.println(laptop12);







    }
}
