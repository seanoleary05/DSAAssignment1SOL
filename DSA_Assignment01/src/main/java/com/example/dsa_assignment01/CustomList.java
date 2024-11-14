package com.example.dsa_assignment01;

import iterators.CustomIterator;
import iterators.CustomNode;
import models.Show;


import java.util.Iterator;


public class CustomList<K> implements Iterable<K> {


    private CustomNode<K> head=null;
    private int length = 0;

    public CustomList() {
        this.head = null;
    }


    public void add(K data) { //Add element to head of the show list
        CustomNode<K> sn = new CustomNode<>(data);
        sn.next = head;
        head = sn;
    }

    public boolean remove(K data) {
        if (head == null) {
            return false; // List is empty, nothing to remove
        }

        // If the head node is the one to be removed
        if (head.getData().equals(data)) {
            head = head.next; // Remove head node by moving to the next node
            return true;
        }

        // Traverse the list to find the node to remove
        CustomNode<K> current = head;
        while (current.next != null && !current.next.getData().equals(data)) {
            current = current.next;
        }

        // If the next node contains the data, remove it by skipping over it
        if (current.next != null) {
            current.next = current.next.next;
            return true; // Successfully removed
        }

        return false; // Data not found in the list
    }


/*
    public String listShows(CustomList<K> list) {
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
        length = 0;
    }

    public int length(){
        return length;
    }


    public boolean empty(){
        if(head==null){
            return true;
        }
         return false;
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

    public String toString()
    {

        String S = " ";

        CustomNode<K> X = head;

        if (X == null)
            return S + " ";

        while (X.next != null) {
            S += (X.getData()) + "\n";
            X = X.next;
        }

        S += String.valueOf(X.getData());
        return S;
    }


    @Override
    public Iterator<K> iterator() {
        return new CustomIterator<>(head); // passes the head to the iterator
    }
}
