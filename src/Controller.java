import java.awt.*;

public class Controller {
    private Model model;
    public Controller(Model model){
        this.model = model;
    }
    public void shot(Point value){
        model.shot(value);
    }
    public boolean isGameOver(){
        return model.isGameOver();
    }
}
