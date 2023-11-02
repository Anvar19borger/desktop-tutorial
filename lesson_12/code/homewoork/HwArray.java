package homewoork;

// Напишите метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
// Сначала последний элемент, потом предпоследний, и т.д.
//Измените (лучше скопируйте и сделайте еще один метод) метод так,
// чтобы он работал с массивом, заполненном "цифрами прописью"
// : zero, one, two, three, ..., nine Выполните "разворот" это массива.

public class HwArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};//Sadaem massiv dlja chisel
        String[] words = {"odin ", " dva ", " tri ", " chetiri ", " pjat"};// sadaem massiv dlja slov

        System.out.println(" Obratnii porjadok , massiv celich chisel:");
        printReverseArray(numbers);
        System.out.println("=============================");
        System.out.println("\n Obratnii massiv strok:");
        printReverseArray(words);
    }

    //  Metod pechati masiva celich chisel v obratnom porjadke
    public static void printReverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //  Metod pechati massiva ,  propisju v obratnom porjadke
    public static void printReverseArray(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
