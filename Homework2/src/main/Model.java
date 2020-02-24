package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {

    private ArrayList<Integer> attempts = new ArrayList();
    static Random random = new Random();
    private int lowLim;
    private int upperLim;
    private int enteredNum;
    public static final int guessedNum = random.nextInt(101);

    public Model(int lowLim, int upperLim){
        this.lowLim = lowLim;
        this.upperLim = upperLim;
    }

    public ArrayList<Integer> getAttempts() {
        return attempts;
    }

    public int getUpperLim() {
        return upperLim;
    }

    public void setUpperLim(int upperLim) {
        this.upperLim = upperLim;
    }

    public int getLowLim() {
        return lowLim;
    }

    public void setLowLim(int lowLim) {
        this.lowLim = lowLim;
    }

    public int getEnteredNum() {
        return enteredNum;
    }

    public void setEnteredNum(int enteredNum) {
        this.enteredNum = enteredNum;
    }

    public int getGuessedNum() {
        return guessedNum;
    }
    public void changeLim() {
        addAttempts(getEnteredNum());
        if (getEnteredNum() < getGuessedNum()) {
            setLowLim(getEnteredNum() + 1);
            View.printMessage(View.ENTERED_NUMBER_LESS);
        } else {
            if (getEnteredNum() > getGuessedNum()) {
                setUpperLim(getEnteredNum() - 1);
                View.printMessage(View.ENTERED_NUMBER_BIGGER);
            } else {
                setLowLim(getEnteredNum());
                setUpperLim(getEnteredNum());
            }
        }
    }

    public void addAttempts(int enteredNum){
        attempts.add(enteredNum);
    }

}

