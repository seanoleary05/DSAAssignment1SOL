package com.example.dsa_assignment01;

import iterators.CustomIterator;
import iterators.CustomNode;
import models.Show;


import java.util.*;


public class CustomList<K> implements Iterable<K> {


    private CustomNode<K> head;
    private int size;

    public CustomList() {
        this.head = null;
    }

    public void add(K data) { //Add element to head of the show list
        CustomNode<K> sn = new CustomNode<>(data);
        sn.next = head;
        head = sn;
    }

/*


    public static void  listShows(CustomList<K> list) {
        String currentList = "";
        System.out.println("Shows in the list:");
        for (Object show : list) {
            currentList +=  "\n" + Show.getShowTitle();

        }
        return currentList;
    }

*/





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
        return new CustomIterator<>(head); // passes the head to the iterator
    }
}
