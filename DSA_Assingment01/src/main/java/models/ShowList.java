package models;

import iterators.CustomIterator;
import iterators.Node;




import java.util.*;


public class ShowList<K> implements Iterable<K> {

    private ShowList<K> s;

    public ShowList() {s = new ShowList<>();}


   Node<K> head = null;


   public void showStart(){
       s.addShow(head.getData());
   }


    public void addShow(K data) { //Add element to head of the show list
        Node<K> sn = new Node<>(data);
        sn.setData(data);
        sn.next = head;
        head = sn;
    }


    public void listShows(K data){
        System.out.println("List of Shows:");
        for(K s: s){
            System.out.println(s);
        }
    }

    public void clear() {
        head = null;
    } //reset facility


    public Show findShow(K soughtShow) {
        Node<K> temp = head;
        while (temp != null && temp.getData() != soughtShow) {
            temp = temp.next;
            if (temp == null) {
                throw new NullPointerException("Show dosent exist");
            }
        }
        return null;

    }

    @Override
    public Iterator<K> iterator() {
        return new CustomIterator<>(head);
    }
}
