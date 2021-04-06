package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label labelText;
    public TextField textName;

    public void buttonMethod(ActionEvent actionEvent) {
        System.out.println("Button Pressed");
        labelText.setText("Changed");

    }

}
