package practice;
//Задача 1. Имеются оценки абитуриента из его аттестата, всего 20 оценок.
// Найдите средний балл абитуриента.


public class Abiturient {
    public static void main(String[] args) {
// objavili i sapolnili masivi
        int[] marks = {2, 3, 3, 1, 4, 1, 3, 2, 1, 1, 3, 2};//sapolnjaem otcenki

        int sumOfMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            // sumOfMarks = sumOfMarks + marks[i];// dlinno ,no ponjatno
            sumOfMarks += marks[i];// etokorotkaja sapis

        }
double averegeMark = (double) sumOfMarks / marks.length;
        System.out.println("Average mark: " + averegeMark);
        System.out.printf("Average mark =%.2f ", averegeMark);//etot metod ,sokraschjaet chisla posle tochki

    }
}
