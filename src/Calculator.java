import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame; // frame of the GUI
    JTextField textField; // text field to enter numbers
    JButton[] numberButtons = new JButton[10]; // buttons to display a number
    JButton[] functionButtons = new JButton[8]; // functionality buttons
    JButton addButton,subButton,mulButton,divButton
    ,decButton,equButton,delButton,clrButton;
    JPanel panel; // panel to contain the buttons


    Font myFont = new Font("Ink Free",Font.BOLD,30); // reuseable font
    double num1= 0,num2 = 0,result = 0; // two variables to hold the user input and 1 to hold the result.

    char operator; // hold the operator symbol for the equation

    Calculator()
    {
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,520);
        frame.setLayout(null);

        textField=new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        for (int i=0; i < functionButtons.length;i++)
        {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        for (int i=0; i < numberButtons.length;i++)
        {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        delButton.setBounds(50,400,145,50);
        clrButton.setBounds(205,400,145,50);
        frame.add(delButton );
        frame.add(clrButton);
        frame.add(textField);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
    Calculator calculator = new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
