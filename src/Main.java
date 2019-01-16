public class Main {
    public static void main(String[] args) {
        Field field1 = new Field("firstField.txt");
        Model model1 = new Model(field1);
        Controller controller1 = new Controller(model1);
        View view1 = new View(field1, controller1);


        Field field2 = new Field("secondField.txt");
        Model model2 = new Model(field2);
        Controller controller2 = new Controller(model2);
        View view2 = new View(field2, controller2);


        View currentView = view2;
        boolean turn = true;

        while (!controller1.isGameOver() && !controller2.isGameOver()){
            if(turn){
                System.out.println("First player turn: ");
            } else {
                System.out.println("Second player turn: ");
            }
            currentView.showField();
            currentView.getMove();

            if(!turn){
                currentView = view2;
            } else {
                currentView = view1;
            }
            turn = !turn;
        }
        if (controller1.isGameOver()){
            System.out.println("Second player wins");
        } else {
            System.out.println("First player wins");
        }

    }
}
