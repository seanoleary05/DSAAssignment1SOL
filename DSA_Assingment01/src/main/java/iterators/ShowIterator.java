package iterators;

import lists.ShowList;


import java.util.Iterator;

public class ShowIterator<K> implements Iterator<K> {

    private ShowNode<K> pos;


    public ShowIterator(ShowNode<K> snode) {
        pos = snode;
    }

    public boolean hasNext() {
        return pos != null;

    }

    public K next() {
        ShowNode<K> temp = pos;
        pos = pos.next;
        return temp.getContents();
    }


}






