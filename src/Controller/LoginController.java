package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LoginController {
	@FXML
    private Pane loginpane1;

    @FXML
    private Label loginwelcome;

    @FXML
    private Button AboutUsbtn;

    @FXML
    private Line line23;

    @FXML
    private Line line22;

    @FXML
    private Pane loginpane2;

    @FXML
    private Line line2;

    @FXML
    private Line line21;

    @FXML
    private TextField inputNIC;

    @FXML
    private TextField inputPass;

    @FXML
    private Label ForgotPass;

    @FXML
    private Button loginbtn;
    
    @FXML
    public void AboutUsAction(ActionEvent event) throws IOException  {
    	
    	AboutUsbtn.getScene().getWindow().hide();
    	Stage aboutUs = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AboutUs.fxml"));
			Scene scene = new Scene(root);
			aboutUs.setResizable(false);
			aboutUs.setScene(scene);
			aboutUs.show();
    }
}
