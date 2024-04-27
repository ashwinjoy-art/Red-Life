import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class Login extends JFrame implements ActionListener
{
    JLabel lblusername;
    JLabel lblpassword;
    JTextField txtusername;
    JPasswordField txtpassword;
    JButton btnlogin;
    JButton btncancel;
    SQL db;
    Common cm;
    
    public Login() {
        this.db = new SQL();
        this.cm = new Common();
        final Container contentPane = this.getContentPane();
        final JPanel comp = new JPanel();
        contentPane.setLayout(null);
        comp.setLayout(null);
        comp.setBackground(Color.white);
        comp.setBounds(0, 0, 358, 192);
        (this.lblusername = new JLabel("Username")).setFont(new Font("Verdana", 0, 12));
        this.txtusername = new JTextField();
        (this.lblpassword = new JLabel("Password")).setFont(new Font("Verdana", 0, 12));
        this.txtpassword = new JPasswordField();
        (this.btnlogin = new JButton("Login")).setBackground(Color.lightGray);
        this.btnlogin.setFont(new Font("Verdana", 0, 12));
        (this.btncancel = new JButton("Cancel")).setBackground(Color.lightGray);
        this.btncancel.setFont(new Font("Verdana", 0, 12));
        this.lblusername.setBounds(45, 40, 100, 20);
        this.txtusername.setBounds(145, 40, 158, 20);
        this.lblpassword.setBounds(45, 70, 100, 20);
        this.txtpassword.setBounds(145, 70, 158, 20);
        this.btnlogin.setBounds(145, 105, 77, 27);
        this.btncancel.setBounds(226, 105, 77, 27);
        comp.add(this.lblusername);
        comp.add(this.txtusername);
        comp.add(this.lblpassword);
        comp.add(this.txtpassword);
        comp.add(this.btnlogin);
        comp.add(this.btncancel);
        contentPane.add(comp);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setTitle("Red Life");
        this.setVisible(true);
        this.setSize(358, 192);
        this.btnlogin.addActionListener(this);
        this.btncancel.addActionListener(this);
        this.setLocation(((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth() - this.getWidth()) / 2, ((int)Toolkit.getDefaultToolkit().getScreenSize().getHeight() - this.getHeight()) / 2);
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.btnlogin) {
            final String trim = this.txtusername.getText().trim();
            final String trim2 = this.txtpassword.getText().trim();
            final String validate = this.cm.validate(new String[][] { { "Userame", trim }, { "Password", trim2 } }, new int[] { 1, 1 }, new Component[] { this.txtusername, this.txtpassword });
            if (!validate.trim().equals("")) {
                JOptionPane.showMessageDialog(null, validate, "Red Life", 2);
            }
            else {
                final String string = "select * from login where username='" + trim + "' and password='" + trim2 + "'";
                try {
                    if (this.db.exeQuery(string).next()) {
                        JOptionPane.showMessageDialog(null, "Valid User", "Red Life", -1);
                        this.dispose();
                        new Home();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid User, Login again!", "Login Failed", 2);
                    }
                }
                catch (Exception obj) {
                    JOptionPane.showMessageDialog(null, "Problem with database connection" + obj);
                }
            }
        }
        if (actionEvent.getSource() == this.btncancel) {
            System.exit(0);
            this.dispose();
        }
    }
    
    public static void main(final String[] array) {
        new Login();
    }
}
