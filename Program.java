import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("task 3_5_3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(500,500));
        JButton button = new JButton("input name");
        JPanel panel = new JPanel();
        panel.add(button);
        frame.getContentPane().add(panel);
         String s = "";
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = JOptionPane.showInputDialog(frame, "enter your name");
                if (str1 == null) {
                    JOptionPane.showMessageDialog(null, "you didn't type your name");
                }
                else {
                    JOptionPane.showMessageDialog(frame, str1);
                }
            }


        });



        frame.setVisible(true);
    }
}
