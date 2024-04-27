import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.event.MouseAdapter;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.PopupMenuEvent;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import java.util.Calendar;
import javax.swing.event.PopupMenuListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.Container;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import com.sun.java.swing.plaf.windows.WindowsComboBoxUI;
import com.sun.java.swing.plaf.motif.MotifComboBoxUI;
import javax.swing.plaf.metal.MetalComboBoxUI;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.ComboBoxUI;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;

// 
// Decompiled by Procyon v0.5.36
// 

public class DateComboBox extends JComboBox
{
    protected SimpleDateFormat dateFormat;
    
    public DateComboBox() {
        this.dateFormat = new SimpleDateFormat("d/M/yyyy");
    }
    
    public void setDateFormat(final SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }
    
    @Override
    public void setSelectedItem(final Object o) {
        this.removeAllItems();
        this.addItem(o);
        super.setSelectedItem(o);
    }
    
    @Override
    public void updateUI() {
        Object ui = UIManager.getUI(this);
        if (ui instanceof MetalComboBoxUI) {
            ui = new MetalDateComboBoxUI();
        }
        else if (ui instanceof MotifComboBoxUI) {
            ui = new MotifDateComboBoxUI();
        }
        else if (ui instanceof WindowsComboBoxUI) {
            ui = new WindowsDateComboBoxUI();
        }
        this.setUI((ComboBoxUI)ui);
    }
    
    public static void main(final String[] array) {
        final JFrame frame = new JFrame();
        final Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("Date:"));
        contentPane.add(new DateComboBox());
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        frame.setSize(200, 100);
        frame.show();
    }
    
    class MetalDateComboBoxUI extends MetalComboBoxUI
    {
        @Override
        protected ComboPopup createPopup() {
            return new DatePopup(this.comboBox);
        }
    }
    
    class WindowsDateComboBoxUI extends WindowsComboBoxUI
    {
        protected ComboPopup createPopup() {
            return new DatePopup(this.comboBox);
        }
    }
    
    class MotifDateComboBoxUI extends MotifComboBoxUI
    {
        @Override
        protected ComboPopup createPopup() {
            return new DatePopup(this.comboBox);
        }
    }
    
    class DatePopup extends updateDate implements ComboPopup, MouseMotionListener, MouseListener, KeyListener, PopupMenuListener
    {
        protected JComboBox comboBox;
        protected Calendar calendar;
        protected JPopupMenu popup;
        protected JLabel monthLabel;
        protected JPanel days;
        protected SimpleDateFormat monthFormat;
        protected Color selectedBackground;
        protected Color selectedForeground;
        protected Color background;
        protected Color foreground;
        protected JList list;
        protected boolean mouseInside;
        protected boolean hideNext;
        
        public DatePopup(final JComboBox comboBox) {
            this.days = null;
            this.monthFormat = new SimpleDateFormat("d/M/yyyy");
            this.list = new JList();
            this.mouseInside = false;
            this.hideNext = false;
            this.comboBox = comboBox;
            this.calendar = Calendar.getInstance();
            if (DatePopup.yr == 0 && DatePopup.mn == 0 && DatePopup.dts == 0) {
                DatePopup.yr = this.calendar.get(1);
                DatePopup.mn = this.calendar.get(2);
                ++DatePopup.mn;
                DatePopup.dts = this.calendar.get(5);
            }
            comboBox.addItem(DatePopup.dts + "/" + DatePopup.mn + "/" + DatePopup.yr);
            this.background = UIManager.getColor("ComboBox.background");
            this.foreground = UIManager.getColor("ComboBox.foreground");
            this.selectedBackground = UIManager.getColor("ComboBox.selectionBackground");
            this.selectedForeground = UIManager.getColor("ComboBox.selectionForeground");
            this.initializePopup();
        }
        
        @Override
        public void show() {
            try {
                this.calendar.setTime(DateComboBox.this.dateFormat.parse(this.comboBox.getSelectedItem().toString()));
            }
            catch (Exception ex) {}
            this.updatePopup();
            this.popup.show(this.comboBox, 0, this.comboBox.getHeight());
        }
        
        @Override
        public void hide() {
            this.popup.setVisible(false);
        }
        
        @Override
        public JList getList() {
            return this.list;
        }
        
        @Override
        public MouseListener getMouseListener() {
            return this;
        }
        
        @Override
        public MouseMotionListener getMouseMotionListener() {
            return this;
        }
        
        @Override
        public KeyListener getKeyListener() {
            return this;
        }
        
        @Override
        public boolean isVisible() {
            return this.popup.isVisible();
        }
        
        @Override
        public void uninstallingUI() {
            this.popup.removePopupMenuListener(this);
        }
        
        @Override
        public void mousePressed(final MouseEvent mouseEvent) {
        }
        
        @Override
        public void mouseReleased(final MouseEvent mouseEvent) {
        }
        
        @Override
        public void mouseClicked(final MouseEvent anEvent) {
            if (!SwingUtilities.isLeftMouseButton(anEvent)) {
                return;
            }
            if (!this.comboBox.isEnabled()) {
                return;
            }
            if (this.comboBox.isEditable()) {
                this.comboBox.getEditor().getEditorComponent().requestFocus();
            }
            else {
                this.comboBox.requestFocus();
            }
            this.togglePopup();
        }
        
        @Override
        public void mouseEntered(final MouseEvent mouseEvent) {
            this.mouseInside = true;
        }
        
        @Override
        public void mouseExited(final MouseEvent mouseEvent) {
            this.mouseInside = false;
        }
        
        @Override
        public void mouseDragged(final MouseEvent mouseEvent) {
        }
        
        @Override
        public void mouseMoved(final MouseEvent mouseEvent) {
        }
        
        @Override
        public void keyPressed(final KeyEvent keyEvent) {
        }
        
        @Override
        public void keyTyped(final KeyEvent keyEvent) {
        }
        
        @Override
        public void keyReleased(final KeyEvent keyEvent) {
            if (keyEvent.getKeyCode() == 32 || keyEvent.getKeyCode() == 10) {
                this.togglePopup();
            }
        }
        
        @Override
        public void popupMenuCanceled(final PopupMenuEvent popupMenuEvent) {
        }
        
        @Override
        public void popupMenuWillBecomeInvisible(final PopupMenuEvent popupMenuEvent) {
            this.hideNext = this.mouseInside;
        }
        
        @Override
        public void popupMenuWillBecomeVisible(final PopupMenuEvent popupMenuEvent) {
        }
        
        protected void togglePopup() {
            if (this.isVisible() || this.hideNext) {
                this.hide();
            }
            else {
                this.show();
            }
            this.hideNext = false;
        }
        
        protected JLabel createUpdateButton(final int n, final int n2) {
            final JLabel label = new JLabel();
            final EtchedBorder etchedBorder = new EtchedBorder();
            final EmptyBorder border = new EmptyBorder(etchedBorder.getBorderInsets(new JLabel()));
            label.setBorder(border);
            label.setForeground(this.foreground);
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(final MouseEvent mouseEvent) {
                    DatePopup.this.calendar.add(n, n2);
                    DatePopup.this.updatePopup();
                }
                
                @Override
                public void mouseEntered(final MouseEvent mouseEvent) {
                    label.setBorder(etchedBorder);
                }
                
                @Override
                public void mouseExited(final MouseEvent mouseEvent) {
                    label.setBorder(border);
                }
            });
            return label;
        }
        
        protected void initializePopup() {
            final JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, 0));
            panel.setBackground(this.background);
            panel.setOpaque(true);
            final JLabel updateButton = this.createUpdateButton(1, -1);
            updateButton.setText("<<");
            updateButton.setToolTipText("Previous Year");
            panel.add(Box.createHorizontalStrut(12));
            panel.add(updateButton);
            panel.add(Box.createHorizontalStrut(12));
            final JLabel updateButton2 = this.createUpdateButton(2, -1);
            updateButton2.setText("<");
            updateButton2.setToolTipText("Previous Month");
            panel.add(updateButton2);
            (this.monthLabel = new JLabel("", 0)).setForeground(this.foreground);
            panel.add(Box.createHorizontalGlue());
            panel.add(this.monthLabel);
            panel.add(Box.createHorizontalGlue());
            final JLabel updateButton3 = this.createUpdateButton(2, 1);
            updateButton3.setText(">");
            updateButton3.setToolTipText("Next Month");
            panel.add(updateButton3);
            final JLabel updateButton4 = this.createUpdateButton(1, 1);
            updateButton4.setText(">>");
            updateButton4.setToolTipText("Next Year");
            panel.add(Box.createHorizontalStrut(12));
            panel.add(updateButton4);
            panel.add(Box.createHorizontalStrut(12));
            (this.popup = new JPopupMenu()).setBorder(BorderFactory.createLineBorder(Color.black));
            this.popup.setLayout(new BorderLayout());
            this.popup.setBackground(this.background);
            this.popup.addPopupMenuListener(this);
            this.popup.add("North", panel);
        }
        
        protected void updatePopup() {
            this.monthLabel.setText(this.monthFormat.format(this.calendar.getTime()));
            if (this.days != null) {
                this.popup.remove(this.days);
            }
            (this.days = new JPanel(new GridLayout(0, 7))).setBackground(this.background);
            this.days.setOpaque(true);
            final Calendar calendar = (Calendar)this.calendar.clone();
            calendar.set(7, calendar.getFirstDayOfWeek());
            for (int i = 0; i < 7; ++i) {
                final int value = calendar.get(7);
                final JLabel comp = new JLabel();
                comp.setHorizontalAlignment(0);
                comp.setForeground(this.foreground);
                if (value == 1) {
                    comp.setText("Sun");
                }
                else if (value == 2) {
                    comp.setText("Mon");
                }
                else if (value == 3) {
                    comp.setText("Tue");
                }
                else if (value == 4) {
                    comp.setText("Wed");
                }
                else if (value == 5) {
                    comp.setText("Thu");
                }
                else if (value == 6) {
                    comp.setText("Fri");
                }
                else if (value == 7) {
                    comp.setText("Sat");
                }
                this.days.add(comp);
                calendar.roll(7, true);
            }
            final Calendar calendar2 = (Calendar)this.calendar.clone();
            calendar2.set(5, 1);
            for (int value2 = calendar2.get(7), j = 0; j < value2 - 1; ++j) {
                this.days.add(new JLabel(""));
            }
            for (int k = 1; k <= calendar2.getActualMaximum(5); ++k) {
                final int l = k;
                final JLabel comp2 = new JLabel(String.valueOf(l));
                comp2.setHorizontalAlignment(0);
                comp2.setForeground(this.foreground);
                comp2.addMouseListener(new MouseListener() {
                    @Override
                    public void mousePressed(final MouseEvent mouseEvent) {
                    }
                    
                    @Override
                    public void mouseClicked(final MouseEvent mouseEvent) {
                    }
                    
                    @Override
                    public void mouseReleased(final MouseEvent mouseEvent) {
                        comp2.setOpaque(false);
                        comp2.setBackground(DatePopup.this.background);
                        comp2.setForeground(DatePopup.this.foreground);
                        DatePopup.this.calendar.set(5, l);
                        DatePopup.this.comboBox.setSelectedItem(DateComboBox.this.dateFormat.format(DatePopup.this.calendar.getTime()));
                        DatePopup.this.hide();
                        DatePopup.this.comboBox.requestFocus();
                    }
                    
                    @Override
                    public void mouseEntered(final MouseEvent mouseEvent) {
                        comp2.setOpaque(true);
                        comp2.setBackground(DatePopup.this.selectedBackground);
                        comp2.setForeground(DatePopup.this.selectedForeground);
                    }
                    
                    @Override
                    public void mouseExited(final MouseEvent mouseEvent) {
                        comp2.setOpaque(false);
                        comp2.setBackground(DatePopup.this.background);
                        comp2.setForeground(DatePopup.this.foreground);
                    }
                });
                this.days.add(comp2);
            }
            this.popup.add("Center", this.days);
            this.popup.pack();
        }
    }
}
