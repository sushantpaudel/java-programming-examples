import java.awt.*;
import javax.swing.*;

public class NepalFlag extends JFrame {
  NepalFlag() {
    this.setTitle("Flag of Nepal");
    this.setSize(1000, 1000);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void paint(Graphics g) {
    // Creating the black color rod to hold the flag
    // g.setColor(Color.BLACK);
    // g.fillRect(30, 30, 10, 600);
    // g.fillPolygon(x1Points, y1Points, 5);
    // g.fillOval(100, 100, 100, 60);
  }

  public static void main(String[] args) {
    new NepalFlag();
  }
}