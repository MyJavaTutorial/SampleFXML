/*
 * Controller of Main GUI Frame.
 */
package control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Sandro
 */
public class MainController implements Initializable {

    int count = 0;
    
    @FXML private Label lblMessage;
    
    @FXML private Button btnExec;
    
    @FXML
    private void handleBtnExecAction(ActionEvent event) {
        count++;
        System.out.println("You clicked " + btnExec.getText() + " " + count + " times!");
        lblMessage.setText("Hello World " + count + "!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBtnExitAction(ActionEvent event) {
        System.out.println("Exit application: bye bye.");
        Platform.exit();
    }
    
}
