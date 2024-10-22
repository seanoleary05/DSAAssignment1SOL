package lists;

import iterators.CustomIterator;
import iterators.CustomNode;
import models.Show;


import java.util.*;


public class CustomList<K> implements Iterable<K> {

    CustomList<K> shows = new CustomList<>();

    CustomNode<K> head = null;
    CustomNode<K> current;
    CustomNode<K> last;


    public void addShow(K data) { //Add element to head of the show list
        CustomNode<K> sn = new CustomNode<>(data);
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


    public Show<K> findShow(K soughtShow) {
        CustomNode<K> temp = head;
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
        return new CustomIterator<>();
    }
}
