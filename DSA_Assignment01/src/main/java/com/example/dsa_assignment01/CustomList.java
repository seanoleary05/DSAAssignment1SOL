package com.example.dsa_assignment01;

import iterators.CustomIterator;
import iterators.CustomNode;
import models.Show;


import java.util.*;


public class CustomList<K> implements Iterable<K> {


    private CustomNode<K> head;
    private int size;


    public void add(K data) { //Add element to head of the show list
        CustomNode<K> sn = new CustomNode<>(data);
        sn.next = head;
        head = sn;
    }


    public String list(){
        String result ="";
        CustomNode<K> current = head;
        System.out.println("List of Shows:");

        while (current!= null){   // while current is not the at the end of the list
            result += current.next;
            current = current.next;
        }
        return result;
    }

    public void clear() {
        head = null;
    }


    public Show<K> findShow(K soughtShow) {
        CustomNode<K> temp = head;
        while (temp != null && temp.data != soughtShow) {
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
