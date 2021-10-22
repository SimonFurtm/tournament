package htl.ahinf.tournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;

import java.awt.*;

public class Controller {
    private boolean addScarce;

    @FXML
    private Pane weaponPane;
    @FXML
    private Pane scarcePane;
    @FXML
    private CheckBox weaponCheckBox;
    @FXML
    private CheckBox scarceCheckBox;

    @FXML
    public void initialize() {
        weaponPane.setVisible(false);
        scarcePane.setVisible(false);
    }

    public void scarcePane(ActionEvent actionEvent) {
        if (scarceCheckBox.isSelected()){
            scarcePane.setVisible(true);
        }else {
            scarcePane.setVisible(false);
        }
    }


    public void weaponPane(ActionEvent actionEvent) {
        if (scarceCheckBox.isSelected()){
            weaponPane.setVisible(true);
        }else {
            weaponPane.setVisible(false);
        }

    }

    public void updateParticipants(ActionEvent actionEvent){

    }
}