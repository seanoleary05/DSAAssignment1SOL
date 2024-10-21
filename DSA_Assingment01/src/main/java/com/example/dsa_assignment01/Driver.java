package com.example.dsa_assignment01;

import com.example.dsa_assignment01.*;
import models.Show;
import models.CustomList;
import utils.Utilities;

public class  Driver {
    private CustomList<K> s;


    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        runMenu();
    }

    private int mainMenu() {
        return Utilities.readnextInt("stock");
    }


        private void runMenu () {
            int option = mainMenu();

            while (option != 0) {

                switch (option) {
                    case 1 -> addShow();

                    default -> System.out.println("Invalid option entered: " + option);
                }


                Utilities.readNextLine("\nPress enter key to continue...");


                option = mainMenu();
            }
            System.out.println("Exiting....bye");
            System.exit(0);
        }

        private void addShow () {
            String showName = Utilities.readNextLine("Show Name: ");
            int showTime = Utilities.readnextInt("Show Time: ");
            String showStartTime = Utilities.readNextLine("Show Start Time: ");
            String showEndTime = Utilities.readNextLine("Show End Time: ");
            double showPrice = Utilities.readNextDouble("Show Price: ");

            boolean isAdded = s.addShow(new Show<K>(showName, showTime, showStartTime, showEndTime, showPrice));
            if (isAdded) {
                System.out.println("Added Show: " + showName);
            } else {
                System.out.println("Show Not Added " + showName);
            }
        }
    }



