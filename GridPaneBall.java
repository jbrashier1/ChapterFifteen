import java.lang.reflect.Method;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;

public class GridPaneBall {

    private ImageView object;
    private GridPane environment;

    public GridPaneBall(ImageView imageViewObject, GridPane gridPane) {
        this.object = imageViewObject;
        this.environment = gridPane;
    }

    public void goUp() {
        if(this.environment.getRowIndex(this.object) > 0) {
            this.environment.setRowIndex(this.object, (this.environment.getRowIndex(this.object)) - 1);
        }
    }
   public void goDown() {
        if(this.environment.getRowIndex(this.object) < 6) {
            this.environment.setRowIndex(this.object, (this.environment.getRowIndex(this.object)) + 1);
        }
    }
    public void goLeft() {
        if(this.environment.getColumnIndex(this.object) > 0) {
            this.environment.setColumnIndex(this.object, (this.environment.getColumnIndex(this.object)) - 1);
        }
    }
    public void goRight() {
        if(this.environment.getColumnIndex(this.object) < 6) {
            this.environment.setColumnIndex(this.object, (this.environment.getColumnIndex(this.object)) + 1);
        }
    }
}
