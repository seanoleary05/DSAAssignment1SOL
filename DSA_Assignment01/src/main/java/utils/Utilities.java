package utils;


import java.util.Scanner;

public class Utilities {


    public static String readnextLine(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextLine();

    }

    public static int readnextInt(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextInt();
    }

    public static double readNextDouble(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextDouble();
    }

    public static String readNextLine(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextLine();
    }








}
