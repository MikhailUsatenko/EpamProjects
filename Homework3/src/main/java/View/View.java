package View;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    public static final String INTERFACE_LANGUAGE = "resources";

    public static final ResourceBundle bundle = ResourceBundle.getBundle(INTERFACE_LANGUAGE,
            new Locale("ua", "UA")
//            new Locale("en", "ENG")
    );

    public void printMessage(String message){
        System.out.println(message);
    }
}
