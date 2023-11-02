package homwork022;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if ("byte".equals(args[i])){
                byte maxSize = Byte.MAX_VALUE;
                byte minSize = Byte.MIN_VALUE;
                System.out.println("min value = " +minSize + "min value = " + maxSize);
            }

        }

    }
}
