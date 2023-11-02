package homework10;

//Task 1
//Collect data on daytime temperatures in your city and the past week into an array.
// Print the temperature that was on Tuesday and then on Thursday.
// Find the average temperature for the past week.

public class Temperature {
    public static void main(String[] args) {

        double[] temperatures = {25, 27, 27, 25, 28, 28, 25};

        // Vivoju tempiraturu dlja vtornika i chetverga, gde vtornik evljaetsja (indeks 1) a chetverg ( indeks 3)
        System.out.println("Tuesday's temperature : " + temperatures[1] + " Celsius");
        System.out.println("Thusday's temperature : " + temperatures[3] + " Celsius");

        // vichesljau tempiraturu sa proschluju nedelü
        double sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }
        double averageTemperature = sum / temperatures.length;
        System.out.println("Last week's average temperature : " + averageTemperature + " Celsius");
        System.out.printf("Last week's average temperature = %.1f" ,averageTemperature );

    }
}









