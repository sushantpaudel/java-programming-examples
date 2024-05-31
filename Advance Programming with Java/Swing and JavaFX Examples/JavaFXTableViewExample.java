import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXTableViewExample extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    // Create TableView with columns
    TableView<Person> tableView = new TableView<>();
    TableColumn<Person, String> nameColumn = new TableColumn<>("Name");
    TableColumn<Person, Integer> ageColumn = new TableColumn<>("Age");
    tableView.getColumns().addAll(nameColumn, ageColumn);

    // Set up column cell value factories
    nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

    // Create sample data
    ObservableList<Person> data = FXCollections.observableArrayList(
        new Person("John", 25),
        new Person("Jane", 30),
        new Person("Bob", 22));

    // Set data to the table
    tableView.setItems(data);

    // Create a VBox to arrange the components
    VBox vbox = new VBox(10, tableView);
    vbox.setPadding(new javafx.geometry.Insets(10));

    // Set up the stage
    Scene scene = new Scene(vbox, 300, 200);
    stage.setTitle("JavaFX TableView Example");
    stage.setScene(scene);
    stage.show();
  }

  // Person class for TableView data
  public static class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }
  }
}
