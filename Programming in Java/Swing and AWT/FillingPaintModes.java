import javax.swing.*;
import java.awt.*;

public class FillingPaintModes {
  public static void main(String[] args) {
    JFrame frame = new JFrame("My Graphics Program");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a custom component to paint on
    JPanel panel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the color
        g.setColor(Color.BLUE);

        // Fill a rectangle
        g.fillRect(50, 50, 200, 100);

        // Set the paint mode to XOR
        g.setXORMode(Color.YELLOW);

        // Fill an oval
        g.fillOval(100, 100, 200, 100);

      }
    };

    frame.add(panel);
    frame.setSize(400, 400);
    // frame.pack();
    frame.setVisible(true);
  }
}
