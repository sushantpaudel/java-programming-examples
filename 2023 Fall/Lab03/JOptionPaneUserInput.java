import java.awt.FlowLayout;

import javax.swing.*;

public class JOptionPaneUserInput {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("JOptionPane Example");
      JButton button = new JButton("Show Input Dialog");

      button.addActionListener(e -> {
        String userInput = JOptionPane.showInputDialog(frame, "Enter a message:");
        if (userInput != null) {
          JOptionPane.showMessageDialog(frame, "You entered: " + userInput);
        }
      });

      frame.setLayout(new FlowLayout());
      frame.add(button);

      frame.setSize(300, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    });
  }
}
