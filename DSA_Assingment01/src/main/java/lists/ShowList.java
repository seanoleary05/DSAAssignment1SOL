package lists;

import iterators.ShowIterator;

import java.util.Iterator;

public class ShowList<T> implements Iterable<T>  {
    S



    public ShowNode<T> head = null;



    class ShowNode<N>{
        public ShowNode<N> next=null;
        private N contents;

        public N getContents() {return contents;}
        public void setContents(N contents) {this.contents = contents;}
    }




    public void addShow(T data) { //Add element to head of the show list
        ShowNode<T> sn = new ShowNode<>();
        sn.setContents(data);
        sn.next=head;
        head=sn;
    }
    /* public Iterator<T> iterator() {
        return new ShowIterator<T>(head);

    }

     */





    public void clear(){ // empties list
        head=null;
    }


}
