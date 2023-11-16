package practice.linked_list;

public class Node<E> {
    //Polja
  Node<E> prev;// tip node - vsjalsja ot java
  E data;
  Node<E> next;
  // Constructor
    public Node(Node<E> prev, E data, Node<E> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
// TODO
    @Override
    public String toString() {
        return "Node{" +
                "prev=" + prev +
                ", data=" + data +
                ", next=" + next +
                '}';
    }
}
