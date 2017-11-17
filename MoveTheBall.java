import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.Event;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.ColumnConstraints;
public class MoveTheBall extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.getColumnConstraints().addAll(new ColumnConstraints(100,100,Double.MAX_VALUE),
                new ColumnConstraints(100,100,Double.MAX_VALUE),
                new ColumnConstraints(100,100,Double.MAX_VALUE),
                new ColumnConstraints(100,100,Double.MAX_VALUE),
                new ColumnConstraints(100,100,Double.MAX_VALUE),
                new ColumnConstraints(100,100,Double.MAX_VALUE),
                new ColumnConstraints(100,100,Double.MAX_VALUE));
        grid.getRowConstraints().addAll(new RowConstraints(100,100,Double.MAX_VALUE),
                new RowConstraints(100,100,Double.MAX_VALUE),
                new RowConstraints(100,100,Double.MAX_VALUE),
                new RowConstraints(100,100,Double.MAX_VALUE),
                new RowConstraints(100,100,Double.MAX_VALUE),
                new RowConstraints(100,100,Double.MAX_VALUE),
                new RowConstraints(100,100,Double.MAX_VALUE));
        Image ball = new Image("File:src/ball.png");
        ImageView ballInGrid = new ImageView(ball);
        grid.add(ballInGrid, 0, 0);
        grid.setGridLinesVisible(true);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(2);
        grid.setVgap(2);
        GridPaneBall ballObj = new GridPaneBall(ballInGrid, grid);
        Button up = new Button("  Up  ");
        up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ballObj.goUp();
            }
        });
        Button down = new Button("Down");
        down.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ballObj.goDown();
            }
        });
        Button left = new Button("Left");
        left.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ballObj.goLeft();
            }
        });
        Button right = new Button("Right");
        right.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ballObj.goRight();
            }
        });
        grid.add(up, 3, 0);
        grid.add(left, 0, 3);
        grid.add(right, 6, 3);
        grid.add(down, 3, 6);
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.print(grid.getRowConstraints());
    }

}
