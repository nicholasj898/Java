package application;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.*;



public class Main extends Application {
	
	StackPane stack = new StackPane();
	Label label ;
	HBox hbox;
	
	public String outcome(int play) {
		String [] options = {"Rock", "Paper", "Scissors"};
		Random rand = new Random();
		int ai = rand.nextInt(3);
		
		StringBuilder str = new StringBuilder();
		str.append("Computer Picks " + options[ai] + "\n");
		if (ai == play)
			str.append("We both picked the same");
		else if ((ai == 0 && play == 2)
		|| (ai == 1 && play == 0)
		|| (ai == 2 && play ==1))
			str.append( "Computer wins - " + options[ai] + " beats " + options[play]);
		else
			str.append("You win - " + options[play] + " beats " + options[ai]);
		return str.toString();
		}
	
@Override
public void start(Stage primaryStage) {
	try {
		primaryStage.setTitle("Rock/Paper/Scissors");
		
		hbox = new HBox();
		label = new Label();
		
		Button rockBtn = new Button();
		rockBtn.setText("Rock");
		rockBtn.setOnAction((event) -> {
			label.setText(outcome(0));
		});
		Button paperBtn = new Button();
		paperBtn.setText("Paper");
		paperBtn.setOnAction((event) -> {
			label.setText(outcome(1));
		});
		Button scissorBtn = new Button();
		scissorBtn.setText("Scissor");
		scissorBtn.setOnAction((event) -> {
			label.setText(outcome(2));
		});
		
		hbox.getChildren().addAll(rockBtn, paperBtn, scissorBtn);
		hbox.setAlignment(Pos.TOP_CENTER);
		hbox.setPadding(new Insets(15, 10, 15, 10));
		hbox.setSpacing(5);
		stack.getChildren().addAll(hbox, label);
		
		BorderPane root = new BorderPane();
		root.setCenter(stack);
		
		Scene scene = new Scene(root, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
}

public static void main(String[] args) {
	launch(args);
	}
}

	