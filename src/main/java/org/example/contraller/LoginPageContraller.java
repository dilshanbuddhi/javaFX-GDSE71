package org.example.contraller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageContraller {
    public TextField nameTxt;
    public TextField passTxt;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        final String username = "dilshan";
        final String password = "1234";
        String uname = nameTxt.getText();
        String pass = passTxt.getText();

        if (username.equals(uname) && password.equals(pass)) {
            navigateDashboard();

        } else {
            if (!username.equals(uname)) {
                nameTxt.setStyle("-fx-text-box-border: red; -fx-text-inner-color: red;");
            } else {
                nameTxt.setStyle("-fx-text-box-border: green; -fx-text-inner-color: green;");
            }

            if (!password.equals(pass)) {
                passTxt.setStyle("-fx-text-box-border: red; -fx-text-inner-color: red;");
            } else {
                passTxt.setStyle("");
            }
        }
    }

    private void navigateDashboard() throws IOException {
        AnchorPane rootNode = FXMLLoader.load(getClass().getResource("/view/customer_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) passTxt.getScene().getWindow();
        stage.setScene(scene);
    }

    public void LOginOnAction2(ActionEvent actionEvent) throws IOException {
        loginOnAction(actionEvent);
    }
}
