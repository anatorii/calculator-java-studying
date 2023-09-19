import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {
    private static int width = 400;
    private static int height = 600;
    private JTextField field;
    private int operandNumber = 1;
    private String action = "";
    private String first = "";
    private String second = "";

    public Calculator() {
        super("Calculator");

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(Calculator.width, Calculator.height);
        this.setLocation(d.width / 2 - Calculator.width / 2, d.height / 2 - Calculator.height / 2);
        this.getContentPane().setBackground(Color.orange);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());

        field = new JTextField();
        field.setFont(new Font("Arial", Font.PLAIN, 20));
        field.setText("");
        field.setColumns(20);
        field.setFocusable(false);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton bPlus = new JButton("+");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton bMinus = new JButton("-");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bMult = new JButton("*");
        JButton bClear = new JButton("C");
        JButton b0 = new JButton("0");
        JButton bEqual = new JButton("=");
        JButton bDiv = new JButton("/");

        this.add(field, new GridBagConstraints(0, 0, 4, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));

        this.add(b1, new GridBagConstraints(0, 1, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(b2, new GridBagConstraints(1, 1, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(b3, new GridBagConstraints(2, 1, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(bPlus, new GridBagConstraints(3, 1, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));

        this.add(b4, new GridBagConstraints(0, 2, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(b5, new GridBagConstraints(1, 2, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(b6, new GridBagConstraints(2, 2, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(bMinus, new GridBagConstraints(3, 2, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));

        this.add(b7, new GridBagConstraints(0, 3, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(b8, new GridBagConstraints(1, 3, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(b9, new GridBagConstraints(2, 3, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(bMult, new GridBagConstraints(3, 3, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));

        this.add(bClear, new GridBagConstraints(0, 4, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(b0, new GridBagConstraints(1, 4, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(bEqual, new GridBagConstraints(2, 4, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));
        this.add(bDiv, new GridBagConstraints(3, 4, 1, 1, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(5,5,5,5), 5, 5));

        this.setVisible(true);

        b1.addActionListener(new NumberActionListener(this));
        b2.addActionListener(new NumberActionListener(this));
        b3.addActionListener(new NumberActionListener(this));
        b4.addActionListener(new NumberActionListener(this));
        b5.addActionListener(new NumberActionListener(this));
        b6.addActionListener(new NumberActionListener(this));
        b7.addActionListener(new NumberActionListener(this));
        b8.addActionListener(new NumberActionListener(this));
        b9.addActionListener(new NumberActionListener(this));
        b0.addActionListener(new NumberActionListener(this));

        bDiv.addActionListener(new ActionActionListener(this));
        bPlus.addActionListener(new ActionActionListener(this));
        bMinus.addActionListener(new ActionActionListener(this));
        bMult.addActionListener(new ActionActionListener(this));

        bClear.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearActionPerformed(e);
            }
        });

        bEqual.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                equalActionPerformed(e);
            }
        });
    }

    public JTextField getField() {
        return field;
    }
    public String getAction() {
        return this.action;
    }
    public String getFirst() {
        return this.first;
    }
    public String getSecond() {
        return this.second;
    }
    public int getOperandNumber() {
        return this.operandNumber;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public void setOperandNumber(int number) {
        this.operandNumber = number;
    }
    public void setFirst(String op) {
        this.first = op;
    }
    public void setSecond(String op) {
        this.second = op;
    }

    public void refreshField() {
        String first = this.first;
        String second = this.second;
        String op = " " + this.action + " ";
        this.field.setText(first + op + second);
    }

    public void equalActionPerformed(ActionEvent e) {
        if (first == "" || second == "") {
            return;
        }
        double f = Double.parseDouble(this.first);
        double s = Double.parseDouble(this.second);
        double result = 0;
        switch (action) {
            case "+": result = f + s; break;
            case "-": result = f - s; break;
            case "/": result = f / s; break;
            case "*": result = f * s; break;
        }
        field.setText(String.valueOf(result));
        action = "";
        first = "";
        second = "";
        operandNumber = 1;
    }

    public void clearActionPerformed(ActionEvent e) {
        field.setText("");
        action = "";
        first = "";
        second = "";
        operandNumber = 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Calculator frame = new Calculator();
            }
        });
    }


}

class ActionActionListener extends AbstractAction {
    private Calculator frame;

    public ActionActionListener(JFrame frame) {
        this.frame = (Calculator) frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = ((JButton) e.getSource()).getText();
        if (frame.getFirst() == "") {
            return;
        }
        if (frame.getSecond() != "" && frame.getOperandNumber() == 2) {
            return;
        }
        frame.setAction(action);
        frame.refreshField();
        frame.setOperandNumber(2);
    }
}

class NumberActionListener extends AbstractAction {
    private Calculator frame;

    public NumberActionListener(JFrame frame) {
        this.frame = (Calculator) frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String digit = ((JButton) e.getSource()).getText();
        if (frame.getOperandNumber() == 1) {
            String f = frame.getFirst();
            frame.setFirst(f + digit);
        } else {
            String f = frame.getSecond();
            frame.setSecond(f + digit);
        }
        frame.refreshField();
    }
}