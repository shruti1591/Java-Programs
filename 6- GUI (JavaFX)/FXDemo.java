/*Write Java program to draw various shapes on
Canvas using JavaFX*/



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class FXDemo extends Application{
	public static void main(String[] args) {
		launch(args);
	}	
	
	public void start(Stage primaryStage) throws Exception {
		
		Group root=new Group();
		Scene scene=new Scene(root);
		Canvas canvas =new Canvas(400,300);		
		GraphicsContext gc=canvas.getGraphicsContext2D();
		gc.setFill(Color.YELLOW);
		gc.fillOval(50, 50, 200, 200); //face
		gc.setFill(Color.rgb(0, 0, 255));//left eye
		gc.fillOval(100, 100, 20, 10);
		gc.setFill(Color.rgb(0, 0, 255));//eye eye
		gc.fillOval(175, 100, 20, 10);
		root.getChildren().add(canvas);
		gc.strokeArc(100, 200, 45, 4, 180, 180, ArcType.OPEN);
		primaryStage.setTitle("happy Day");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
}
