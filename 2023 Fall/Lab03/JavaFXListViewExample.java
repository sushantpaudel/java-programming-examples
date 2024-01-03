import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXListViewExample extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    ListView<String> listView = new ListView<>();
    ObservableList<String> items = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");
    listView.setItems(items);

    Button addButton = new Button("Add Item");
    addButton.setOnAction(event -> {
      String newItem = "New Item";
      items.add(newItem);
    });

    Button removeButton = new Button("Remove Item");
    removeButton.setOnAction(event -> {
      if (!items.isEmpty()) {
        items.remove(items.size() - 1);
      }
    });

    VBox vbox = new VBox(listView, addButton, removeButton);
    Scene scene = new Scene(vbox, 300, 200);

    stage.setScene(scene);
    stage.setTitle("JavaFX ListView Example");
    stage.show();
  }
}
