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
        frame = new JFrame("Simple Calculator"); // frame with the title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the app when X is clicked
        frame.setSize(420,520); // size of the frame
        frame.setLayout(null); // no layout manager used for the frame
        frame.setVisible(true); // display frame
    }

    public static void main(String[] args) {
    Calculator calculator = new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
