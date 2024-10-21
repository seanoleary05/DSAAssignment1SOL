package iterators;


import java.util.Iterator;

public class CustomIterator<K> implements Iterator<K> {

    private Node<K> pos;


    public CustomIterator(Node<K> node) {
        pos = node;
    }

    public boolean hasNext() {
        return pos != null;

    }

    public K next() {
        Node<K> temp = pos;
        pos = pos.next;
        return temp.getData();
    }



}










