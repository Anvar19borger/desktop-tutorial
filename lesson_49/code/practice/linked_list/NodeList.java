package practice.linked_list;

public interface NodeList<E> extends Iterable<E>{
    // Propisivaem metodi
    int size(); // On snaet rasmmer lista
   default boolean isEmpty(){
       return size() == 0;
    }
    boolean add(E element); // dobavlenie
    void clear(); // sachistka

    default boolean contains(Object o) {
        return indexOf(o) >= 0; // est li takoi nobekt
    }

    default boolean remove(Object o) {
        int index = indexOf(o);
        if (index < 0){
            return false;

        }
        remove(index);
        return true;
    }
    boolean add(int index, E element);// dobavit na mesto po indexu
    E get(int index); // poluchenie elimenta po indeksu
    int indexOf(Object o); //
    int lstIndexOf(Object o);
    E reove(int index); //udolenie is lista usla po ego indesu (nomeru)
    E set(int index, E element);


}
