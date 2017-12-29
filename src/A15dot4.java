import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;




//create textFields and buttons
public class A15dot4 extends Application{
	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
	private TextField tfResult = new TextField();

	public static void main (String[] args){
		Application.launch(args);
	}



	public void start(Stage primaryStage){
		HBox pane = new HBox();
		//Set UI
		GridPane gridPane = new GridPane();

		Button btAdd = new Button("Add");
		Button btSubtract = new Button("Subtract");
		Button btMultiply = new Button("Multiply");
		Button btDivide = new Button("Divide");


		//Create Labels and insert textFields and buttons
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Number 1:"), 0, 0);
		gridPane.add(tfNumber1, 1, 0);
		gridPane.add(new Label("Number 2:"), 2, 0);
		gridPane.add(tfNumber2, 3, 0);
		gridPane.add(new Label("Result:"), 4, 0);
		gridPane.add(tfResult, 5, 0);
		gridPane.add(btAdd, 0, 1);
		gridPane.add(btSubtract, 1, 1);
		gridPane.add(btMultiply, 2, 1);
		gridPane.add(btDivide, 3, 1);

		//Set properties for UI
		pane.setAlignment(Pos.CENTER);
		tfNumber1.setAlignment(Pos.BOTTOM_LEFT);
		tfNumber2.setAlignment(Pos.BOTTOM_LEFT);
		tfResult.setAlignment(Pos.BOTTOM_LEFT);
		tfResult.setEditable(false);

		//Process Events
		btAdd.setOnAction(e -> addNumbers());
		btSubtract.setOnAction(e -> subtractNumbers());
		btMultiply.setOnAction(e -> multiplyNumbers());
		btDivide.setOnAction(e -> divideNumbers());

		//Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 450, 50);
		primaryStage.setTitle("Exercise15_4");//Set Title
		primaryStage.setScene(scene);//Set Scene in Stage
		primaryStage.show();//Display the Stage


	}
	private void addNumbers() {
		double n1=
				Double.parseDouble(tfNumber1.getText());
		double n2=
				Double.parseDouble(tfNumber2.getText());
		double add = 
				n1 + n2;
		tfResult.setText(String.format("%.1f", add));
	}

	private void subtractNumbers() {
		double n1=
				Double.parseDouble(tfNumber1.getText());
		double n2=
				Double.parseDouble(tfNumber2.getText());
		double sub=
				n1 - n2;
		tfResult.setText(String.format("%.1f", sub));
	}

	private void multiplyNumbers() {
		double n1=
				Double.parseDouble(tfNumber1.getText());
		double n2=
				Double.parseDouble(tfNumber2.getText());
		double multiply=
				n1 * n2;
		tfResult.setText(String.format("%.1f", multiply));
	}

	private void divideNumbers() {
		double n1=
				Double.parseDouble(tfNumber1.getText());
		double n2=
				Double.parseDouble(tfNumber2.getText());
		double div=
				n1 / n2;
		tfResult.setText(String.format("%.1f", div));
	}


}

