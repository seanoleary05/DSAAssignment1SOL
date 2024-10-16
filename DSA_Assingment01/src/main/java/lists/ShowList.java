package lists;

import iterators.ShowIterator;
import iterators.ShowNode;
import models.Show;

import java.util.Iterator;

public class ShowList<T> implements Iterable<T>  {
    ShowList<Show> shows = new ShowList<>();



    public ShowNode<T> head = null;


    public void startShow(){
        shows.addShow(new Show("New Show",45,"starts soon", "ends now", 12.99));

    }


    public void addShow(T data) { //Add element to head of the show list
        ShowNode<T> sn = new ShowNode<>();
        sn.setContents(data);
        sn.next=head;
        head=sn;
    }

   public void clear(){
            head=null;
   }

     public Iterator<T> iterator() {
         return new ShowIterator<>(head);

     }






}
