package org.openjfx;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BasicWindow {


    protected StackPane stackPane;
    protected Stage stage;
    protected Label label;
    protected Button button;
    protected Scene scene;

    public BasicWindow()
    {
        stage=new Stage();
        stage.setTitle("Window");
        button = new Button("Close");
        button.setLayoutY(50);
        this.label=new Label();
        this.stackPane=new StackPane(label,button);
        stackPane.setAlignment(Pos.TOP_CENTER);
        scene = new Scene(stackPane,400,300);
        StackPane.setMargin(stackPane.getChildren().get(0),new Insets(10));
        StackPane.setMargin(stackPane.getChildren().get(1),new Insets(40));
        setMessage("Hi! I am basic window!");
        stage.setScene(scene);
        stage.setResizable(false);
        button.setOnAction(e->stage.close());

    }

    public void setMessage(String message)
    {
        this.label.setText(message);
    }
    @FXML
    public void showWindow()
    {
        stage.showAndWait();
    }

    public BasicWindow clone()  {
        return new BasicWindow();
    }




}
