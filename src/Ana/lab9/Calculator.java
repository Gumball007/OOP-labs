package Ana.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class calculatorFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    Font font1 = new Font("Baskerville", Font.BOLD, 16);
    Font font2 = new Font("Baskerville", Font.BOLD, 32);
    JLabel title = new JLabel("Calculator");
    JLabel number1 = new JLabel("Number 1");
    JLabel number2 = new JLabel("Number 2");
    JLabel result = new JLabel("Result");
    JTextField number1Field = new JTextField();
    JTextField number2Field = new JTextField();
    JTextField resultField = new JTextField();
    JButton divideButton = new JButton("Divide");
    JButton resetButton = new JButton("Reset");

    calculatorFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
        container.setBackground(new Color(66, 208, 255));
    }

    public void setLocationAndSize() {
        title.setBounds(100, 5, 200, 50);
        title.setFont(font2);
        title.setForeground(Color.white);

        number1.setBounds(50, 70, 150, 20);
        number1.setFont(font1);

        number2.setBounds(50, 120, 150, 20);
        number2.setFont(font1);

        result.setBounds(50, 170, 150, 20);
        result.setFont(font1);

        number1Field.setBounds(150, 65, 150, 30);
        number2Field.setBounds(150, 115, 150, 30);
        resultField.setBounds(150, 165, 150, 30);
        resultField.setEditable(false);
        divideButton.setBounds(50, 250, 100, 50);
        divideButton.setFont(font1);
        resetButton.setBounds(200, 250, 100, 50);
        resetButton.setFont(font1);
    }

    public void addComponentsToContainer() {
        add(title);
        add(number1);
        add(number2);
        add(result);
        add(number1Field);
        add(number2Field);
        add(resultField);
        add(divideButton);
        add(resetButton);
    }

    public void addActionEvent() {
        divideButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of Reset button
        if (e.getSource() == resetButton) {
            number1Field.setText("");
            number2Field.setText("");
            resultField.setText("");
        }
        //Coding Part of Divide button
        String s1 = number1Field.getText();
        String s2 = number2Field.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (number2Field.getText().equals("13")) {
            JOptionPane.showMessageDialog(this, "13 is unlucky", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (b == 0) {
            JOptionPane.showMessageDialog(this, "Division by 0 is not allowed", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (e.getSource() == divideButton) {
            c = a / b;
        }
        String Result = String.valueOf(c);
        resultField.setText(Result);
    }

    public static class Calculator {
        public static void main(String[] a) {
            calculatorFrame frame = new calculatorFrame();
            frame.setVisible(true);
            frame.setBounds(5, 0, 370, 370);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
        }
    }
}

