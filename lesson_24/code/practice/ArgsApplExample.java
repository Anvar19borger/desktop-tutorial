package practice;

public class ArgsApplExample {
    public static void main(String[] args) {
        //String[] args - eeto massiv tippa String i sovut ego args
        // V etot massiv mojno peredovat dannie pri startee progggrami is kontaktnoi stroki

        String str1 = args[0];
        int num1 = Integer.parseInt(str1);

        String str2 = args[1];
        int num2 = Integer.parseInt(str2);


        System.out.println(str1 + " * " + str2 + " = " + num1 * num2);


    }
}
