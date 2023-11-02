package practice1.time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class TimeAppl {
    public static void main(String[] args) {
        //        **Работа с датами:**
//        - узнать текущую дату и время
//        - есть дата, какой это был день недели? день месяца? день года?
//        - есть дата, как узнать, это было раньше? или позже?
//
//          **Путешествие во времени**
//        - в будущее currentDay.plus
//        - в прошлое currentDay.minus
//        - использование ChronoUnit
//
//          **Получение интервала времени**
//
//          **Сортировка массива по времени**
//
//         **Date Formatter**
//
//          **Парсинг даты из строки**

        LocalDate currentDay = LocalDate.now();
        System.out.println(currentDay);// Mejdunarodnii format dati

        LocalTime  currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate gagarin = LocalDate.of(1961,4,12);
        System.out.println(gagarin.getYear());
        System.out.println(gagarin.getDayOfYear());
        System.out.println("Start Gagarin day of week: " + gagarin.getDayOfWeek());

        System.out.println(gagarin.isBefore(currentDay));// ojidaem true
        System.out.println(gagarin.isAfter(currentDay));// ojidaem false

        System.out.println("---------Traveling in Time----------------");
        LocalDate newDate = currentDay.plusDays(50);
        System.out.println(newDate);

        newDate = currentDay.plusWeeks(12);
        System.out.println(newDate);

        // 2 kakaja data bila
        newDate = currentDay.minusMonths(2);
        System.out.println("Twi month ago: " + newDate);

        // operacija with chronounits
        System.out.println(localDateTime.plus(9, ChronoUnit.HALF_DAYS));// skoolko polovinok dnei po 12 chesov proschlo
        // CENTURE - 100 let
        newDate = currentDay.plus(2, ChronoUnit.CENTURIES);
        System.out.println(" In 2  centures: " + newDate);
        System.out.println("Kakoi den nedeli budit: " + newDate.getDayOfWeek());

        // Skolko let proschlo? skolko let
        LocalDate einstain = LocalDate.of(1879,3,14);
        long res = ChronoUnit.YEARS.between(gagarin,einstain);
        System.out.println(res);

        System.out.println("Srovnenie dati");
        System.out.println(einstain.compareTo(gagarin));// srovnenie dati
        LocalDate yestertoday = LocalDate.of(2023,10,30);
        System.out.println(currentDay.compareTo(yestertoday));

        // wremmja sartirovki
        LocalDate[] dates = {yestertoday,einstain,gagarin,currentDay};
        System.out.println(Arrays.toString(dates));// nee otsartirovaniee dati
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));// otsortirovannaja data v massive


    }
}
