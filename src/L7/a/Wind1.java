package L7.a;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class Wind1 extends JFrame {
    public Wind1() {
        setBounds(600, 200, 450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Kalkulyator");
        Scanner scan = new Scanner(System.in);

        JPanel panelN = new JPanel();

        panelN.setLayout(new BoxLayout(panelN, BoxLayout.X_AXIS));
        JTextField textField = new JTextField();
        panelN.add(textField);

        JButton btnSqr = new JButton("SQR");

        btnSqr.addActionListener(e -> {
            int x = Integer.parseInt(textField.getText());
            textField.setText("" + x * x);
        });
        panelN.add(btnSqr);
        btnSqr.setPreferredSize(new Dimension(100, 50));

        add(panelN, BorderLayout.NORTH);


        JPanel panelCentre = new JPanel(new GridLayout(3, 3));
        for (int i = 1; i < 10; i++) {
            JButton btn = new JButton("" + i);

            panelCentre.add(btn);
        }

        add(panelCentre, BorderLayout.CENTER);


        // JPanel panelE = new JPanel();
        JPanel panelE = new JPanel(new GridLayout(4, 1));

        JButton Btn1 = new JButton("+");
        panelE.add(Btn1);


        JButton Btn2 = new JButton("-");
        panelE.add(Btn2);
        JButton Btn3 = new JButton("*");
        panelE.add(Btn3);
        JButton Btn4 = new JButton("/");
        panelE.add(Btn4);


        add(panelE, BorderLayout.EAST);

        JPanel panelW = new JPanel(new GridLayout(3, 1));

        JButton B1 = new JButton("ON/C");

        panelW.add(B1);
        JButton B2 = new JButton("%");
        panelW.add(B2);
        JButton B3 = new JButton("+/-");
        panelW.add(B3);

        add(panelW, BorderLayout.WEST);

        setVisible(true);
    }

}
