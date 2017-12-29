import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A15dot5 extends Application{
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tFutureValue = new TextField();
	
	public static void main(String[] args) {
		Application.launch(args);

	}
	public void start(Stage primaryStage){
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(5);
		gp.setVgap(5);
		Scene scene = new Scene(gp, 350, 200);
		primaryStage.setTitle("Investment Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		gp.add(new Label("Investment Amount") , 0, 0);
		gp.add(new Label(tfInvestmentAmount, 1, 0);
		
		gp.add(new Label("Number Of Years") , 0, 0);
		gp.add(new Label(tfNumberOfYears, 1, 0);
		
		gp.add(new Label("Annual Interest Rate") , 0, 0);
		gp.add(new Label(tfAnnualInterestRate, 1, 0);
		
		gp.add(new Label("Future Value") , 0, 0);
		gp.add(new Label(tfFutureValue, 1, 0);
		
		Button bCalc = new Button("Calculate");
		bCalc.setMinWidth(165);
		bCalc.setOnAction(e-> calculateValue())
		gp.add(bCalc, 0, 4);
		
		Button bReset = new Button("Reset");
		bReset.setMinWidth(165);
		bReset.setOnAction(e-> resetform())
		gp.add(bReset, 1, 4);
		
		gp.getStyleClass().add("grid-pane")
		scene.getStylesheets().add("InvestmentCalculatot.css")
}
	private void calculateValue(){
		try{
			double amount = Double.parseDouble(tfInvestmentAmount.getText());
			double years = Double.parseDouble(tfNumberOf Years.getText());
			double rate = Double.parseDouble(tfAnnualInterestRate.getText());
			rate/1200.0;
			double futureValue = amount * Math.pow(1.0 +rate,  years * 12.0)
					tfFutureValue.setText(String.format("%.2f")futureValue);
		}
		catch(Exception e){
			tfFutureValue.setText("Invalid Input");
		}
	}
	
	private void resetForm(){
		tfInvestmentAmount.clear();
		tfNumberOfYears.clear();
		tfAnnualInterestRate.clear();
		tfFutureValue.clear();
	}



