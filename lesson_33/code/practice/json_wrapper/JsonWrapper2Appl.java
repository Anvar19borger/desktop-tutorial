package practice.json_wrapper;

public class JsonWrapper2Appl {
    public static void main(String[] args) {

        JsonWrapper2<String> wrapper2 = new JsonWrapper2<>("10");
        System.out.println(wrapper2.getValue() + " Privet!");
        System.out.println();

        //  String a = wrapper2.getValue();
        //System.out.println(a);
        JsonWrapper2<Integer> wrapper21 = new JsonWrapper2<>(10);
        wrapper21.getValue();
        System.out.println(wrapper21.getValue() * 10);


    }

}
