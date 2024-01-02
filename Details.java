import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Details implements ActionListener {
    JFrame j;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28;
    JButton B;

    public Details(){
        j = new JFrame("Details");
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        Color color = new Color(255, 132, 0);
        j.getContentPane().setBackground(color);

        B = new JButton("PAY BILL");

        l1 = new JLabel("HOTEL TITAN");
        l2 = new JLabel("Your Room Is Booked");
        l3 = new JLabel("Check Your All Details");
        l4 = new JLabel(" USERNAME        :- ");
        l5 = new JLabel(" ");
        l6 = new JLabel(" AADHAR CARD NO. :- ");
        l7 = new JLabel(" ");
        l8 = new JLabel(" MOBILE NO.      :- ");
        l9 = new JLabel(" ");
        l10 = new JLabel(" Room Type       :- ");
        l11 = new JLabel(" ");
        l12 = new JLabel(" FACILITY        :- ");
        l13 = new JLabel(" ");
        l14 = new JLabel(" Spending Days   :- ");
        l15 = new JLabel(" ");
        l16 = new JLabel(" Numbers Of Room :- ");
        l17 = new JLabel(" ");
        l18 = new JLabel(" CHECK IN DATE   :- ");
        l19 = new JLabel(" ");
        l20 = new JLabel(" CHECK OUT DATE  :- ");
        l21 = new JLabel(" ");
        l22 = new JLabel(" MALE            :- ");
        l23 = new JLabel(" ");
        l24 = new JLabel(" FEMALE          :- ");
        l25 = new JLabel(" ");
        l26 = new JLabel(" CHILDREN        :- ");
        l27 = new JLabel(" ");
        l28 = new JLabel(" If Your All Details Are Right Then Click On Pay Bill");

        j.add(B);

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
        j.add(l16);
        j.add(l17);
        j.add(l18);
        j.add(l19);
        j.add(l20);
        j.add(l21);
        j.add(l22);
        j.add(l23);
        j.add(l24);
        j.add(l25);
        j.add(l26);
        j.add(l27);
        j.add(l28);
        
        l1.setBounds(285, 0, 325, 120);
        l1.setFont(new Font("Monospaced",Font.BOLD,30));
        l1.setForeground(Color.BLACK);

        l2.setBounds(30, 65, 325, 120);
        l2.setFont(new Font("Monospaced",Font.BOLD,25));
        l2.setForeground(Color.BLACK);

        l3.setBounds(30, 115, 375, 120);
        l3.setFont(new Font("Dialoginput",Font.BOLD,25));
        l3.setForeground(Color.BLACK);

        l4.setBounds(18, 175, 325, 90);
        l4.setFont(new Font("Monospaced",Font.BOLD,20));
        l4.setForeground(Color.BLACK);

        l5.setBounds(255, 175, 325, 90);
        l5.setFont(new Font("Monospaced",Font.BOLD,20));
        l5.setForeground(Color.BLACK);

        l6.setBounds(18, 210, 325, 90);
        l6.setFont(new Font("Monospaced",Font.BOLD,20));
        l6.setForeground(Color.BLACK);

        l7.setBounds(260, 210, 325, 90);
        l7.setFont(new Font("Monospaced",Font.BOLD,20));
        l7.setForeground(Color.BLACK);

        l8.setBounds(20, 245, 325, 90);
        l8.setFont(new Font("Monospaced",Font.BOLD,20));
        l8.setForeground(Color.BLACK);

        l9.setBounds(260, 245, 325, 90);
        l9.setFont(new Font("Monospaced",Font.BOLD,20));
        l9.setForeground(Color.BLACK);

        l10.setBounds(20, 275, 325, 90);
        l10.setFont(new Font("Monospaced",Font.BOLD,20));
        l10.setForeground(Color.BLACK);

        l11.setBounds(260, 275, 325, 90);
        l11.setFont(new Font("Monospaced",Font.BOLD,20));
        l11.setForeground(Color.BLACK);

        l12.setBounds(20, 305, 325, 90);
        l12.setFont(new Font("Monospaced",Font.BOLD,20));
        l12.setForeground(Color.BLACK);

        l13.setBounds(260, 305, 325, 90);
        l13.setFont(new Font("Monospaced",Font.BOLD,20));
        l13.setForeground(Color.BLACK);

        l14.setBounds(20, 335, 325, 90);
        l14.setFont(new Font("Monospaced",Font.BOLD,20));
        l14.setForeground(Color.BLACK);

        l15.setBounds(250, 335, 325, 90);
        l15.setFont(new Font("Monospaced",Font.BOLD,20));
        l15.setForeground(Color.BLACK);

        l16.setBounds(20, 365, 325, 90);
        l16.setFont(new Font("Monospaced",Font.BOLD,20));
        l16.setForeground(Color.BLACK);

        l17.setBounds(250, 365, 325, 90);
        l17.setFont(new Font("Monospaced",Font.BOLD,20));
        l17.setForeground(Color.BLACK);

        l18.setBounds(20, 395, 325, 90);
        l18.setFont(new Font("Monospaced",Font.BOLD,20));
        l18.setForeground(Color.BLACK);

        l19.setBounds(250, 395, 325, 90);
        l19.setFont(new Font("Monospaced",Font.BOLD,20));
        l19.setForeground(Color.BLACK);

        l20.setBounds(20, 425, 325, 90);
        l20.setFont(new Font("Monospaced",Font.BOLD,20));
        l20.setForeground(Color.BLACK);

        l21.setBounds(250, 425, 325, 90);
        l21.setFont(new Font("Monospaced",Font.BOLD,20));
        l21.setForeground(Color.BLACK);

        l22.setBounds(20, 455, 325, 90);
        l22.setFont(new Font("Monospaced",Font.BOLD,20));
        l22.setForeground(Color.BLACK);

        l23.setBounds(250, 455, 325, 90);
        l23.setFont(new Font("Monospaced",Font.BOLD,20));
        l23.setForeground(Color.BLACK);

        l24.setBounds(20, 485, 325, 90);
        l24.setFont(new Font("Monospaced",Font.BOLD,20));
        l24.setForeground(Color.BLACK);

        l25.setBounds(250, 485, 325, 90);
        l25.setFont(new Font("Monospaced",Font.BOLD,20));
        l25.setForeground(Color.BLACK);

        l26.setBounds(20, 515, 325, 90);
        l26.setFont(new Font("Monospaced",Font.BOLD,20));
        l26.setForeground(Color.BLACK);

        l27.setBounds(250, 515, 325, 90);
        l27.setFont(new Font("Monospaced",Font.BOLD,20));
        l27.setForeground(Color.BLACK);

        l28.setBounds(20, 565, 925, 90);
        l28.setFont(new Font("Monospaced",Font.BOLD,23));
        l28.setForeground(Color.BLACK);

        B.setBounds(320, 655, 130, 30);
        B.setFont(new Font("Monospaced",Font.BOLD,18));
        B.setForeground(Color.BLACK);
        B.setBackground(Color.CYAN);

        B.addActionListener(this);
    }
    public static void main(String[] args) {
        new Details();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==B) {
            System.out.println("PAY BILL");
            JOptionPane.showMessageDialog(B, "Your Transaction Is Done.THANK YOU");
            j.dispose();
        } else {
            JOptionPane.showMessageDialog(B, " Your Transaction Is Not Done");
        }
    }
}
