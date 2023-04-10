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
public class Doctor_login extends JFrame {

    static void main(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    JFrame f;
    JButton bt10;
    JButton bt11;
    JButton bc;
    JLabel l28;
    JLabel l29;
    JLabel l30;
    JLabel l31;
    JTextField jtf17;
    JTextField jtf18;
    String e,g;
    public Doctor_login(){
        f=new JFrame("Health care");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200,250,730,600);
        f.getContentPane().setBackground(Color.CYAN);
        f.setLayout(null);
        //f.setResizable(false);
        
        l28=new JLabel("Doctor ID: ");
        l28.setBounds(50,150,100,30);
        l28.setForeground(Color.BLACK);
        l28.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        f.add(l28);
        
        jtf17=new JTextField();
        jtf17.setBounds(180,150 ,220, 30);
        f.add(jtf17);
        
        l29=new JLabel("Password: ");
        l29.setBounds(50,250,100,30);
        l29.setForeground(Color.BLACK);
        l29.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        f.add(l29);
        
        jtf18=new JTextField();
        jtf18.setBounds(180,250 ,220, 30);
        f.add(jtf18);
        
        bt10=new JButton("Login");
        bt10.setBounds(180,400,80,40);
        f.add(bt10);
        
        bt11=new JButton("Create Account");
        bt11.setBounds(300,400,180,40);
        f.add(bt11);
        
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
        
         bc=new JButton("<= Back");
        bc.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent actionEvent){
            
            E_Health_care e=new E_Health_care();
            f.setVisible(false);
        }
    });
        
        
        
        bt10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                  try
                {
                   FileReader fr=new FileReader("doctoraccount");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   e=jtf17.getText();
                   g=jtf18.getText();
                   while(s!=null)
                   {
                        String[] sc=s.split(",");
                        if(sc[0].equals(e))
                        {
                            if(sc[5].equals(g))
                            {
                                String s2=sc[5];
                                JOptionPane.showMessageDialog(bt10,"LogIn Success");
                                patient_request pr=new patient_request();
                               //p_form.main(null);
	                        f.setVisible(false);
                               break;   
                            }
                            else{
                                JOptionPane.showMessageDialog(bt10,"Wrong Password");
				break;
			      }
                        }
                        s=br.readLine();
                        if(s==null){
                            JOptionPane.showMessageDialog(bt10,"LogIn Fail or Create Acccount First");
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
        bt10.setForeground(Color.white);
        bt10.setBackground(Color.black);
        
        bt11.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent actionEvent){
            
            d_account  da=new d_account ();
            f.setVisible(false);
        }
    });
        bt11.setForeground(Color.white);
        bt11.setBackground(Color.black);
  

}  
    public static void main(String[] args) {
        Doctor_login dl=new Doctor_login();
        dl.setResizable(false);
    }
}
    

    
