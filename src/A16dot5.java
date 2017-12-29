import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;




//create textFields and buttons
public class A16dot5 extends Application{
	private TextField tfDecimal = new TextField();
	private TextField tfHex = new TextField();
	private TextField tfBinary = new TextField();

	public static void main (String[] args){
		Application.launch(args);
	}



	public void start(Stage primaryStage){
		HBox pane = new HBox();
		//Set UI
		GridPane gridPane = new GridPane();



		//Create Labels and insert textFields and buttons
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Decimal"), 0, 0);
		gridPane.add(tfDecimal, 1, 0);
		gridPane.add(new Label("Hex"), 0, 1);
		gridPane.add(tfHex, 1, 1);
		gridPane.add(new Label("Binary"), 0, 2);
		gridPane.add(tfBinary, 1, 2);
		
		//Set properties for UI
		pane.setAlignment(Pos.CENTER);
		tfDecimal.setAlignment(Pos.BOTTOM_LEFT);
		tfHex.setAlignment(Pos.BOTTOM_LEFT);
		tfBinary.setAlignment(Pos.BOTTOM_LEFT);
		

		//Process Events
		tfDecimal.setOnAction(e -> convertDec());
		tfHex.setOnAction(e -> convertHex());
		tfBinary.setOnAction(e -> convertBin());

		//Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 600, 100);
		primaryStage.setTitle("Exercise16_5");//Set Title
		primaryStage.setScene(scene);//Set Scene in Stage
		primaryStage.show();//Display the Stage


	}
	private void convertDec() {
		int n1= Integer.parseInt(tfDecimal.getText());
		tfHex.setText(Integer.toHexString(n1));
		tfBinary.setText(Integer.toBinaryString(n1));
		
	}

	private void convertHex() {
		int n1= Integer.parseInt(tfHex.getText(),16);
		tfDecimal.setText(Integer.toString(n1));
		tfBinary.setText(Integer.toBinaryString(n1));
	}

	private void convertBin() {
		int n1= Integer.parseInt(tfBinary.getText(),2);
		tfDecimal.setText(Integer.toString(n1));
		tfHex.setText(Integer.toHexString(n1));
	}

	


}



