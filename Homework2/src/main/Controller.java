package main;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;
    private int temp;
    private boolean flag;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        view.printLimits(model.getLowLim(),model.getUpperLim());
        view.printMessage(view.ENTER_NUMBER);
        flag = true;
        while (flag) {
            while (!scanner.hasNextInt()) {
                view.printMessage(view.ENTERED_NUMBER_NOT_VALID);
                scanner.next();
            }
            temp = scanner.nextInt();
            if (temp <= model.getUpperLim() && temp >= model.getLowLim()) {
                model.setEnteredNum(temp);
                flag = false;
                model.changeLim();
            }else {
                view.printMessage(view.ENTERED_NUMBER_OUT_OF_RANGE);
            }
        }
        view.showAttempts(model.getAttempts());
    }

}
