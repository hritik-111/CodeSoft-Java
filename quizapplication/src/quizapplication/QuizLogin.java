package quizapplication;

import java.awt.*;
import static java.awt.Font.BOLD;
import javax.swing.*;
import java.awt.event.*;

public class QuizLogin extends JFrame implements ActionListener{
    JButton rules, back;
    JTextField tfname;
    QuizLogin(){
        getContentPane().setBackground(Color.darkGray);
        setLayout(null);
        //Image for quiz
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz_icon.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 500, 500);
        add(image);
        
        //Heading
        JLabel heading = new JLabel("Enjoy Quiz");
        heading.setBounds(630, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", BOLD, 40));
        heading.setForeground(new Color(178, 61, 127));
        add(heading);
        
        //name innput
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(670, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", BOLD, 20));
        name.setForeground(new Color(178, 61, 127));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(620, 200, 300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tfname);
        
        //rules button
        rules = new JButton("Rules");
        rules.setBounds(790,250,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        //Back Button
        back = new JButton("Back");
        back.setBounds(640,250,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        setVisible(true); // So that the frame is visible
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules ){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }  else if(ae.getSource() == back) {
            setVisible(false);
        }     
    }
    public static void main(String[] args){
        new QuizLogin();     //anonymous object
    }    
}
