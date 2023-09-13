package quizapplication;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.darkGray);
        setLayout(null);

        JLabel heading = new JLabel("Welcome  " + name + "  Enjoy Quiz");
        heading.setBounds(50, 20, 700, 50);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 38));
        heading.setForeground(new Color(178, 61, 127));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(50, 80, 700, 500); // Adjusted bounds and location for rules display
        rules.setFont(new Font("Tahona", Font.PLAIN, 16));
        rules.setForeground(Color.WHITE);
        rules.setText("<html>" + "1. Answer all 10 questions; they are all compulsory."
                + "<br><br>" + "2. You have a time limit of 1 minute for each question."
                + "<br><br>" + "3. If you run out of time on a question, it will be automatically submitted."
                + "<br><br>" + "4. Choose your answers wisely, as you cannot go back to previous questions." 
                + "<br><br>"+ "5. Stay focused and avoid distractions during the quiz."
                + "<br><br>"+ "6. Do your best and stay confident; you've got this!"
                + "<br><br>" + "7. Don't be discouraged by difficult questions; give it your best shot." + "<br><br>"
                + "**Remember, it's not just about the score, but the learning experience.**" + "<br><br>"
                + "\tBelieve in yourself, and good luck! You can do it!    "+"<br><br>"
                +"<html>");
        add(rules);
        
        start = new JButton("Start");
        start.setBounds(320, 550, 120, 25);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        back = new JButton("Back");
        back.setBounds(450, 550, 120, 25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000, 700);
        setLocation(200, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }else if(ae.getSource() == back){
            setVisible(false);
            new QuizLogin();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
