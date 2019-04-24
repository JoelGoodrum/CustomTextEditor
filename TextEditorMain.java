/**
	This program is to be a simple text editor 
	it should have numbered lines
	grow number of lines as needed
	save files as .java
	open files as .java
	if possible have own compiler
*/



import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.stage.Stage;  
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text; 
import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class TextEditorMain extends Application {


    //start app
    @Override
	public void start(Stage primaryStage) throws Exception{

		String textStyle_css = "-fx-font-family:Consolas; "+
							   "-fx-font-weight:700;"+
							   "-fx-control-inner-background: #282923;"+
							   "-fx-highlight-fill: lightgray; "+
							   "-fx-highlight-text-fill: firebrick;"+ 
							   "-fx-font-size: 16px;";

		//show GUI
		primaryStage.setTitle("MyTextEditor");
		
		//obejcts

		//Menu
		MenuBar menuBar = new MenuBar();
		Menu file = new Menu("File");
		Menu options = new Menu("Options");
		menuBar.getMenus().addAll(file, options);


		//text
		TextArea text = new TextArea();
		text.setPrefHeight(600);
		text.setPrefWidth(500);
		text.setStyle(textStyle_css);

		//layout
		VBox layout = new VBox(menuBar,text);

		//Scene
		Scene scene = new Scene(layout,600,500);

		primaryStage.setScene(scene);
		primaryStage.show();

		
	}

	
	//launch app
	public static void main(String[] args) {
        Application.launch(args);
    }

}

