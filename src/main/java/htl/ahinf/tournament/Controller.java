package htl.ahinf.tournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Controller {
    private Pane weaponPane;
    private Pane scarcePane;


    @FXML
    public void initialize(){
        scarcePane.setVisible(false);
        weaponPane.setVisible(false);
    }

    public Controller(Label welcomeText, Pane weaponPane, Pane scarcePane) {
        this.weaponPane = weaponPane;
        this.scarcePane = scarcePane;
    }

    public void addScarce(ActionEvent actionEvent) {
        scarcePane.setVisible(true);
    }

    public void addWeapon(ActionEvent actionEvent) {
        weaponPane.setVisible(true);
    }
}