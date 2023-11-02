package practice;
//Задача 1. Задача о яблоках (начальное значение 30 яблок). Запустить цикл,
// в котором яблоки берутся из корзины до тех пор, пока они там есть.
// Последнее сообщение: "Яблоки кончились!".

public class Apples {
    public static void main(String[] args) {

        int apples = 30;// startovie snachenie
        int counter = 0;// eto schochik
        int applesInCycle = apples;// porametr

        while (applesInCycle >= 0){
            //telo cicla
            System.out.println("Take  one apple from basket");
            applesInCycle = applesInCycle - 1;// isminjaem poramiter cikla
            // applesInCycle--;
            counter++;// colichestvo vipolnenich operacii
            System.out.println("The rest of apples " + applesInCycle);

        }
        System.out.println("The job is done, total apples " + counter + " added in pei from " + apples + " in basket. ");





    }
}
