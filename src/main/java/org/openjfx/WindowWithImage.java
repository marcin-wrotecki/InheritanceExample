package org.openjfx;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WindowWithImage extends BasicWindow {


    public WindowWithImage() {
        ImageView image = null;
        try {
            image = new ImageView(new Image(new FileInputStream("img/image.jpg"),250,150,false,false));
            stackPane.getChildren().add(image);
        } catch (FileNotFoundException e) {
            System.out.println("Can't find image");
        }
        setMessage("Hi! I am window with image");
        StackPane.setMargin(stackPane.getChildren().get(2),new Insets(100));
    }

}
