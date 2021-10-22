package htl.ahinf.tournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    private TextField knightName;
    @FXML
    private TextField knightPhoneNr;
    @FXML
    private TextArea textArea;
    @FXML
    private TextField weaponProperty;
    @FXML
    private TextField weaponType;
    @FXML
    private TextField weaponDescription;
    @FXML
    private TextField scarceExperience;
    @FXML
    private TextField scarcePhoneNr;
    @FXML
    private TextField scarceName;
    @FXML
    private TextField nickName;
    @FXML
    private Pane backgroundPane;
    @FXML
    private Pane weaponPane;
    @FXML
    private Pane scarcePane;
    @FXML
    private CheckBox weaponCheckBox;
    @FXML
    private CheckBox scarceCheckBox;

    private boolean addScarce;
    private Tournament tournament = new Tournament("FX Tournier","java");

    @FXML
    public void initialize() {
        weaponPane.setVisible(false);
        scarcePane.setVisible(false);
    }

    public void showScarcePane(ActionEvent actionEvent) {
        scarcePane.setVisible(scarceCheckBox.isSelected());
    }


    public void showWeaponPane(ActionEvent actionEvent) {
        weaponPane.setVisible(weaponCheckBox.isSelected());

    }

    public void addKnight(ActionEvent actionEvent){
        if (knightName != null && knightPhoneNr != null && nickName != null){
            Knight knight = new Knight(knightName.getText(),knightPhoneNr.getText(),nickName.getText());
            try {
                tournament.addParticipants(knight);
            }catch (KnightAlreadyExists e){
                System.out.println(e + " is already participating.");
            }
        }else {
            System.out.println("Please fill out the whole form.");
        }
        clearForm();

    }

    public void discardForm(ActionEvent actionEvent){
        clearForm();
    }
    public void clearForm(){
        weaponPane.setVisible(false);
        scarcePane.setVisible(false);
        knightName.clear();
        knightPhoneNr.clear();
        nickName.clear();
        scarceName.clear();
        scarcePhoneNr.clear();
        scarceExperience.clear();
        weaponDescription.clear();
        weaponProperty.clear();
        weaponType.clear();
    }

    public void updateParticipants(ActionEvent actionEvent){
        textArea.setText(tournament.getParticipants().toString());
    }
}