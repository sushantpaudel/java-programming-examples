import javax.swing.*;
import java.awt.*;

public class TextFontColor {
  public static void main(String[] args) {
    JFrame frame = new JFrame("My Graphics Program");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a custom component to paint on
    JPanel panel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the font and color
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(Color.RED);

        // Draw text on the panel
        g.drawString("Hello, Graphics!", 50, 50);
      }
    };

    frame.add(panel);
    frame.setSize(400, 400);
    // frame.pack();
    frame.setVisible(true);
  }
}
