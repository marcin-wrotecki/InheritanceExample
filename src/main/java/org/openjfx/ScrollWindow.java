package org.openjfx;


import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;

public class ScrollWindow extends BasicWindow {


    public ScrollWindow() {
        Label label = new Label("I am inside scrollPane");
        ScrollPane scrollPane=new ScrollPane(label);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        stackPane.getChildren().add(scrollPane);
        setMessage("Hi! I am window with scrollPane");
        StackPane.setMargin(stackPane.getChildren().get(2),new Insets(100));

    }


}
