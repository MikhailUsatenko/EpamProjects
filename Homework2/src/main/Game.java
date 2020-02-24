package main;

public class Game {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(0,100);
        Controller controller = new Controller(model, view);
        while(model.getUpperLim() != model.getLowLim()){
            controller.process();
        }
    }
}
