package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener{
    Score(String name, int score){
        
        getContentPane().setBackground(Color.WHITE);
        setSize(950, 400);
        setLocation(100, 30);
        setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Score_card.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2); 
        JLabel image = new JLabel(i3);
        image.setBounds(10, 10, 500, 300);
        add(image);
        
        JLabel yscore = new JLabel("Your Score is " +score);
        yscore.setBounds(550,50,250,70);
        yscore.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(yscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(550,165,200,45);
        submit.setFont(new Font("Tahona",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
        setVisible(false);
        new QuizLogin();
    }
    public static void main (String [] args){
        new Score("User",0);
    }
}
