import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXLayoutExample extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    HBox hbox = new HBox();
    VBox vbox = new VBox();

    Button button1 = new Button("Button 1");
    Button button2 = new Button("Button 2");
    Label label = new Label("Label");
    TextField textField = new TextField("Text Field");

    hbox.getChildren().addAll(button1, button2);
    vbox.getChildren().addAll(label, textField);

    Scene scene = new Scene(new HBox(hbox, vbox), 300, 200);
    stage.setScene(scene);
    stage.setTitle("JavaFX Layout Example");
    stage.show();
  }
}
