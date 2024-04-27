import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.table.JTableHeader;
import java.sql.ResultSet;
import java.awt.Container;
import java.util.Vector;
import java.awt.Dimension;
import javax.swing.table.TableModel;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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

public class Purchase extends JFrame implements ActionListener
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
    JButton btnpriceview;
    JButton btnadd;
    JButton btnview;
    JButton btnsave;
    JButton btncancel;
    JButton btneditprice;
    JButton btnmodifyprice;
    JButton btncancelprice;
    JLabel lbltitle;
    JLabel lbltitle1;
    JLabel lblbillno;
    JLabel lblgetbillno;
    JLabel lbldate;
    JLabel lblbloodgroup;
    JLabel lblbloodgroupmsg;
    JLabel lblquantity;
    JLabel lblprice;
    JLabel lblgetprice;
    JLabel lblpricemsg;
    JLabel lblrecipient;
    JLabel lblname;
    JLabel lbladdress;
    JLabel lblphone;
    JLabel lblunitmsg;
    JLabel lblunit;
    JLabel lblaplus;
    JLabel lblaminus;
    JLabel lblbplus;
    JLabel lblbminus;
    JLabel lbloplus;
    JLabel lblominus;
    JLabel lblabplus;
    JLabel lblabminus;
    JLabel lblgetdate;
    JLabel lblgetbloodgroup;
    JLabel lblgetquantity;
    JLabel lblgetname;
    JLabel lblgetphone;
    JTextField txtquantity;
    JTextField txtname;
    JTextField txtphone;
    JTextField txtaplus;
    JTextField txtaminus;
    JTextField txtbplus;
    JTextField txtbminus;
    JTextField txtoplus;
    JTextField txtominus;
    JTextField txtabplus;
    JTextField txtabminus;
    JTextArea taaddress;
    JComboBox cbbloodgroup;
    JComboBox cbbillno;
    DateComboBox dcbdate;
    JTable table;
    JScrollPane pane;
    JScrollPane sp;
    DefaultTableModel model;
    SQL db;
    Common cm;
    
    public Purchase() {
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
        this.p5.setBounds(224, 180, 800, 588);
        this.p6.setBounds(224, 180, 800, 588);
        this.p4.setBackground(Color.white);
        this.p5.setBackground(Color.white);
        this.p6.setBackground(Color.white);
        this.b1 = new JButton("Home");
        this.b2 = new JButton("Donor Registration");
        this.b3 = new JButton("Blood Stock Management");
        this.b4 = new JButton("Purchase");
        this.b5 = new JButton("Logout");
        this.b1.setBackground(Color.lightGray);
        this.b2.setBackground(Color.lightGray);
        this.b3.setBackground(Color.lightGray);
        this.b4.setBackground(Color.white);
        this.b5.setBackground(Color.lightGray);
        this.b1.setBounds(0, 0, 205, 30);
        this.b2.setBounds(205, 0, 205, 30);
        this.b3.setBounds(410, 0, 205, 30);
        this.b4.setBounds(615, 0, 205, 30);
        this.b5.setBounds(820, 0, 204, 30);
        (this.btnadd = new JButton("New Purchase")).setFont(new Font("Verdana", 0, 12));
        (this.btnview = new JButton("View Purchase")).setFont(new Font("Verdana", 0, 12));
        (this.btnpriceview = new JButton("Blood Pricing")).setFont(new Font("Verdana", 0, 12));
        this.btnadd.setBackground(Color.lightGray);
        this.btnview.setBackground(Color.lightGray);
        this.btnpriceview.setBackground(Color.lightGray);
        this.btnadd.setBounds(20, 50, 180, 30);
        this.btnview.setBounds(20, 100, 180, 30);
        this.btnpriceview.setBounds(20, 150, 180, 30);
        (this.lbltitle = new JLabel("")).setFont(new Font("Verdana", 1, 16));
        (this.lblbillno = new JLabel("Bill No.")).setFont(new Font("Verdana", 1, 12));
        (this.lblgetbillno = new JLabel("")).setFont(new Font("Verdana", 1, 12));
        this.lblgetbillno.setForeground(Color.red);
        try {
            final ResultSet exeQuery = this.db.exeQuery("select COALESCE(max(billno)+1,1) from purchase");
            if (exeQuery.next()) {
                this.lblgetbillno.setText(String.valueOf(exeQuery.getInt(1)));
            }
        }
        catch (Exception ex) {}
        (this.cbbillno = new JComboBox()).addItem("Select");
        try {
            final ResultSet exeQuery2 = this.db.exeQuery("select distinct billno from purchase order by billno");
            while (exeQuery2.next()) {
                this.cbbillno.addItem(exeQuery2.getString(1));
            }
        }
        catch (Exception ex2) {}
        this.cbbillno.setBackground(Color.white);
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
        (this.lblgetbloodgroup = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblbloodgroupmsg = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        this.lblbloodgroupmsg.setForeground(Color.red);
        (this.lblquantity = new JLabel("Quantity:")).setFont(new Font("Verdana", 0, 12));
        this.txtquantity = new JTextField();
        (this.lblgetquantity = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblunit = new JLabel("unit")).setFont(new Font("Verdana", 1, 12));
        (this.lblprice = new JLabel("Price:")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetprice = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblpricemsg = new JLabel("Rs. per unit")).setFont(new Font("Verdana", 0, 12));
        (this.lblrecipient = new JLabel("Blood recipient")).setFont(new Font("Verdana", 1, 13));
        (this.lblname = new JLabel("Name:")).setFont(new Font("Verdana", 0, 12));
        this.txtname = new JTextField();
        (this.lblgetname = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lbladdress = new JLabel("Address")).setFont(new Font("Verdana", 0, 12));
        this.taaddress = new JTextArea();
        this.sp = new JScrollPane(this.taaddress);
        (this.lblphone = new JLabel("Contact No.")).setFont(new Font("Verdana", 0, 12));
        this.txtphone = new JTextField();
        (this.lblgetphone = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        this.btnsave = new JButton("Save");
        this.btncancel = new JButton("Cancel");
        (this.lblunitmsg = new JLabel("*    0.45 litre = 1 unit of blood")).setFont(new Font("Verdana", 1, 11));
        this.lblunitmsg.setForeground(Color.red);
        this.lbltitle.setBounds(300, 10, 180, 20);
        this.lblbillno.setBounds(240, 50, 100, 20);
        this.lblgetbillno.setBounds(370, 50, 40, 20);
        this.cbbillno.setBounds(370, 50, 90, 20);
        this.lbldate.setBounds(240, 80, 100, 20);
        this.dcbdate.setBounds(370, 80, 90, 20);
        this.lblgetdate.setBounds(370, 80, 90, 20);
        this.lblbloodgroup.setBounds(240, 110, 100, 20);
        this.cbbloodgroup.setBounds(370, 110, 80, 20);
        this.lblgetbloodgroup.setBounds(370, 110, 80, 20);
        this.lblbloodgroupmsg.setBounds(460, 110, 350, 20);
        this.lblquantity.setBounds(240, 140, 150, 20);
        this.txtquantity.setBounds(370, 140, 100, 20);
        this.lblgetquantity.setBounds(370, 140, 100, 20);
        this.lblunit.setBounds(480, 140, 50, 20);
        this.lblprice.setBounds(240, 170, 100, 20);
        this.lblgetprice.setBounds(370, 170, 60, 20);
        this.lblpricemsg.setBounds(440, 170, 350, 20);
        this.lblrecipient.setBounds(330, 210, 180, 20);
        this.lblname.setBounds(240, 250, 100, 20);
        this.txtname.setBounds(370, 250, 150, 20);
        this.lblgetname.setBounds(370, 250, 150, 20);
        this.lbladdress.setBounds(240, 280, 100, 20);
        this.sp.setBounds(370, 280, 150, 60);
        this.lblphone.setBounds(240, 350, 100, 20);
        this.txtphone.setBounds(370, 350, 150, 20);
        this.lblgetphone.setBounds(370, 350, 150, 20);
        this.btnsave.setBounds(320, 400, 90, 24);
        this.btncancel.setBounds(430, 400, 90, 24);
        this.lblunitmsg.setBounds(530, 450, 350, 24);
        (this.lbltitle1 = new JLabel("Blood Pricing")).setFont(new Font("Verdana", 1, 16));
        this.model = new DefaultTableModel(new Object[] { "Serial No.", "Blood Group", "Price per unit" }, 0) {
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
        this.table.getColumnModel().getColumn(0).setPreferredWidth(70);
        this.table.getColumnModel().getColumn(1).setPreferredWidth(130);
        this.table.getColumnModel().getColumn(2).setPreferredWidth(497);
        try {
            final ResultSet exeQuery3 = this.db.exeQuery("select priceid,bloodgroup,price from bloodprice order by priceid ASC");
            while (exeQuery3.next()) {
                final Vector<String> rowData = new Vector<String>();
                rowData.add(exeQuery3.getString(1));
                rowData.add(exeQuery3.getString(2));
                rowData.add(exeQuery3.getString(3));
                this.model.addRow(rowData);
            }
        }
        catch (Exception ex3) {}
        this.pane = new JScrollPane(this.table);
        (this.lblaplus = new JLabel("A+:")).setFont(new Font("Verdana", 0, 12));
        this.txtaplus = new JTextField();
        (this.lblaminus = new JLabel("A-:")).setFont(new Font("Verdana", 0, 12));
        this.txtaminus = new JTextField();
        (this.lblbplus = new JLabel("B+:")).setFont(new Font("Verdana", 0, 12));
        this.txtbplus = new JTextField();
        (this.lblbminus = new JLabel("B-:")).setFont(new Font("Verdana", 0, 12));
        this.txtbminus = new JTextField();
        (this.lbloplus = new JLabel("O+:")).setFont(new Font("Verdana", 0, 12));
        this.txtoplus = new JTextField();
        (this.lblominus = new JLabel("O-:")).setFont(new Font("Verdana", 0, 12));
        this.txtominus = new JTextField();
        (this.lblabplus = new JLabel("AB+:")).setFont(new Font("Verdana", 0, 12));
        this.txtabplus = new JTextField();
        (this.lblabminus = new JLabel("AB-:")).setFont(new Font("Verdana", 0, 12));
        this.txtabminus = new JTextField();
        this.btneditprice = new JButton("Edit price");
        this.btnmodifyprice = new JButton("Update");
        this.btncancelprice = new JButton("Cancel");
        this.lbltitle1.setBounds(300, 10, 180, 20);
        this.pane.setBounds(44, 60, 700, 203);
        this.lblaplus.setBounds(44, 280, 50, 20);
        this.txtaplus.setBounds(94, 280, 90, 20);
        this.lblaminus.setBounds(44, 310, 50, 20);
        this.txtaminus.setBounds(94, 310, 90, 20);
        this.lblbplus.setBounds(44, 340, 50, 20);
        this.txtbplus.setBounds(94, 340, 90, 20);
        this.lblbminus.setBounds(44, 370, 50, 20);
        this.txtbminus.setBounds(94, 370, 90, 20);
        this.lbloplus.setBounds(44, 400, 50, 20);
        this.txtoplus.setBounds(94, 400, 90, 20);
        this.lblominus.setBounds(44, 430, 50, 20);
        this.txtominus.setBounds(94, 430, 90, 20);
        this.lblabplus.setBounds(44, 460, 50, 20);
        this.txtabplus.setBounds(94, 460, 90, 20);
        this.lblabminus.setBounds(44, 490, 50, 20);
        this.txtabminus.setBounds(94, 490, 90, 20);
        this.btneditprice.setBounds(44, 280, 90, 24);
        this.btnmodifyprice.setBounds(204, 488, 90, 24);
        this.btncancelprice.setBounds(304, 488, 90, 24);
        this.p1.add(comp);
        this.p2.add(this.b1);
        this.p2.add(this.b2);
        this.p2.add(this.b3);
        this.p2.add(this.b4);
        this.p2.add(this.b5);
        comp2.add(this.btnpriceview);
        comp2.add(this.btnadd);
        comp2.add(this.btnview);
        this.p3.add(comp2);
        this.p5.add(this.lbltitle);
        this.p5.add(this.lblbillno);
        this.p5.add(this.lblgetbillno);
        this.p5.add(this.cbbillno);
        this.p5.add(this.lbldate);
        this.p5.add(this.dcbdate);
        this.p5.add(this.lblgetdate);
        this.p5.add(this.lblbloodgroup);
        this.p5.add(this.cbbloodgroup);
        this.p5.add(this.lblgetbloodgroup);
        this.p5.add(this.lblbloodgroupmsg);
        this.p5.add(this.lblquantity);
        this.p5.add(this.txtquantity);
        this.p5.add(this.lblgetquantity);
        this.p5.add(this.lblunit);
        this.p5.add(this.lblprice);
        this.p5.add(this.lblgetprice);
        this.p5.add(this.lblpricemsg);
        this.p5.add(this.lblrecipient);
        this.p5.add(this.lblname);
        this.p5.add(this.txtname);
        this.p5.add(this.lblgetname);
        this.p5.add(this.lbladdress);
        this.p5.add(this.sp);
        this.p5.add(this.lblphone);
        this.p5.add(this.txtphone);
        this.p5.add(this.lblgetphone);
        this.p5.add(this.btnsave);
        this.p5.add(this.btncancel);
        this.p5.add(this.lblunitmsg);
        this.p6.add(this.lbltitle1);
        this.p6.add(this.pane);
        this.p6.add(this.lblaplus);
        this.p6.add(this.txtaplus);
        this.p6.add(this.lblaminus);
        this.p6.add(this.txtaminus);
        this.p6.add(this.lblbplus);
        this.p6.add(this.txtbplus);
        this.p6.add(this.lblbminus);
        this.p6.add(this.txtbminus);
        this.p6.add(this.lbloplus);
        this.p6.add(this.txtoplus);
        this.p6.add(this.lblominus);
        this.p6.add(this.txtominus);
        this.p6.add(this.lblabplus);
        this.p6.add(this.txtabplus);
        this.p6.add(this.lblabminus);
        this.p6.add(this.txtabminus);
        this.p6.add(this.btneditprice);
        this.p6.add(this.btnmodifyprice);
        this.p6.add(this.btncancelprice);
        this.setSize(1024, 768);
        this.setVisible(true);
        this.setTitle("Purchase Blood");
        this.setResizable(false);
        contentPane.add(this.p1);
        contentPane.add(this.p2);
        contentPane.add(this.p3);
        contentPane.add(this.p4);
        contentPane.add(this.p5);
        contentPane.add(this.p6);
        this.p5.setVisible(false);
        this.p6.setVisible(false);
        this.lblpricemsg.setVisible(false);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);
        this.b5.addActionListener(this);
        this.btnadd.addActionListener(this);
        this.btnview.addActionListener(this);
        this.btnpriceview.addActionListener(this);
        this.cbbillno.addActionListener(this);
        this.cbbloodgroup.addActionListener(this);
        this.btnsave.addActionListener(this);
        this.btncancel.addActionListener(this);
        this.btneditprice.addActionListener(this);
        this.btnmodifyprice.addActionListener(this);
        this.btncancelprice.addActionListener(this);
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
        if (actionEvent.getSource() == this.b4) {}
        if (actionEvent.getSource() == this.b5) {
            System.exit(0);
        }
        if (actionEvent.getSource() == this.btnadd) {
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.p6.setVisible(false);
            this.btnadd.setBackground(Color.white);
            this.btnview.setBackground(Color.lightGray);
            this.btnpriceview.setBackground(Color.lightGray);
            this.lbltitle.setText("New Purchase");
            this.clear('a');
            this.visible('a');
        }
        if (actionEvent.getSource() == this.btnview) {
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.p6.setVisible(false);
            this.btnadd.setBackground(Color.lightGray);
            this.btnview.setBackground(Color.white);
            this.btnpriceview.setBackground(Color.lightGray);
            this.lbltitle.setText("View Purchase");
            this.lblgetbillno.setVisible(false);
            this.cbbillno.setVisible(true);
            this.clear('v');
        }
        if (actionEvent.getSource() == this.btnpriceview) {
            this.p4.setVisible(false);
            this.p5.setVisible(false);
            this.p6.setVisible(true);
            this.btnadd.setBackground(Color.lightGray);
            this.btnview.setBackground(Color.lightGray);
            this.btnpriceview.setBackground(Color.white);
            this.clear('e');
        }
        if (actionEvent.getSource() == this.btneditprice) {
            this.visible('e');
            try {
                final ResultSet exeQuery = this.db.exeQuery("select bloodgroup,price from bloodprice order by priceid ASC");
                while (exeQuery.next()) {
                    final String string = exeQuery.getString(1);
                    final String string2 = exeQuery.getString(2);
                    if (string.equals("A+")) {
                        this.txtaplus.setText(string2);
                    }
                    else if (string.equals("A-")) {
                        this.txtaminus.setText(string2);
                    }
                    else if (string.equals("B+")) {
                        this.txtbplus.setText(string2);
                    }
                    else if (string.equals("B-")) {
                        this.txtbminus.setText(string2);
                    }
                    else if (string.equals("O+")) {
                        this.txtoplus.setText(string2);
                    }
                    else if (string.equals("O-")) {
                        this.txtominus.setText(string2);
                    }
                    else if (string.equals("AB+")) {
                        this.txtabplus.setText(string2);
                    }
                    else {
                        if (!string.equals("AB-")) {
                            continue;
                        }
                        this.txtabminus.setText(string2);
                    }
                }
            }
            catch (Exception ex) {}
        }
        if (actionEvent.getSource() == this.btncancelprice) {
            this.clear('e');
        }
        if (actionEvent.getSource() == this.btnmodifyprice) {
            final String trim = this.txtaplus.getText().trim();
            final String trim2 = this.txtaminus.getText().trim();
            final String trim3 = this.txtbplus.getText().trim();
            final String trim4 = this.txtbminus.getText().trim();
            final String trim5 = this.txtoplus.getText().trim();
            final String trim6 = this.txtominus.getText().trim();
            final String trim7 = this.txtabplus.getText().trim();
            final String trim8 = this.txtabminus.getText().trim();
            final String validate = this.cm.validate(new String[][] { { "'A+'", trim }, { "'A-'", trim2 }, { "'B+'", trim3 }, { "'B-'", trim4 }, { "'O+'", trim5 }, { "'O-'", trim6 }, { "'AB+'", trim7 }, { "'AB-'", trim8 } }, new int[] { 3, 3, 3, 3, 3, 3, 3, 3 }, new Component[] { this.txtaplus, this.txtaminus, this.txtbplus, this.txtbminus, this.txtoplus, this.txtominus, this.txtabplus, this.txtabminus });
            if (!validate.trim().equals("")) {
                JOptionPane.showMessageDialog(null, validate, "Validation", 2);
            }
            else {
                final float float1 = Float.parseFloat(trim);
                final float float2 = Float.parseFloat(trim2);
                final float float3 = Float.parseFloat(trim3);
                final float float4 = Float.parseFloat(trim4);
                final float float5 = Float.parseFloat(trim5);
                final float float6 = Float.parseFloat(trim6);
                final float float7 = Float.parseFloat(trim7);
                final float float8 = Float.parseFloat(trim8);
                final String[] array = { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" };
                final float[] array2 = { float1, float2, float3, float4, float5, float6, float7, float8 };
                for (int i = 0; i < 8; ++i) {
                    this.db.exeUpdate("update bloodprice set price=" + array2[i] + "  where bloodgroup='" + array[i] + "'");
                }
                this.model.setRowCount(0);
                try {
                    final ResultSet exeQuery2 = this.db.exeQuery("select priceid,bloodgroup,price from bloodprice order by priceid ASC");
                    while (exeQuery2.next()) {
                        final Vector<String> rowData = new Vector<String>();
                        rowData.add(exeQuery2.getString(1));
                        rowData.add(exeQuery2.getString(2));
                        rowData.add(exeQuery2.getString(3));
                        this.model.addRow(rowData);
                    }
                }
                catch (Exception ex2) {}
                this.clear('e');
            }
        }
        if (actionEvent.getSource() == this.btnsave) {
            final String trim9 = this.dcbdate.getSelectedItem().toString().trim();
            final String trim10 = this.cbbloodgroup.getSelectedItem().toString().trim();
            final String trim11 = this.txtquantity.getText().trim();
            final String trim12 = this.lblgetprice.getText().trim();
            final String trim13 = this.txtname.getText().trim();
            final String trim14 = this.taaddress.getText().trim();
            final String trim15 = this.txtphone.getText().trim();
            final String validate2 = this.cm.validate(new String[][] { { "a Blood Group", trim10, this.cbbloodgroup.getItemAt(0).toString().trim() }, { "Required quantity", trim11 }, { "Name", trim13 }, { "Address", trim14 }, { "Contact No.", trim15 } }, new int[] { 5, 3, 1, 1, 1 }, new Component[] { this.cbbloodgroup, this.txtquantity, this.txtname, this.taaddress, this.txtphone });
            if (!validate2.trim().equals("")) {
                JOptionPane.showMessageDialog(null, validate2, "Validation", 2);
            }
            else {
                try {
                    final float float9 = Float.parseFloat(trim11);
                    final float n = Float.parseFloat(trim12) * float9;
                    final ResultSet exeQuery3 = this.db.exeQuery("select sum(quantity) from bloodstock where bloodgroup='" + trim10 + "'");
                    exeQuery3.next();
                    final float float10 = exeQuery3.getFloat(1);
                    if (float9 <= float10) {
                        final float f = float10 - float9;
                        final int exeUpdate = this.db.exeUpdate("insert into purchase(date, bloodgroup,quantity,price,recipientname,recipientaddress,recipientphone) values('" + trim9 + "','" + trim10 + "'," + float9 + "," + n + ",'" + trim13 + "','" + trim14 + "','" + trim15 + "')");
                        int n2;
                        int exeUpdate2;
                        if (f == 0.0f) {
                            n2 = this.db.exeUpdate("delete from bloodstock where bloodgroup='" + trim10 + "'");
                            exeUpdate2 = 1;
                        }
                        else {
                            final ResultSet exeQuery4 = this.db.exeQuery("select top 1 stockid from bloodstock where bloodgroup='" + trim10 + "' order by stockid DESC");
                            exeQuery4.next();
                            final int int1 = exeQuery4.getInt(1);
                            n2 = this.db.exeUpdate("delete from bloodstock  where bloodgroup='" + trim10 + "' AND stockid !=" + int1);
                            exeUpdate2 = this.db.exeUpdate("update bloodstock set quantity=" + f + "  where stockid=" + int1);
                        }
                        if (exeUpdate > 0 && n2 > 0 && exeUpdate2 > 0) {
                            JOptionPane.showMessageDialog(null, float9 + " unit of " + trim10 + " blood purchased successfully\n TOTAL PRICE :" + n, "Successfully Purchased", 1);
                            if (this.cbbloodgroup.getItemCount() > 1) {
                                this.cbbloodgroup.removeActionListener(this);
                                this.cbbloodgroup.setSelectedIndex(0);
                                this.cbbloodgroup.addActionListener(this);
                            }
                            this.lblbloodgroupmsg.setText("");
                            this.txtquantity.setText("");
                            this.lblgetprice.setText("");
                            this.txtname.setText("");
                            this.taaddress.setText("");
                            this.txtphone.setText("");
                            this.lblpricemsg.setVisible(false);
                            final ResultSet exeQuery5 = this.db.exeQuery("select COALESCE(max(billno)+1,1) from purchase");
                            if (exeQuery5.next()) {
                                this.lblgetbillno.setText(String.valueOf(exeQuery5.getInt(1)));
                            }
                            this.cbbillno.removeActionListener(this);
                            this.cbbillno.removeAllItems();
                            this.cbbillno.addItem("Select");
                            try {
                                final ResultSet exeQuery6 = this.db.exeQuery("select distinct billno from purchase order by billno");
                                while (exeQuery6.next()) {
                                    this.cbbillno.addItem(exeQuery6.getString(1));
                                }
                            }
                            catch (Exception ex3) {}
                            this.cbbillno.addActionListener(this);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Required quantity of '" + trim10 + "' blood is not available in the stock!", "No Stock", 1);
                    }
                }
                catch (Exception ex4) {}
            }
        }
        if (actionEvent.getSource() == this.btncancel) {
            this.dispose();
            new Home();
        }
        if (actionEvent.getSource() == this.cbbloodgroup) {
            final String trim16 = this.cbbloodgroup.getSelectedItem().toString().trim();
            this.txtquantity.setEditable(false);
            this.txtname.setEditable(false);
            this.taaddress.setEditable(false);
            this.txtphone.setEditable(false);
            this.txtquantity.setText("");
            this.txtname.setText("");
            this.taaddress.setText("");
            this.txtphone.setText("");
            this.btnsave.setEnabled(false);
            if (trim16.equals("select")) {
                this.lblbloodgroupmsg.setVisible(false);
                this.lblbloodgroupmsg.setText("");
                this.lblgetprice.setText("");
                this.lblpricemsg.setVisible(false);
            }
            else {
                this.lblbloodgroupmsg.setVisible(true);
                this.lblpricemsg.setVisible(true);
                try {
                    final ResultSet exeQuery7 = this.db.exeQuery("select price from bloodprice WHERE bloodgroup='" + trim16 + "'");
                    exeQuery7.next();
                    this.lblgetprice.setText(exeQuery7.getString(1));
                    if (this.db.exeQuery("select quantity from bloodstock WHERE bloodgroup='" + trim16 + "'").next()) {
                        final ResultSet exeQuery8 = this.db.exeQuery("select sum(quantity) from bloodstock WHERE bloodgroup='" + trim16 + "'");
                        exeQuery8.next();
                        final float float11 = exeQuery8.getFloat(1);
                        if (float11 <= 0.0f) {
                            this.lblbloodgroupmsg.setText("(No stock of '" + trim16 + "' blood!)");
                        }
                        else {
                            this.lblbloodgroupmsg.setText("(" + float11 + " units of '" + trim16 + "' blood in the stock)");
                            this.txtquantity.setEditable(true);
                            this.txtname.setEditable(true);
                            this.taaddress.setEditable(true);
                            this.txtphone.setEditable(true);
                            this.btnsave.setEnabled(true);
                        }
                    }
                    else {
                        this.lblbloodgroupmsg.setText("(No stock of '" + trim16 + "' blood!)");
                    }
                }
                catch (Exception ex5) {}
            }
        }
        if (actionEvent.getSource() == this.cbbillno) {
            final String trim17 = this.cbbillno.getSelectedItem().toString().trim();
            if (trim17.equals("Select")) {
                this.clear('v');
            }
            else {
                final int int2 = Integer.parseInt(trim17);
                try {
                    final ResultSet exeQuery9 = this.db.exeQuery("select date,bloodgroup,quantity,price,recipientname,recipientaddress,recipientphone from purchase where billno=" + int2);
                    if (exeQuery9.next()) {
                        this.lblgetdate.setText(exeQuery9.getString(1));
                        this.lblgetbloodgroup.setText(exeQuery9.getString(2));
                        this.lblgetquantity.setText(exeQuery9.getString(3));
                        this.lblgetprice.setText(exeQuery9.getString(4));
                        this.lblgetname.setText(exeQuery9.getString(5));
                        this.taaddress.setText(exeQuery9.getString(6));
                        this.lblgetphone.setText(exeQuery9.getString(7));
                        this.visible('v');
                    }
                    else {
                        this.clear('v');
                    }
                }
                catch (Exception ex6) {}
                this.visible('v');
            }
        }
    }
    
    public void clear(final char c) {
        switch (c) {
            case 'e': {
                this.lblaplus.setVisible(false);
                this.txtaplus.setVisible(false);
                this.lblaminus.setVisible(false);
                this.txtaminus.setVisible(false);
                this.lblbplus.setVisible(false);
                this.txtbplus.setVisible(false);
                this.lblbminus.setVisible(false);
                this.txtbminus.setVisible(false);
                this.lbloplus.setVisible(false);
                this.txtoplus.setVisible(false);
                this.lblominus.setVisible(false);
                this.txtominus.setVisible(false);
                this.lblabplus.setVisible(false);
                this.txtabplus.setVisible(false);
                this.lblabminus.setVisible(false);
                this.txtabminus.setVisible(false);
                this.btneditprice.setVisible(true);
                this.btnmodifyprice.setVisible(false);
                this.btncancelprice.setVisible(false);
                this.txtaplus.setText("");
                this.txtaminus.setText("");
                this.txtbplus.setText("");
                this.txtbminus.setText("");
                this.txtoplus.setText("");
                this.txtominus.setText("");
                this.txtabplus.setText("");
                this.txtabminus.setText("");
                this.txtaplus.setBackground(Color.white);
                this.txtaminus.setBackground(Color.white);
                this.txtbplus.setBackground(Color.white);
                this.txtbminus.setBackground(Color.white);
                this.txtoplus.setBackground(Color.white);
                this.txtominus.setBackground(Color.white);
                this.txtabplus.setBackground(Color.white);
                this.txtabminus.setBackground(Color.white);
                break;
            }
            case 'a': {
                if (this.cbbloodgroup.getItemCount() > 1) {
                    this.cbbloodgroup.removeActionListener(this);
                    this.cbbloodgroup.setSelectedIndex(0);
                    this.cbbloodgroup.addActionListener(this);
                }
                this.lblbloodgroupmsg.setText("");
                this.txtquantity.setText("");
                this.lblgetprice.setText("");
                this.txtname.setText("");
                this.taaddress.setText("");
                this.txtphone.setText("");
                this.txtquantity.setEditable(false);
                this.txtname.setEditable(false);
                this.txtphone.setEditable(false);
                this.taaddress.setEditable(false);
                this.btnsave.setEnabled(false);
                this.cbbloodgroup.setBackground(Color.white);
                this.txtquantity.setBackground(Color.white);
                this.txtname.setBackground(Color.white);
                this.taaddress.setBackground(Color.white);
                this.txtphone.setBackground(Color.white);
                this.cbbillno.setVisible(false);
                this.lblgetdate.setVisible(false);
                this.lblgetbloodgroup.setVisible(false);
                this.lblquantity.setVisible(false);
                this.lblname.setVisible(false);
                this.lblphone.setVisible(false);
                this.lblpricemsg.setVisible(false);
                break;
            }
            case 'v': {
                this.lbldate.setVisible(false);
                this.dcbdate.setVisible(false);
                this.lblgetdate.setVisible(false);
                this.lblbloodgroup.setVisible(false);
                this.cbbloodgroup.setVisible(false);
                this.lblgetbloodgroup.setVisible(false);
                this.lblbloodgroupmsg.setVisible(false);
                this.lblquantity.setVisible(false);
                this.txtquantity.setVisible(false);
                this.lblgetquantity.setVisible(false);
                this.lblunit.setVisible(false);
                this.lblprice.setVisible(false);
                this.lblgetprice.setVisible(false);
                this.lblpricemsg.setVisible(false);
                this.lblrecipient.setVisible(false);
                this.lblname.setVisible(false);
                this.txtname.setVisible(false);
                this.lblgetname.setVisible(false);
                this.lbladdress.setVisible(false);
                this.sp.setVisible(false);
                this.lblphone.setVisible(false);
                this.txtphone.setVisible(false);
                this.lblgetphone.setVisible(false);
                this.btnsave.setVisible(false);
                this.btncancel.setVisible(false);
                this.lblunitmsg.setVisible(false);
                this.lblgetdate.setText("");
                this.lblgetbloodgroup.setText("");
                this.lblgetquantity.setText("");
                this.lblgetprice.setText("");
                this.lblgetname.setText("");
                this.taaddress.setText("");
                this.txtphone.setText("");
                break;
            }
        }
    }
    
    public void visible(final char c) {
        switch (c) {
            case 'e': {
                this.lblaplus.setVisible(true);
                this.txtaplus.setVisible(true);
                this.lblaminus.setVisible(true);
                this.txtaminus.setVisible(true);
                this.lblbplus.setVisible(true);
                this.txtbplus.setVisible(true);
                this.lblbminus.setVisible(true);
                this.txtbminus.setVisible(true);
                this.lbloplus.setVisible(true);
                this.txtoplus.setVisible(true);
                this.lblominus.setVisible(true);
                this.txtominus.setVisible(true);
                this.lblabplus.setVisible(true);
                this.txtabplus.setVisible(true);
                this.lblabminus.setVisible(true);
                this.txtabminus.setVisible(true);
                this.btneditprice.setVisible(false);
                this.btnmodifyprice.setVisible(true);
                this.btncancelprice.setVisible(true);
                break;
            }
            case 'a': {
                this.lblgetbillno.setVisible(true);
                this.lbldate.setVisible(true);
                this.dcbdate.setVisible(true);
                this.lblbloodgroup.setVisible(true);
                this.cbbloodgroup.setVisible(true);
                this.lblbloodgroupmsg.setVisible(true);
                this.lblquantity.setVisible(true);
                this.txtquantity.setVisible(true);
                this.lblunit.setVisible(true);
                this.lblprice.setVisible(true);
                this.lblgetprice.setVisible(true);
                this.lblrecipient.setVisible(true);
                this.lblname.setVisible(true);
                this.txtname.setVisible(true);
                this.lbladdress.setVisible(true);
                this.sp.setVisible(true);
                this.lblphone.setVisible(true);
                this.txtphone.setVisible(true);
                this.btnsave.setVisible(true);
                this.btncancel.setVisible(true);
                this.lblunitmsg.setVisible(true);
                break;
            }
            case 'v': {
                this.lbldate.setVisible(true);
                this.lblgetdate.setVisible(true);
                this.lblbloodgroup.setVisible(true);
                this.lblgetbloodgroup.setVisible(true);
                this.lblquantity.setVisible(true);
                this.lblgetquantity.setVisible(true);
                this.lblunit.setVisible(true);
                this.lblprice.setVisible(true);
                this.lblgetprice.setVisible(true);
                this.lblrecipient.setVisible(true);
                this.lblname.setVisible(true);
                this.lblgetname.setVisible(true);
                this.lbladdress.setVisible(true);
                this.sp.setVisible(true);
                this.lblphone.setVisible(true);
                this.lblgetphone.setVisible(true);
                this.taaddress.setEditable(false);
                break;
            }
        }
    }
    
    public static void main(final String[] array) {
    }
}
