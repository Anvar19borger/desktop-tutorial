package practice.linked_list;

public class NodeListAppl {
    public static void main(String[] args) {
        // sosdaem spisok  is celich chisel

        NodeListImpl<Integer> listNumbers = new NodeListImpl<>();
        System.out.println(listNumbers.size());
        System.out.println(listNumbers.isEmpty());

        listNumbers.add(100);
        listNumbers.add(200);
        listNumbers.add(300);
        listNumbers.add(400);

        System.out.println(listNumbers.size());
        System.out.println(listNumbers.isEmpty());

        for (Integer n : listNumbers ){
            System.out.print(n + " | ");
        }
        System.out.println();
      //  System.out.println(listNumbers);// chornaja peschat

        // stavit 250 pod indecsom 2
        listNumbers.add(2,250);
        for (Integer n : listNumbers ){
            System.out.print(n + " | ");
        }
        System.out.println();
        // udalim usel 300 po indexu 2
        listNumbers.reove(3);
        for (Integer n : listNumbers ){
            System.out.print(n + " | ");
        }
        System.out.println();
        // dobaviom null
        listNumbers.add(4,null);
        for (Integer n : listNumbers ){
            System.out.print(n + " | ");
        }
        System.out.println();





        // sosdaem spisok is strok
    }
}
