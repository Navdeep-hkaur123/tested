package com.example.tested;




import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField usernameField;


@FXML
private TextField passwordField;

private int invalidAttempts = 0;
private final int MAX_ATTEMPTS = 5;

@FXML
private void loginButtonClicked() {
    String username = usernameField.getText();
    String password = passwordField.getText();

    // Perform static authentication
    if (username.equals("your_username") && password.equals("your_password")) {
        showAlert("Success!!!");
    } else {
        invalidAttempts++;
        if (invalidAttempts >= MAX_ATTEMPTS) {
            showAlert("Sorry, Your Account is Locked!!!");
            // Optionally disable login button or take other actions
        } else {
            showAlert("Sorry, Invalid Username or Password\nAttempts left: " + (MAX_ATTEMPTS - invalidAttempts));
        }
    }
}

private void showAlert(String message) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Login Result");
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
}
}