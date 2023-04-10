package e_health_care;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class E_Health_care extends JFrame{
    JFrame j;
    JPanel jp;
    JLabel l1;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JLabel jl;
    public E_Health_care(){
        j=new JFrame("Health Care");
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBounds(700,100,600,800);
        j.setLayout(null);
        j.getContentPane().setBackground(Color.CYAN);
        
        JLabel l1=new JLabel("Online Health Care Platform");
        l1.setBounds(150,0,350,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Bernard MT Condensed", Font.BOLD, 25));
        j.add(l1);
        j.setResizable(false);
        
        b1=new JButton("Patient");
        b2=new JButton("Doctor");
        b3=new JButton("Pharmacy");
        b4=new JButton("Admin");
        
        b1.setBounds(200, 100, 150, 100);
        b1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        j.add(b1);
        
        b2.setBounds(200, 240, 150, 100);
        b2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        j.add(b2);
        
        b3.setBounds(200, 380, 150, 100);
        b3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        j.add(b3);
        
        b4.setBounds(200, 520, 150, 100);
        b4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
        b4.setForeground(Color.white);
        b4.setBackground(Color.black);
        j.add(b4);
        
  
        j.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            if (JOptionPane.showConfirmDialog(j , 
                "Are you sure you want to close this window?", "Close Window?", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                System.exit(0);
             }
            else
            {
              setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
             }
            }
         });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                Patient_login ld=new Patient_login();
                //Patient_login.main(null);
                j.setVisible(false);
                ld.dispose();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                 Doctor_login dl=new Doctor_login();
                j.setVisible(false);
                dl.dispose();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                 Pharmacy  ph=new Pharmacy ();
                j.setVisible(false);
                ph.dispose();
            }
        });
        
         b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                 admin a=new admin();
                j.setVisible(false);
                a.dispose();
            }
        });
    }
    
    public static void main(String[] args) {
        E_Health_care e=new E_Health_care();
        e.setResizable(false);
    }
    
}
 