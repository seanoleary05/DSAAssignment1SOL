package models;

import iterators.ShowIterator;
import iterators.ShowNode;
import org.w3c.dom.Node;


import java.util.*;


public class ShowList<K> implements Iterable<K> {

    ShowList<K> shows = new ShowList<>();


   ShowNode<K> head = null;


    public void addShow(K data) { //Add element to head of the show list
        ShowNode<K> sn = new ShowNode<>(data);
        sn.setData(data);
        sn.next = head;
        head = sn;
    }


    public void listShows(K data){
        System.out.println("List of Shows:");
        for(K s: shows){
            System.out.println(s);
        }
    }

    public void clear() {
        head = null;
    }


    public Show findShow(K soughtShow) {
        ShowNode<K> temp = head;
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
        return new ShowIterator<>(head);
    }
}
