import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiCastExample {
    private JFrame frame;
    private JLabel label1;
    private JLabel label2;
    private JButton button;

    public MultiCastExample() {
        frame = new JFrame("Multicasting Example");
        label1 = new JLabel("Listener 1: Not clicked");
        label2 = new JLabel("Listener 2: Not clicked");
        button = new JButton("Click me");

        // Set up the layout and add components
        frame.setLayout(new BorderLayout());
        frame.add(label1, BorderLayout.NORTH);
        frame.add(label2, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        // Register multiple listeners to the button
        button.addActionListener(new ButtonClickListener1(label1));
        button.addActionListener(new ButtonClickListener2(label2));

        // Finalize the frame setup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        javax.swing.SwingUtilities.invokeLater(MultiCastExample::new);
    }

    // First event listener class
    private static class ButtonClickListener1 implements ActionListener {
        private JLabel label;

        public ButtonClickListener1(JLabel label) {
            this.label = label;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Listener 1: Button clicked!");
        }
    }

    // Second event listener class
    private static class ButtonClickListener2 implements ActionListener {
        private JLabel label;

        public ButtonClickListener2(JLabel label) {
            this.label = label;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Listener 2: Button clicked!");
        }
    }
}
