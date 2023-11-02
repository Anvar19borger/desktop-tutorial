package practice;


public class ArrayAlphabet {
    public static void main(String[] args) {
        // sapolnit mosiv ot 0..do 20

        int[] arrayNum = new int[20];// objavilöi masiv

        for (int i = 0; i < arrayNum.length; i++) {// sapuskaem cikl

            arrayNum[i] = i + 1;// sapolnjaem eelimenti masiva
        }
        // sapuskaem dlja pechati masivov
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " , ");

        }

        System.out.println();
        System.out.println("0 po indaksu element " + arrayNum[0]);
        System.out.println("19 po indeksu element " + arrayNum[19]);

        // System.out.println(" 20 po indeksu element " + arrayNum[20]);// vichod sa predeli masiva

        char[] alphabet = new char[26];
        // sapolnenie
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (65 + i);// 65 eto kod bolschoi bukvi A latinskogo alfovita,
            // ( char) eto prividenie int k tipu char
        }
        // pechat masiva
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + "  ");
        }

    }
}
