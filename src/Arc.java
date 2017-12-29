import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Arc extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Draw Something");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Arc arc1 = new Arc(150, 100, 80, 80, 30, 75);
		arc1.setFill(Color.RED);
		arc1.setType(ArcType.ROUND);
		pane.getChildren().add(new Text(210, 40, "arc1: round"));
		pane.getChildren().add(arc1);
	}

}




}

}
