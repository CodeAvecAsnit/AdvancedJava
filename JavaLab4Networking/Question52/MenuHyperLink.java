package JavaLab4Networking.Question52;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MenuHyperLink extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox box = new HBox(4);
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> stage.close());
        fileMenu.getItems().add(exitItem);
        menuBar.getMenus().add(fileMenu);

        Hyperlink link = new Hyperlink("Visit Website!");
        link.setOnAction(e -> System.out.println("Hyperlink clicked!"));

        Button btn= new Button("Click me");

        Tooltip tooltip = new Tooltip("Click the button to see what happens");
        btn.setTooltip(tooltip);

        box.getChildren().addAll(menuBar, link, btn);
        Scene scene = new Scene(box, 400, 500);
        stage.setScene(scene);
        stage.setTitle("All JavaFX Controls Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
