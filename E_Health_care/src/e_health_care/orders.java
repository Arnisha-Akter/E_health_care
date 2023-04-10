
package e_health_care;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class orders extends JFrame{
     JFrame j;
     JLabel l50;
     JTextArea jtf36;
     JScrollPane sp;
     public orders(){
         
        j=new JFrame("Health Care");
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBounds(180,50,500,500);
        j.getContentPane().setBackground(Color.CYAN);
        j.setLayout(null);
        
        l50=new JLabel("Orders for Medicines");
        l50.setBounds(180,-80,250,250);
        l50.setFont(new Font("Bernard MT Condensed", Font.BOLD, 18));
        j.add(l50);
        
        jtf36=new JTextArea(5,10);
        jtf36.setBounds(100,80,300,280);
        sp=new JScrollPane(jtf36,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setBounds(100,80,300,280);
        sp.getViewport().setBackground(Color.WHITE);
        sp.getViewport().add(jtf36);
        sp.setVisible(true);
        j.add(sp);
        
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
        
         try{
                   FileReader fr=new FileReader("pharmacyorders");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   while(s!=null)
                   {
                       String[] sc=s.split(",");
                       for(int i=1;i<=sc.length;i++)
                       {
                       jtf36.setText(i+"."+"Adress-"+sc[0]+","+"Name-"+sc[1]+","+"Cell No.-"+sc[2]+","+"Item-"+sc[3]+","+"Price-"+sc[4]);
                       
                       }
                       break;
                       
                   }
                   
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    }
         
}
     public static void main(String[] args) {
         orders o=new orders();
         o.setResizable(false);
        
    }
}
