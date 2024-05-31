import javax.swing.*;
import java.awt.*;

public class SwingGUIWithLayout {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Swing GUI");
      frame.setLayout(new BorderLayout());

      JButton button1 = new JButton("Button 1");
      JButton button2 = new JButton("Button 2");
      JLabel label = new JLabel("Label");
      JTextField textField = new JTextField("Text Field");

      frame.add(button1, BorderLayout.NORTH);
      frame.add(button2, BorderLayout.SOUTH);
      frame.add(label, BorderLayout.WEST);
      frame.add(textField, BorderLayout.CENTER);

      frame.setSize(300, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    });
  }
}
