package htl.ahinf.tournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Controller {
    @FXML
    public Label errorMassage;
    public Button btn1;
    public Button btn2;
    public ImageView logo;
    public ImageView background;
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
    private Pane weaponPane;
    @FXML
    private Pane scarcePane;
    @FXML
    private CheckBox weaponCheckBox;
    @FXML
    private CheckBox scarceCheckBox;

    private boolean addScarce;
    private boolean addWeapon;
    private boolean darkSide = true;
    private char weaponTypeChar;
    private int scarceExperienceInt;

    private Tournament tournament = new Tournament("FX Tournier","java");

    //images
    Image empireLogo = new Image(new FileInputStream("src/main/resources/htl/ahinf/tournament/empire-logo.png"));
    Image jediLogo = new Image(new FileInputStream("src/main/resources/htl/ahinf/tournament/jedi-logo.png"));
    Image empireBackground = new Image(new FileInputStream("src/main/resources/htl/ahinf/tournament/empire-background.jpg"));
    Image jediBackground = new Image(new FileInputStream("src/main/resources/htl/ahinf/tournament/jedi-background.jpg"));

    public Controller() throws FileNotFoundException {}

    @FXML
    public void initialize() {  //wird ausgeführt beim starten der applikation
        weaponPane.setVisible(false);
        scarcePane.setVisible(false);
    }

    //fügt knappen hinzu
    public void addScarce(ActionEvent actionEvent) {
        scarcePane.setVisible(scarceCheckBox.isSelected());
        if(scarceCheckBox.isSelected()){
            addScarce=true;
        }else {
            addScarce=false;
        }
    }

    //fügt waffe hinzu
    public void addWeapon(ActionEvent actionEvent) {
        weaponPane.setVisible(weaponCheckBox.isSelected());
        if(weaponCheckBox.isSelected()){
            addWeapon=true;
        }else {
            addWeapon=false;
        }
    }

    //fügt ritter hinzu
    public void addKnight(ActionEvent actionEvent){
        if (knightName.getText() != "" && knightPhoneNr.getText() != "" && nickName.getText() != ""){   //wenn alles ausgefüllt ist beim formular (für den ritter)
            //erstellt ritter
            Knight knight = new Knight(knightName.getText(),knightPhoneNr.getText(),nickName.getText());
            //ritter in turnier schon vorhanden exeption
            try {
                //fügt ritter zum turnier hinzu
                tournament.addParticipants(knight);

            }catch (KnightAlreadyExists e){
                System.out.println(e + " is already participating.");
                errorMassage.setText("Knight already exists");
            }

            //wenn waffe hinzugefügt werden soll
            if (addWeapon){
                //wandelt string in char um
                weaponTypeChar = weaponType.getText().charAt(0);
                //fügt waffe zum ritter hinzu
                knight.addWeapon(weaponDescription.getText(),weaponTypeChar,weaponProperty.getText());
                    //falls waffentyp nicht vorhanden ist
                    if(!knight.isValidWeaponType()) {
                        errorMassage.setText("Wrong weapon type");
                        tournament.removeParticipant(knight);
                    }

            }
            //wenn knappe hinzugefügt werden soll
            if (addScarce){
                try {
                    //string zu integer
                    scarceExperienceInt = Integer.parseInt(scarceExperience.getText());
                    //fügt knappen zum ritter hinzu
                    knight.addScarce(scarceName.getText(),scarcePhoneNr.getText(), scarceExperienceInt);
                }catch (NumberFormatException e){   //wenn string kein nummer ist
                    System.out.println("Scarce experience must be a Integer.");
                    errorMassage.setText("XP isn`t Integer");
                    tournament.removeParticipant(knight);
                }
            }
        }else {
            System.out.println("Please fill out the whole form.");
            errorMassage.setText("Form not valid");
        }
        textArea.setText(tournament.listAllParticipants());
    }

    //verwirft formular
    public void discardForm(ActionEvent actionEvent){
        clearForm();
    }

    //setzt alles auf den "soll-stand" zurück
    public void clearForm(){
        weaponPane.setVisible(false);
        scarcePane.setVisible(false);
        weaponCheckBox.setSelected(false);
        scarceCheckBox.setSelected(false);
        knightName.clear();
        knightPhoneNr.clear();
        nickName.clear();
        scarceName.clear();
        scarcePhoneNr.clear();
        scarceExperience.clear();
        weaponDescription.clear();
        weaponProperty.clear();
        weaponType.clear();
        addScarce = false;
        addWeapon = false;
    }
    //gibt die liste aller teilnehmer im textfeld aus
    public void updateParticipants(ActionEvent actionEvent){
        textArea.setText(tournament.listAllParticipants());
        System.out.println("Updating...");
        errorMassage.setText("");
    }

    //ändert das design
    public void switchSide(ActionEvent actionEvent) {
        if (darkSide){
            btn1.setStyle("-fx-background-color: lightgreen");
            btn2.setStyle("-fx-background-color: lightgreen");
            scarcePane.setStyle("-fx-background-color: lightgreen");
            weaponPane.setStyle("-fx-background-color: lightgreen");
            logo.setImage(jediLogo);
            background.setImage(jediBackground);
            darkSide = false;
        }else{
            btn1.setStyle("-fx-background-color: red");
            btn2.setStyle("-fx-background-color: red");
            scarcePane.setStyle("-fx-background-color: red");
            weaponPane.setStyle("-fx-background-color: red");
            logo.setImage(empireLogo);
            background.setImage(empireBackground);
            darkSide = true;
        }
    }
}