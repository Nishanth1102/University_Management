package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    About(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/about.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(270,0,500,220);
        add(img);

        JLabel heading = new JLabel("<html> THREE                             </br> </br> </n>TECHNICAL UNIVERSITY</html>");
        heading.setBounds(70,20,300,130);
        heading.setFont(new Font("Tahoma", Font.BOLD,30));
        add(heading);

        JLabel name = new JLabel("Nishanth \n ");
        name.setBounds(60,270,550,40);
        name.setFont(new Font("Tahoma", Font.BOLD,30));
        add(name);

        JLabel name1 = new JLabel("Shamanth \n ");
        name1.setBounds(60,310,550,40);
        name1.setFont(new Font("Tahoma", Font.BOLD,30));
        add(name1);

        JLabel contact = new JLabel("Pramod \n ");
        contact.setBounds(60,350,550,40);
        contact.setFont(new Font("Tahoma", Font.BOLD,30));
        add(contact);

        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(new Color(255,235,205));
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new About();
    }
}