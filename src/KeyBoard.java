import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyBoard {
    private static int firstN;
    private static int secondN;
    private Operation operation;
    private static JPanel keyboard;
    private static JTextField cout;
    public KeyBoard(JTextField cout){
        this.cout = cout;

        JButton one = new JButton("1");
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cout.setText(cout.getText() + "1");
            }
        });
        JButton two = new JButton("2");
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cout.setText(cout.getText() + "2");
            }
        });
        JButton three = new JButton("3");
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cout.setText(cout.getText() + "3");
            }
        });
        JButton four = new JButton("4");
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cout.setText(cout.getText() + "4");
            }
        });
        JButton five = new JButton("5");
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cout.setText(cout.getText() + "5");
            }
        });
        JButton six = new JButton("6");
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cout.setText(cout.getText() + "6");
            }
        });
        JButton seven = new JButton("7");
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cout.setText(cout.getText() + "7");
            }
        });
        JButton eight = new JButton("8");
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cout.setText(cout.getText() + "8");
            }
        });
        JButton nine = new JButton("9");
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cout.setText(cout.getText() + "9");
            }
        });
        JButton zero = new JButton("0");
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cout.setText(cout.getText() + "0");
            }
        });
        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    operation = secondN -> firstN + secondN;
                    firstN = Integer.parseInt(cout.getText());
                    cout.setText("");
                }catch (NumberFormatException ex){
                    System.out.println("No number was provided");
                }
            }
        });
        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    operation = secondN -> firstN - secondN;
                    firstN = Integer.parseInt(cout.getText());
                    cout.setText("");
                }catch (NumberFormatException ex){
                    System.out.println("No number was provided");
                }
            }
        });
        JButton divide = new JButton("/");
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    operation = secondN -> firstN / secondN;
                    firstN = Integer.parseInt(cout.getText());
                    cout.setText("");
                }catch (NumberFormatException ex){
                    System.out.println("No number was provided");
                }

            }
        });
        JButton multiply = new JButton("*");
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    operation = secondN -> firstN * secondN;
                    firstN = Integer.parseInt(cout.getText());
                    cout.setText("");
                }catch (NumberFormatException ex){
                    System.out.println("No number was provided");
                }
            }
        });
        JButton equals = new JButton("=");
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!cout.getText().equals("")) {
                    try {
                        secondN = Integer.parseInt(cout.getText());
                        cout.setText("" + operation.operation(secondN));
                    } catch (ArithmeticException ex) {
                        firstN = 0;
                        secondN = 0;
                        operation = null;
                        cout.setText("");
                    } catch (NullPointerException ex) {
                        System.out.println("No first value was provided!");
                    }
                }
            }
        });
        JButton erase = new JButton("<-");
        erase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cout.getText().length() != 0)
                    cout.setText(cout.getText().substring(0, cout.getText().length() - 1));
            }
        });
        JButton clear = new JButton("CE");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstN = 0;
                secondN = 0;
                operation = null;
                cout.setText("");
            }
        });

        keyboard = new JPanel(new FlowLayout());
        keyboard.setBackground(Color.GRAY);
        keyboard.add(one);
        keyboard.add(two);
        keyboard.add(three);
        keyboard.add(four);
        keyboard.add(five);
        keyboard.add(six);
        keyboard.add(seven);
        keyboard.add(eight);
        keyboard.add(nine);
        keyboard.add(zero);
        keyboard.add(plus);
        keyboard.add(minus);
        keyboard.add(multiply);
        keyboard.add(divide);
        keyboard.add(equals);
        keyboard.add(erase);
        keyboard.add(clear);


    }

    public JPanel keyboardGet(){
        return keyboard;
    }
}
