package models;

import iterators.ShowIterator;
import iterators.ShowNode;


import java.util.*;


public class ShowList<T> implements Iterable<T> {
    public ShowNode<T> head = null;

    public void addShow(T data) { //Add element to head of the show list
        ShowNode<T> sn = new ShowNode<>();
        sn.setContents(data);
        sn.next = head;
        head = sn;
    }

    public void clear() {
        head = null;
    }


    public Show findShow(T soughtShow) {
        ShowNode<T> temp = head;
        while (temp != null && temp.getContents() != soughtShow) {
            temp = temp.next;
            if (temp == null) {
                throw new NullPointerException("Show dosent exist");
            }
        }
        return null;

    }

    @Override
    public Iterator<T> iterator() {
        return new ShowIterator<>(head);
    }
}
