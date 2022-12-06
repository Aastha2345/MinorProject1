import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JFrame;
public class WelcomePage extends JFrame
{
    Frame fObj;
    Button button1, button2, button3, button4, button5, button6, button7;
    Label l1;
    Font f1;
    Font f2;

    WelcomePage() {
        fObj = new Frame ("Digital Telephone Diary");
        button1 = new Button("Insert");
        button2 = new Button("Delete");
        button3 = new Button("Search");
        button4 = new Button("Update");
        button5 = new Button("Display");
        l1 = new Label("Telephone Diary");
        f1 = new Font("Algerian",Font.BOLD,40);
        f2 = new Font("Monospaced",Font.ITALIC,15);
        l1.setFont(f1);
        fObj.add(l1);
        button1.setFont(f2);
        button2.setFont(f2);
        button3.setFont(f2);
        button4.setFont(f2);
        button5.setFont(f2);
        fObj.add(button1);
        fObj.add(button2);
        fObj.add(button3);
        fObj.add(button4);
        fObj.add(button5);
        fObj.setLayout(new FlowLayout(FlowLayout.CENTER,1920,60));
        fObj.setSize(300,400);
        fObj.setVisible(true);
    }

    public static void main (String args[])
    {
        new Menu();
    }
}






















/*import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Telephone Diary");

    WelcomePage(){
        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
*/