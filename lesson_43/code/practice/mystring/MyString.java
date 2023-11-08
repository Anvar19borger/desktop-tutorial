package practice.mystring;

import practice.mystring.model.MyStringIterator;

import java.util.Iterator;

public class MyString  implements Iterable<Character>{
    // polja/ field
    private StringBuilder str;// StringBuilder - eeto vstroini v Java class

    // konstrucktor

    public MyString(StringBuilder str) {
        this.str = new StringBuilder(str);
    }

    public StringBuilder getStr() {
        return str;
    }

    public void setStr(StringBuilder str) {
        this.str = str;
    }

    // metod dobovlenija sinvola
    public void addChar(char ch) {
        str.append(ch);
    }

    // mmetod udolenija sinvolov
    public void removeChar(char ch) {
        int index = str.indexOf(Character.toString(ch));// naschli index, s leva na pravo, na kotorom stoit ch
        str.deleteCharAt(index);// udalili
    }

    @Override
    public String toString() {
        return str.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }
}
