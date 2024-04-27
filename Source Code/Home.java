import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.Component;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class Home extends JFrame implements ActionListener
{
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    
    public Home() {
        final ImagePanel comp = new ImagePanel(new ImageIcon("image/header.jpg").getImage());
        final ImagePanel comp2 = new ImagePanel(new ImageIcon("image/background.jpg").getImage());
        final Container contentPane = this.getContentPane();
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        contentPane.setLayout(null);
        this.p1.setLayout(null);
        this.p2.setLayout(null);
        this.p3.setLayout(null);
        this.p1.setBounds(0, 0, 1024, 150);
        this.p2.setBounds(0, 150, 1024, 30);
        this.p3.setBounds(0, 180, 1024, 588);
        this.b1 = new JButton("Home");
        this.b2 = new JButton("Donor Registration");
        this.b3 = new JButton("Blood Stock Management");
        this.b4 = new JButton("Purchase");
        this.b5 = new JButton("Logout");
        this.b1.setBackground(Color.white);
        this.b2.setBackground(Color.lightGray);
        this.b3.setBackground(Color.lightGray);
        this.b4.setBackground(Color.lightGray);
        this.b5.setBackground(Color.lightGray);
        this.b1.setBounds(0, 0, 205, 30);
        this.b2.setBounds(205, 0, 205, 30);
        this.b3.setBounds(410, 0, 205, 30);
        this.b4.setBounds(615, 0, 205, 30);
        this.b5.setBounds(820, 0, 204, 30);
        this.p1.add(comp);
        this.p2.add(this.b1);
        this.p2.add(this.b2);
        this.p2.add(this.b3);
        this.p2.add(this.b4);
        this.p2.add(this.b5);
        this.p3.add(comp2);
        this.setSize(1024, 768);
        this.setVisible(true);
        this.setTitle("Red Life");
        this.setResizable(false);
        contentPane.add(this.p1);
        contentPane.add(this.p2);
        contentPane.add(this.p3);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);
        this.b5.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.b1) {
            this.dispose();
            new Home();
        }
        if (actionEvent.getSource() == this.b2) {
            this.dispose();
            new Donorregistration();
        }
        if (actionEvent.getSource() == this.b3) {
            this.dispose();
            new Bloodstockmanagement();
        }
        if (actionEvent.getSource() == this.b4) {
            this.dispose();
            new Purchase();
        }
        if (actionEvent.getSource() == this.b5) {
            System.exit(0);
        }
    }
    
    public static void main(final String[] array) {
    }
}
