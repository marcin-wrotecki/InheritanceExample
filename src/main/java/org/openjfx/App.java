package org.openjfx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));

        stage.setScene(scene);
        stage.setTitle("Inheritance");
        stage.setResizable(false);
        stage.show();
        stage.setOnCloseRequest(e->closeProgram());

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.descriptions");
        fxmlLoader.setResources(bundle);
        return fxmlLoader.load();
    }

    public static void closeProgram(){
        Platform.exit();
        System.exit(0);
    }

    public static void run(String[] args) {
        launch();
    }

}