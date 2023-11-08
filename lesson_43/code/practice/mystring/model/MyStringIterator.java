package practice.mystring.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {
    // polja
    private StringBuilder str;
    private int size;
    private int currPosition;

    // konstruktor

    public MyStringIterator(StringBuilder str) {
        this.str = str;
        this.size = str.length();
        //this.currPosition = currPosition;
    }
    // proverka est li sleduschi eliment

    @Override
    public boolean hasNext() {
        return currPosition < size;// et0o logicheskoe virojenie , true  - snachit esche est elimenti mmnojestva
    }
    // etot metod doljen vrnut elementi mnojestva

    @Override
    public Character next() {
      Character curCharacter = str.charAt(currPosition);
      currPosition++;
      return curCharacter;
    }
    // etot etod dlja udolenija elimenta stroki
    public void remove(){
        str.deleteCharAt(--currPosition);
        size--;
    }
}
