package r.guseynov.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcurator extends JFrame {

    private Double leftOperand;
    private String operation;

    public Calcurator() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new BorderLayout());
        final JLabel display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 18));
        add(display, BorderLayout.NORTH);
        final ActionListener numberListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton button = (JButton) e.getSource();
                final String text = button.getText();
                String displayText = display.getText();
                ActionListener buttonListener = new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        final JButton source = (JButton) e.getSource();
                        final String action = source.getText();
                        Double rightOperand = Double.parseDouble(display.getText());

                        if("=".equals(action)) {
                            if(leftOperand != null);
                            switch (operation) {
                                case "+":
                                display.setText(String.valueOf(leftOperand + rightOperand));
                                break;
                                case "-":
                                    display.setText(String.valueOf(leftOperand - rightOperand));
                                    break;
                                case "*":
                                    display.setText(String.valueOf(leftOperand * rightOperand));
                                    break;
                                case "/":
                                    display.setText(String.valueOf(leftOperand / rightOperand));
                                    break;
                            }
                            leftOperand = Double.parseDouble(display.getText());
                            operation = null;
                        }
                        return;
                    }
                };

                if (".".equals(text) && !displayText.contains(".")) {
                      return;
                }
                if ("0".equals(text)) {
                    displayText = "";
                }
                displayText += text;
                display.setText(displayText);
            }
        };
        final JPanel numberPanel = new JPanel();
        final GridLayout numberLayout = new GridLayout(4, 4, 10, 10);
        numberPanel.setLayout(numberLayout);

        for (int i = 0; i < 10; i++) {
            final JButton button = new JButton(String.valueOf(i));
            button.addActionListener(numberListener);
            numberPanel.add(button);
        }

        final JButton pointButton = new JButton(".");
        pointButton.addActionListener(numberListener);

        final JButton negativeButton = new JButton("+/-");

        numberPanel.add(pointButton);
        numberPanel.add(negativeButton);

        final JPanel buttonPanel = new JPanel();
        final GridLayout buttonLayout = new GridLayout(2, 3, 10, 10);
        buttonPanel.setLayout(buttonLayout);
        for(char c : "C+-*/=".toCharArray()) {
            final JButton button = new JButton(String.valueOf(c));
            button.addActionListener(numberListener);
            buttonPanel.add(button);
        }
        add(numberPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);


    }

    public static void main(String[] args) { new Calcurator();}
}

