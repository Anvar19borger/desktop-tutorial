package practice;
//Задача 2. Создайте массив, который содержит возраст студентов группы.
//
//какой возраст максимальный?
//какой возраст минимальный?
//есть ли однокурсники с одинаковым возрастом? Если да, то сколько студентов, у которых одинаковый возраст?


public class EgeOfStudents {
    public static void main(String[] args) {

        int[] ageOfStudent ={30, 18, 45, 52, 43, 25, 61, 38, 40, 35, 36,45, 47, 34, 29, 22, 18};

        // ichem maksimalnii eliment masiva
        int max = ageOfStudent[0];// eto pervi kondidat na maximum
        int indexMax = 0;

        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] > max ){// kak da tekuschii eliment masiva budet bolsche , chem max
                max =ageOfStudent[i];// vsjali maximalnii eliment
                indexMax = i;// vsali ego indeks
            }
        }
        System.out.println("Max age: " + max);
        System.out.println("Indeex of max element : " + indexMax);

        // ichem minimalnii eliment masiva
        int min = ageOfStudent[0];// eto pervi kondidat na minimum
        int indexMin = 0;

        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] < min ){// kak da tekuschii eliment masiva budet mensche , chem max
                min =ageOfStudent[i];// vsjali minimalnii eliment
                indexMin = i;// vsali ego indeks
            }

        }
        System.out.println("Min age: " + min);
        System.out.println("Indeex of max element : " + indexMin);

        // ischim dublikat
        // idem po vsem elementam masiva, nachinaja  s 0-go, i dlja nego ischem sovpodenie
        // otvet viglidit tak, : est dublikat, ego indeks - ...., vsegda tokich dublikatov....

        int duplicate = ageOfStudent[0];// kondidat na  duplicata
        int dCount = 0;// eto schotschik
        int index = 0;
        for (int i = 0; i < ageOfStudent.length; i++) {
            for (int j = i + 1; j < ageOfStudent.length; j++) {//nachinaem poisk dublikata so so sledujuschego elementa
                if (ageOfStudent[i] == ageOfStudent[j]){
                    duplicate = ageOfStudent[i];
                    dCount++;
                    index = j;//TODO vosmojno index += j; - proverit
                    System.out.println("Duplicate : " + duplicate + " index : " + index);
                    System.out.println("Quality of duplicate : " + dCount);

                }
            }
        }
    }
}
