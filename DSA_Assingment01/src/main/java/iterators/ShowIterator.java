package iterators;

import lists.ShowList;
import models.ShowNode;

import java.util.Iterator;

public class ShowIterator<K> implements Iterator<K> {

    private ShowNode<K>  pos;
    public ShowNode<K> head;

    public ShowIterator(ShowNode<K> snode) {pos =snode;}

    public boolean hasNext(){
        return pos != null;
    }

    public K next(){
        ShowNode<K> temp = pos;
        pos=pos.next;
        return temp.getContents();
    }






    public class ShowNode<K> {
        public ShowNode<K> next = null;
        private K contents;

        public K getContents() {return contents;}
        public void setContents(K contents) {this.contents = contents;}

    }
}
