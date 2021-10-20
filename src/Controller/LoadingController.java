package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class LoadingController implements Initializable{
	
	

	@FXML
    private ProgressBar progressbar;
	
	@FXML
    private Label LoadingLable;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		Task<Void> task = new Task<Void>() {
			
			@Override
			protected Void call() throws Exception{
				
				for(int i=0;i<=100;i++) {
					updateProgress(i, 100);
					Thread.sleep(50);
					if(i<99) {
						LoadingLable.setText("launching Application...");	
					}
				}
				
				return null;
			}
			
		};
		
		progressbar.progressProperty().unbind();
		progressbar.progressProperty().bind(task.progressProperty());
		
		Thread th = new Thread(task);
		th.setDaemon(true);		
		th.start();
		
		
	}
	
}
