package com.example.midtermproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ConnectionController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onConnectionButtonClick() {
        welcomeText.setText("Connecting to Server");
        EchoClient.main(null);
    }
}