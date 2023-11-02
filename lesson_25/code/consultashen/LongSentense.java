package consultashen;

public class LongSentense {
    public static void main(String[] args) {

        String senteense = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";
        String[] words = senteense.split(" ");//metod skolko slov
        System.out.println("Stolko simvolov v etom predlojenie: " + words.length);
        int count = 0;

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals("–")) {// schitaeemm skolko tire
                count++;

            }
        }
        System.out.println("Stolko teree v etom predlojenie: " + count);
        int w = words.length - count;
        System.out.println( "Stolko slov v etom predlojeenie : " + w);


        String[] letters = senteense.split("");
        System.out.println("Stolko bukv v etomm predlojenii : " + letters.length);

        String[] comma = senteense.split(",");
        System.out.println("Stolko comma v etom predlojenie : " + comma.length);

        System.out.println("----------");

        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }
        String finalOutput = reversedString.toString().trim();
        System.out.println("Pechataem stroku sadom na pered : " + finalOutput);



    }

}
