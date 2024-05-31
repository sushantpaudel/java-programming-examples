import javax.swing.*;

public class SimpleSwingApp {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Hello, Swing!");
      JLabel label = new JLabel("Hello, Swing!");
      frame.getContentPane().add(label);
      frame.setSize(300, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    });
  }
}
