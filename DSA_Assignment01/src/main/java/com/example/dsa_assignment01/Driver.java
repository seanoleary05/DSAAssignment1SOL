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
            System.out.println("5. List Shows");
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

               /* case 2:
                    //Adds a performance to an existing show
                    System.out.println("Enter The Show name you want to add a Performance to");
                    String findShowName = scanner.nextLine();
                    Show selectedShow = CustomList.getShowByName(findShowName);


                    if(selectedShow != null){
                        System.out.println("Enter the performance date");
                        String date = scanner.nextLine();
                        System.out.println("Enter the time of the performance *77 for matinee, 69 for evening*");
                        char time = scanner.next().charAt(0);
                        BalconySeats[]
                    }

                */




                case 5:
                    //Lists All Shows
                    System.out.println("The list of all Shows are:");
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

