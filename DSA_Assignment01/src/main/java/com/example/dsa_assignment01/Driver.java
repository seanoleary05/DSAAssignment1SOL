package com.example.dsa_assignment01;
import java.util.Scanner;
import utils.Utilities;
import models.*;


public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<Object> list = new CustomList<>();


        list.add(new Show("The Lion King", 45, "1st Jan", "3rd Jan", 12.99));

        System.out.println("Welcome to the Theatre Application!");
        boolean running = true;

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add Show");
            System.out.println("2. Add Performance");
            System.out.println("3. Add Customer");
            System.out.println("4. Add Booking");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new Show to the list
                    System.out.print("Enter Show Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter The Shows Runtime: ");
                    int runtime = scanner.nextInt();
                    scanner.nextLine(); // Jumps to nextline
                    System.out.print("Enter The Starting date : ");
                    String startDate = scanner.nextLine();
                    System.out.print("Enter The Ending date : ");
                    String endDate = scanner.nextLine();
                    System.out.println("Enter the Shows Ticket Price");
                    double price = scanner.nextDouble();

                    Show show = new Show(name, runtime, startDate, endDate, price);
                    list.add(show);
                    System.out.println("Show added to the list.");
                    break;


               /* case 5:
                    //Lists All Shows
                    CustomList.listShows(list);

                */

                case 6:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    /*        public static void listShows(CustomList<Object> list ){
                    for (Object obj : list) {
                        Show show = (Show) obj;
                        System.out.println(show);
                    }

                }

     */



            scanner.close();
        }
    }

