package Controller;

import java.io.IOException;

<<<<<<< HEAD
=======
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
>>>>>>> 1f52f2dcbdd72b31b4b153e616bac4699a46e2eb
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
<<<<<<< HEAD
=======
import javafx.scene.control.ChoiceBox;
>>>>>>> 1f52f2dcbdd72b31b4b153e616bac4699a46e2eb
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class AdminAddUserController {
	
<<<<<<< HEAD
=======
	
	ObservableList<String> designation = FXCollections.observableArrayList("Traffic", "Non-Traffic");
>>>>>>> 1f52f2dcbdd72b31b4b153e616bac4699a46e2eb

    @FXML
    private Label Admin;

    @FXML
    private Label Admin1;

    @FXML
    private Line AdminDashLine1;

    @FXML
    private Line AdminDashLine2;

    @FXML
    private Line AdminDashLine3;

    @FXML
    private Line AdminDashLine4;

    @FXML
    private Pane AdminDashPane1;

    @FXML
    private Pane AdminDashPane2;

    @FXML
    private Button AdminDashbtn1;

    @FXML
    private Button AdminDashbtn2;

    @FXML
    private Button AdminDashbtn3;

    @FXML
    private Button AdminDashbtn4;

    @FXML
    private Button AdminDashbtn5;

    @FXML
    private Button Backbtn;

    @FXML
    private TextField DestinationTxt;

    @FXML
    private Button LogOutbtn;

    @FXML
    private TextField StationTxt;

    @FXML
    private Button SubmitUserbtn;

    @FXML
    private TextField UserNameTxt;

    @FXML
    private TextField UserNicTxt;
<<<<<<< HEAD
=======
    
    @FXML
    private ChoiceBox<String> ChoiceBoxSelect;
    
    @FXML
    private void initialize(){
    	ChoiceBoxSelect.setItems(designation);
    }
>>>>>>> 1f52f2dcbdd72b31b4b153e616bac4699a46e2eb

    @FXML
    public void AdminDashAction1(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn1.getScene().getWindow().hide();
    	Stage addUser = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminAdduser.fxml"));
			Scene scene = new Scene(root);
			addUser.setResizable(false);
			addUser.setScene(scene);
			addUser.show();
    }
 
    @FXML
    public void AdminDashAction2(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn2.getScene().getWindow().hide();
    	Stage deleteUser = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminDeleteUser.fxml"));
			Scene scene = new Scene(root);
			deleteUser.setResizable(false);
			deleteUser.setScene(scene);
			deleteUser.show();
    }

    @FXML
    public void AdminDashAction3(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn3.getScene().getWindow().hide();
    	Stage addVehicle = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminAddVehicleDetails.fxml"));
			Scene scene = new Scene(root);
			addVehicle.setResizable(false);
			addVehicle.setScene(scene);
			addVehicle.show();
    }
    
    @FXML
    public void AdminDashAction4(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn4.getScene().getWindow().hide();
    	Stage deleteVehicle = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminDeleteVehicleDetails.fxml"));
			Scene scene = new Scene(root);
			deleteVehicle.setResizable(false);
			deleteVehicle.setScene(scene);
			deleteVehicle.show();
    }

    @FXML
    public void AdminDashAction5(ActionEvent event) throws IOException  {
    	
    	AdminDashbtn5.getScene().getWindow().hide();
    	Stage addVaccination = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminVaccinatedDetails.fxml"));
			Scene scene = new Scene(root);
			addVaccination.setResizable(false);
			addVaccination.setScene(scene);
			addVaccination.show();
    }    
    @FXML
    public void BackbtnAction(ActionEvent event) throws IOException  {
    	
    	Backbtn.getScene().getWindow().hide();
    	Stage dashBoard = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminDashboard.fxml"));
			Scene scene = new Scene(root);
			dashBoard.setResizable(false);
			dashBoard.setScene(scene);
			dashBoard.show();
    }

    @FXML
    public void LogOutbtnAction(ActionEvent event) throws IOException  {
    	
    	LogOutbtn.getScene().getWindow().hide();
    	Stage logOut = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
			Scene scene = new Scene(root);
			logOut.setResizable(false);
			logOut.setScene(scene);
			logOut.show();
    }
}
