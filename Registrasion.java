import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Color;
import java.awt.Font;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Registrasion implements ActionListener {
    JFrame j;
    JLabel l1, l2, l3, l4, l5, l6,l7;
    JTextField t1, t2, t3, t4, t5;
    JButton b1;
    JCheckBox c1;

    public Registrasion() {
        j = new JFrame("Registrasion");
        j.setSize(785, 450);
        j.setLayout(null);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        Color color = new Color(248, 192, 61);
        j.getContentPane().setBackground(color);

        b1 = new JButton("REGISTER");

        l1 = new JLabel("REGISTER YOUR-SELF HERE");
        l2 = new JLabel("FIRST NAME :- ");
        l3 = new JLabel("LAST NAME  :- ");
        l6 = new JLabel("USERNAME   :- ");
        l4 = new JLabel("E-Mail   :- ");
        l5 = new JLabel("PASSWORD :- ");
        l7 = new JLabel("Remember Password ");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();

        c1 = new JCheckBox();

        j.add(b1);

        j.add(t1);
        j.add(t2);
        j.add(t3);
        j.add(t4);
        j.add(t5);

        j.add(l1);
        j.add(l2);
        j.add(l3);
        j.add(l4);
        j.add(l5);
        j.add(l6);
        j.add(l7);

        j.add(c1);

        l1.setBounds(250, 22, 325, 90);
        l1.setFont(new Font("Monospaced",Font.BOLD,20));
        l1.setForeground(Color.BLACK);
        
        l2.setBounds(32, 100, 199, 43);
        l2.setFont(new Font("Monospaced",Font.BOLD,18));
        l2.setForeground(Color.BLACK);

        l3.setBounds(32, 153, 199, 43);
        l3.setFont(new Font("Monospaced",Font.BOLD,18));
        l3.setForeground(Color.BLACK);

        l4.setBounds(422, 102, 199, 43);
        l4.setFont(new Font("Monospaced",Font.BOLD,17));
        l4.setForeground(Color.BLACK);

        l5.setBounds(422, 155, 199, 43);
        l5.setFont(new Font("Monospaced",Font.BOLD,18));
        l5.setForeground(Color.BLACK);

        l7.setBounds(573, 183, 199, 43);
        l7.setFont(new Font("",Font.BOLD,10));
        l7.setForeground(Color.BLACK);

        l6.setBounds(32, 200, 199, 43);
        l6.setFont(new Font("Monospaced",Font.BOLD,18));
        l6.setForeground(Color.BLACK);

        t1.setBounds(182, 110, 200, 30);
        t1.setFont(new Font("Monospaced",Font.BOLD,18));
        t1.setForeground(Color.BLACK);

        t2.setBounds(182, 160, 200, 30);
        t2.setFont(new Font("Monospaced",Font.BOLD,18));
        t2.setForeground(Color.BLACK);

        t3.setBounds(555, 110, 200, 30);
        t3.setFont(new Font("Monospaced",Font.BOLD,18));
        t3.setForeground(Color.BLACK);

        t4.setBounds(555, 162, 200, 30);
        t4.setFont(new Font("Monospaced",Font.BOLD,18));
        t4.setForeground(Color.BLACK);

        t5.setBounds(182, 210, 200, 30);
        t5.setFont(new Font("Monospaced",Font.BOLD,18));
        t5.setForeground(Color.BLACK);

        c1.setBounds(550, 195, 20, 20);
        c1.setForeground(Color.orange);
        c1.setBackground(Color.orange);

        b1.setBounds(330, 280, 150, 30);
        b1.setFont(new Font("Monospaced",Font.BOLD,20));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.CYAN);

        b1.addActionListener(this);
    }

    public static Connection createconnection() {
        Connection con = null;
        try {
            Registrasion.forName("com.mysql.jdbc.driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Register", "root", "root");
        } catch (Exception e) {
            System.out.println("Exception caught : " + e);
        }
        return con;
    }

    private static void forName(String string) {
    }

    public static void main(String[] args) {
        new Registrasion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("REGISTER");
            String FM = t1.getText();
            String LM = t2.getText();
            String EM = t3.getText();
            String PW = t4.getText();
            String UN = t5.getText();
            try {
                Connection con = Registrasion.createconnection();
                String sql = "INSERT INTO user values ('" + FM + "','" + LM + "','" + EM + "','" + PW + "','" + UN + "')";
                Statement sta = con.createStatement();
                int x = sta.executeUpdate(sql);
                if (x == 0) {
                    JOptionPane.showMessageDialog(b1, "This is alredy exist");
                } else {
                    JOptionPane.showMessageDialog(b1, "" + UN + " Your account is sucessfully created");
                }
                new Booking();
                j.dispose();
            } catch (Exception g) {
                System.out.println("REGISTER Exception :" + g);
            }
        }
    }
}