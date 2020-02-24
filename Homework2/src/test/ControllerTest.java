import main.Model;
import main.View;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ControllerTest {

    static Model model = new Model(0, 100);
    private static final int lowTemp = model.getLowLim();
    private static final int upperTemp = model.getUpperLim();

    @BeforeClass
    public static void setEnteredNum() {
        model.setEnteredNum(20);
    }

    @Test
    public void rightGuessedNumber() {
        assertTrue("Guessed number is out of range", model.getGuessedNum() <= model.getUpperLim() &&
                model.getGuessedNum() >= model.getLowLim());
    }

    @Test
    public void rightEntering() {
        System.out.println(model.getEnteredNum());
        System.out.println(model.getLowLim());
        System.out.println(model.getUpperLim());
        assertTrue(View.ENTERED_NUMBER_OUT_OF_RANGE, model.getEnteredNum() >= model.getLowLim() &&
                model.getEnteredNum() <= model.getUpperLim());
    }

    @Test
    public void changeLimit() {
        if (model.getEnteredNum() < model.getGuessedNum()) {
            model.setLowLim(model.getEnteredNum() + 1);
        } else {
            if (model.getEnteredNum() > model.getGuessedNum()) {
                model.setUpperLim(model.getEnteredNum() - 1);
            } else {
                model.setLowLim(model.getEnteredNum());
                model.setUpperLim(model.getEnteredNum());
            }
        }
        assertTrue(model.getLowLim() > lowTemp || model.getUpperLim() < upperTemp);
    }
}



