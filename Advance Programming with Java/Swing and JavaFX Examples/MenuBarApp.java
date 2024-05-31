import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarApp {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("MenuBar Example");
      JTextArea textArea = new JTextArea();
      JMenuBar menuBar = new JMenuBar();
      JMenu fileMenu = new JMenu("File");
      JMenu editMenu = new JMenu("Edit");

      JMenuItem newItem = new JMenuItem("New");
      JMenuItem openItem = new JMenuItem("Open");
      JMenuItem saveItem = new JMenuItem("Save");
      JMenuItem cutItem = new JMenuItem("Cut");
      JMenuItem copyItem = new JMenuItem("Copy");
      JMenuItem pasteItem = new JMenuItem("Paste");

      fileMenu.add(newItem);
      fileMenu.add(openItem);
      fileMenu.add(saveItem);

      editMenu.add(cutItem);
      editMenu.add(copyItem);
      editMenu.add(pasteItem);

      menuBar.add(fileMenu);
      menuBar.add(editMenu);

      newItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          textArea.setText("");
        }
      });

      cutItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          textArea.cut();
        }
      });

      copyItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          textArea.copy();
        }
      });

      pasteItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          textArea.paste();
        }
      });

      frame.setLayout(new BorderLayout());
      frame.add(textArea, BorderLayout.CENTER);
      frame.setJMenuBar(menuBar);

      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    });
  }
}
