package com.example.dsa_assignment01;
import java.util.Scanner;
import utils.Utilities;
import models.*;


public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<Object> list = new CustomList<>();


        list.add(new Show<>("The Lion King", 45, "1st Jan", "3rd Jan", 12.99));
        list.add(new Show<>("The Lion King 2", 60, "5th Jan", "7th Jan", 9.99));
        System.out.println("Welcome to the Theatre Application!");
        boolean running = true;

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add Show");
            System.out.println("2. Add Performance");
            System.out.println("3. Add Customer");
            System.out.println("4. Add Booking");
            System.out.println("5. List All");
            System.out.println("6. Empty the list");

            System.out.println("8. Exit Application");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new Show to the list
                    System.out.print("Enter Show Name: ");
                    String name = scanner.nextLine();
                    String showName = name;
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

                    System.out.println("Show added to the head of the list.");
                    break;

              case 2:
              // Add a new performance to the list
                  System.out.println("Enter the Performance Date: ");
                  String date = scanner.nextLine();
                  String performanceDate = date;
                  System.out.println("Enter the Performance Time *Evening Or Matinee: ");
                  char performanceTime = scanner.next().charAt(0);
                  boolean[][] balconySeats = new boolean[3][8];
                  boolean[][] circleSeats = new boolean[3][10];
                  boolean[][] stallsSeats = new boolean[4][10];

                  Performance performance = new Performance(date,performanceTime,balconySeats,circleSeats,stallsSeats);
                  list.add(performance);

                  System.out.println("Performance added to the list.");
                  break;











                case 5:
                    //Lists All Objects
                    System.out.println("The list of all Items are:");
                    if(list.empty()){
                        System.out.println("The List is empty");
                        System.out.println("Press Enter to Continue");
                        scanner.nextLine();

                    }
                    System.out.println("*************************************");
                    System.out.println(list);
                    System.out.println("*************************************");
                    System.out.println("Press Enter To Continue");
                    scanner.nextLine();
                    break;






                case 6:
                    // Clears the list of all Nodes
                    list.clear();
                    System.out.println("The List Has been deleted");
                    scanner.nextLine();
                    break;


                case 8:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }



            scanner.close();
        }
    }

