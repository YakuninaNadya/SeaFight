import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Field {
    public static final int EMPTY = 0;
    public static final int BOAT = 1;
    public static final int DAMAGED = 2;
    public static final int MISSED = 3;

    private int [][] field;


    public Field(String filename){
        readField(filename);
    }
    public void setValue(int x, int y, int value){
        field[x][y] = value;
    }
    public int getValue(int x, int y){
        return field[x][y];
    }
    public int getSize() {
        return field.length;
    }
    private void readField(String filename){

        try {
            Scanner sc = new Scanner(new File(filename));
            int n = sc.nextInt();
            int m = sc.nextInt();
            field = new int[n][m];
            for(int i = 0; i<n; i++){
                for (int j = 0; j<m; j++){
                    field[i][j] = sc.nextInt();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
