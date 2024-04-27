import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.awt.Container;
import javax.swing.BorderFactory;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class Donorregistration extends JFrame implements ActionListener
{
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JPanel p5;
    JPanel p6;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton btnadd;
    JButton btnview;
    JButton btnupdate;
    JButton btnbloodtest;
    JButton btnsave;
    JButton btnclear;
    JButton btnmodify;
    JButton btndelete;
    JLabel lblid;
    JLabel lbldate;
    JLabel lblname;
    JLabel lblage;
    JLabel lblbloodgroup;
    JLabel lblgender;
    JLabel lblemail;
    JLabel lblmobno;
    JLabel lbladdress;
    JLabel lbldistrict;
    JLabel lblstate;
    JLabel lblcountry;
    JLabel lbltitle;
    JLabel lblgetid;
    JLabel lblgetdate;
    JLabel lblgetname;
    JLabel lblgetage;
    JLabel lblgetbloodgroup;
    JLabel lblgetgender;
    JLabel lblgetemail;
    JLabel lblgetmobno;
    JLabel lblgetdistrict;
    JLabel lblgetstate;
    JLabel lblgetcountry;
    JTextField txtname;
    JTextField txtage;
    JTextField txtemail;
    JTextField txtmobno;
    JTextField txtstate;
    JTextField txtdistrict;
    JTextField txtcountry;
    JTextArea taaddress;
    JTextArea tagetaddress;
    JComboBox cbbloodgroup;
    JComboBox cbgender;
    JComboBox cbid;
    JScrollPane sp1;
    JScrollPane sp2;
    DateComboBox cbdate;
    SQL db;
    Common cm;
    int comboval;
    
    public Donorregistration() {
        this.db = new SQL();
        this.cm = new Common();
        this.comboval = 0;
        final ImagePanel comp = new ImagePanel(new ImageIcon("image/header.jpg").getImage());
        final ImagePanel imagePanel = new ImagePanel(new ImageIcon("image/background.jpg").getImage());
        final ImagePanel comp2 = new ImagePanel(new ImageIcon("image/side.jpg").getImage());
        final Container contentPane = this.getContentPane();
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        this.p4 = new JPanel();
        this.p5 = new JPanel();
        this.p6 = new JPanel();
        contentPane.setLayout(null);
        this.p1.setLayout(null);
        this.p2.setLayout(null);
        this.p3.setLayout(null);
        this.p4.setLayout(null);
        this.p5.setLayout(null);
        this.p6.setLayout(null);
        this.p1.setBounds(0, 0, 1024, 150);
        this.p2.setBounds(0, 150, 1024, 30);
        this.p3.setBounds(0, 180, 224, 588);
        this.p4.setBounds(224, 180, 800, 588);
        this.p5.setBounds(224, 180, 800, 78);
        this.p6.setBounds(224, 258, 800, 510);
        this.p4.setBackground(Color.white);
        this.p5.setBackground(Color.white);
        this.p6.setBackground(Color.white);
        this.b1 = new JButton("Home");
        this.b2 = new JButton("Donor Registration");
        this.b3 = new JButton("Blood Stock Management");
        this.b4 = new JButton("Purchase");
        this.b5 = new JButton("Logout");
        this.b1.setBackground(Color.lightGray);
        this.b2.setBackground(Color.white);
        this.b3.setBackground(Color.lightGray);
        this.b4.setBackground(Color.lightGray);
        this.b5.setBackground(Color.lightGray);
        this.b1.setBounds(0, 0, 205, 30);
        this.b2.setBounds(205, 0, 205, 30);
        this.b3.setBounds(410, 0, 205, 30);
        this.b4.setBounds(615, 0, 205, 30);
        this.b5.setBounds(820, 0, 204, 30);
        (this.btnadd = new JButton("Add Details")).setFont(new Font("Verdana", 0, 12));
        (this.btnview = new JButton("View Details")).setFont(new Font("Verdana", 0, 12));
        (this.btnupdate = new JButton("Edit Details")).setFont(new Font("Verdana", 0, 12));
        (this.btnbloodtest = new JButton("Blood Test")).setFont(new Font("Verdana", 0, 12));
        this.btnadd.setBounds(20, 50, 180, 30);
        this.btnview.setBounds(20, 100, 180, 30);
        this.btnupdate.setBounds(20, 150, 180, 30);
        this.btnbloodtest.setBounds(20, 200, 180, 30);
        this.btnadd.setBackground(Color.lightGray);
        this.btnview.setBackground(Color.lightGray);
        this.btnupdate.setBackground(Color.lightGray);
        this.btnbloodtest.setBackground(Color.lightGray);
        (this.lbltitle = new JLabel("")).setFont(new Font("Verdana", 1, 16));
        (this.lblid = new JLabel("Donor ID:")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetid = new JLabel("")).setFont(new Font("Verdana", 1, 12));
        (this.cbid = new JComboBox()).addItem("Select");
        try {
            final ResultSet exeQuery = this.db.exeQuery("select did from donor order by did ASC");
            while (exeQuery.next()) {
                this.cbid.addItem(exeQuery.getString(1));
            }
        }
        catch (Exception ex) {}
        this.cbid.setBackground(Color.white);
        (this.lbldate = new JLabel("Date:")).setFont(new Font("Verdana", 0, 12));
        (this.cbdate = new DateComboBox()).setBackground(Color.white);
        (this.lblname = new JLabel("Name:")).setFont(new Font("Verdana", 0, 12));
        this.txtname = new JTextField();
        (this.lblage = new JLabel("Age:")).setFont(new Font("Verdana", 0, 12));
        this.txtage = new JTextField();
        (this.lblbloodgroup = new JLabel("Blood Group:")).setFont(new Font("Verdana", 0, 12));
        (this.cbbloodgroup = new JComboBox()).addItem("select");
        this.cbbloodgroup.addItem("A+");
        this.cbbloodgroup.addItem("A-");
        this.cbbloodgroup.addItem("B+");
        this.cbbloodgroup.addItem("B-");
        this.cbbloodgroup.addItem("O+");
        this.cbbloodgroup.addItem("O-");
        this.cbbloodgroup.addItem("AB+");
        this.cbbloodgroup.addItem("AB-");
        this.cbbloodgroup.setBackground(Color.white);
        (this.lblgender = new JLabel("Gender:")).setFont(new Font("Verdana", 0, 12));
        (this.cbgender = new JComboBox()).addItem("select");
        this.cbgender.addItem("Male");
        this.cbgender.addItem("Female");
        this.cbgender.setBackground(Color.white);
        (this.lblemail = new JLabel("Email:")).setFont(new Font("Verdana", 0, 12));
        this.txtemail = new JTextField();
        (this.lblmobno = new JLabel("Mobile No.:")).setFont(new Font("Verdana", 0, 12));
        this.txtmobno = new JTextField();
        (this.lbladdress = new JLabel("Address:")).setFont(new Font("Verdana", 0, 12));
        this.taaddress = new JTextArea();
        this.sp1 = new JScrollPane(this.taaddress);
        (this.lbldistrict = new JLabel("District:")).setFont(new Font("Verdana", 0, 12));
        this.txtdistrict = new JTextField();
        (this.lblstate = new JLabel("State:")).setFont(new Font("Verdana", 0, 12));
        this.txtstate = new JTextField();
        (this.lblcountry = new JLabel("Country:")).setFont(new Font("Verdana", 0, 12));
        this.txtcountry = new JTextField();
        this.btnsave = new JButton("Save");
        this.btnclear = new JButton("Clear");
        this.btnmodify = new JButton("Modify");
        this.btndelete = new JButton("Delete");
        this.lbltitle.setBounds(300, 10, 180, 20);
        this.lblid.setBounds(240, 50, 100, 20);
        this.lblgetid.setBounds(370, 50, 150, 20);
        this.cbid.setBounds(370, 50, 90, 20);
        this.lbldate.setBounds(240, 10, 100, 20);
        this.cbdate.setBounds(370, 10, 90, 20);
        this.lblname.setBounds(240, 40, 100, 20);
        this.txtname.setBounds(370, 40, 150, 20);
        this.lblage.setBounds(240, 70, 100, 20);
        this.txtage.setBounds(370, 70, 150, 20);
        this.lblbloodgroup.setBounds(240, 100, 100, 20);
        this.cbbloodgroup.setBounds(370, 100, 150, 20);
        this.lblgender.setBounds(240, 130, 100, 20);
        this.cbgender.setBounds(370, 130, 150, 20);
        this.lblemail.setBounds(240, 160, 100, 20);
        this.txtemail.setBounds(370, 160, 150, 20);
        this.lblmobno.setBounds(240, 190, 100, 20);
        this.txtmobno.setBounds(370, 190, 150, 20);
        this.lbladdress.setBounds(240, 220, 100, 20);
        this.sp1.setBounds(370, 220, 150, 50);
        this.lbldistrict.setBounds(240, 280, 100, 20);
        this.txtdistrict.setBounds(370, 280, 150, 20);
        this.lblstate.setBounds(240, 310, 100, 20);
        this.txtstate.setBounds(370, 310, 150, 20);
        this.lblcountry.setBounds(240, 340, 100, 20);
        this.txtcountry.setBounds(370, 340, 150, 20);
        this.btnsave.setBounds(320, 390, 90, 24);
        this.btnclear.setBounds(430, 390, 90, 24);
        this.btnmodify.setBounds(320, 390, 90, 24);
        this.btndelete.setBounds(210, 390, 90, 24);
        (this.lblgetdate = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetname = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetage = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetbloodgroup = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetgender = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetemail = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetmobno = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        this.tagetaddress = new JTextArea();
        (this.sp2 = new JScrollPane(this.tagetaddress)).setBorder(BorderFactory.createEmptyBorder());
        (this.lblgetdistrict = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetstate = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetcountry = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        this.lblgetdate.setBounds(370, 10, 150, 20);
        this.lblgetname.setBounds(370, 40, 150, 20);
        this.lblgetage.setBounds(370, 70, 150, 20);
        this.lblgetbloodgroup.setBounds(370, 100, 150, 20);
        this.lblgetgender.setBounds(370, 130, 150, 20);
        this.lblgetemail.setBounds(370, 160, 150, 20);
        this.lblgetmobno.setBounds(370, 190, 150, 20);
        this.sp2.setBounds(370, 220, 150, 50);
        this.lblgetdistrict.setBounds(370, 280, 150, 20);
        this.lblgetstate.setBounds(370, 310, 150, 20);
        this.lblgetcountry.setBounds(370, 340, 150, 20);
        this.p1.add(comp);
        this.p2.add(this.b1);
        this.p2.add(this.b2);
        this.p2.add(this.b3);
        this.p2.add(this.b4);
        this.p2.add(this.b5);
        comp2.add(this.btnadd);
        comp2.add(this.btnview);
        comp2.add(this.btnupdate);
        comp2.add(this.btnbloodtest);
        this.p3.add(comp2);
        this.p5.add(this.lbltitle);
        this.p5.add(this.lblid);
        this.p5.add(this.lblgetid);
        this.p5.add(this.cbid);
        this.p6.add(this.lbldate);
        this.p6.add(this.cbdate);
        this.p6.add(this.lblname);
        this.p6.add(this.txtname);
        this.p6.add(this.lblage);
        this.p6.add(this.txtage);
        this.p6.add(this.lblbloodgroup);
        this.p6.add(this.cbbloodgroup);
        this.p6.add(this.lblgender);
        this.p6.add(this.cbgender);
        this.p6.add(this.lblemail);
        this.p6.add(this.txtemail);
        this.p6.add(this.lblmobno);
        this.p6.add(this.txtmobno);
        this.p6.add(this.lbladdress);
        this.p6.add(this.sp1);
        this.p6.add(this.lbldistrict);
        this.p6.add(this.txtdistrict);
        this.p6.add(this.lblstate);
        this.p6.add(this.txtstate);
        this.p6.add(this.lblcountry);
        this.p6.add(this.txtcountry);
        this.p6.add(this.btnsave);
        this.p6.add(this.btnclear);
        this.p6.add(this.btnmodify);
        this.p6.add(this.btndelete);
        this.p6.add(this.lblgetdate);
        this.p6.add(this.lblgetname);
        this.p6.add(this.lblgetage);
        this.p6.add(this.lblgetbloodgroup);
        this.p6.add(this.lblgetgender);
        this.p6.add(this.lblgetemail);
        this.p6.add(this.lblgetmobno);
        this.p6.add(this.sp2);
        this.p6.add(this.lblgetdistrict);
        this.p6.add(this.lblgetstate);
        this.p6.add(this.lblgetcountry);
        contentPane.add(this.p1);
        contentPane.add(this.p2);
        contentPane.add(this.p3);
        contentPane.add(this.p4);
        contentPane.add(this.p5);
        contentPane.add(this.p6);
        this.setSize(1024, 768);
        this.setVisible(true);
        this.setTitle("Donor Registration");
        this.setResizable(false);
        this.p5.setVisible(false);
        this.p6.setVisible(false);
        this.tagetaddress.setEditable(false);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);
        this.b5.addActionListener(this);
        this.btnadd.addActionListener(this);
        this.btnview.addActionListener(this);
        this.btnupdate.addActionListener(this);
        this.btnbloodtest.addActionListener(this);
        this.btnsave.addActionListener(this);
        this.btnclear.addActionListener(this);
        this.btnmodify.addActionListener(this);
        this.btndelete.addActionListener(this);
        this.cbid.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.b1) {
            this.dispose();
            new Home();
        }
        if (actionEvent.getSource() == this.b2) {}
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
        if (actionEvent.getSource() == this.btnadd) {
            this.comboval = 0;
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.p6.setVisible(true);
            this.lbltitle.setText("Add Donor Details");
            this.btnadd.setBackground(Color.white);
            this.btnview.setBackground(Color.lightGray);
            this.btnupdate.setBackground(Color.lightGray);
            this.clear('a');
            this.visible('a');
            this.lblid.setVisible(true);
            this.lblgetid.setVisible(true);
            this.cbid.setVisible(false);
            try {
                final ResultSet exeQuery = this.db.exeQuery("select COALESCE(max(did)+1,1) from donor");
                if (exeQuery.next()) {
                    this.lblgetid.setText(String.valueOf(exeQuery.getInt(1)));
                }
            }
            catch (Exception ex) {}
        }
        if (actionEvent.getSource() == this.btnview) {
            this.comboval = 1;
            this.clear('u');
            if (this.cbid.getItemCount() > 1) {
                this.cbid.removeActionListener(this);
                this.cbid.setSelectedIndex(0);
                this.cbid.addActionListener(this);
            }
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.p6.setVisible(true);
            this.lbltitle.setText("View Donor Details");
            this.btnadd.setBackground(Color.lightGray);
            this.btnview.setBackground(Color.white);
            this.btnupdate.setBackground(Color.lightGray);
            this.lblid.setVisible(true);
            this.lblgetid.setVisible(false);
            this.cbid.setVisible(true);
        }
        if (actionEvent.getSource() == this.btnupdate) {
            this.comboval = 2;
            this.clear('u');
            if (this.cbid.getItemCount() > 1) {
                this.cbid.removeActionListener(this);
                this.cbid.setSelectedIndex(0);
                this.cbid.addActionListener(this);
            }
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.p6.setVisible(true);
            this.lbltitle.setText("Edit Donor Details");
            this.btnadd.setBackground(Color.lightGray);
            this.btnview.setBackground(Color.lightGray);
            this.btnupdate.setBackground(Color.white);
            this.lblid.setVisible(true);
            this.lblgetid.setVisible(false);
            this.cbid.setVisible(true);
        }
        if (actionEvent.getSource() == this.btnbloodtest) {
            this.dispose();
            new Bloodtest();
        }
        if (actionEvent.getSource() == this.btnsave) {
            final String string = this.cbdate.getSelectedItem().toString();
            final String trim = this.txtname.getText().trim();
            final String trim2 = this.txtage.getText().trim();
            final String string2 = this.cbbloodgroup.getSelectedItem().toString();
            final String string3 = this.cbgender.getSelectedItem().toString();
            final String trim3 = this.txtemail.getText().trim();
            final String trim4 = this.txtmobno.getText().trim();
            final String trim5 = this.taaddress.getText().trim();
            final String trim6 = this.txtdistrict.getText().trim();
            final String trim7 = this.txtstate.getText().trim();
            final String trim8 = this.txtcountry.getText().trim();
            final String validate = this.cm.validate(new String[][] { { "Name", trim }, { "Age", trim2 }, { "a Blood Group", string2, this.cbbloodgroup.getItemAt(0).toString().trim() }, { "a Gender", string3, this.cbgender.getItemAt(0).toString().trim() }, { "Email", trim3 }, { "Mobile No.", trim4 }, { "Address", trim5 }, { "District", trim6 }, { "State", trim7 }, { "Country", trim8 } }, new int[] { 1, 4, 5, 5, 7, 1, 1, 1, 1, 1 }, new Component[] { this.txtname, this.txtage, this.cbbloodgroup, this.cbgender, this.txtemail, this.txtmobno, this.taaddress, this.txtdistrict, this.txtstate, this.txtcountry });
            if (!validate.trim().equals("")) {
                JOptionPane.showMessageDialog(null, validate, "Validation", 2);
            }
            else if (this.db.exeUpdate("insert into donor(date,name,age,bgroup,gender,email,mobno,address,district,state,country) values('" + string + "','" + trim + "'," + Integer.parseInt(trim2) + ",'" + string2 + "','" + string3 + "','" + trim3 + "','" + trim4 + "','" + trim5 + "','" + trim6 + "','" + trim7 + "','" + trim8 + "')") > 0) {
                JOptionPane.showMessageDialog(null, "Details of " + trim + " added successfully", "Successfully Registered", 1);
                this.clear('c');
                this.cbid.removeActionListener(this);
                this.cbid.removeAllItems();
                this.cbid.addItem("Select");
                try {
                    final ResultSet exeQuery2 = this.db.exeQuery("select did from donor order by did ASC");
                    while (exeQuery2.next()) {
                        this.cbid.addItem(String.valueOf(exeQuery2.getInt(1)));
                    }
                }
                catch (Exception ex2) {}
                this.cbid.addActionListener(this);
                try {
                    final ResultSet exeQuery3 = this.db.exeQuery("select COALESCE(max(did)+1,1) from donor");
                    if (exeQuery3.next()) {
                        this.lblgetid.setText(String.valueOf(exeQuery3.getInt(1)));
                    }
                }
                catch (Exception ex3) {}
            }
        }
        if (actionEvent.getSource() == this.btnmodify) {
            this.cbdate.getSelectedItem().toString();
            final String trim9 = this.txtname.getText().trim();
            final String trim10 = this.txtage.getText().trim();
            final String string4 = this.cbbloodgroup.getSelectedItem().toString();
            final String string5 = this.cbgender.getSelectedItem().toString();
            final String trim11 = this.txtemail.getText().trim();
            final String trim12 = this.txtmobno.getText().trim();
            final String trim13 = this.taaddress.getText().trim();
            final String trim14 = this.txtdistrict.getText().trim();
            final String trim15 = this.txtstate.getText().trim();
            final String trim16 = this.txtcountry.getText().trim();
            final String validate2 = this.cm.validate(new String[][] { { "Name", trim9 }, { "Age", trim10 }, { "a Blood Group", string4, this.cbbloodgroup.getItemAt(0).toString().trim() }, { "a Gender", string5, this.cbgender.getItemAt(0).toString().trim() }, { "Email", trim11 }, { "Mobile No.", trim12 }, { "Address", trim13 }, { "District", trim14 }, { "State", trim15 }, { "Country", trim16 } }, new int[] { 1, 4, 5, 5, 7, 1, 1, 1, 1, 1 }, new Component[] { this.txtname, this.txtage, this.cbbloodgroup, this.cbgender, this.txtemail, this.txtmobno, this.taaddress, this.txtdistrict, this.txtstate, this.txtcountry });
            if (!validate2.trim().equals("")) {
                JOptionPane.showMessageDialog(null, validate2, "Validation", 2);
            }
            else {
                Integer.parseInt(trim10);
                final String trim17 = this.cbid.getSelectedItem().toString().trim();
                if (!trim17.equals("Select")) {
                    if (this.db.exeUpdate("UPDATE donor SET name='" + trim9 + "',age=age,bgroup='" + string4 + "',gender='" + string5 + "',email='" + trim11 + "',mobno='" + trim12 + "',address='" + trim13 + "',district='" + trim14 + "',state='" + trim15 + "',country='" + trim16 + "' WHERE  did=" + Integer.parseInt(trim17)) > 0) {
                        JOptionPane.showMessageDialog(null, "Details of " + trim9 + " updated successfully", "Successfully Updated", 1);
                    }
                    this.clear('u');
                    this.cbid.removeActionListener(this);
                    this.cbid.setSelectedIndex(0);
                    this.cbid.addActionListener(this);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Error updating details", "Error", 2);
                }
            }
        }
        if (actionEvent.getSource() == this.btndelete) {
            final String trim18 = this.cbid.getSelectedItem().toString().trim();
            final String trim19 = this.txtname.getText().trim();
            int int1 = 0;
            if (!trim18.equals("Select")) {
                final int int2 = Integer.parseInt(trim18);
                try {
                    final ResultSet exeQuery4 = this.db.exeQuery("select count(donorid) from bloodstock WHERE donorid=" + int2);
                    exeQuery4.next();
                    int1 = exeQuery4.getInt(1);
                }
                catch (Exception ex4) {}
                if (int1 > 0) {
                    JOptionPane.showMessageDialog(null, "Details of this donor is used in the blood stock!", "No delete permission", 0);
                }
                else if (int1 == 0) {
                    if (this.db.exeUpdate("DELETE FROM donor WHERE  did=" + int2) > 0) {
                        JOptionPane.showMessageDialog(null, "Details of " + trim19 + " deleted successfully", "Successfully Deleted", 1);
                    }
                    this.clear('u');
                    this.cbid.removeActionListener(this);
                    this.cbid.removeAllItems();
                    this.cbid.addItem("Select");
                    try {
                        final ResultSet exeQuery5 = this.db.exeQuery("select did from donor order by did ASC");
                        while (exeQuery5.next()) {
                            this.cbid.addItem(String.valueOf(exeQuery5.getInt(1)));
                        }
                    }
                    catch (Exception ex5) {}
                    this.cbid.addActionListener(this);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Error updating details", "Error", 2);
            }
        }
        if (actionEvent.getSource() == this.btnclear) {
            this.clear('c');
        }
        if (actionEvent.getSource() == this.cbid) {
            final String trim20 = this.cbid.getSelectedItem().toString().trim();
            if (trim20.equals("Select")) {
                this.clear('u');
            }
            else {
                final int int3 = Integer.parseInt(trim20);
                String string6 = "";
                String string7 = "";
                String string8 = "";
                String string9 = "";
                String string10 = "";
                String string11 = "";
                String string12 = "";
                String string13 = "";
                String string14 = "";
                String string15 = "";
                String string16 = "";
                try {
                    final ResultSet exeQuery6 = this.db.exeQuery("select date,name,age,bgroup,gender,email,mobno,address,district,state,country from donor where did=" + int3);
                    exeQuery6.next();
                    string6 = exeQuery6.getString(1);
                    string7 = exeQuery6.getString(2);
                    string8 = exeQuery6.getString(3);
                    string9 = exeQuery6.getString(4);
                    string10 = exeQuery6.getString(5);
                    string11 = exeQuery6.getString(6);
                    string12 = exeQuery6.getString(7);
                    string13 = exeQuery6.getString(8);
                    string14 = exeQuery6.getString(9);
                    string15 = exeQuery6.getString(10);
                    string16 = exeQuery6.getString(11);
                }
                catch (Exception ex6) {}
                this.visible('c');
                if (this.comboval == 1) {
                    this.lblgetdate.setText(string6);
                    this.lblgetname.setText(string7);
                    this.lblgetage.setText(string8);
                    this.lblgetbloodgroup.setText(string9);
                    this.lblgetgender.setText(string10);
                    this.lblgetemail.setText(string11);
                    this.lblgetmobno.setText(string12);
                    this.tagetaddress.setText(string13);
                    this.lblgetdistrict.setText(string14);
                    this.lblgetstate.setText(string15);
                    this.lblgetcountry.setText(string16);
                    this.visible('v');
                }
                else if (this.comboval == 2) {
                    this.clear('c');
                    this.lblgetdate.setText(string6);
                    this.txtname.setText(string7);
                    this.txtage.setText(string8);
                    if (string9.equals("A+")) {
                        this.cbbloodgroup.setSelectedIndex(1);
                    }
                    else if (string9.equals("A-")) {
                        this.cbbloodgroup.setSelectedIndex(2);
                    }
                    else if (string9.equals("B+")) {
                        this.cbbloodgroup.setSelectedIndex(3);
                    }
                    else if (string9.equals("B-")) {
                        this.cbbloodgroup.setSelectedIndex(4);
                    }
                    else if (string9.equals("O+")) {
                        this.cbbloodgroup.setSelectedIndex(5);
                    }
                    else if (string9.equals("O-")) {
                        this.cbbloodgroup.setSelectedIndex(6);
                    }
                    else if (string9.equals("AB+")) {
                        this.cbbloodgroup.setSelectedIndex(7);
                    }
                    if (string10.equals("Male")) {
                        this.cbgender.setSelectedIndex(1);
                    }
                    else if (string10.equals("Female")) {
                        this.cbgender.setSelectedIndex(2);
                    }
                    this.txtemail.setText(string11);
                    this.txtmobno.setText(string12);
                    this.taaddress.setText(string13);
                    this.txtdistrict.setText(string14);
                    this.txtstate.setText(string15);
                    this.txtcountry.setText(string16);
                    this.visible('e');
                }
            }
        }
    }
    
    public void clear(final char c) {
        switch (c) {
            case 'a': {
                this.lblgetdate.setVisible(false);
                this.lblgetname.setVisible(false);
                this.lblgetage.setVisible(false);
                this.lblgetbloodgroup.setVisible(false);
                this.lblgetgender.setVisible(false);
                this.lblgetemail.setVisible(false);
                this.lblgetmobno.setVisible(false);
                this.taaddress.setEditable(true);
                this.lblgetdistrict.setVisible(false);
                this.lblgetstate.setVisible(false);
                this.lblgetcountry.setVisible(false);
                this.btnmodify.setVisible(false);
                this.btndelete.setVisible(false);
                this.clear('c');
                break;
            }
            case 'u': {
                this.lbldate.setVisible(false);
                this.cbdate.setVisible(false);
                this.lblname.setVisible(false);
                this.txtname.setVisible(false);
                this.lblage.setVisible(false);
                this.txtage.setVisible(false);
                this.lblbloodgroup.setVisible(false);
                this.cbbloodgroup.setVisible(false);
                this.lblgender.setVisible(false);
                this.cbgender.setVisible(false);
                this.lblemail.setVisible(false);
                this.txtemail.setVisible(false);
                this.lblmobno.setVisible(false);
                this.txtmobno.setVisible(false);
                this.lbladdress.setVisible(false);
                this.sp1.setVisible(false);
                this.lbldistrict.setVisible(false);
                this.txtdistrict.setVisible(false);
                this.lblstate.setVisible(false);
                this.txtstate.setVisible(false);
                this.lblcountry.setVisible(false);
                this.txtcountry.setVisible(false);
                this.btnsave.setVisible(false);
                this.btnclear.setVisible(false);
                this.btnmodify.setVisible(false);
                this.btndelete.setVisible(false);
                this.lblgetdate.setVisible(false);
                this.lblgetname.setVisible(false);
                this.lblgetage.setVisible(false);
                this.lblgetbloodgroup.setVisible(false);
                this.lblgetgender.setVisible(false);
                this.lblgetemail.setVisible(false);
                this.lblgetmobno.setVisible(false);
                this.sp2.setVisible(false);
                this.lblgetdistrict.setVisible(false);
                this.lblgetstate.setVisible(false);
                this.lblgetcountry.setVisible(false);
                this.lblgetdate.setText("");
                this.lblgetname.setText("");
                this.lblgetage.setText("");
                this.lblgetbloodgroup.setText("");
                this.lblgetgender.setText("");
                this.lblgetemail.setText("");
                this.lblgetmobno.setText("");
                this.tagetaddress.setText("");
                this.lblgetdistrict.setText("");
                this.lblgetstate.setText("");
                this.lblgetcountry.setText("");
                break;
            }
            case 'c': {
                this.txtname.setText("");
                this.txtage.setText("");
                this.cbbloodgroup.setSelectedIndex(0);
                this.cbgender.setSelectedIndex(0);
                this.txtemail.setText("");
                this.txtmobno.setText("");
                this.taaddress.setText("");
                this.txtdistrict.setText("");
                this.txtstate.setText("");
                this.txtcountry.setText("");
                this.txtname.setBackground(Color.white);
                this.txtage.setBackground(Color.white);
                this.cbbloodgroup.setBackground(Color.white);
                this.cbgender.setBackground(Color.white);
                this.txtemail.setBackground(Color.white);
                this.txtmobno.setBackground(Color.white);
                this.taaddress.setBackground(Color.white);
                this.txtdistrict.setBackground(Color.white);
                this.txtstate.setBackground(Color.white);
                this.txtcountry.setBackground(Color.white);
                break;
            }
        }
    }
    
    public void visible(final char c) {
        switch (c) {
            case 'a': {
                this.lbldate.setVisible(true);
                this.cbdate.setVisible(true);
                this.lblname.setVisible(true);
                this.txtname.setVisible(true);
                this.lblage.setVisible(true);
                this.txtage.setVisible(true);
                this.lblbloodgroup.setVisible(true);
                this.cbbloodgroup.setVisible(true);
                this.lblgender.setVisible(true);
                this.cbgender.setVisible(true);
                this.lblemail.setVisible(true);
                this.txtemail.setVisible(true);
                this.lblmobno.setVisible(true);
                this.txtmobno.setVisible(true);
                this.lbladdress.setVisible(true);
                this.sp1.setVisible(true);
                this.lbldistrict.setVisible(true);
                this.txtdistrict.setVisible(true);
                this.lblstate.setVisible(true);
                this.txtstate.setVisible(true);
                this.lblcountry.setVisible(true);
                this.txtcountry.setVisible(true);
                this.btnsave.setVisible(true);
                this.btnclear.setVisible(true);
                break;
            }
            case 'c': {
                this.lbldate.setVisible(true);
                this.lblgetdate.setVisible(true);
                this.lblname.setVisible(true);
                this.lblage.setVisible(true);
                this.lblbloodgroup.setVisible(true);
                this.lblgender.setVisible(true);
                this.lblemail.setVisible(true);
                this.lblmobno.setVisible(true);
                this.lbladdress.setVisible(true);
                this.lbldistrict.setVisible(true);
                this.lblstate.setVisible(true);
                this.lblcountry.setVisible(true);
                break;
            }
            case 'v': {
                this.lblgetname.setVisible(true);
                this.lblgetage.setVisible(true);
                this.lblgetbloodgroup.setVisible(true);
                this.lblgetgender.setVisible(true);
                this.lblgetemail.setVisible(true);
                this.lblgetmobno.setVisible(true);
                this.sp2.setVisible(true);
                this.lblgetdistrict.setVisible(true);
                this.lblgetstate.setVisible(true);
                this.lblgetcountry.setVisible(true);
                break;
            }
            case 'e': {
                this.txtname.setVisible(true);
                this.txtage.setVisible(true);
                this.cbbloodgroup.setVisible(true);
                this.cbgender.setVisible(true);
                this.txtemail.setVisible(true);
                this.txtmobno.setVisible(true);
                this.sp1.setVisible(true);
                this.txtdistrict.setVisible(true);
                this.txtstate.setVisible(true);
                this.txtcountry.setVisible(true);
                this.btnmodify.setVisible(true);
                this.btndelete.setVisible(true);
                this.btnclear.setVisible(true);
                break;
            }
        }
    }
    
    public static void main(final String[] array) {
    }
}
