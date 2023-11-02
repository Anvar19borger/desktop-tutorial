package computer.practice.comp;

import computer.practice.comp.model.Computer;
import computer.practice.comp.model.Laptop12;
import computer.practice.comp.model.Laptop;
import computer.practice.comp.model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {
        double a = 10;// upper casting
        int b = (int) a;// down casting
        Computer[] shop = new Computer[5];
        shop[0] = new Computer(" i5 ", 12, 512, " HP ");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone("Snapdragon", 8, 128, "Samsung", 24, 0.15, 123456789098l);

        printArray(shop);
        int total = getTotalSSDCapacity(shop);
        System.out.println("Total ssd  capacity = " + total);
        Laptop12 laptop1 = (Laptop12) shop[1];
        laptop1.setHours(4.5);
        System.out.println(laptop1);
        System.out.println(shop[1]);
    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.println(arr[i]);
        }
    }

    public static int getTotalSSDCapacity(Computer[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)

                res += arr[i].getSsd();

        }
        return res;
    }

    public static double getTotalLaptopHours(Computer[] arr) {
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop) {
                Laptop laptop = (Laptop) arr[i];
                res += laptop.getHours();
            }

        }
        return res;
    }

    public static int getTotalSSDLaptopCapacity(Computer[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop && !(arr[i] instanceof Smartphone)) {
                res += arr[i].getSsd();
            }

        }
        return res;
    }

}
