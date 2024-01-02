import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Color;
import java.awt.Font;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Booking implements ActionListener {
    JFrame j;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17,l18,l19;
    JTextField t1, t2, t3;
    JComboBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;
    JButton b;

    public Booking() {
        j = new JFrame("Room Booking");
        j.setSize(675, 800);
        j.setLayout(null);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        Color color = new Color(255, 196, 118);
        j.getContentPane().setBackground(color);

        String[] Room = {"---ROOM---"," Single Room ","Couple Room","Family Room "};

        String[] Facility ={"--FACILITY--","1-Star(Just Rest)","2-Star(Basic Necessities)","3-Star(Multiple Rooms)",
                            "4-Star(Upscale Comfort)","5-Star(Luxury)"}; 

        String[] Days={"--Days--","1","2","3","4","5"};           
        
        String[] Rooms={"--Rooms--","1","2","3"};

        String[] Date={"--Date--","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
                                  "21","22","23","24","25","26","27","28","29","30","31"};

        String[] Months={"--Months--","January","Febuary","March","April","May","June","July","August","September","Octomber","November","December"};

        String[] Gender={"--Select--","0","1","2","3","4"};

        b = new JButton("BOOK NOW");

        l18 = new JLabel("HOTEL TITAN");
        l1 = new JLabel("Successfully Registed");
        l2 = new JLabel(" Now You Can Book A Room ");
        l3 = new JLabel(" USERNAME :- ");
        l4 = new JLabel(" For Indetity Cleary Fication ");
        l5 = new JLabel(" AADHAR CARD NO. :- ");
        l6 = new JLabel(" MOBILE NO.      :- ");
        l7 = new JLabel(" Room Type :-");
        l8 = new JLabel(" FACILITY :- ");
        l9 = new JLabel(" Spending Days :-");
        l10 = new JLabel(" Numbers Of Room :-");
        l11 = new JLabel("CHECK IN DATE :- ");
        l12 = new JLabel("CHECK OUT DATE :- ");
        l13 = new JLabel("MALE     :- ");
        l14 = new JLabel("FEMALE   :- ");
        l15 = new JLabel("CHILDREN :- ");
        
        c1 = new JComboBox<>(Room);
        c2 = new JComboBox<>(Facility);
        c3 = new JComboBox<>(Days);
        c4 = new JComboBox<>(Rooms);
        c5 = new JComboBox<>(Date);
        c6 = new JComboBox<>(Months);
        c7 = new JComboBox<>(Date);
        c8 = new JComboBox<>(Months);
        c9 = new JComboBox<>(Gender);
        c10 = new JComboBox<>(Gender);
        c11 = new JComboBox<>(Gender);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        j.add(b);

        j.add(t1);
        j.add(t2);
        j.add(t3);

        j.add(l1);
        j.add(l2);
        j.add(l3);
        j.add(l4);
        j.add(l5);
        j.add(l6);
        j.add(l7);
        j.add(l8);
        j.add(l9);
        j.add(l10);
        j.add(l11);
        j.add(l12);
        j.add(l13);
        j.add(l14);
        j.add(l15);
        j.add(l18);

        j.add(c1);
        j.add(c2);
        j.add(c3);
        j.add(c4);
        j.add(c5);
        j.add(c6);
        j.add(c7);
        j.add(c8);
        j.add(c9);
        j.add(c10);
        j.add(c11);

        l18.setBounds(225, 0, 325, 90);
        l18.setFont(new Font("Monospaced",Font.BOLD,30));
        l18.setForeground(Color.BLACK);

        l1.setBounds(170, 55, 325, 90);
        l1.setFont(new Font("Monospaced",Font.BOLD,25));
        l1.setForeground(Color.BLACK);

        l2.setBounds(20, 110, 325, 90);
        l2.setFont(new Font("Monospaced",Font.BOLD,18));
        l2.setForeground(Color.BLACK);

        l3.setBounds(20, 150, 325, 90);
        l3.setFont(new Font("Monospaced",Font.BOLD,18));
        l3.setForeground(Color.BLACK);

        l4.setBounds(20, 195, 525, 90);
        l4.setFont(new Font("Monospaced",Font.BOLD,18));
        l4.setForeground(Color.BLACK);

        l5.setBounds(20, 235, 325, 90);
        l5.setFont(new Font("Monospaced",Font.BOLD,18));
        l5.setForeground(Color.BLACK);

        l6.setBounds(20, 280, 325, 90);
        l6.setFont(new Font("Monospaced",Font.BOLD,18));
        l6.setForeground(Color.BLACK);

        l7.setBounds(20, 330, 525, 90);
        l7.setFont(new Font("Monospaced",Font.BOLD,18));
        l7.setForeground(Color.BLACK);
        
        l8.setBounds(270, 330, 325, 90);
        l8.setFont(new Font("Monospaced",Font.BOLD,18));
        l8.setForeground(Color.BLACK);

        l9.setBounds(20, 380, 325, 90);
        l9.setFont(new Font("Monospaced",Font.BOLD,18));
        l9.setForeground(Color.BLACK);

        l10.setBounds(320, 380, 325, 90);
        l10.setFont(new Font("Monospaced",Font.BOLD,18));
        l10.setForeground(Color.BLACK);

        l11.setBounds(30, 428, 325, 90);
        l11.setFont(new Font("Monospaced",Font.BOLD,18));
        l11.setForeground(Color.BLACK);

        l12.setBounds(30, 472, 325, 90);
        l12.setFont(new Font("Monospaced",Font.BOLD,18));
        l12.setForeground(Color.BLACK);

        l13.setBounds(30, 515, 325, 90);
        l13.setFont(new Font("Monospaced",Font.BOLD,18));
        l13.setForeground(Color.BLACK);

        l14.setBounds(30, 555, 325, 90);
        l14.setFont(new Font("Monospaced",Font.BOLD,18));
        l14.setForeground(Color.BLACK);

        l15.setBounds(30, 595, 325, 90);
        l15.setFont(new Font("Monospaced",Font.BOLD,18));
        l15.setForeground(Color.BLACK);

        t1.setBounds(160, 182, 200, 30);
        t1.setFont(new Font("Monospaced",Font.BOLD,18));
        t1.setForeground(Color.BLACK);

        t2.setBounds(240, 267, 200, 30);
        t2.setFont(new Font("Monospaced",Font.BOLD,18));
        t2.setForeground(Color.BLACK);

        t3.setBounds(240, 315, 200, 30);
        t3.setFont(new Font("Monospaced",Font.BOLD,18));
        t3.setForeground(Color.BLACK);

        c1.setBounds(170, 363, 90, 30);
        c2.setBounds(410, 363, 150, 30);
        c3.setBounds(213, 413, 80, 30);
        c4.setBounds(538, 413, 80, 30);
        c5.setBounds(213, 460, 80, 30);
        c6.setBounds(299, 460, 95, 30);
        c7.setBounds(225, 505, 80, 30);
        c8.setBounds(310, 505, 95, 30);
        c9.setBounds(155, 547, 80, 30);
        c10.setBounds(155, 587, 80, 30);
        c11.setBounds(155, 625, 80, 30);

        b.setBounds(280, 685, 130, 30);
        b.setFont(new Font("Monospaced",Font.BOLD,17));
        b.setForeground(Color.BLACK);
        b.setBackground(Color.CYAN);

        b.addActionListener(this);
    }

    public static Connection createconnection(){
        Connection con = null;
        try {
              Booking.forName("com.mysql.jdbc.driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Register", "root", "root");
        } catch (Exception e) {
            System.out.println("Exception caught : " + e);
        }
        return con;
    }

    private static void forName(String string) {
    }

    public static void main(String[] args) {
        new Booking();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            System.out.println("BOOK");
            String UN = t1.getText();
            String AD = t2.getText();
            String MN = t3.getText();
            String RT = (c1.getSelectedItem()+"");
            String FA = (c2.getSelectedItem()+"");
            String SD = (c3.getSelectedItem()+"");
            String NR = (c4.getSelectedItem()+"");
            String ID = (c5.getSelectedItem()+"/"+c6.getSelectedItem());
            String OD = (c7.getSelectedItem()+"/"+c8.getSelectedItem());
            String MA = (c9.getSelectedItem()+"");
            String FE = (c10.getSelectedItem()+"");
            String CH = (c11.getSelectedItem()+"");
            try {
                Connection con = Booking.createconnection();{
                    String sql = "INSERT INTO Booking values ('" + UN + "','" + AD + "','" + MN + "','" + RT + "','" + FA + "','" + SD + "','" + NR + "','" + ID + "','" + OD + "','" + MA + "','" + FE + "','" + CH + "')";
                    Statement sta = con.createStatement();
                    int x =sta.executeUpdate(sql);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(b, "This is alredy exist");
                    }else{
                        JOptionPane.showMessageDialog(b, "" + UN + " Your Booking Room Processing");
                    }
                    Details de = new Details();
                    de.l5.setText(UN);
                    de.l7.setText(AD);
                    de.l9.setText(MN);
                    de.l11.setText(RT);
                    de.l13.setText(FA);
                    de.l15.setText(SD);
                    de.l17.setText(NR);
                    de.l19.setText(ID);
                    de.l21.setText(OD);
                    de.l23.setText(MA);
                    de.l25.setText(FE);
                    de.l27.setText(CH);

                    j.dispose();
                } 
            } catch (Exception g) {
                System.out.println("REGISTER Exception :" + g);
            }
        }
    }
}