package practice.cats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat[] cat;// sosdali massiv
    @BeforeEach
    void setUpTest() {
        cat = new Cat[4];
        cat[0] = new Cat(101, "Tischka", "breed", 5, 3.5);
        cat[1] = new Cat(102, "Genny", "sfinks", 1, 1.2);
        cat[2] = new Cat(103, "Murzik", "pers", 9, 5.0);
        cat[3] = new Cat(104, "Motya", "maikun", 2, 8.5);

    }
    @Test
    void testCatSort(){
        System.out.println("-------- Test Cat Sorting-------");
        printArray(cat);// pechataem ne ot sortirovannom massive
        Arrays.sort(cat);// v etom metode vipolnili sartirovku
        System.out.println("---Sortirovka po vosrastu------");
        printArray(cat);

    }
    @Test
    void testCatSortCamporator(){
        // vtoroi sposob sartirovki
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());// sravnili po imenam po polju Name
            }
        };
        printArray(cat);// pechataem ne ot sortirovannom massive
        Arrays.sort(cat, catComparator);// vipolnili sartirovku s metodom kamporator
        System.out.println("---Sortirovka po vosrastu------");
        printArray(cat);
    }
    @Test

    public void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}