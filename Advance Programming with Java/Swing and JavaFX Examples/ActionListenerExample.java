import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("ActionListener Example");
      JLabel label = new JLabel();
      JButton button = new JButton("Click me");

      button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          label.setText("Button clicked!");
        }
      });

      // Create an instance of the event handler and assign it to the button
      button.addActionListener(new ButtonClickHandler(label));

      frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
      frame.add(button);
      frame.add(label);

      frame.setSize(300, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    });
  }
}
