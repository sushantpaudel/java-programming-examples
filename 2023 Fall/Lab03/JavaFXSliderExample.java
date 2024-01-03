import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXSliderExample extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    // Create a Slider for controlling the radius of a circle
    Slider slider = new Slider(0, 100, 50);

    // Create a Label to display the current radius value
    Label label = new Label("Radius: " + slider.getValue());

    // Set up a listener to update the label when the slider value changes
    slider.valueProperty()
        .addListener((observable, oldValue, newValue) -> label.setText("Radius: " + newValue.intValue()));

    // Create a VBox to arrange the components
    VBox vbox = new VBox(10, slider, label);
    vbox.setPadding(new javafx.geometry.Insets(10));

    // Set up the stage
    Scene scene = new Scene(vbox, 300, 200);
    stage.setTitle("JavaFX Slider Example");
    stage.setScene(scene);
    stage.show();
  }
}
