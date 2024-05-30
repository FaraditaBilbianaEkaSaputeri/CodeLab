package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application {
    @Override
    public void start(Stage mainStage) {
        try {
            GridPane loginGrid = new GridPane();
            loginGrid.setAlignment(Pos.CENTER);
            loginGrid.setPadding(new Insets(25, 25, 25, 25));
            loginGrid.setVgap(8);
            loginGrid.setHgap(10);

            Text titleText = new Text("Login Page");
            titleText.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
            GridPane.setConstraints(titleText, 0, 0, 2, 1);

            Label usernameLabel = new Label("Username:");
            GridPane.setConstraints(usernameLabel, 0, 1);
            TextField usernameField = new TextField();
            usernameField.setPromptText("Enter username");
            GridPane.setConstraints(usernameField, 1, 1);

            Label passwordLabel = new Label("Password:");
            GridPane.setConstraints(passwordLabel, 0, 2);
            PasswordField passwordField = new PasswordField();
            GridPane.setConstraints(passwordField, 1, 2);

            Button signInButton = new Button("Log In");
            HBox signInHBox = new HBox(10);
            signInHBox.setAlignment(Pos.BOTTOM_RIGHT);
            signInHBox.getChildren().add(signInButton);
            GridPane.setConstraints(signInHBox, 1, 3);

            Text feedbackText = new Text();
            feedbackText.setFill(Color.RED);
            GridPane.setConstraints(feedbackText, 1, 4);

            GridPane homeGrid = new GridPane();
            homeGrid.setAlignment(Pos.CENTER);
            homeGrid.setPadding(new Insets(25, 25, 25, 25));
            homeGrid.setVgap(8);
            homeGrid.setHgap(10);

            Text welcomeText = new Text();
            welcomeText.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
            GridPane.setConstraints(welcomeText, 0, 0);

            Button signOutButton = new Button("Log Out");
            HBox signOutHBox = new HBox(10);
            signOutHBox.setAlignment(Pos.BOTTOM_RIGHT);
            signOutHBox.getChildren().add(signOutButton);
            GridPane.setConstraints(signOutHBox, 0, 1);

            Scene loginScene = new Scene(loginGrid, 400, 400);
            Scene homeScene = new Scene(homeGrid, 400, 400);

            loginGrid.getChildren().addAll(titleText, usernameLabel, usernameField, passwordLabel, passwordField, signInHBox, feedbackText);
            homeGrid.getChildren().addAll(welcomeText, signOutHBox);

            signInButton.setOnAction(event -> {
                String user = usernameField.getText();
                String pass = passwordField.getText();

                if ("074".equals(user) && "074".equals(pass)) {
                    welcomeText.setText("Hello " + usernameField.getText());
                    mainStage.setScene(homeScene);
                } else {
                    feedbackText.setText("Incorrect Username or Password");
                }
            });

            signOutButton.setOnAction(event -> {
                passwordField.clear();
                mainStage.setScene(loginScene);
            });

            loginScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            mainStage.setScene(loginScene);
            mainStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
