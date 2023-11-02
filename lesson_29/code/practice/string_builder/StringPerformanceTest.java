package practice.string_builder;

public class StringPerformanceTest {
    private static  final int N_ITERATION = 100_000;// opredeljaem constantu
    private  static  final String WORD = "Word";// opredeljaem constantu


    public static void main(String[] args) {
        // Chto to so String imutebal
        String str = "";// iniciirivali pustuju stroku
        long t1 = System.currentTimeMillis();// Sosika vrmja
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis();// vtoraja sasechka vremini
        System.out.println(t2 - t1);// skolko vrmini proschlo v millesikundach

        // StringBuilder - mutable
        StringBuilder stringBuilder = new StringBuilder("");
         t1 = System.currentTimeMillis();//
        for (int i = 0; i < N_ITERATION; i++) {
            stringBuilder.append(WORD);
        }
        str =stringBuilder.toString();
         t2 = System.currentTimeMillis();//
        System.out.println(t2 - t1);




    }
}
