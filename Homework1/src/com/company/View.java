package com.company;

public class View {
    public static final String INPUT_WORD = "Enter a word: ";
    public static final String WRONG_INPUT_WORD = "Wrong input. Enter a correct word: ";

    public void printMessage(String message1, String message2)
    {
        System.out.println(message1 + " " + message2);
    }

    public void printMessageEntering(String message)
    {
        System.out.println(message);
    }
}
