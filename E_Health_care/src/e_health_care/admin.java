
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
import javax.swing.*;

public class admin extends JFrame{
    JFrame f;
    JLabel l48;
    JLabel l49;
    JTextField jtf34;
    JTextField jtf35;
    JButton bt15;
    String x,y;
    public admin(){
        f=new JFrame("Health care");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200,250,730,600);
        f.getContentPane().setBackground(Color.CYAN);
        f.setLayout(null);
        
        l48=new JLabel("Admin ID: ");
        l48.setBounds(50,150,100,30);
        l48.setForeground(Color.BLACK);
        l48.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        f.add(l48);
        
        jtf34=new JTextField();
        jtf34.setBounds(180,150 ,220, 30);
        f.add(jtf34);
        
        l49=new JLabel("Password: ");
        l49.setBounds(50,250,100,30);
        l49.setForeground(Color.BLACK);
        l49.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        f.add(l49);
        
        jtf35=new JTextField();
        jtf35.setBounds(180,250 ,220, 30);
        f.add(jtf35);
        
       JButton bc=new JButton("<= Back");
        bc.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent actionEvent){
            
            E_Health_care e=new E_Health_care();
            f.setVisible(false);
        }
    });
        bc.setForeground(Color.white);
        bc.setBackground(Color.black);
        bc.setBounds(50,50,80,40);
        f.add(bc);
        
         bt15=new JButton("Login");
        bt15.setBounds(480,400,80,40);
        f.add(bt15);
        bt15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                  try
                {
                   FileReader fr=new FileReader("orders.txt");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   x=jtf34.getText();
                   y=jtf35.getText();
                   while(s!=null)
                   {
                        String[] sc=s.split(",");
                        if(sc[0].equals(x))
                        {
                            if(sc[1].equals(y))
                            {
                                String s2=sc[2];
                                JOptionPane.showMessageDialog(bt15,"LogIn Success");
                                p_form pf=new p_form();
                               //p_form.main(null);
	                        f.setVisible(false);
                               break;   
                            }
      
                            else{
                                JOptionPane.showMessageDialog(bt15,"Wrong Password");
				break;
			      }
                        }
                        s=br.readLine();
                        if(s==null){
                            JOptionPane.showMessageDialog(bt15,"LogIn Fail or Create Acccount First");
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
        bt15.setForeground(Color.white);
        bt15.setBackground(Color.black);
        f.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            if (JOptionPane.showConfirmDialog(f, 
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
    }
    
    public static void main(String[] args) {
        admin a=new admin();
        a.setResizable(false);
        
    }
    
}
