package de.hhu.propra16;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.layout.GridPane;
/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtons extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*Parent root = FXMLLoader.load(getClass().getResource("/five_buttons" +
                ".fxml"));*/
	Button alertbutton = new Button();
	alertbutton.setText("Nicht drücken!");
	alerbutton.setonAction(event->{
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("W A R N U N G ! ! !");
		alert.setContentText("Okay doch nicht..");
 		alert.showAndWait();
	});
	GridPane main = new GridPane();
	main.add(alertbutton,2,2);

        primaryStage.setTitle("Five Buttons");
        primaryStage.setScene(new Scene(main, 800, 600));
        primaryStage.show();
    }
}
