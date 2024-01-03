import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorComboBoxApp {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Color ComboBox");
      JPanel panel = new JPanel();
      JComboBox<String> colorComboBox = new JComboBox<>(new String[] { "Red", "Green", "Blue" });

      colorComboBox.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          String selectedColor = (String) colorComboBox.getSelectedItem();
          switch (selectedColor) {
            case "Red":
              panel.setBackground(Color.RED);
              break;
            case "Green":
              panel.setBackground(Color.GREEN);
              break;
            case "Blue":
              panel.setBackground(Color.BLUE);
              break;
          }
        }
      });

      frame.setLayout(new BorderLayout());
      frame.add(colorComboBox, BorderLayout.NORTH);
      frame.add(panel, BorderLayout.CENTER);

      frame.setSize(300, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    });
  }
}
