package ba.unsa.etf.rpr.projekat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ResourceBundle bundle = ResourceBundle.getBundle("Translation");
        Locale.setDefault(new Locale("en_US"));
        FXMLLoader loader = new FXMLLoader( getClass().getResource("/fxml/administrator.fxml"), bundle);
        Scene scene = new Scene(loader.load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE);
        stage.setTitle("Login");
        stage.getIcons().add(new Image("/images/user-icon.png"));
        stage.setScene(scene);
       // stage.toFront();
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}