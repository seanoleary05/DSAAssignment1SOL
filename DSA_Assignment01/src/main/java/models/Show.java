package models;

import com.example.dsa_assignment01.CustomList;
import com.example.dsa_assignment01.Driver;
import iterators.CustomNode;
import org.w3c.dom.Node;

import java.io.*;
import java.util.Scanner;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class Show<K> {
    private String showTitle = "";
    private int showRunTime; // in minutes
    private String showStartDate = "";
    private String showEndDate = "";
    private double showTicketPrice;
    private Show link;
    private CustomList<Performance> performances;



    public Show(String showTitle,int showRunTime, String showStartDate, String showEndDate, double showTicketPrice) {
        this.showTitle = showTitle;
        setShowRunTime(showRunTime);
        this.showStartDate = showStartDate;
        this.showEndDate = showEndDate;
        this.showTicketPrice = showTicketPrice;
        this.performances = new CustomList<Performance>();




    }



    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        if ((showTitle.length() > 4) && (showTitle.length() < 40))
        this.showTitle = showTitle;
    }

    public int getShowRunTime()
    {
        return showRunTime;
    }

    public void setShowRunTime(int showRunTime)
    {
        if ((showRunTime > 30) && (showRunTime < 200))
            this.showRunTime = showRunTime;
    }



    public  String getShowStartDate() {
        return showStartDate;
    }

    public void setShowStartDate(String showStartDate) {
        this.showStartDate = showStartDate;
    }

    public String getShowEndDate() {
        return showEndDate;
    }

    public void setShowEndDate(String showEndDate) {
        this.showEndDate = showEndDate;
    }

    public double getShowTicketPrice() {
        return showTicketPrice;
    }

    public void setShowTicketPrice(double showTicketPrice) {
        this.showTicketPrice = showTicketPrice;
    }

    public CustomList<Performance>getPerformances() {
        return performances;
    }

    public void addPerformance(Performance performance) {
        performances.add(performance);
    }

    public void removePerformance(Performance performance) {
        performances.remove(performance);
    }







    public static void saveList(String filename, CustomNode<Object> head) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(head);
        }
    }

    public static CustomNode<Object> loadList(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (CustomNode<Object>) ois.readObject();
        }
    }



    @Override
    public String toString() {
        return "Show" +
                "Title: " + showTitle + '\'' +
                ", Run-Time: " + showRunTime +
                ", Start Date: " + showStartDate + '\'' +
                ", End Date: " + showEndDate + '\'' +
                ", Price: " + showTicketPrice
                ;
    }
}
