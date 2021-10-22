package htl.ahinf.tournament;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class TournamentApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TournamentApplication.class.getResource("hello-view.fxml"));
        stage.getIcons().add(new Image("htl/ahinf/tournament/logo.jpg"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 400);
        stage.setTitle("Tournament");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}