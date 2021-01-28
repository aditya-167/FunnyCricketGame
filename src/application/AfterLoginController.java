package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AfterLoginController {
	
	@FXML
	private Button playagain_ind;

	@FXML
	private Button playagain_aus;
	public void goBack(ActionEvent event) throws IOException{
		Main m = new Main();
		m.changeScene("view/Sample.fxml");
	}

}
