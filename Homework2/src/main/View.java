package main;

import java.util.ArrayList;

public class View {
    public static final String ENTERED_NUMBER_OUT_OF_RANGE = "Entered number is out of range. Try again: ";
    public static final String ENTERED_NUMBER_NOT_VALID = "Entered number is not valid. Try again: ";
    public static final String END_GAME = "Congratulations! You guess the number";
    public static final String ENTER_NUMBER = "Enter a number: ";
    public static final String ENTERED_NUMBER_LESS = "Enter a bigger number";
    public static final String ENTERED_NUMBER_BIGGER = "Enter a less number";

    public static void showAttempts(ArrayList<Integer> attempts){
        System.out.print("Your attempts: ");
        for (int counter : attempts) {
            System.out.print(counter + " ");
        }
        System.out.println();
    }

    public static void printLimits(int lowLim, int upperLim){
        System.out.println("Limits: [" + lowLim + ";" + upperLim + "]" );
    }

    public static void printMessage(String message){
        System.out.println(message);
    }
}
