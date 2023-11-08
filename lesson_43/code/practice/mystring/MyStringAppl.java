package practice.mystring;

import java.util.Iterator;

public class MyStringAppl {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("To be or not too be");

        MyString myString = new MyString(str);

        Iterator<Character> iterator = myString.iterator();

        while (iterator.hasNext()){
            char ch = iterator.next();
            if(ch == 'o') { // удалили все буквы o
                iterator.remove();
            }
        }
        System.out.println(myString);

       // myString.addChar('!');
        //System.out.println(myString);
        //myString.removeChar('r');
       // System.out.println(myString);
       // myString.removeChar('o');
        //System.out.println(myString);

        // napichataem vsju stroku bolschimi bukvami
       // StringBuilder builder  = myString.getStr();// v pereennuju builder sabrali  soderjimoe
        //for (int i = 0; i < builder.length(); i++) {
          //  char c = builder.charAt(i);
            //c = Character.toUpperCase(c);
            //System.out.print(c);


       // }
        // drugoi programist delaet
        //System.out.println();
        //builder.setLength(5);// obresali dlinu stroki
        //System.out.println(builder);// napischatali
        //System.out.println(myString);// isminilas ischodnaja stroka - eto plocho!


    }
}
