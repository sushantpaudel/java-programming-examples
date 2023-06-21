import java.awt.*;
import javax.swing.*;

public class NepalFlag extends JFrame {
  NepalFlag() {
    this.setTitle("Flag of Nepal");
    this.setSize(500, 500);
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

    // BLUE TRIANGLE
    g.setColor(Color.BLUE);
    int x1Points[] = { 100, 300, 150, 350, 100 };
    int y1Points[] = { 100, 200, 200, 350, 350 };
    g.fillPolygon(x1Points, y1Points, 5);

    // RED TRIANGLE
    g.setColor(Color.RED);
    int x2Points[] = { 110, 270, 130, 330, 110 };
    int y2Points[] = { 115, 190, 190, 340, 340 };
    g.fillPolygon(x2Points, y2Points, 5);

    // SUN
    g.setColor(Color.WHITE);
    g.fillOval(130, 250, 80, 80);

    // MOON
    g.setColor(Color.WHITE);
    g.fillOval(120, 140, 40, 40);
    g.setColor(Color.RED);
    g.fillOval(120, 130, 40, 40);
    g.setColor(Color.WHITE);
    g.fillOval(130, 160, 20, 20);
  }

  public static void main(String[] args) {
    new NepalFlag();
  }
}