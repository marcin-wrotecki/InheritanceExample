package org.openjfx;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class WindowWithAdditionalInfo extends BasicWindow {

    public WindowWithAdditionalInfo(){
        Label label = new Label("Additional Info");
        stackPane.getChildren().add(label);
        setMessage("Hi! I am window with additional info");
        StackPane.setMargin(stackPane.getChildren().get(2),new Insets(100));
    }

}
