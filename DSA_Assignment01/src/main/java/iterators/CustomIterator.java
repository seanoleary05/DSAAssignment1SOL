package iterators;


import java.util.Iterator;

public class CustomIterator<K> implements Iterator<K> {

    private CustomNode<K> pos;


    public void Iterator(CustomNode<K> cnode) {
        pos = cnode;
    }

    public boolean hasNext() {
        return pos != null;

    }

    public K next() {
        CustomNode<K> temp = pos;
        pos = pos.next;
        return temp.getData();
    }



}










