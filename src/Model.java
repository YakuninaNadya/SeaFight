import java.awt.*;

public class Model {
    private Field field;
    public Model(Field field) {
        this.field = field;
    }

    public void shot(Point coords){
        int x = coords.x;
        int y = coords.y;
        if(field.getValue(x,y) == field.EMPTY){
            field.setValue(x,y, Field.MISSED);
        } else{
            field.setValue(x,y,Field.DAMAGED);
        }

    }
    public boolean isGameOver(){
        for( int i = 0; i< field.getSize(); i++){
            for( int j = 0; j< field.getSize(); j++){
                if(field.getValue(i,j) == Field.BOAT){
                    return false;
                }
            }
        }
        return true;
    }
}
