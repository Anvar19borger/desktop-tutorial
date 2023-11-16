package practice.linked_list;

import java.util.Iterator;

public class NodeListImpl<E> implements NodeList<E> {
    // Polja
    private Node<E> first;
    private Node<E> last;
    private int size;

    // O(1)
    @Override
    public int size() {
        return size;
    }

    //O(1)
    @Override
    public boolean add(E element) {
        Node<E> newNode = new Node<>(last, element, null); // sosdaem novii, sleduschi usel, poslednii
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode; // esli spisok bil pustoi, to  novii sosdovaemii stanovitsa pervim
        }
        last = newNode;
        size++;
        return true;
        // usel novii ,sleduschii , v konce spiska
    }

    // O(1)
    @Override
    public void clear() {
        first = last = null;
        size = 0;

    }

    //O(n)
    @Override
    public boolean add(int index, E element) {
        if (index == size) {//eto dobovlenija elimenta v konec
            return add(element);
        }
        Node<E> node = getNodeByIndex(index);// berem usel po ego indexu
        Node<E> newNode = new Node<>(node.prev, element, node);// sosdaem novi usel dlja vstavku v cpisok
        node.prev = newNode;
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            first = newNode;// vstavka v nachalo spiska
        }
        size++;
        return true;
    }

    //O(n)
    // rasobratsja kak rabotaet metod
    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    //O(n)
    @Override
    public E get(int index) {
        Node<E> node = getNodeByIndex(index);
        return node.data;
    }

    //O(n)
    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o != null) { // vnutri usla net null
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o.equals(node.data)) {
                    return index;
                }
            }
        } else { // vnuri usla null
            for (Node<E> node = first; node != null; node = node.next, index++) {// cikl, kotori perebiraet usli
                if (o == node.data) {// null ojno sravnivat cheres ==
                    return index;
                }
            }
        }
        return -1; // obekta  ne suschistvuet (obekt o ne naid3en v spiske)
    }

    //O(1)
    @Override
    public int lstIndexOf(Object o) {

        int lastIndex = -1;
        int index = 0;
        if (o != null) {
            for (Node<E> node = last; node != null; node = node.prev, index++) {
                if (o.equals(node.data)) {
                    lastIndex = index;
                    break; // Naiden poslednii index ,vichod is cikla
                }
            }
        } else {
            for (Node<E> node = last; node != null; node = node.prev, index++) {
                if (node.data == null) {
                    lastIndex = index;// Naiden poslednii index ,vichod is cikla
                    break; //
                }
            }
        }
        return lastIndex;
    }

    // O(n)
    @Override
    public E reove(int index) {
        Node<E> node = getNodeByIndex(index);
        return unlink(node);

    }

    //Этот метод unlink используется для удаления узла из связанного списка. Вот пошаговое объяснение того, что делает этот метод:
    //
    //E victim = node.data;: Сохраняет значение данных узла, который будет удален, чтобы впоследствии вернуть его из метода.
    //
    //Node<E> prev = node.prev;: Сохраняет ссылку на предыдущий узел.
    //
    //Node<E> next = node.next;: Сохраняет ссылку на следующий узел.
    //
    //if (prev != null) { prev.next = next; node.prev = null; } else { first = next; }: Проверяет, существует ли предыдущий узел.
    // Если предыдущий узел существует, он устанавливает ссылку next предыдущего узла на следующий узел за удаляемым узлом (prev.next = next),
    // а затем обнуляет ссылку на предыдущий узел у удаляемого узла (node.prev = null). Если предыдущего узла нет,
    // значит удаляемый узел был первым в списке, поэтому first (первый узел списка) устанавливается на следующий за удаляемым узлом (first = next).
    //
    //if (next != null) { next.prev = prev; node.next = null; } else { last = prev; }:
    // Проверяет, существует ли следующий узел после удаляемого узла. Если следующий узел существует,
    // он устанавливает ссылку prev следующего узла на предыдущий узел перед удаляемым узлом (next.prev = prev),
    // а затем обнуляет ссылку на следующий узел у удаляемого узла (node.next = null).
    // Если следующего узла нет, значит удаляемый узел был последним в списке, поэтому last (последний узел списка)
    // устанавливается на предыдущий узел перед удаляемым узлом (last = prev).
    //
    //node.data = null;: Обнуляет данные удаляемого узла для предотвращения утечки памяти.
    //
    //size--;: Уменьшает размер списка, так как узел был удален.
    //
    //return victim;: Возвращает значение данных удаляемого узла.
    //
    //Этот метод отсоединяет узел из списка, обновляя ссылки предыдущего и следующего узлов таким образом,
    // что удаляемый узел исключается из цепочки связанных узлов.

    // O(1)
    private E unlink(Node<E> node) {
        E victim = node.data;
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        if (prev != null) {
            prev.next = next;
            node.prev = null;
        } else {
            first = next;
        }
        if (next != null) {
            next.prev = prev;
            node.next = null;
        } else {
            last = prev;
        }
        node.data = null;
        size--;
        return victim;

    }

    //O(n)
    @Override
    public E set(int index, E element) {
        Node<E> node = getNodeByIndex(index);// naschli usel po indexu
        E victim = node.data;
        node.data = element;// obnavlennie danie
        return victim;

    }

    //O(1)
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}
