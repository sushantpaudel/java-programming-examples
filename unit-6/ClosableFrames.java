import javax.swing.*;

public class ClosableFrames {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Graphics Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Add your graphics code here

        frame.setSize(400, 400);
        // frame.pack();
        frame.setVisible(true);
    }
}
