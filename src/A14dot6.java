import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class A14dot6 extends Application {


	public static void main(String[] args) {
		Application.launch(args);
	}
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Draw Something");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Arc arc1 = new Arc(150, 100, 80, 80, 0, 75);
		arc1.setFill(Color.RED);
		arc1.setType(ArcType.ROUND);
		arc1.setStroke(Color.BLACK);
		pane.getChildren().add(new Text(210, 40, "Project: 20%"));
		pane.getChildren().add(arc1);
		
		Arc arc2 = new Arc(150, 100, 80, 80, 75, 36);
		arc2.setFill(Color.BLUE);
		arc2.setType(ArcType.ROUND);
		arc2.setStroke(Color.BLACK);
		pane.getChildren().add(new Text(130, 10, "Quizes: 10%"));
		pane.getChildren().add(arc2);
		
		Arc arc3 = new Arc(150, 100, 80, 80, 111, 108);
		arc3.setFill(Color.GREEN);
		arc3.setType(ArcType.ROUND);
		arc3.setStroke(Color.BLACK);
		pane.getChildren().add(new Text(20, 170, "Midterm Exams: 30%"));
		pane.getChildren().add(arc3);
		
		Arc arc4 = new Arc(150, 100, 80, 80, 219, 144);
		arc4.setFill(Color.YELLOW);
		arc4.setType(ArcType.ROUND);
		arc4.setStroke(Color.BLACK);
		pane.getChildren().add(new Text(210, 170, "Final Exam: 40%"));
		pane.getChildren().add(arc4);
		
		
	}


}



