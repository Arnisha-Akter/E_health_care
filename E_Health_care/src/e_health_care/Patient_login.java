package e_health_care;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
public class Patient_login extends JFrame {
    JFrame f;
    JButton bt1;
    JButton bt2;
    JButton bc;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    String c,d;
    public Patient_login(){
        f=new JFrame("Health care");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200,250,730,600);
        f.getContentPane().setBackground(Color.CYAN);
        f.setLayout(null);
        
        l2=new JLabel("Patient ID: ");
        l2.setBounds(50,150,100,30);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        f.add(l2);
        
        jtf1=new JTextField();
        jtf1.setBounds(180,150 ,220, 30);
        f.add(jtf1);
        
        l5=new JLabel("Password: ");
        l5.setBounds(50,250,100,30);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        f.add(l5);
        
        jtf3=new JTextField();
        jtf3.setBounds(180,250 ,220, 30);
        f.add(jtf3);
        
        bt1=new JButton("Login");
        bt1.setBounds(180,400,80,40);
        f.add(bt1);
        
        bt2=new JButton("Create Account");
        bt2.setBounds(300,400,180,40);
        f.add(bt2);
        
        bc=new JButton("<= Back");
        bc.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent actionEvent){
            
            E_Health_care e=new E_Health_care();
            f.setVisible(false);
        }
    });
        bc.setBounds(50,50,80,40);
        bc.setForeground(Color.white);
        bc.setBackground(Color.black);
        f.add(bc);
        
        f.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            if (JOptionPane.showConfirmDialog(f , 
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
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                  try
                {
                   FileReader fr=new FileReader("patient account");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   c=jtf1.getText();
                   d=jtf3.getText();
                   while(s!=null)
                   {
                        String[] sc=s.split(",");
                        if(sc[0].equals(c))
                        {
                            if(sc[4].equals(d))
                            {
                                String s2=sc[4];
                                JOptionPane.showMessageDialog(bt1,"LogIn Success");
                                p_form pf=new p_form();
                               //p_form.main(null);
	                        f.setVisible(false);
                               break;   
                            }
      
                            else{
                                JOptionPane.showMessageDialog(bt1,"Wrong Password");
				break;
			      }
                        }
                        s=br.readLine();
                        if(s==null){
                            JOptionPane.showMessageDialog(bt1,"LogIn Fail or Create Acccount First");
                        }
                    }
                    br.close();
                    
                //bt1.setVisible(false);
            }   catch (FileNotFoundException ex) {   
                    Logger.getLogger(Patient_login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Patient_login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        bt1.setForeground(Color.white);
        bt1.setBackground(Color.black);
        
        bt2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent actionEvent){
            
            p_account pa=new p_account();
            f.setVisible(false);
        }
    });
        bt2.setForeground(Color.white);
        bt2.setBackground(Color.black);
  

}  
    public static void main(String[] args) {
        Patient_login pl=new Patient_login();
        pl.setResizable(false);
    }
}
    

    
