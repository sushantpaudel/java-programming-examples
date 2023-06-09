import javax.swing.*;
import java.awt.*;

public class Shapes {
  public static void main(String[] args) {
    JFrame frame = new JFrame("My Graphics Program");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a custom component to paint on
    JPanel panel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw lines
        g.drawLine(50, 50, 150, 150);
        g.drawLine(150, 150, 250, 50);

        // Draw a rectangle
        g.drawRect(50, 100, 200, 100);

        // Draw an oval
        g.drawOval(300, 100, 200, 100);
      }
    };

    frame.add(panel);
    frame.setSize(400, 400);
    // frame.pack();
    frame.setVisible(true);
  }
}
