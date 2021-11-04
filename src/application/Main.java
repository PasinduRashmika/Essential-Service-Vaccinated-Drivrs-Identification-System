package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
			//Parent root= FXMLLoader.load(getClass().getResource("/FXML_Files/Loading.fxml"));
			//Parent root= FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
			//Parent root= FXMLLoader.load(getClass().getResource("/FXML_Files/AboutUs.fxml"));
			Parent root= FXMLLoader.load(getClass().getResource("/FXML_Files/AdminDashboard.fxml"));
			Scene scene = new Scene(root,1140,640);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Essential Service & Vaccinated Drivers Identifiaction System");
			primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/ProLogoN.png")));
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
