package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInController {
	
	public LogInController() {
		
	}
	@FXML
	private Button button;

	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private Label info_area;

	private double ind_score;
	private double aus_score;
	
	private String checkScore() {
		this.aus_score = Math.random();
		this.ind_score = Math.random();
		if(aus_score>=ind_score)
		{
			
			return "AUS";
		}
		else {

			return "IND"; 
		
		}
	}
	public void loggedIn(ActionEvent event) throws IOException{
		checkLogin();
	}
	
	private void checkLogin() throws IOException{
		
		Main m = new Main();
		
		if(username.getText().toString().equals("Cricket") && password.getText().toString().equals("madarchod")) {
			
			info_area.setText("Login Successful");
			
			if(this.checkScore() == "AUS")
				m.changeScene("view/aus_won.fxml");
			else if (this.checkScore() == "IND")
				m.changeScene("view/ind_won.fxml");
		}
		else if (username.getText().isEmpty() && password.getText().isBlank()) {
			info_area.setText("please enter your credentials");
		}
		else {
			info_area.setText("madarchod galat hai");
		}
	}
}
