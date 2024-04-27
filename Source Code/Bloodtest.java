import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.awt.Container;
import java.awt.Component;
import javax.swing.AbstractButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class Bloodtest extends JFrame implements ActionListener
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
    JButton btnsave;
    JButton btnclear;
    JButton btnmodify;
    JButton btndelete;
    JLabel lbltitle;
    JLabel lbltestid;
    JLabel lbldonorid;
    JLabel lbldate;
    JLabel lblname;
    JLabel lblbloodgroup;
    JLabel lblgender;
    JLabel lblgettestid;
    JLabel lblgetdonorid;
    JLabel lblgetdate;
    JLabel lblgetname;
    JLabel lblgetbloodgroup;
    JLabel lblgetgender;
    JLabel lblhtest;
    JLabel lblhresult;
    JLabel lblhnormal;
    JLabel lblbiochem;
    JLabel lblhaematology;
    JLabel lblbilirubintot;
    JLabel lblbilirubindir;
    JLabel lblalt;
    JLabel lblhb;
    JLabel lbltc;
    JLabel lblneutrophil;
    JLabel lbllymphocyte;
    JLabel lbleosinophil;
    JLabel lblplatelet;
    JLabel lblesr;
    JLabel lblhtest1;
    JLabel lblhresult1;
    JLabel lblhiv;
    JLabel lblvdrl;
    JLabel lblhbsag;
    JLabel lblgethiv;
    JLabel lblgetvdrl;
    JLabel lblgethbsag;
    JLabel lbltestresult;
    JLabel lbltestresultview;
    JLabel lblgetbilirubintot;
    JLabel lblgetbilirubindir;
    JLabel lblgetalt;
    JLabel lblgethb;
    JLabel lblgettc;
    JLabel lblgetneutrophil;
    JLabel lblgetlymphocyte;
    JLabel lblgeteosinophil;
    JLabel lblgetplatelet;
    JLabel lblgetesr;
    JLabel lblbillitotunit;
    JLabel lblbillitotnormal;
    JLabel lblbillidirunit;
    JLabel lblbillidirnormal;
    JLabel lblaltunit;
    JLabel lblaltnormal;
    JLabel lblhbunit;
    JLabel lblhbnormal;
    JLabel lbltcunit;
    JLabel lbltcnormal;
    JLabel lblneutrophilunit;
    JLabel lblneutrophilnormal;
    JLabel lbllymphocyteunit;
    JLabel lbllymphocytenormal;
    JLabel lbleosinophilunit;
    JLabel lbleosinophilnormal;
    JLabel lblplateletunit;
    JLabel lblplateletnormal;
    JLabel lblesrunit;
    JLabel lblesrnormal;
    JTextField txtbilirubintot;
    JTextField txtbilirubindir;
    JTextField txtalt;
    JTextField txthb;
    JTextField txttc;
    JTextField txtneutrophil;
    JTextField txtlymphocyte;
    JTextField txteosinophil;
    JTextField txtplatelet;
    JTextField txtesr;
    JRadioButton rbhivpos;
    JRadioButton rbhivneg;
    JRadioButton rbvdrlreact;
    JRadioButton rbvdrlnon;
    JRadioButton rbhbspos;
    JRadioButton rbhbsneg;
    ButtonGroup bg1;
    ButtonGroup bg2;
    ButtonGroup bg3;
    JComboBox cbdonorid;
    JComboBox cbtestid;
    DateComboBox cbdate;
    SQL db;
    Common cm;
    int comboval;
    
    public Bloodtest() {
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
        this.p5.setBounds(224, 180, 800, 130);
        this.p6.setBounds(224, 310, 800, 458);
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
        this.btnadd.setBounds(20, 50, 180, 30);
        this.btnview.setBounds(20, 100, 180, 30);
        this.btnupdate.setBounds(20, 150, 180, 30);
        this.btnadd.setBackground(Color.lightGray);
        this.btnview.setBackground(Color.lightGray);
        this.btnupdate.setBackground(Color.lightGray);
        (this.lbltitle = new JLabel("")).setFont(new Font("Verdana", 1, 16));
        (this.lbltestid = new JLabel("Blood test ID:")).setFont(new Font("Verdana", 0, 12));
        (this.lblgettestid = new JLabel("")).setFont(new Font("Verdana", 1, 12));
        try {
            final ResultSet exeQuery = this.db.exeQuery("select COALESCE(max(btid)+1,1) from bloodtest");
            if (exeQuery.next()) {
                this.lblgettestid.setText(String.valueOf(exeQuery.getInt(1)));
            }
        }
        catch (Exception ex) {}
        (this.cbtestid = new JComboBox()).addItem("Select");
        try {
            final ResultSet exeQuery2 = this.db.exeQuery("select btid from bloodtest order by btid ASC");
            while (exeQuery2.next()) {
                this.cbtestid.addItem(exeQuery2.getString(1));
            }
        }
        catch (Exception ex2) {}
        this.cbtestid.setBackground(Color.white);
        (this.lbldate = new JLabel("Date:")).setFont(new Font("Verdana", 0, 12));
        (this.cbdate = new DateComboBox()).setBackground(Color.white);
        (this.lblgetdate = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lbldonorid = new JLabel("Donor ID:")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetdonorid = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.cbdonorid = new JComboBox()).addItem("Select");
        try {
            final ResultSet exeQuery3 = this.db.exeQuery("select did from donor order by did ASC");
            while (exeQuery3.next()) {
                this.cbdonorid.addItem(exeQuery3.getString(1));
            }
        }
        catch (Exception ex3) {}
        this.cbdonorid.setBackground(Color.white);
        (this.lblname = new JLabel("Donor name:")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetname = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblbloodgroup = new JLabel("Blood group:")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetbloodgroup = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblgender = new JLabel("Gender:")).setFont(new Font("Verdana", 0, 12));
        (this.lblgetgender = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblhtest = new JLabel("Test")).setFont(new Font("Verdana", 1, 12));
        this.lblhtest.setForeground(Color.blue);
        (this.lblhresult = new JLabel("Result")).setFont(new Font("Verdana", 1, 12));
        this.lblhresult.setForeground(Color.blue);
        (this.lblhnormal = new JLabel("Normal Range")).setFont(new Font("Verdana", 1, 12));
        this.lblhnormal.setForeground(Color.blue);
        (this.lblbiochem = new JLabel("BIOCHEMISTRY")).setFont(new Font("Verdana", 1, 12));
        (this.lblbilirubintot = new JLabel("s bilirubin total:")).setFont(new Font("Verdana", 0, 12));
        this.txtbilirubintot = new JTextField();
        (this.lblgetbilirubintot = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblbillitotunit = new JLabel("mgs/dl")).setFont(new Font("Verdana", 1, 12));
        (this.lblbillitotnormal = new JLabel("0.5-0.9 mgs/dl")).setFont(new Font("Verdana", 1, 12));
        (this.lblbilirubindir = new JLabel("s bilirubin direct:")).setFont(new Font("Verdana", 0, 12));
        this.txtbilirubindir = new JTextField();
        (this.lblgetbilirubindir = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        this.txtbilirubindir = new JTextField();
        (this.lblbillidirunit = new JLabel("mgs/dl")).setFont(new Font("Verdana", 1, 12));
        (this.lblbillidirnormal = new JLabel("0.3-0.5 mgs/dl")).setFont(new Font("Verdana", 1, 12));
        (this.lblalt = new JLabel("ALT:")).setFont(new Font("Verdana", 0, 12));
        this.txtalt = new JTextField();
        (this.lblgetalt = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblaltunit = new JLabel("U/L")).setFont(new Font("Verdana", 1, 12));
        (this.lblaltnormal = new JLabel("5-34 U/L")).setFont(new Font("Verdana", 1, 12));
        (this.lblhaematology = new JLabel("HAEMATOLOGY")).setFont(new Font("Verdana", 1, 12));
        (this.lblhb = new JLabel("Heamoglobin:")).setFont(new Font("Verdana", 0, 12));
        this.txthb = new JTextField();
        (this.lblgethb = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblhbunit = new JLabel("g/dl")).setFont(new Font("Verdana", 1, 12));
        (this.lblhbnormal = new JLabel("12-18 g/dl")).setFont(new Font("Verdana", 1, 12));
        (this.lbltc = new JLabel("Total Count:")).setFont(new Font("Verdana", 0, 12));
        this.txttc = new JTextField();
        (this.lblgettc = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lbltcunit = new JLabel("/uL")).setFont(new Font("Verdana", 1, 12));
        (this.lbltcnormal = new JLabel("4000 - 10000/uL")).setFont(new Font("Verdana", 1, 12));
        (this.lblneutrophil = new JLabel("Neutrophil:")).setFont(new Font("Verdana", 0, 12));
        this.txtneutrophil = new JTextField();
        (this.lblgetneutrophil = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblneutrophilunit = new JLabel("%")).setFont(new Font("Verdana", 1, 12));
        (this.lblneutrophilnormal = new JLabel("55-70%")).setFont(new Font("Verdana", 1, 12));
        (this.lbllymphocyte = new JLabel("Lymphocyte:")).setFont(new Font("Verdana", 0, 12));
        this.txtlymphocyte = new JTextField();
        (this.lblgetlymphocyte = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lbllymphocyteunit = new JLabel("%")).setFont(new Font("Verdana", 1, 12));
        (this.lbllymphocytenormal = new JLabel("35-40%")).setFont(new Font("Verdana", 1, 12));
        (this.lbleosinophil = new JLabel("Eosinophil:")).setFont(new Font("Verdana", 0, 12));
        this.txteosinophil = new JTextField();
        (this.lblgeteosinophil = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lbleosinophilunit = new JLabel("%")).setFont(new Font("Verdana", 1, 12));
        (this.lbleosinophilnormal = new JLabel("1-6%")).setFont(new Font("Verdana", 1, 12));
        (this.lblplatelet = new JLabel("Platelet:")).setFont(new Font("Verdana", 0, 12));
        this.txtplatelet = new JTextField();
        (this.lblgetplatelet = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblplateletunit = new JLabel("/uL")).setFont(new Font("Verdana", 1, 12));
        (this.lblplateletnormal = new JLabel("1,50,000-3,00,000/uL")).setFont(new Font("Verdana", 1, 12));
        (this.lblesr = new JLabel("ESR:")).setFont(new Font("Verdana", 0, 12));
        this.txtesr = new JTextField();
        (this.lblgetesr = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblesrunit = new JLabel("mm-1hour")).setFont(new Font("Verdana", 1, 12));
        (this.lblesrnormal = new JLabel("0-20 mm-1hour")).setFont(new Font("Verdana", 1, 12));
        (this.lblhtest1 = new JLabel("Test")).setFont(new Font("Verdana", 1, 12));
        this.lblhtest1.setForeground(Color.blue);
        (this.lblhresult1 = new JLabel("Result")).setFont(new Font("Verdana", 1, 12));
        this.lblhresult1.setForeground(Color.blue);
        (this.lblhiv = new JLabel("HIV:")).setFont(new Font("Verdana", 0, 12));
        (this.rbhivpos = new JRadioButton("positive")).setBackground(Color.white);
        (this.rbhivneg = new JRadioButton("negetive", true)).setBackground(Color.white);
        (this.bg1 = new ButtonGroup()).add(this.rbhivpos);
        this.bg1.add(this.rbhivneg);
        (this.lblgethiv = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblvdrl = new JLabel("VDRL:")).setFont(new Font("Verdana", 0, 12));
        (this.rbvdrlreact = new JRadioButton("reactive")).setBackground(Color.white);
        (this.rbvdrlnon = new JRadioButton("non-reactive", true)).setBackground(Color.white);
        (this.bg2 = new ButtonGroup()).add(this.rbvdrlreact);
        this.bg2.add(this.rbvdrlnon);
        (this.lblgetvdrl = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        (this.lblhbsag = new JLabel("HBS Ag:")).setFont(new Font("Verdana", 0, 12));
        (this.rbhbspos = new JRadioButton("positive")).setBackground(Color.white);
        (this.rbhbsneg = new JRadioButton("negetive", true)).setBackground(Color.white);
        (this.bg3 = new ButtonGroup()).add(this.rbhbspos);
        this.bg3.add(this.rbhbsneg);
        (this.lblgethbsag = new JLabel("")).setFont(new Font("Verdana", 0, 12));
        this.btnsave = new JButton("Save");
        this.btnclear = new JButton("Clear");
        this.btnmodify = new JButton("Modify");
        this.btndelete = new JButton("Delete");
        this.lbltitle.setBounds(290, 10, 250, 20);
        this.lbltestid.setBounds(40, 50, 100, 20);
        this.lblgettestid.setBounds(150, 50, 90, 20);
        this.cbtestid.setBounds(150, 50, 90, 20);
        this.lbldate.setBounds(600, 50, 70, 20);
        this.cbdate.setBounds(660, 50, 90, 20);
        this.lblgetdate.setBounds(660, 50, 90, 20);
        this.lbldonorid.setBounds(40, 80, 100, 20);
        this.cbdonorid.setBounds(150, 80, 90, 20);
        this.lblgetdonorid.setBounds(150, 80, 90, 20);
        this.lblname.setBounds(260, 80, 100, 20);
        this.lblgetname.setBounds(370, 80, 90, 20);
        this.lblbloodgroup.setBounds(40, 110, 100, 20);
        this.lblgetbloodgroup.setBounds(150, 110, 90, 20);
        this.lblgender.setBounds(260, 110, 100, 20);
        this.lblgetgender.setBounds(370, 110, 90, 20);
        this.lblhtest.setBounds(60, 10, 100, 20);
        this.lblhresult.setBounds(180, 10, 100, 20);
        this.lblhnormal.setBounds(330, 10, 150, 20);
        this.lblbiochem.setBounds(20, 40, 150, 20);
        this.lblbilirubintot.setBounds(20, 70, 160, 20);
        this.txtbilirubintot.setBounds(156, 70, 80, 20);
        this.lblgetbilirubintot.setBounds(156, 70, 80, 20);
        this.lblbillitotunit.setBounds(240, 70, 80, 20);
        this.lblbillitotnormal.setBounds(330, 70, 120, 20);
        this.lblbilirubindir.setBounds(20, 100, 160, 20);
        this.txtbilirubindir.setBounds(156, 100, 80, 20);
        this.lblgetbilirubindir.setBounds(156, 100, 80, 20);
        this.lblbillidirunit.setBounds(240, 100, 80, 20);
        this.lblbillidirnormal.setBounds(330, 100, 120, 20);
        this.lblalt.setBounds(20, 130, 160, 20);
        this.txtalt.setBounds(156, 130, 80, 20);
        this.lblgetalt.setBounds(156, 130, 80, 20);
        this.lblaltunit.setBounds(240, 130, 80, 20);
        this.lblaltnormal.setBounds(330, 130, 120, 20);
        this.lblhaematology.setBounds(20, 160, 150, 20);
        this.lblhb.setBounds(20, 190, 160, 20);
        this.txthb.setBounds(156, 190, 80, 20);
        this.lblgethb.setBounds(156, 190, 80, 20);
        this.lblhbunit.setBounds(240, 190, 80, 20);
        this.lblhbnormal.setBounds(330, 190, 120, 20);
        this.lbltc.setBounds(20, 220, 160, 20);
        this.txttc.setBounds(156, 220, 80, 20);
        this.lblgettc.setBounds(156, 220, 80, 20);
        this.lbltcunit.setBounds(240, 220, 80, 20);
        this.lbltcnormal.setBounds(330, 220, 120, 20);
        this.lblneutrophil.setBounds(20, 250, 100, 20);
        this.txtneutrophil.setBounds(156, 250, 80, 20);
        this.lblgetneutrophil.setBounds(156, 250, 80, 20);
        this.lblneutrophilunit.setBounds(240, 250, 80, 20);
        this.lblneutrophilnormal.setBounds(330, 250, 120, 20);
        this.lbllymphocyte.setBounds(20, 280, 100, 20);
        this.txtlymphocyte.setBounds(156, 280, 80, 20);
        this.lblgetlymphocyte.setBounds(156, 280, 80, 20);
        this.lbllymphocyteunit.setBounds(240, 280, 80, 20);
        this.lbllymphocytenormal.setBounds(330, 280, 120, 20);
        this.lbleosinophil.setBounds(20, 310, 100, 20);
        this.txteosinophil.setBounds(156, 310, 80, 20);
        this.lblgeteosinophil.setBounds(156, 310, 80, 20);
        this.lbleosinophilunit.setBounds(240, 310, 80, 20);
        this.lbleosinophilnormal.setBounds(330, 310, 120, 20);
        this.lblplatelet.setBounds(20, 340, 100, 20);
        this.txtplatelet.setBounds(156, 340, 80, 20);
        this.lblgetplatelet.setBounds(156, 340, 80, 20);
        this.lblplateletunit.setBounds(240, 340, 80, 20);
        this.lblplateletnormal.setBounds(330, 340, 190, 20);
        this.lblesr.setBounds(20, 370, 100, 20);
        this.txtesr.setBounds(156, 370, 80, 20);
        this.lblgetesr.setBounds(156, 370, 80, 20);
        this.lblesrunit.setBounds(240, 370, 80, 20);
        this.lblesrnormal.setBounds(330, 370, 120, 20);
        this.btnsave.setBounds(570, 370, 90, 24);
        this.btnclear.setBounds(680, 370, 90, 24);
        this.btnmodify.setBounds(570, 370, 90, 24);
        this.btndelete.setBounds(460, 370, 90, 24);
        this.lblhtest1.setBounds(520, 10, 100, 20);
        this.lblhresult1.setBounds(640, 10, 100, 20);
        this.lblhiv.setBounds(510, 40, 100, 20);
        this.rbhivpos.setBounds(586, 40, 80, 20);
        this.rbhivneg.setBounds(670, 40, 80, 20);
        this.lblgethiv.setBounds(586, 40, 150, 20);
        this.lblvdrl.setBounds(510, 70, 100, 20);
        this.rbvdrlreact.setBounds(586, 70, 80, 20);
        this.rbvdrlnon.setBounds(670, 70, 100, 20);
        this.lblgetvdrl.setBounds(586, 70, 150, 20);
        this.lblhbsag.setBounds(510, 100, 100, 20);
        this.rbhbspos.setBounds(586, 100, 80, 20);
        this.rbhbsneg.setBounds(670, 100, 100, 20);
        this.lblgethbsag.setBounds(586, 100, 150, 20);
        (this.lbltestresult = new JLabel("Test Result:")).setFont(new Font("Verdana", 1, 12));
        (this.lbltestresultview = new JLabel("")).setFont(new Font("Verdana", 1, 12));
        this.lbltestresult.setBounds(510, 130, 100, 20);
        this.lbltestresultview.setBounds(600, 130, 150, 20);
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
        this.p5.add(this.lbltestid);
        this.p5.add(this.lblgettestid);
        this.p5.add(this.cbtestid);
        this.p5.add(this.lbldate);
        this.p5.add(this.cbdate);
        this.p5.add(this.lblgetdate);
        this.p5.add(this.lbldonorid);
        this.p5.add(this.cbdonorid);
        this.p5.add(this.lblgetdonorid);
        this.p5.add(this.lblname);
        this.p5.add(this.lblgetname);
        this.p5.add(this.lblbloodgroup);
        this.p5.add(this.lblgetbloodgroup);
        this.p5.add(this.lblgender);
        this.p5.add(this.lblgetgender);
        this.p6.add(this.lblhtest);
        this.p6.add(this.lblhresult);
        this.p6.add(this.lblhnormal);
        this.p6.add(this.lblbiochem);
        this.p6.add(this.lblbilirubintot);
        this.p6.add(this.txtbilirubintot);
        this.p6.add(this.lblgetbilirubintot);
        this.p6.add(this.lblbillitotunit);
        this.p6.add(this.lblbillidirunit);
        this.p6.add(this.lblbilirubindir);
        this.p6.add(this.txtbilirubindir);
        this.p6.add(this.lblgetbilirubindir);
        this.p6.add(this.lblbillitotnormal);
        this.p6.add(this.lblbillidirnormal);
        this.p6.add(this.lblalt);
        this.p6.add(this.txtalt);
        this.p6.add(this.lblgetalt);
        this.p6.add(this.lblaltunit);
        this.p6.add(this.lblaltnormal);
        this.p6.add(this.lblhaematology);
        this.p6.add(this.lblhb);
        this.p6.add(this.txthb);
        this.p6.add(this.lblgethb);
        this.p6.add(this.lblhbunit);
        this.p6.add(this.lblhbnormal);
        this.p6.add(this.lbltc);
        this.p6.add(this.txttc);
        this.p6.add(this.lblgettc);
        this.p6.add(this.lbltcunit);
        this.p6.add(this.lbltcnormal);
        this.p6.add(this.lblneutrophil);
        this.p6.add(this.txtneutrophil);
        this.p6.add(this.lblgetneutrophil);
        this.p6.add(this.lblneutrophilunit);
        this.p6.add(this.lblneutrophilnormal);
        this.p6.add(this.lbllymphocyte);
        this.p6.add(this.txtlymphocyte);
        this.p6.add(this.lblgetlymphocyte);
        this.p6.add(this.lbllymphocyteunit);
        this.p6.add(this.lbllymphocytenormal);
        this.p6.add(this.lbleosinophil);
        this.p6.add(this.txteosinophil);
        this.p6.add(this.lblgeteosinophil);
        this.p6.add(this.lbleosinophilunit);
        this.p6.add(this.lbleosinophilnormal);
        this.p6.add(this.lblplatelet);
        this.p6.add(this.txtplatelet);
        this.p6.add(this.lblgetplatelet);
        this.p6.add(this.lblplateletunit);
        this.p6.add(this.lblplateletnormal);
        this.p6.add(this.lblesr);
        this.p6.add(this.txtesr);
        this.p6.add(this.lblgetesr);
        this.p6.add(this.lblesrunit);
        this.p6.add(this.lblesrnormal);
        this.p6.add(this.lblhtest1);
        this.p6.add(this.lblhresult1);
        this.p6.add(this.lblhiv);
        this.p6.add(this.rbhivpos);
        this.p6.add(this.rbhivneg);
        this.p6.add(this.lblgethiv);
        this.p6.add(this.lblvdrl);
        this.p6.add(this.rbvdrlreact);
        this.p6.add(this.rbvdrlnon);
        this.p6.add(this.lblgetvdrl);
        this.p6.add(this.lblhbsag);
        this.p6.add(this.rbhbspos);
        this.p6.add(this.rbhbsneg);
        this.p6.add(this.lblgethbsag);
        this.p6.add(this.btnsave);
        this.p6.add(this.btnclear);
        this.p6.add(this.btnmodify);
        this.p6.add(this.btndelete);
        this.p6.add(this.lbltestresult);
        this.p6.add(this.lbltestresultview);
        contentPane.add(this.p1);
        contentPane.add(this.p2);
        contentPane.add(this.p3);
        contentPane.add(this.p4);
        contentPane.add(this.p5);
        contentPane.add(this.p6);
        this.setSize(1024, 768);
        this.setVisible(true);
        this.setTitle("Blood Test");
        this.setResizable(false);
        this.p5.setVisible(false);
        this.p6.setVisible(false);
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
        this.cbtestid.addActionListener(this);
        this.lbltestresult.setVisible(false);
        this.lbltestresultview.setVisible(false);
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
        if (actionEvent.getSource() == this.btnadd) {
            this.clear('a');
            this.clear('c');
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.p6.setVisible(true);
            this.btnadd.setBackground(Color.white);
            this.btnview.setBackground(Color.lightGray);
            this.btnupdate.setBackground(Color.lightGray);
            this.lbltitle.setText("Add blood test details");
            this.cbtestid.setVisible(false);
            this.lblgettestid.setVisible(true);
            this.lbldonorid.setVisible(true);
            this.cbdonorid.setVisible(true);
            this.lblgetdonorid.setVisible(false);
            if (this.cbdonorid.getItemCount() > 1) {
                this.cbdonorid.removeActionListener(this);
                this.cbdonorid.setSelectedIndex(0);
                this.cbdonorid.addActionListener(this);
            }
        }
        if (actionEvent.getSource() == this.btnview) {
            this.comboval = 1;
            this.clear('a');
            this.clear('v');
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.p6.setVisible(true);
            this.btnadd.setBackground(Color.lightGray);
            this.btnview.setBackground(Color.white);
            this.btnupdate.setBackground(Color.lightGray);
            this.lbltitle.setText("View blood test details");
            this.cbtestid.setVisible(true);
            this.lblgettestid.setVisible(false);
            this.lbldonorid.setVisible(false);
            this.cbdonorid.setVisible(false);
            this.lblgetdonorid.setVisible(false);
            if (this.cbtestid.getItemCount() > 1) {
                this.cbtestid.removeActionListener(this);
                this.cbtestid.setSelectedIndex(0);
                this.cbtestid.addActionListener(this);
            }
        }
        if (actionEvent.getSource() == this.btnupdate) {
            this.comboval = 2;
            this.clear('a');
            this.clear('c');
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.p6.setVisible(true);
            this.btnadd.setBackground(Color.lightGray);
            this.btnview.setBackground(Color.lightGray);
            this.btnupdate.setBackground(Color.white);
            this.lbltitle.setText("Edit blood test details");
            this.cbtestid.setVisible(true);
            this.lblgettestid.setVisible(false);
            this.lbldonorid.setVisible(false);
            this.cbdonorid.setVisible(false);
            this.lblgetdonorid.setVisible(false);
            if (this.cbtestid.getItemCount() > 1) {
                this.cbtestid.removeActionListener(this);
                this.cbtestid.setSelectedIndex(0);
                this.cbtestid.addActionListener(this);
            }
        }
        if (actionEvent.getSource() == this.btnsave) {
            final String trim = this.cbdonorid.getSelectedItem().toString().trim();
            if (!trim.equals("Select")) {
                final int int1 = Integer.parseInt(trim);
                int int2 = 0;
                final String trim2 = this.lblgetname.getText().trim();
                final String trim3 = this.lblgetgender.getText().trim();
                final String trim4 = this.lblgetbloodgroup.getText().trim();
                final String string = this.cbdate.getSelectedItem().toString();
                String str;
                if (this.rbhivpos.isSelected()) {
                    str = "positive";
                }
                else {
                    str = "negetive";
                }
                String str2;
                if (this.rbvdrlreact.isSelected()) {
                    str2 = "reactive";
                }
                else {
                    str2 = "nonreactive";
                }
                String str3;
                if (this.rbhbspos.isSelected()) {
                    str3 = "positive";
                }
                else {
                    str3 = "negetive";
                }
                final String trim5 = this.txtbilirubintot.getText().trim();
                final String trim6 = this.txtbilirubindir.getText().trim();
                final String trim7 = this.txtalt.getText().trim();
                final String trim8 = this.txthb.getText().trim();
                final String trim9 = this.txttc.getText().trim();
                final String trim10 = this.txtneutrophil.getText().trim();
                final String trim11 = this.txtlymphocyte.getText().trim();
                final String trim12 = this.txteosinophil.getText().trim();
                final String trim13 = this.txtplatelet.getText().trim();
                final String trim14 = this.txtesr.getText().trim();
                try {
                    final ResultSet exeQuery = this.db.exeQuery("select count(btid) from bloodtest WHERE donorid=" + int1 + " AND date='" + string + "'");
                    exeQuery.next();
                    int2 = exeQuery.getInt(1);
                }
                catch (Exception ex) {}
                if (int2 > 0) {
                    JOptionPane.showMessageDialog(null, "A blood test detail of " + trim2 + " was added on the same date(" + string + ")", "Duplicate Blood Test Error", 2);
                }
                else {
                    final String validate = this.cm.validate(new String[][] { { "s bilirubin total", trim5 }, { "s bilirubin direct", trim6 }, { "ALT", trim7 }, { "Heamoglobin", trim8 }, { "Total Count", trim9 }, { "Neutrophil", trim10 }, { "Lymphocyte", trim11 }, { "Eosinophil", trim12 }, { "Platelet", trim13 }, { "ESR", trim14 } }, new int[] { 3, 3, 2, 3, 2, 2, 2, 2, 2, 3 }, new Component[] { this.txtbilirubintot, this.txtbilirubindir, this.txtalt, this.txthb, this.txttc, this.txtneutrophil, this.txtlymphocyte, this.txteosinophil, this.txtplatelet, this.txtesr });
                    if (!validate.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, validate, "Validation", 2);
                    }
                    else {
                        final float float1 = Float.parseFloat(trim5);
                        final float float2 = Float.parseFloat(trim6);
                        final int int3 = Integer.parseInt(trim7);
                        final float float3 = Float.parseFloat(trim8);
                        final int int4 = Integer.parseInt(trim9);
                        final int int5 = Integer.parseInt(trim10);
                        final int int6 = Integer.parseInt(trim11);
                        final int int7 = Integer.parseInt(trim12);
                        final int int8 = Integer.parseInt(trim13);
                        final float float4 = Float.parseFloat(trim14);
                        String s = "";
                        String str4;
                        if (this.rbhivpos.isSelected() || this.rbvdrlreact.isSelected() || this.rbhbspos.isSelected() || float1 < 0.5 || float1 > 0.9 || float2 < 0.3 || float2 > 0.5 || int3 < 5 || int3 > 34 || float3 < 12.0f || float3 > 18.0f || int4 < 4000 || int4 > 10000 || int5 < 55 || int5 > 70 || int6 < 35 || int6 > 40 || int7 < 1 || int7 > 6 || int8 < 150000 || int8 > 300000 || float4 < 0.0f || float4 > 20.0f) {
                            if (this.rbhivpos.isSelected()) {
                                s += "HIV is positive\n";
                            }
                            if (this.rbvdrlreact.isSelected()) {
                                s += "VDRL is reactive\n";
                            }
                            if (this.rbhbspos.isSelected()) {
                                s += "HBS Ag is positive\n";
                            }
                            if (float1 < 0.5 || float1 > 0.9) {
                                s += "s bilirubin total is not in the normal range\n";
                            }
                            if (float2 < 0.3 || float2 > 0.5) {
                                s += "s bilirubin direct is not in the normal range\n";
                            }
                            if (int3 < 5 || int3 > 34) {
                                s += "ATL is not in the normal range\n";
                            }
                            if (float3 < 12.0f || float3 > 18.0f) {
                                s += "Haemoglobin is not in the normal range\n";
                            }
                            if (int4 < 4000 || int4 > 10000) {
                                s += "Total Count is not in the normal range\n";
                            }
                            if (int5 < 55 || int5 > 70) {
                                s += "Neutrophil is not in the normal range\n";
                            }
                            if (int6 < 35 || int6 > 40) {
                                s += "Lymphocyte is not in the normal range\n";
                            }
                            if (int7 < 1 || int7 > 6) {
                                s += "Eosinophil is not in the normal range\n";
                            }
                            if (int8 < 150000 || int8 > 300000) {
                                s += "Platelets is not in the normal range\n";
                            }
                            if (float4 < 0.0f || float4 > 20.0f) {
                                s += "ESR is not in the normal range\n";
                            }
                            str4 = "Failed";
                        }
                        else {
                            str4 = "Successful";
                        }
                        if (this.db.exeUpdate("insert into bloodtest(donorid,donorname,bloodgroup,gender,date,hiv,vdrl,hbsag,bilirubintotal,bilirubindirect,alt,hb,tc,neutrophil,lymphocyte,eosinophil,platelets,esr,testresult) values(" + int1 + ",'" + trim2 + "','" + trim4 + "','" + trim3 + "','" + string + "','" + str + "','" + str2 + "','" + str3 + "'," + float1 + "," + float2 + "," + int3 + "," + float3 + "," + int4 + "," + int5 + "," + int6 + "," + int7 + "," + int8 + "," + float4 + ",'" + str4 + "')") == 1) {
                            if (str4.equals("Successful")) {
                                JOptionPane.showMessageDialog(null, "Blood test details of " + trim2 + " added successfully\nTest result - Success", "Successfully Added", 1);
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Blood test details of " + trim2 + " added successfully\nTest result - Failed\nNOTE:\n" + s, "Successfully Added", 1);
                            }
                            this.clear('a');
                            this.clear('c');
                            if (this.cbdonorid.getItemCount() > 1) {
                                this.cbdonorid.removeActionListener(this);
                                this.cbdonorid.setSelectedIndex(0);
                                this.cbdonorid.addActionListener(this);
                            }
                            this.cbtestid.removeActionListener(this);
                            this.cbtestid.removeAllItems();
                            this.cbtestid.addItem("Select");
                            try {
                                final ResultSet exeQuery2 = this.db.exeQuery("select btid from bloodtest order by btid ASC");
                                while (exeQuery2.next()) {
                                    this.cbtestid.addItem(String.valueOf(exeQuery2.getInt(1)));
                                }
                                this.cbtestid.addActionListener(this);
                            }
                            catch (Exception ex2) {}
                            try {
                                final ResultSet exeQuery3 = this.db.exeQuery("select COALESCE(max(btid)+1,1) from bloodtest");
                                if (exeQuery3.next()) {
                                    this.lblgettestid.setText(exeQuery3.getString(1));
                                }
                            }
                            catch (Exception ex3) {}
                        }
                    }
                }
            }
        }
        if (actionEvent.getSource() == this.btnmodify) {
            final String trim15 = this.cbtestid.getSelectedItem().toString().trim();
            if (!trim15.equals("Select")) {
                final int int9 = Integer.parseInt(trim15);
                final String trim16 = this.lblgetname.getText().trim();
                this.lblgetgender.getText().trim();
                this.lblgetbloodgroup.getText().trim();
                this.cbdate.getSelectedItem().toString();
                String str5;
                if (this.rbhivpos.isSelected()) {
                    str5 = "positive";
                }
                else {
                    str5 = "negetive";
                }
                String str6;
                if (this.rbvdrlreact.isSelected()) {
                    str6 = "reactive";
                }
                else {
                    str6 = "nonreactive";
                }
                String str7;
                if (this.rbhbspos.isSelected()) {
                    str7 = "positive";
                }
                else {
                    str7 = "negetive";
                }
                final String trim17 = this.txtbilirubintot.getText().trim();
                final String trim18 = this.txtbilirubindir.getText().trim();
                final String trim19 = this.txtalt.getText().trim();
                final String trim20 = this.txthb.getText().trim();
                final String trim21 = this.txttc.getText().trim();
                final String trim22 = this.txtneutrophil.getText().trim();
                final String trim23 = this.txtlymphocyte.getText().trim();
                final String trim24 = this.txteosinophil.getText().trim();
                final String trim25 = this.txtplatelet.getText().trim();
                final String trim26 = this.txtesr.getText().trim();
                final String validate2 = this.cm.validate(new String[][] { { "s bilirubin total", trim17 }, { "s bilirubin direct", trim18 }, { "ALT", trim19 }, { "Heamoglobin", trim20 }, { "Total Count", trim21 }, { "Neutrophil", trim22 }, { "Lymphocyte", trim23 }, { "Eosinophil", trim24 }, { "Platelet", trim25 }, { "ESR", trim26 } }, new int[] { 3, 3, 2, 3, 2, 2, 2, 2, 2, 3 }, new Component[] { this.txtbilirubintot, this.txtbilirubindir, this.txtalt, this.txthb, this.txttc, this.txtneutrophil, this.txtlymphocyte, this.txteosinophil, this.txtplatelet, this.txtesr });
                if (!validate2.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, validate2, "Validation", 2);
                }
                else {
                    final float float5 = Float.parseFloat(trim17);
                    final float float6 = Float.parseFloat(trim18);
                    final int int10 = Integer.parseInt(trim19);
                    final float float7 = Float.parseFloat(trim20);
                    final int int11 = Integer.parseInt(trim21);
                    final int int12 = Integer.parseInt(trim22);
                    final int int13 = Integer.parseInt(trim23);
                    final int int14 = Integer.parseInt(trim24);
                    final int int15 = Integer.parseInt(trim25);
                    final float float8 = Float.parseFloat(trim26);
                    String s2 = "";
                    String str8;
                    if (this.rbhivpos.isSelected() || this.rbvdrlreact.isSelected() || this.rbhbspos.isSelected() || float5 < 0.5 || float5 > 0.9 || float6 < 0.3 || float6 > 0.5 || int10 < 5 || int10 > 34 || float7 < 12.0f || float7 > 18.0f || int11 < 4000 || int11 > 10000 || int12 < 55 || int12 > 70 || int13 < 35 || int13 > 40 || int14 < 1 || int14 > 6 || int15 < 150000 || int15 > 300000 || float8 < 0.0f || float8 > 20.0f) {
                        if (this.rbhivpos.isSelected()) {
                            s2 += "HIV is positive\n";
                        }
                        if (this.rbvdrlreact.isSelected()) {
                            s2 += "VDRL is reactive\n";
                        }
                        if (this.rbhbspos.isSelected()) {
                            s2 += "HBS Ag is positive\n";
                        }
                        if (float5 < 0.5 || float5 > 0.9) {
                            s2 += "s bilirubin total is not in the normal range\n";
                        }
                        if (float6 < 0.3 || float6 > 0.5) {
                            s2 += "s bilirubin direct is not in the normal range\n";
                        }
                        if (int10 < 5 || int10 > 34) {
                            s2 += "ATL is not in the normal range\n";
                        }
                        if (float7 < 12.0f || float7 > 18.0f) {
                            s2 += "Haemoglobin is not in the normal range\n";
                        }
                        if (int11 < 4000 || int11 > 10000) {
                            s2 += "Total Count is not in the normal range\n";
                        }
                        if (int12 < 55 || int12 > 70) {
                            s2 += "Neutrophil is not in the normal range\n";
                        }
                        if (int13 < 35 || int13 > 40) {
                            s2 += "Lymphocyte is not in the normal range\n";
                        }
                        if (int14 < 1 || int14 > 6) {
                            s2 += "Eosinophil is not in the normal range\n";
                        }
                        if (int15 < 150000 || int15 > 300000) {
                            s2 += "Platelets is not in the normal range\n";
                        }
                        if (float8 < 0.0f || float8 > 20.0f) {
                            s2 += "ESR is not in the normal range\n";
                        }
                        str8 = "Failed";
                    }
                    else {
                        str8 = "Successful";
                    }
                    if (this.db.exeUpdate("update bloodtest set hiv='" + str5 + "',vdrl='" + str6 + "',hbsag='" + str7 + "',bilirubintotal=" + float5 + ",bilirubindirect=" + float6 + ",alt=" + int10 + ",hb=" + float7 + ",tc=" + int11 + ",neutrophil=" + int12 + ",lymphocyte=" + int13 + ",eosinophil=" + int14 + ",platelets=" + int15 + ",esr=" + float8 + ",testresult ='" + str8 + "' WHERE btid=" + int9) == 1) {
                        if (str8.equals("Successful")) {
                            JOptionPane.showMessageDialog(null, "Blood test details of " + trim16 + " updated successfully\nTest result - Success", "Successfully Updated", 1);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Blood test details of " + trim16 + " updated successfully\nTest result - Failed\nNOTE:\n" + s2, "Successfully Updated", 1);
                        }
                        this.clear('a');
                        this.clear('c');
                        this.lblgetdonorid.setVisible(false);
                        this.lbldonorid.setVisible(false);
                    }
                }
            }
        }
        if (actionEvent.getSource() == this.btndelete) {
            final String trim27 = this.cbtestid.getSelectedItem().toString().trim();
            final String trim28 = this.lblgetname.getText().trim();
            int int16 = 0;
            if (!trim27.equals("Select")) {
                final int int17 = Integer.parseInt(trim27);
                try {
                    final ResultSet exeQuery4 = this.db.exeQuery("select count(bloodtestid) from bloodstock WHERE bloodtestid=" + int17);
                    exeQuery4.next();
                    int16 = exeQuery4.getInt(1);
                }
                catch (Exception ex4) {}
                if (int16 > 0) {
                    JOptionPane.showMessageDialog(null, "Details of this blood test is used in the blood stock!", "No delete permission", 0);
                }
                else if (int16 == 0) {
                    if (this.db.exeUpdate("DELETE FROM bloodtest WHERE  btid=" + int17) > 0) {
                        JOptionPane.showMessageDialog(null, "Blood test details of " + trim28 + " deleted successfully", "Successfully Deleted", 1);
                    }
                    this.clear('a');
                    this.clear('c');
                    this.cbtestid.removeActionListener(this);
                    this.cbtestid.removeAllItems();
                    this.cbtestid.addItem("Select");
                    try {
                        final ResultSet exeQuery5 = this.db.exeQuery("select btid from bloodtest order by btid ASC");
                        while (exeQuery5.next()) {
                            this.cbtestid.addItem(String.valueOf(exeQuery5.getInt(1)));
                        }
                    }
                    catch (Exception ex5) {}
                    this.cbtestid.addActionListener(this);
                    this.lblgetdonorid.setVisible(false);
                    this.lbldonorid.setVisible(false);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Error updating details", "Error", 2);
            }
        }
        if (actionEvent.getSource() == this.btnclear) {
            this.clear('c');
        }
        if (actionEvent.getSource() == this.cbtestid) {
            final String trim29 = this.cbtestid.getSelectedItem().toString().trim();
            if (trim29.equals("Select")) {
                this.clear('a');
                this.lbldonorid.setVisible(false);
                this.lblgetdonorid.setVisible(false);
            }
            else {
                final int int18 = Integer.parseInt(trim29);
                String string2 = "";
                String string3 = "";
                String string4 = "";
                String string5 = "";
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
                String string17 = "";
                String string18 = "";
                String string19 = "";
                String string20 = "";
                try {
                    final ResultSet exeQuery6 = this.db.exeQuery("select donorid,donorname,bloodgroup,gender,date,hiv,vdrl,hbsag,bilirubintotal,bilirubindirect,alt,hb,tc,neutrophil,lymphocyte,eosinophil,platelets,esr,testresult from bloodtest where btid=" + int18);
                    exeQuery6.next();
                    string2 = exeQuery6.getString(1);
                    string3 = exeQuery6.getString(2);
                    string4 = exeQuery6.getString(3);
                    string5 = exeQuery6.getString(4);
                    string6 = exeQuery6.getString(5);
                    string7 = exeQuery6.getString(6);
                    string8 = exeQuery6.getString(7);
                    string9 = exeQuery6.getString(8);
                    string10 = exeQuery6.getString(9);
                    string11 = exeQuery6.getString(10);
                    string12 = exeQuery6.getString(11);
                    string13 = exeQuery6.getString(12);
                    string14 = exeQuery6.getString(13);
                    string15 = exeQuery6.getString(14);
                    string16 = exeQuery6.getString(15);
                    string17 = exeQuery6.getString(16);
                    string18 = exeQuery6.getString(17);
                    string19 = exeQuery6.getString(18);
                    string20 = exeQuery6.getString(19);
                }
                catch (Exception ex6) {}
                this.lblgetdonorid.setText(string2);
                this.lblgetname.setText(string3);
                this.lblgetbloodgroup.setText(string4);
                this.lblgetgender.setText(string5);
                this.lblgetdate.setText(string6);
                if (this.comboval == 1) {
                    this.lblgethiv.setText(string7);
                    this.lblgetvdrl.setText(string8);
                    this.lblgethbsag.setText(string9);
                    this.lblgetbilirubintot.setText(string10);
                    this.lblgetbilirubindir.setText(string11);
                    this.lblgethb.setText(string13);
                    this.lblgettc.setText(string14);
                    this.lblgetneutrophil.setText(string15);
                    this.lblgetlymphocyte.setText(string16);
                    this.lblgeteosinophil.setText(string17);
                    this.lblgetplatelet.setText(string18);
                    this.lblgetesr.setText(string19);
                    this.lbltestresultview.setText(string20);
                    this.visible('v');
                    if (string20.equals("Successful")) {
                        this.lbltestresultview.setForeground(Color.green);
                    }
                    else {
                        this.lbltestresultview.setForeground(Color.red);
                    }
                }
                else if (this.comboval == 2) {
                    if (string7.equals("positive")) {
                        this.rbhivpos.setSelected(true);
                    }
                    else {
                        this.rbhivneg.setSelected(true);
                    }
                    if (string8.equals("reactive")) {
                        this.rbvdrlreact.setSelected(true);
                    }
                    else {
                        this.rbvdrlnon.setSelected(true);
                    }
                    if (string9.equals("positive")) {
                        this.rbhbspos.setSelected(true);
                    }
                    else {
                        this.rbhbsneg.setSelected(true);
                    }
                    this.txtbilirubintot.setText(string10);
                    this.txtbilirubindir.setText(string11);
                    this.txtalt.setText(string12);
                    this.txthb.setText(string13);
                    this.txttc.setText(string14);
                    this.txtneutrophil.setText(string15);
                    this.txtlymphocyte.setText(string16);
                    this.txteosinophil.setText(string17);
                    this.txtplatelet.setText(string18);
                    this.txtesr.setText(string19);
                    this.visible('e');
                }
            }
        }
        if (actionEvent.getSource() == this.cbdonorid) {
            final String trim30 = this.cbdonorid.getSelectedItem().toString().trim();
            if (trim30.equals("Select")) {
                this.clear('a');
            }
            else {
                this.visible('a');
                final int int19 = Integer.parseInt(trim30);
                String string21 = "";
                String string22 = "";
                String string23 = "";
                try {
                    final ResultSet exeQuery7 = this.db.exeQuery("select name,gender,bgroup from donor where did=" + int19);
                    exeQuery7.next();
                    string21 = exeQuery7.getString(1);
                    string22 = exeQuery7.getString(2);
                    string23 = exeQuery7.getString(3);
                }
                catch (Exception ex7) {}
                this.lblgetname.setText(string21);
                this.lblgetgender.setText(string22);
                this.lblgetbloodgroup.setText(string23);
            }
        }
    }
    
    public void clear(final char c) {
        switch (c) {
            case 'a': {
                this.lbldate.setVisible(false);
                this.cbdate.setVisible(false);
                this.lblgetdate.setVisible(false);
                this.lblname.setVisible(false);
                this.lblgetname.setVisible(false);
                this.lblbloodgroup.setVisible(false);
                this.lblgetbloodgroup.setVisible(false);
                this.lblgender.setVisible(false);
                this.lblgetgender.setVisible(false);
                this.lblhtest.setVisible(false);
                this.lblhresult.setVisible(false);
                this.lblhnormal.setVisible(false);
                this.lblbiochem.setVisible(false);
                this.lblbilirubintot.setVisible(false);
                this.txtbilirubintot.setVisible(false);
                this.lblgetbilirubintot.setVisible(false);
                this.lblbillitotunit.setVisible(false);
                this.lblbillidirunit.setVisible(false);
                this.lblbilirubindir.setVisible(false);
                this.txtbilirubindir.setVisible(false);
                this.lblgetbilirubindir.setVisible(false);
                this.lblbillitotnormal.setVisible(false);
                this.lblbillidirnormal.setVisible(false);
                this.lblalt.setVisible(false);
                this.txtalt.setVisible(false);
                this.lblgetalt.setVisible(false);
                this.lblaltunit.setVisible(false);
                this.lblaltnormal.setVisible(false);
                this.lblhaematology.setVisible(false);
                this.lblhb.setVisible(false);
                this.txthb.setVisible(false);
                this.lblgethb.setVisible(false);
                this.lblhbunit.setVisible(false);
                this.lblhbnormal.setVisible(false);
                this.lbltc.setVisible(false);
                this.txttc.setVisible(false);
                this.lblgettc.setVisible(false);
                this.lbltcunit.setVisible(false);
                this.lbltcnormal.setVisible(false);
                this.lblneutrophil.setVisible(false);
                this.txtneutrophil.setVisible(false);
                this.lblgetneutrophil.setVisible(false);
                this.lblneutrophilunit.setVisible(false);
                this.lblneutrophilnormal.setVisible(false);
                this.lbllymphocyte.setVisible(false);
                this.txtlymphocyte.setVisible(false);
                this.lblgetlymphocyte.setVisible(false);
                this.lbllymphocyteunit.setVisible(false);
                this.lbllymphocytenormal.setVisible(false);
                this.lbleosinophil.setVisible(false);
                this.txteosinophil.setVisible(false);
                this.lblgeteosinophil.setVisible(false);
                this.lbleosinophilunit.setVisible(false);
                this.lbleosinophilnormal.setVisible(false);
                this.lblplatelet.setVisible(false);
                this.txtplatelet.setVisible(false);
                this.lblgetplatelet.setVisible(false);
                this.lblplateletunit.setVisible(false);
                this.lblplateletnormal.setVisible(false);
                this.lblesr.setVisible(false);
                this.txtesr.setVisible(false);
                this.lblgetesr.setVisible(false);
                this.lblesrunit.setVisible(false);
                this.lblesrnormal.setVisible(false);
                this.lblhtest1.setVisible(false);
                this.lblhresult1.setVisible(false);
                this.lblhiv.setVisible(false);
                this.rbhivpos.setVisible(false);
                this.rbhivneg.setVisible(false);
                this.lblgethiv.setVisible(false);
                this.lblvdrl.setVisible(false);
                this.rbvdrlreact.setVisible(false);
                this.rbvdrlnon.setVisible(false);
                this.lblgetvdrl.setVisible(false);
                this.lblhbsag.setVisible(false);
                this.rbhbspos.setVisible(false);
                this.rbhbsneg.setVisible(false);
                this.lblgethbsag.setVisible(false);
                this.btnsave.setVisible(false);
                this.btnclear.setVisible(false);
                this.btnmodify.setVisible(false);
                this.btndelete.setVisible(false);
                this.lbltestresult.setVisible(false);
                this.lbltestresultview.setVisible(false);
                break;
            }
            case 'c': {
                this.rbhivneg.setSelected(true);
                this.rbvdrlnon.setSelected(true);
                this.rbhbsneg.setSelected(true);
                this.txtbilirubintot.setText("");
                this.txtbilirubindir.setText("");
                this.txtalt.setText("");
                this.txthb.setText("");
                this.txttc.setText("");
                this.txtneutrophil.setText("");
                this.txtlymphocyte.setText("");
                this.txteosinophil.setText("");
                this.txtplatelet.setText("");
                this.txtesr.setText("");
                this.txtbilirubintot.setBackground(Color.white);
                this.txtbilirubindir.setBackground(Color.white);
                this.txtalt.setBackground(Color.white);
                this.txthb.setBackground(Color.white);
                this.txttc.setBackground(Color.white);
                this.txtneutrophil.setBackground(Color.white);
                this.txtlymphocyte.setBackground(Color.white);
                this.txteosinophil.setBackground(Color.white);
                this.txtplatelet.setBackground(Color.white);
                this.txtesr.setBackground(Color.white);
                break;
            }
            case 'v': {
                this.lblgethiv.setText("");
                this.lblgetvdrl.setText("");
                this.lblgethbsag.setText("");
                this.lblgetbilirubintot.setText("");
                this.lblgetbilirubindir.setText("");
                this.lblgetalt.setText("");
                this.lblgethb.setText("");
                this.lblgettc.setText("");
                this.lblgetneutrophil.setText("");
                this.lblgetlymphocyte.setText("");
                this.lblgeteosinophil.setText("");
                this.lblgetplatelet.setText("");
                this.lblgetesr.setText("");
                break;
            }
        }
    }
    
    public void visible(final char c) {
        switch (c) {
            case 'a': {
                this.visible('c');
                this.cbdate.setVisible(true);
                this.txtbilirubintot.setVisible(true);
                this.txtbilirubindir.setVisible(true);
                this.txtalt.setVisible(true);
                this.txthb.setVisible(true);
                this.txttc.setVisible(true);
                this.txtneutrophil.setVisible(true);
                this.txtlymphocyte.setVisible(true);
                this.txteosinophil.setVisible(true);
                this.txtplatelet.setVisible(true);
                this.txtesr.setVisible(true);
                this.rbhivpos.setVisible(true);
                this.rbhivneg.setVisible(true);
                this.rbvdrlreact.setVisible(true);
                this.rbvdrlnon.setVisible(true);
                this.rbhbspos.setVisible(true);
                this.rbhbsneg.setVisible(true);
                this.btnsave.setVisible(true);
                this.btnclear.setVisible(true);
                break;
            }
            case 'v': {
                this.visible('c');
                this.lblgetdate.setVisible(true);
                this.lbldonorid.setVisible(true);
                this.lblgetdonorid.setVisible(true);
                this.lblgetbilirubintot.setVisible(true);
                this.lblgetbilirubindir.setVisible(true);
                this.lblgetalt.setVisible(true);
                this.lblgethb.setVisible(true);
                this.lblgettc.setVisible(true);
                this.lblgetneutrophil.setVisible(true);
                this.lblgetlymphocyte.setVisible(true);
                this.lblgeteosinophil.setVisible(true);
                this.lblgetplatelet.setVisible(true);
                this.lblgetesr.setVisible(true);
                this.lblgethiv.setVisible(true);
                this.lblgetvdrl.setVisible(true);
                this.lblgethbsag.setVisible(true);
                this.lbltestresult.setVisible(true);
                this.lbltestresultview.setVisible(true);
                break;
            }
            case 'e': {
                this.visible('c');
                this.lblgetdate.setVisible(true);
                this.lbldonorid.setVisible(true);
                this.lblgetdonorid.setVisible(true);
                this.txtbilirubintot.setVisible(true);
                this.txtbilirubindir.setVisible(true);
                this.txtalt.setVisible(true);
                this.txthb.setVisible(true);
                this.txttc.setVisible(true);
                this.txtneutrophil.setVisible(true);
                this.txtlymphocyte.setVisible(true);
                this.txteosinophil.setVisible(true);
                this.txtplatelet.setVisible(true);
                this.txtesr.setVisible(true);
                this.rbhivpos.setVisible(true);
                this.rbhivneg.setVisible(true);
                this.rbvdrlreact.setVisible(true);
                this.rbvdrlnon.setVisible(true);
                this.rbhbspos.setVisible(true);
                this.rbhbsneg.setVisible(true);
                this.btnmodify.setVisible(true);
                this.btndelete.setVisible(true);
                this.btnclear.setVisible(true);
                break;
            }
            case 'c': {
                this.lbldate.setVisible(true);
                this.lblname.setVisible(true);
                this.lblgetname.setVisible(true);
                this.lblbloodgroup.setVisible(true);
                this.lblgetbloodgroup.setVisible(true);
                this.lblgender.setVisible(true);
                this.lblgetgender.setVisible(true);
                this.lblhtest.setVisible(true);
                this.lblhresult.setVisible(true);
                this.lblhnormal.setVisible(true);
                this.lblbiochem.setVisible(true);
                this.lblbilirubintot.setVisible(true);
                this.lblbillitotunit.setVisible(true);
                this.lblbillitotnormal.setVisible(true);
                this.lblbilirubindir.setVisible(true);
                this.lblbillidirunit.setVisible(true);
                this.lblbillidirnormal.setVisible(true);
                this.lblalt.setVisible(true);
                this.lblaltunit.setVisible(true);
                this.lblaltnormal.setVisible(true);
                this.lblhaematology.setVisible(true);
                this.lblhb.setVisible(true);
                this.lblhbunit.setVisible(true);
                this.lblhbnormal.setVisible(true);
                this.lbltc.setVisible(true);
                this.lbltcunit.setVisible(true);
                this.lbltcnormal.setVisible(true);
                this.lblneutrophil.setVisible(true);
                this.lblneutrophilunit.setVisible(true);
                this.lblneutrophilnormal.setVisible(true);
                this.lbllymphocyte.setVisible(true);
                this.lbllymphocyteunit.setVisible(true);
                this.lbllymphocytenormal.setVisible(true);
                this.lbleosinophil.setVisible(true);
                this.lbleosinophilunit.setVisible(true);
                this.lbleosinophilnormal.setVisible(true);
                this.lblplatelet.setVisible(true);
                this.lblplateletunit.setVisible(true);
                this.lblplateletnormal.setVisible(true);
                this.lblesr.setVisible(true);
                this.lblesrunit.setVisible(true);
                this.lblesrnormal.setVisible(true);
                this.lblhtest1.setVisible(true);
                this.lblhresult1.setVisible(true);
                this.lblhiv.setVisible(true);
                this.lblvdrl.setVisible(true);
                this.lblhbsag.setVisible(true);
                break;
            }
        }
    }
    
    public static void main(final String[] array) {
    }
}
