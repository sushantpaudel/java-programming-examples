import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXChoiceBoxExample extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    // Create a ChoiceBox with font options
    ChoiceBox<String> choiceBox = new ChoiceBox<>();
    choiceBox.getItems().addAll("Arial", "Times New Roman", "Courier New");

    // Create a Label to display selected font
    Label label = new Label("Selected Font: ");

    // Set up a listener to update the label when a font is selected
    choiceBox.setOnAction(event -> label.setText("Selected Font: " + choiceBox.getValue()));

    // Create a VBox to arrange the components
    VBox vbox = new VBox(10, choiceBox, label);
    vbox.setPadding(new javafx.geometry.Insets(10));

    // Set up the stage
    Scene scene = new Scene(vbox, 300, 200);
    stage.setTitle("JavaFX ChoiceBox Example");
    stage.setScene(scene);
    stage.show();
  }
}
