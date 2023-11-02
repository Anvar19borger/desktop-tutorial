package praktice;

import java.util.Arrays;

public class StringAppl {
    public static void main(String[] args) {

        System.out.println("------------------------------------");
        String str = "Hello";
        char[] chars = {32, 'w', 'o', 'r', 'l', 'd'};// 32 - eto code probela
        String str1 = new String(chars);
        System.out.println(str1);
        str = str + str1;
        System.out.println(str);
        str = str.concat(str1);// onologischnaja opeeracija, dobavil esche ras slovo world
        System.out.println(str);
        int l = str.length();// viesnjaem dlinu stroki
        System.out.println("Dlina stroki " + str + " : " + l);
        char c = str.charAt(str.length() - 1);// oprediljaem poslednii sinvol stroki
        System.out.println("Posledni sinvol stroki : " + c);

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println(" Budim pichatat po bukvam: ");// peechat po bukwam
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println("------------------------------------");
        String str2 = " World";// budim sravnivat s str1 = " world"
        System.out.println(str1.equals(str2));// ojidaem false
        System.out.println(str1.equalsIgnoreCase(str2));//ojidaem true
        String str3 = str1.toUpperCase();// perivodim stroku v   UpperCase
        System.out.println(str3);
        str3.toLowerCase();
        System.out.println(str3.toLowerCase());// perevodim v niskii register

        System.out.println("------------------------------------");
        // indeex - posicija  sinvola v stroke
        System.out.println(str);
        int index = str.indexOf('l');//str = "Hello"
        System.out.println("Indeex dlja l = " + index);
        index = str.indexOf("world");// s kokogo indexa nachinaetsja podstroka "world"
        System.out.println(index);
        index = str.indexOf('l', 4);// ischim l nachinaja s 4 indexa v stroke
        System.out.println(index);
        index = str.lastIndexOf('l');// eto index poslednigo nachojdenija 'l'
        System.out.println(index);
        index = str.indexOf('A');// ischeeem index otsudvuscheei bukvi
        System.out.println(index);
        System.out.println("------------------------------------");
        System.out.println(str.substring(3));// napichataeeem podstroku s 3 indexa
        System.out.println(str.substring(1, 8));// a sdes s indexa do indeex"primer s1 po 8"
        System.out.println((str.replace("o", " o-o-o")));// samena bukv
        System.out.println("------------------------------------");// udaljaeem probeeli
        String str4 = "             Bill        ";
        System.out.println(str4);
        str4 = str4.trim();
        System.out.println(str4);
        System.out.println("------------------------------------");
        String str5 = "I love Sring in Java!";
        String[] words = str5.split(" ");// rasdeljaeem stroku na elimeenti massiva  tipa String
        System.out.println("Quantity of words in string: " + words.length);// usnali dlinu massiva
        System.out.println(Arrays.toString(words));// napichatali massiv
        System.out.println("------------------------------------");
        String str6 = "Ja pomnü chudnoe mngnovenie ...";
        String[] letters = str6.split("");// rasdelitelja net, chtobi poluchit bukvi
        System.out.println("Quantity of letters in string: " + letters.length);//
        System.out.println(Arrays.toString(letters));


    }
}
