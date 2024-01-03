import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConcatenateTextFields {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Concatenate TextFields");
      JTextField textField1 = new JTextField();
      JTextField textField2 = new JTextField();
      JButton concatenateButton = new JButton("Concatenate");
      JLabel resultLabel = new JLabel();

      concatenateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          String text1 = textField1.getText();
          String text2 = textField2.getText();
          String result = text1 + text2;
          resultLabel.setText("Concatenated result: " + result);
        }
      });

      frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
      frame.add(textField1);
      frame.add(textField2);
      frame.add(concatenateButton);
      frame.add(resultLabel);

      frame.setSize(300, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    });
  }
}
