package lists;

import iterators.ShowIterator;
import iterators.ShowNode;

import java.util.Iterator;

public class ShowList<T> implements Iterable<T>  {
    ShowList<String> names = new ShowList<>();


    public ShowNode<T> head = null;


    public void addShow(T data) { //Add element to head of the show list
        ShowNode<T> sn = new ShowNode<>();
        sn.setContents(data);
        sn.next=head;
        head=sn;
    }
     public Iterator<T> iterator() {
         return new ShowIterator<>(head);

     }






}
