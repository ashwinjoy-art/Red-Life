import javax.swing.JOptionPane;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.table.JTableHeader;
import java.sql.ResultSet;
import java.awt.Container;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.table.TableModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class Bloodstockmanagement extends JFrame implements ActionListener
{
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JPanel p5;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton btnadd;
    JButton btnview;
    JButton btnupdate;
    JButton btnsave;
    JButton btnclear;
    JButton btnmodify;
    JButton btndelete;
    JLabel lbltitle;
    JLabel lblstockid;
    JLabel lbldate;
    JLabel lblbloodgroup;
    JLabel lblquantity;
    JLabel lbldonorid;
    JLabel lbldonorname;
    JLabel lblbloodtestid;
    JLabel lblgetstockid;
    JLabel lblgetdonorname;
    JLabel lblgetdate;
    JLabel lbltestmsg;
    JLabel lbldonoridmsg;
    JLabel lblunit;
    JComboBox cbbloodgroup;
    JComboBox cbdonorid;
    JComboBox cbbloodtestid;
    JComboBox cbstockid;
    JTextField txtquantity;
    DateComboBox dcbdate;
    JTable table;
    JScrollPane pane;
    DefaultTableModel model;
    SQL db;
    Common cm;
    
    public Bloodstockmanagement() {
        this.db = new SQL();
        this.cm = new Common();
        final ImagePanel comp = new ImagePanel(new ImageIcon("image/header.jpg").getImage());
        final ImagePanel comp2 = new ImagePanel(new ImageIcon("image/side.jpg").getImage());
        final Container contentPane = this.getContentPane();
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        this.p4 = new JPanel();
        this.p5 = new JPanel();
        contentPane.setLayout(null);
        this.p1.setLayout(null);
        this.p2.setLayout(null);
        this.p3.setLayout(null);
        this.p4.setLayout(null);
        this.p5.setLayout(null);
        this.p1.setBounds(0, 0, 1024, 150);
        this.p2.setBounds(0, 150, 1024, 30);
        this.p3.setBounds(0, 180, 224, 588);
        this.p4.setBounds(224, 180, 800, 588);
        this.p5.setBounds(224, 180, 800, 588);
        this.p4.setBackground(Color.white);
        this.p5.setBackground(Color.white);
        this.b1 = new JButton("Home");
        this.b2 = new JButton("Donor Registration");
        this.b3 = new JButton("Blood Stock Management");
        this.b4 = new JButton("Purchase");
        this.b5 = new JButton("Logout");
        this.b1.setBackground(Color.lightGray);
        this.b2.setBackground(Color.lightGray);
        this.b3.setBackground(Color.white);
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
        this.btnadd.setBackground(Color.lightGray);
        this.btnview.setBackground(Color.lightGray);
        this.btnupdate.setBackground(Color.lightGray);
        this.btnadd.setBounds(20, 50, 180, 30);
        this.btnview.setBounds(20, 100, 180, 30);
        this.btnupdate.setBounds(20, 150, 180, 30);
        (this.lbltitle = new JLabel("")).setFont(new Font("Verdana", 1, 16));
        (this.lblstockid = new JLabel("Stock ID:")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetstockid = new JLabel("")).setFont(new Font("Verdana", 1, 12));
        (this.cbstockid = new JComboBox()).addItem("Select");
        try {
            final ResultSet exeQuery = this.db.exeQuery("select stockid from bloodstock order by stockid ASC");
            while (exeQuery.next()) {
                this.cbstockid.addItem(exeQuery.getString(1));
            }
        }
        catch (Exception ex) {}
        this.cbstockid.setBackground(Color.white);
        (this.lbldate = new JLabel("Date:")).setFont(new Font("Verdana", 0, 12));
        (this.dcbdate = new DateComboBox()).setBackground(Color.white);
        (this.lblgetdate = new JLabel("")).setFont(new Font("Verdana", 0, 12));
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
        (this.lblquantity = new JLabel("Quantity:")).setFont(new Font("Verdana", 0, 12));
        this.txtquantity = new JTextField();
        (this.lblunit = new JLabel("unit")).setFont(new Font("Verdana", 1, 12));
        (this.lbldonorid = new JLabel("Donor ID:")).setFont(new Font("Verdana", 0, 12));
        (this.cbdonorid = new JComboBox()).setBackground(Color.white);
        (this.lbldonoridmsg = new JLabel("Please select a Blood Group")).setFont(new Font("Verdana", 0, 12));
        this.lbldonoridmsg.setForeground(Color.red);
        (this.lbldonorname = new JLabel("Donor Name:")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetdonorname = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblbloodtestid = new JLabel("Blood Test ID:")).setFont(new Font("Verdana", 0, 12));
        (this.cbbloodtestid = new JComboBox()).setBackground(Color.white);
        (this.lbltestmsg = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        this.lbltestmsg.setForeground(Color.red);
        (this.btnsave = new JButton("Save")).setFont(new Font("Verdana", 0, 12));
        (this.btnclear = new JButton("Clear")).setFont(new Font("Verdana", 0, 12));
        (this.btnmodify = new JButton("Modify")).setFont(new Font("Verdana", 0, 12));
        (this.btndelete = new JButton("Delete")).setFont(new Font("Verdana", 0, 12));
        this.model = new DefaultTableModel(new Object[] { "Stock ID", "Date", "Blood Group", "Quantity", "Donor", "Blood test ID" }, 0) {
            @Override
            public boolean isCellEditable(final int n, final int n2) {
                return false;
            }
        };
        this.table = new JTable(this.model) {
            @Override
            public boolean isCellEditable(final int n, final int n2) {
                return false;
            }
        };
        final JTableHeader tableHeader = this.table.getTableHeader();
        tableHeader.setBackground(Color.white);
        tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 40));
        tableHeader.setResizingAllowed(false);
        this.table.setRowHeight(this.table.getRowHeight() + 4);
        this.table.getColumnModel().getColumn(0).setPreferredWidth(60);
        this.table.getColumnModel().getColumn(1).setPreferredWidth(80);
        this.table.getColumnModel().getColumn(2).setPreferredWidth(80);
        this.table.getColumnModel().getColumn(3).setPreferredWidth(90);
        this.table.getColumnModel().getColumn(4).setPreferredWidth(300);
        this.table.getColumnModel().getColumn(5).setPreferredWidth(90);
        (this.pane = new JScrollPane(this.table)).setBounds(44, 60, 700, 300);
        this.lbltitle.setBounds(300, 10, 180, 20);
        this.lblstockid.setBounds(240, 50, 100, 20);
        this.lblgetstockid.setBounds(370, 50, 90, 20);
        this.cbstockid.setBounds(370, 50, 90, 20);
        this.lbldate.setBounds(240, 80, 100, 20);
        this.dcbdate.setBounds(370, 80, 90, 20);
        this.lblgetdate.setBounds(370, 80, 150, 20);
        this.lblbloodgroup.setBounds(240, 110, 100, 20);
        this.cbbloodgroup.setBounds(370, 110, 150, 20);
        this.lblquantity.setBounds(240, 140, 100, 20);
        this.txtquantity.setBounds(370, 140, 100, 20);
        this.lblunit.setBounds(480, 140, 50, 20);
        this.lbldonorid.setBounds(240, 170, 100, 20);
        this.cbdonorid.setBounds(370, 170, 150, 20);
        this.lbldonoridmsg.setBounds(370, 170, 350, 20);
        this.lbldonorname.setBounds(240, 200, 100, 20);
        this.lblgetdonorname.setBounds(370, 200, 150, 20);
        this.lblbloodtestid.setBounds(240, 230, 100, 20);
        this.cbbloodtestid.setBounds(370, 230, 150, 20);
        this.lbltestmsg.setBounds(370, 230, 200, 20);
        this.btnsave.setBounds(320, 280, 90, 24);
        this.btnclear.setBounds(430, 280, 90, 24);
        this.btnmodify.setBounds(320, 280, 90, 24);
        this.btndelete.setBounds(210, 280, 90, 24);
        this.p1.add(comp);
        this.p2.add(this.b1);
        this.p2.add(this.b2);
        this.p2.add(this.b3);
        this.p2.add(this.b4);
        this.p2.add(this.b5);
        comp2.add(this.btnadd);
        comp2.add(this.btnview);
        comp2.add(this.btnupdate);
        this.p3.add(comp2);
        this.p5.add(this.lbltitle);
        this.p5.add(this.lblstockid);
        this.p5.add(this.lblgetstockid);
        this.p5.add(this.cbstockid);
        this.p5.add(this.lbldate);
        this.p5.add(this.dcbdate);
        this.p5.add(this.lblgetdate);
        this.p5.add(this.lblbloodgroup);
        this.p5.add(this.cbbloodgroup);
        this.p5.add(this.lblquantity);
        this.p5.add(this.txtquantity);
        this.p5.add(this.lblunit);
        this.p5.add(this.lbldonorid);
        this.p5.add(this.cbdonorid);
        this.p5.add(this.lbldonoridmsg);
        this.p5.add(this.lbldonorname);
        this.p5.add(this.lblgetdonorname);
        this.p5.add(this.lblbloodtestid);
        this.p5.add(this.cbbloodtestid);
        this.p5.add(this.lbltestmsg);
        this.p5.add(this.btnsave);
        this.p5.add(this.btnclear);
        this.p5.add(this.btnmodify);
        this.p5.add(this.btndelete);
        this.p5.add(this.pane);
        this.setSize(1024, 768);
        this.setVisible(true);
        this.setTitle("Blood Stock Management");
        contentPane.add(this.p1);
        contentPane.add(this.p2);
        contentPane.add(this.p3);
        contentPane.add(this.p4);
        contentPane.add(this.p5);
        this.p5.setVisible(false);
        this.pane.setVisible(false);
        this.cbstockid.setVisible(false);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);
        this.b5.addActionListener(this);
        this.btnadd.addActionListener(this);
        this.btnview.addActionListener(this);
        this.btnupdate.addActionListener(this);
        this.btnsave.addActionListener(this);
        this.btnclear.addActionListener(this);
        this.btnmodify.addActionListener(this);
        this.btndelete.addActionListener(this);
        this.cbdonorid.addActionListener(this);
        this.cbstockid.addActionListener(this);
        this.cbbloodgroup.addActionListener(this);
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
        if (actionEvent.getSource() == this.b3) {}
        if (actionEvent.getSource() == this.b4) {
            this.dispose();
            new Purchase();
        }
        if (actionEvent.getSource() == this.b5) {
            System.exit(0);
        }
        if (actionEvent.getSource() == this.btnadd) {
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.btnadd.setBackground(Color.white);
            this.btnview.setBackground(Color.lightGray);
            this.btnupdate.setBackground(Color.lightGray);
            this.clear('a');
            this.lbltitle.setText("Add blood stock");
            try {
                final ResultSet exeQuery = this.db.exeQuery("select COALESCE(max(stockid)+1,1) from bloodstock");
                if (exeQuery.next()) {
                    this.lblgetstockid.setText(String.valueOf(exeQuery.getInt(1)));
                }
            }
            catch (Exception ex) {}
        }
        if (actionEvent.getSource() == this.btnview) {
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.btnadd.setBackground(Color.lightGray);
            this.btnview.setBackground(Color.white);
            this.btnupdate.setBackground(Color.lightGray);
            this.clear('u');
            this.lbltitle.setText("View blood stock");
            this.pane.setVisible(true);
            this.lbltestmsg.setVisible(false);
            this.lbldonoridmsg.setVisible(false);
            this.lblstockid.setVisible(false);
            this.cbstockid.setVisible(false);
            this.model.setRowCount(0);
            try {
                final ResultSet exeQuery2 = this.db.exeQuery("select stockid,date,bloodgroup,quantity,donorname,bloodtestid from bloodstock order by stockid ASC");
                while (exeQuery2.next()) {
                    final Vector<String> rowData = new Vector<String>();
                    rowData.add(exeQuery2.getString(1));
                    rowData.add(exeQuery2.getString(2));
                    rowData.add(exeQuery2.getString(3));
                    rowData.add(exeQuery2.getString(4));
                    rowData.add(exeQuery2.getString(5));
                    rowData.add(exeQuery2.getString(6));
                    this.model.addRow(rowData);
                }
            }
            catch (Exception ex2) {}
        }
        if (actionEvent.getSource() == this.btnupdate) {
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.btnadd.setBackground(Color.lightGray);
            this.btnview.setBackground(Color.lightGray);
            this.btnupdate.setBackground(Color.white);
            this.clear('u');
            this.lbltitle.setText("Edit blood stock");
            this.lblstockid.setVisible(true);
            this.cbstockid.setVisible(true);
            this.lblgetstockid.setVisible(false);
            this.lbltestmsg.setVisible(false);
            this.lbldonoridmsg.setVisible(false);
            if (this.cbstockid.getItemCount() > 1) {
                this.cbstockid.removeActionListener(this);
                this.cbstockid.setSelectedIndex(0);
                this.cbstockid.addActionListener(this);
            }
        }
        if (actionEvent.getSource() == this.btnsave) {
            final String string = this.dcbdate.getSelectedItem().toString();
            final String string2 = this.cbbloodgroup.getSelectedItem().toString();
            final String trim = this.txtquantity.getText().trim();
            String string3 = "";
            String trim2 = "";
            String string4 = "";
            int int1 = 0;
            final String trim3 = this.cbbloodgroup.getItemAt(0).toString().trim();
            String message;
            boolean b;
            if (string2.equals("select")) {
                message = this.cm.validate(new String[][] { { "a Blood Group", string2, trim3 }, { "Quantity", trim } }, new int[] { 5, 3 }, new Component[] { this.cbbloodgroup, this.txtquantity });
                b = false;
            }
            else {
                try {
                    final ResultSet exeQuery3 = this.db.exeQuery("select count(donorid) from bloodtest WHERE bloodgroup='" + string2 + "'");
                    exeQuery3.next();
                    int1 = exeQuery3.getInt(1);
                }
                catch (Exception ex3) {}
                if (int1 > 0) {
                    string3 = this.cbdonorid.getSelectedItem().toString();
                    trim2 = this.lblgetdonorname.getText().trim();
                    final String trim4 = this.cbdonorid.getItemAt(0).toString().trim();
                    if (string3.equals("select")) {
                        message = this.cm.validate(new String[][] { { "a Blood Group", string2, trim3 }, { "Quantity", trim }, { "a Donor ID", string3, trim4 } }, new int[] { 5, 3, 5 }, new Component[] { this.cbbloodgroup, this.txtquantity, this.cbdonorid });
                        b = false;
                    }
                    else {
                        string4 = this.cbbloodtestid.getSelectedItem().toString();
                        message = this.cm.validate(new String[][] { { "a Blood Group", string2, trim3 }, { "Quantity", trim }, { "a Donor ID", string3, trim4 }, { "a Blood Test ID", string4, this.cbbloodtestid.getItemAt(0).toString().trim() } }, new int[] { 5, 3, 5, 5 }, new Component[] { this.cbbloodgroup, this.txtquantity, this.cbdonorid, this.cbbloodtestid });
                        b = true;
                    }
                }
                else {
                    message = this.cm.validate(new String[][] { { "a Blood Group", string2, trim3 }, { "Quantity", trim } }, new int[] { 5, 3 }, new Component[] { this.cbbloodgroup, this.txtquantity });
                    b = false;
                }
            }
            if (!message.trim().equals("")) {
                JOptionPane.showMessageDialog(null, message, "Validation", 2);
            }
            else if (b && this.db.exeUpdate("insert into bloodstock(date,bloodgroup,quantity,donorid,donorname,bloodtestid) values('" + string + "','" + string2 + "'," + Float.parseFloat(trim) + "," + Integer.parseInt(string3) + ",'" + trim2 + "'," + Integer.parseInt(string4) + ")") == 1) {
                JOptionPane.showMessageDialog(null, "Details of the blood added into the stock", "Successfully Added", 1);
                this.clear('c');
                this.cbstockid.removeActionListener(this);
                this.cbstockid.removeAllItems();
                this.cbstockid.addItem("Select");
                try {
                    final ResultSet exeQuery4 = this.db.exeQuery("select stockid from bloodstock order by stockid ASC");
                    while (exeQuery4.next()) {
                        this.cbstockid.addItem(String.valueOf(exeQuery4.getInt(1)));
                    }
                }
                catch (Exception ex4) {}
                this.cbstockid.addActionListener(this);
                try {
                    final ResultSet exeQuery5 = this.db.exeQuery("select COALESCE(max(stockid)+1,1) from bloodstock");
                    if (exeQuery5.next()) {
                        this.lblgetstockid.setText(String.valueOf(exeQuery5.getInt(1)));
                    }
                }
                catch (Exception ex5) {}
            }
        }
        if (actionEvent.getSource() == this.btnclear) {
            this.clear('c');
        }
        if (actionEvent.getSource() == this.btnmodify) {
            final String trim5 = this.cbstockid.getSelectedItem().toString().trim();
            if (!trim5.equals("Select")) {
                final int int2 = Integer.parseInt(trim5);
                final String string5 = this.cbbloodgroup.getSelectedItem().toString();
                final String trim6 = this.txtquantity.getText().trim();
                String string6 = "";
                String trim7 = "";
                String string7 = "";
                int int3 = 0;
                final String trim8 = this.cbbloodgroup.getItemAt(0).toString().trim();
                String message2;
                int n;
                if (string5.equals("select")) {
                    message2 = this.cm.validate(new String[][] { { "a Blood Group", string5, trim8 }, { "Quantity", trim6 } }, new int[] { 5, 3 }, new Component[] { this.cbbloodgroup, this.txtquantity });
                    n = 0;
                }
                else {
                    try {
                        final ResultSet exeQuery6 = this.db.exeQuery("select count(donorid) from bloodtest WHERE bloodgroup='" + string5 + "'");
                        exeQuery6.next();
                        int3 = exeQuery6.getInt(1);
                    }
                    catch (Exception ex6) {}
                    if (int3 > 0) {
                        string6 = this.cbdonorid.getSelectedItem().toString();
                        trim7 = this.lblgetdonorname.getText().trim();
                        final String trim9 = this.cbdonorid.getItemAt(0).toString().trim();
                        if (string6.equals("select")) {
                            message2 = this.cm.validate(new String[][] { { "a Blood Group", string5, trim8 }, { "Quantity", trim6 }, { "a Donor ID", string6, trim9 } }, new int[] { 5, 3, 5 }, new Component[] { this.cbbloodgroup, this.txtquantity, this.cbdonorid });
                            n = 0;
                        }
                        else {
                            string7 = this.cbbloodtestid.getSelectedItem().toString();
                            message2 = this.cm.validate(new String[][] { { "a Blood Group", string5, trim8 }, { "Quantity", trim6 }, { "a Donor ID", string6, trim9 }, { "a Blood Test ID", string7, this.cbbloodtestid.getItemAt(0).toString().trim() } }, new int[] { 5, 3, 5, 5 }, new Component[] { this.cbbloodgroup, this.txtquantity, this.cbdonorid, this.cbbloodtestid });
                            n = 1;
                        }
                    }
                    else {
                        message2 = this.cm.validate(new String[][] { { "a Blood Group", string5, trim8 }, { "Quantity", trim6 } }, new int[] { 5, 3 }, new Component[] { this.cbbloodgroup, this.txtquantity });
                        n = 0;
                    }
                }
                if (!message2.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, message2, "Validation", 2);
                }
                else if (n == 1) {
                    if (this.db.exeUpdate("update bloodstock set bloodgroup='" + string5 + "',quantity=" + Float.parseFloat(trim6) + ",donorid=" + Integer.parseInt(string6) + ",donorname='" + trim7 + "',bloodtestid=" + Integer.parseInt(string7) + " WHERE stockid=" + int2) > 0) {
                        JOptionPane.showMessageDialog(null, "Details of the blood stock updated successfully", "Successfully Updated", 1);
                    }
                    this.clear('c');
                    this.clear('u');
                    if (this.cbstockid.getItemCount() > 1) {
                        this.cbstockid.removeActionListener(this);
                        this.cbstockid.setSelectedIndex(0);
                        this.cbstockid.addActionListener(this);
                    }
                }
            }
        }
        if (actionEvent.getSource() == this.btndelete) {
            final String trim10 = this.cbstockid.getSelectedItem().toString().trim();
            if (!trim10.equals("Select")) {
                if (this.db.exeUpdate("DELETE FROM bloodstock WHERE  stockid=" + Integer.parseInt(trim10)) > 0) {
                    JOptionPane.showMessageDialog(null, "Details of blood deleted successfully", "Successfully Deleted", 1);
                }
                this.clear('u');
                this.cbstockid.removeActionListener(this);
                this.cbstockid.removeAllItems();
                this.cbstockid.addItem("Select");
                try {
                    final ResultSet exeQuery7 = this.db.exeQuery("select stockid from bloodstock order by stockid ASC");
                    while (exeQuery7.next()) {
                        this.cbstockid.addItem(String.valueOf(exeQuery7.getInt(1)));
                    }
                }
                catch (Exception ex7) {}
                this.cbstockid.addActionListener(this);
            }
            else {
                JOptionPane.showMessageDialog(null, "Error deleting details", "Error", 2);
            }
        }
        if (actionEvent.getSource() == this.cbbloodgroup) {
            final String trim11 = this.cbbloodgroup.getSelectedItem().toString().trim();
            this.lblgetdonorname.setText("");
            this.lbltestmsg.setVisible(true);
            this.lbltestmsg.setText("");
            this.cbbloodtestid.setVisible(false);
            this.cbbloodtestid.removeActionListener(this);
            this.cbbloodtestid.removeAllItems();
            this.cbbloodtestid.addActionListener(this);
            if (trim11.equals("select")) {
                this.lbldonoridmsg.setText("Please select a Blood Group");
                this.cbdonorid.setVisible(false);
                this.lbldonoridmsg.setVisible(true);
            }
            else {
                try {
                    final ResultSet exeQuery8 = this.db.exeQuery("select count(donorid) from bloodtest WHERE bloodgroup='" + trim11 + "'");
                    exeQuery8.next();
                    if (exeQuery8.getInt(1) > 0) {
                        this.cbdonorid.removeActionListener(this);
                        this.cbdonorid.removeAllItems();
                        final ResultSet exeQuery9 = this.db.exeQuery("select distinct(donorid) from bloodtest WHERE bloodgroup='" + trim11 + "'order by donorid ASC");
                        this.cbdonorid.addItem("select");
                        while (exeQuery9.next()) {
                            this.cbdonorid.addItem(exeQuery9.getString(1));
                        }
                        this.cbdonorid.addActionListener(this);
                        this.lbldonoridmsg.setText("");
                        this.cbdonorid.setVisible(true);
                        this.lbldonoridmsg.setVisible(false);
                        this.lbltestmsg.setText("Please select a Donor ID");
                    }
                    else {
                        this.lbldonoridmsg.setText("No " + trim11 + " donor with blood tested added yet!");
                        this.cbdonorid.setVisible(false);
                        this.lbldonoridmsg.setVisible(true);
                    }
                }
                catch (Exception ex8) {}
            }
        }
        if (actionEvent.getSource() == this.cbdonorid) {
            final String trim12 = this.cbdonorid.getSelectedItem().toString().trim();
            if (trim12.equals("select")) {
                this.lblgetdonorname.setText("");
                this.lbltestmsg.setVisible(true);
                this.cbbloodtestid.setVisible(false);
                this.lbltestmsg.setText("Please select a Donor ID");
            }
            else {
                final int int4 = Integer.parseInt(trim12);
                String string8 = "";
                try {
                    this.cbbloodtestid.removeActionListener(this);
                    this.cbbloodtestid.removeAllItems();
                    final ResultSet exeQuery10 = this.db.exeQuery("select donorname,btid from bloodtest where testresult='Successful' and donorid=" + int4 + " order by btid ASC");
                    this.cbbloodtestid.addItem("select");
                    while (exeQuery10.next()) {
                        string8 = exeQuery10.getString(1);
                        this.cbbloodtestid.addItem(exeQuery10.getString(2));
                    }
                }
                catch (Exception ex9) {}
                this.cbbloodtestid.addActionListener(this);
                this.lblgetdonorname.setText(string8);
                this.lbltestmsg.setVisible(false);
                this.cbbloodtestid.setVisible(true);
            }
        }
        if (actionEvent.getSource() == this.cbstockid) {
            final String trim13 = this.cbstockid.getSelectedItem().toString().trim();
            this.clear('u');
            if (!trim13.equals("Select")) {
                final int int5 = Integer.parseInt(trim13);
                String string9 = "";
                String string10 = "";
                String string11 = "";
                String string12 = "";
                String string13 = "";
                String string14 = "";
                try {
                    final ResultSet exeQuery11 = this.db.exeQuery("select date,bloodgroup,quantity,donorid,donorname,bloodtestid from bloodstock where stockid=" + int5);
                    exeQuery11.next();
                    string9 = exeQuery11.getString(1);
                    string10 = exeQuery11.getString(2);
                    string11 = exeQuery11.getString(3);
                    string12 = exeQuery11.getString(4);
                    string13 = exeQuery11.getString(5);
                    string14 = exeQuery11.getString(6);
                }
                catch (Exception ex10) {}
                this.lblgetdate.setText(string9);
                this.cbbloodgroup.setSelectedItem(string10);
                this.txtquantity.setText(string11);
                this.cbdonorid.setSelectedItem(string12);
                this.lblgetdonorname.setText(string13);
                this.cbbloodtestid.setSelectedItem(string14);
                this.lbldate.setVisible(true);
                this.lblgetdate.setVisible(true);
                this.lblbloodgroup.setVisible(true);
                this.cbbloodgroup.setVisible(true);
                this.lbltestmsg.setVisible(false);
                this.lblquantity.setVisible(true);
                this.txtquantity.setVisible(true);
                this.lblunit.setVisible(true);
                this.lbldonorid.setVisible(true);
                this.cbdonorid.setVisible(true);
                this.lbldonorname.setVisible(true);
                this.lblgetdonorname.setVisible(true);
                this.lblbloodtestid.setVisible(true);
                this.cbbloodtestid.setVisible(true);
                this.btnclear.setVisible(true);
                this.btnmodify.setVisible(true);
                this.btndelete.setVisible(true);
            }
        }
    }
    
    public void clear(final char c) {
        switch (c) {
            case 'a': {
                this.lblstockid.setVisible(true);
                this.lblgetstockid.setVisible(true);
                this.lbldate.setVisible(true);
                this.dcbdate.setVisible(true);
                this.lblbloodgroup.setVisible(true);
                this.cbbloodgroup.setVisible(true);
                this.lblquantity.setVisible(true);
                this.txtquantity.setVisible(true);
                this.lblunit.setVisible(true);
                this.lbldonorid.setVisible(true);
                this.cbdonorid.setVisible(false);
                this.lbldonoridmsg.setVisible(true);
                this.lbldonorname.setVisible(true);
                this.lblgetdonorname.setVisible(true);
                this.lblbloodtestid.setVisible(true);
                this.lbltestmsg.setVisible(true);
                this.cbbloodtestid.setVisible(false);
                this.btnsave.setVisible(true);
                this.btnclear.setVisible(true);
                this.cbstockid.setVisible(false);
                this.lblgetstockid.setVisible(true);
                this.btnmodify.setVisible(false);
                this.btndelete.setVisible(false);
                this.pane.setVisible(false);
                this.lblgetdate.setVisible(false);
                this.clear('c');
                break;
            }
            case 'u': {
                this.lblgetstockid.setVisible(false);
                this.lbldate.setVisible(false);
                this.dcbdate.setVisible(false);
                this.lblgetdate.setVisible(false);
                this.lblgetdate.setText("");
                this.lblbloodgroup.setVisible(false);
                this.cbbloodgroup.setVisible(false);
                this.lblquantity.setVisible(false);
                this.txtquantity.setVisible(false);
                this.lblunit.setVisible(false);
                this.lbldonorid.setVisible(false);
                this.cbdonorid.setVisible(false);
                this.lbldonoridmsg.setVisible(false);
                this.lbldonorname.setVisible(false);
                this.lblgetdonorname.setVisible(false);
                this.lblbloodtestid.setVisible(false);
                this.cbbloodtestid.setVisible(false);
                this.lbltestmsg.setText("");
                this.lbltestmsg.setVisible(false);
                this.btnsave.setVisible(false);
                this.btnclear.setVisible(false);
                this.btnmodify.setVisible(false);
                this.btndelete.setVisible(false);
                this.pane.setVisible(false);
                this.txtquantity.setText("");
                this.txtquantity.setBackground(Color.white);
                this.cbbloodgroup.setBackground(Color.white);
                this.cbdonorid.setBackground(Color.white);
                this.cbbloodtestid.setBackground(Color.white);
                break;
            }
            case 'c': {
                if (this.cbbloodgroup.getItemCount() > 1) {
                    this.cbbloodgroup.removeActionListener(this);
                    this.cbbloodgroup.setSelectedIndex(0);
                    this.cbbloodgroup.addActionListener(this);
                }
                if (this.cbdonorid.getItemCount() > 1) {
                    this.cbdonorid.removeActionListener(this);
                    this.cbdonorid.setSelectedIndex(0);
                    this.cbdonorid.addActionListener(this);
                }
                if (this.cbbloodtestid.getItemCount() > 1) {
                    this.cbbloodtestid.removeActionListener(this);
                    this.cbbloodtestid.removeAllItems();
                    this.cbbloodtestid.addActionListener(this);
                }
                this.lbldonoridmsg.setVisible(true);
                this.lbldonoridmsg.setText("Please select a Blood Group");
                this.cbdonorid.setVisible(false);
                this.lbltestmsg.setText("");
                this.lbltestmsg.setVisible(false);
                this.cbbloodtestid.setVisible(false);
                this.txtquantity.setText("");
                this.lblgetdonorname.setText("");
                this.txtquantity.setBackground(Color.white);
                this.cbbloodgroup.setBackground(Color.white);
                this.cbdonorid.setBackground(Color.white);
                this.cbbloodtestid.setBackground(Color.white);
                break;
            }
        }
    }
    
    public static void main(final String[] array) {
    }
}
