package gui;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

/**
 * Main method class for javafx
 * @author valdar
 *
 */
public class Main extends Application {
	
	static  String[] params;
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			System.out.println(params[0]);
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainGui.fxml"));
			System.out.println(params[0]);
			AnchorPane root = (AnchorPane)loader.load();
			System.out.println(params[0]);
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			
			MainController mc =(MainController) loader.getController();
			
			mc.setStage(primaryStage);
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		params = args;
		
		launch(args);
	}
}
