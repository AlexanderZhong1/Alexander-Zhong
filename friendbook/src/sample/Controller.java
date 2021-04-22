package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public ListView<friend> friendList = new ListView<>();
    public TextField firstText;
    public TextField lastText;
    public Label lastDisplay;
    public Label firstDisplay;

    public void addButton(ActionEvent actionEvent) {
        if (firstText.getText().isEmpty() == false && lastText.getText().isEmpty() == false) {
            friendList.getItems().add(new friend(firstText.getText(), lastText.getText()));
            firstText.clear(); 
            lastText.clear();
        }
    }

    public void deleteButton(ActionEvent actionEvent) {
        friend friendselect = friendList.getSelectionModel().getSelectedItem();
        if (friendselect != null) {
            friendList.getItems().remove(friendList.getItems().indexOf(friendselect));
        }
    }

    public void displayFriend(MouseEvent mouseEvent) {
        if (friendList.getItems().size() != 0 && friendList.getSelectionModel().getSelectedItem() != null) {
            friend friendselect = friendList.getSelectionModel().getSelectedItem();
            firstDisplay.setText("Firstname: " + friendselect.getFirstName());
            lastDisplay.setText(("Lastname: " + friendselect.getLastName()));

        }


    }
}
