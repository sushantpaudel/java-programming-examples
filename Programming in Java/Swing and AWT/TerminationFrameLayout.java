import javax.swing.*;
import java.awt.*;

public class TerminationFrameLayout {
  public static void main(String[] args) {
    JFrame frame = new JFrame("My Graphics Program");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the layout manager
    frame.setLayout(new FlowLayout());

    // Add components to the frame
    JLabel label = new JLabel("Hello, World!");
    frame.add(label);

    JButton button = new JButton("Click Me");
    frame.add(button);

    frame.setSize(400, 400);
    // frame.pack();
    frame.setVisible(true);
  }
}
