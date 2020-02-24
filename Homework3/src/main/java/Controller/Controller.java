package Controller;

import Model.Model;
import View.Messages.Messages;
import View.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void process(){
        Scanner scanner = new Scanner(System.in);
        view.printMessage(Messages.ENTER_LOGIN);
    }

//    public String enteringFromScanner(Scanner scanner){
//
//    }


}
