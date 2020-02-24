package com.company;

import java.util.Scanner;

public class Controller {

    public static final String word1 = "Hello";
    public static final String word2 = "Java!";

    private Model model;
    private View view;
    private String temp;

    public Controller (Model model, View view)
    {
        this.model = model;
        this.view = view;
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        model.setMessage1(setMessageWithScanner1(scanner));
        model.setMessage2(setMessageWithScanner2(scanner));
        view.printMessage(model.getMessage1(), model.getMessage2());
    }

    public String setMessageWithScanner1(Scanner scanner){
        view.printMessageEntering(view.INPUT_WORD);
        temp = scanner.nextLine();
        while (! temp.equals(word1)) {
            view.printMessageEntering(View.WRONG_INPUT_WORD);
            temp = scanner.nextLine();
        }
        return temp;
    }

    public String setMessageWithScanner2(Scanner scanner){
        view.printMessageEntering(view.INPUT_WORD);
        temp = scanner.nextLine();
        while (! temp.equals(word2)) {
            view.printMessageEntering(View.WRONG_INPUT_WORD);
            temp = scanner.nextLine();
        }
        return temp;
    }
}
