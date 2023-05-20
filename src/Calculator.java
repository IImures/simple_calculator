import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator(){
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextField cout = new JTextField();
        cout.setPreferredSize(new Dimension(100,40));
        cout.setEnabled(false);
        panel.add(cout, BorderLayout.PAGE_START);

        JPanel keyboard = new KeyBoard(cout).keyboardGet();
        panel.add(keyboard);

        panel.setBackground(Color.GRAY);

        add(panel);

        setSize(250,280);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
