package org.openjfx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class PrimaryController implements Initializable {


    @FXML
    Button basicButton,scrollButton,infoButton,imageButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BasicWindow  basicWindow=new BasicWindow();
        basicButton.setOnAction(e->basicWindow.showWindow());

        BasicWindow scrollWindow = new ScrollWindow();
        scrollButton.setOnAction(e->scrollWindow.showWindow());

        BasicWindow windowWithAdditionalInfo=new WindowWithAdditionalInfo();
        infoButton.setOnAction(e->windowWithAdditionalInfo.showWindow());
        BasicWindow windowWithImage = new WindowWithImage();
        imageButton.setOnAction(e->windowWithImage.showWindow());

    }
}
