module htl.ahinf.tournament {
    requires javafx.controls;
    requires javafx.fxml;


    opens htl.ahinf.tournament to javafx.fxml;
    exports htl.ahinf.tournament;
}