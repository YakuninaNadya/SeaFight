import java.awt.*;
import java.util.Scanner;

public class View {
    private final Field field;
    private Controller controller;
    private Scanner sc;

    public View(Field field, Controller controller) {
        this.field = field;
        this.controller = controller;
        sc = new Scanner(System.in);
    }

    public void showField() {
        for (int i = 0; i < field.getSize(); i++) {
            for (int j = 0; j < field.getSize(); j++) {
                if(field.getValue(i,j) == Field.DAMAGED){
                    System.out.print("X ");
                } else if (field.getValue(i,j) == Field.MISSED) {
                    System.out.print("_ ");
                } else{
                    System.out.print(Field.EMPTY + " ");
                }
            }
            System.out.println();
        }

    }

    public void getMove(){
        System.out.println("X value: ");
        int x = sc.nextInt();
        System.out.println("Y value: ");
        int y = sc.nextInt();
        controller.shot(new Point(x,y));


    }
}
