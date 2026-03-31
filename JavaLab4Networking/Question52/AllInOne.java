package JavaLab4Networking.Question52;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.File;

public class AllInOne extends Application {

    @Override
    public void start(Stage stage) {

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> stage.close());
        fileMenu.getItems().add(exitItem);
        menuBar.getMenus().add(fileMenu);

        GridPane form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(20));
        form.setAlignment(Pos.CENTER);

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your full name");

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        emailField.setPromptText("Enter your email");

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");

        Label genderLabel = new Label("Gender:");
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        RadioButton other = new RadioButton("Other");

        ToggleGroup genderGroup = new ToggleGroup();
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);
        other.setToggleGroup(genderGroup);

        HBox genderBox = new HBox(10, male, female, other);

        Label hobbiesLabel = new Label("Hobbies:");
        CheckBox cbReading = new CheckBox("Reading");
        CheckBox cbTraveling = new CheckBox("Traveling");
        CheckBox cbGaming = new CheckBox("Gaming");
        HBox hobbiesBox = new HBox(10, cbReading, cbTraveling, cbGaming);

        Label picLabel = new Label("Profile Picture:");
        Button picButton = new Button("Choose File");
        Label picPathLabel = new Label("No file chosen");
        Tooltip picTooltip = new Tooltip("Select a profile picture");
        picButton.setTooltip(picTooltip);

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Profile Picture");
        picButton.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(stage);
            if (selectedFile != null) {
                picPathLabel.setText(selectedFile.getAbsolutePath());
            }
        });

        HBox picBox = new HBox(10, picButton, picPathLabel);

        Hyperlink loginLink = new Hyperlink("Already have an account? Login with Google");
        loginLink.setOnAction(e -> System.out.println("Redirecting to Google login..."));

        Button submitBtn = new Button("Register");
        submitBtn.setOnAction(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = passwordField.getText();
            String gender = ((RadioButton) genderGroup.getSelectedToggle()) != null ?
                    ((RadioButton) genderGroup.getSelectedToggle()).getText() : "Not selected";
            StringBuilder hobbies = new StringBuilder();
            if (cbReading.isSelected()) hobbies.append("Reading ");
            if (cbTraveling.isSelected()) hobbies.append("Traveling ");
            if (cbGaming.isSelected()) hobbies.append("Gaming ");
            if (hobbies.length() == 0) hobbies.append("None");

            String pic = picPathLabel.getText();

            System.out.println("----- Registration Info -----");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("Gender: " + gender);
            System.out.println("Hobbies: " + hobbies);
            System.out.println("Profile Pic: " + pic);
        });

        form.add(nameLabel, 0, 0);
        form.add(nameField, 1, 0);
        form.add(emailLabel, 0, 1);
        form.add(emailField, 1, 1);
        form.add(passwordLabel, 0, 2);
        form.add(passwordField, 1, 2);
        form.add(genderLabel, 0, 3);
        form.add(genderBox, 1, 3);
        form.add(hobbiesLabel, 0, 4);
        form.add(hobbiesBox, 1, 4);
        form.add(picLabel, 0, 5);
        form.add(picBox, 1, 5);
        form.add(submitBtn, 1, 6);
        form.add(loginLink, 1, 7);

        VBox root = new VBox(menuBar, form);
        Scene scene = new Scene(root, 600, 500);
        javafx.geometry.Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((screenBounds.getWidth() - 600) / 2);
        stage.setY((screenBounds.getHeight() - 500) / 2);
        stage.setScene(scene);
        stage.setTitle("User Registration Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}