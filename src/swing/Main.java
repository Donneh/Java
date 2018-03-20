package swing;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField input = new JTextField();
        frame.getContentPane().add(input);

        JButton submit = new JButton("Convert");
        frame.getContentPane().add(submit);

        frame.pack();
        frame.setVisible(true);
    }
}
