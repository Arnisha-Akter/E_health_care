
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class patient_request extends JFrame{
    JFrame j;
    JLabel l40;
    JTextField jtf27;
    JTextArea jtf28;
     JButton bt13;
     JScrollPane sp;
    
    patient_request(){
        j=new JFrame("Health Care");
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBounds(200,250,730,700);
        j.getContentPane().setBackground(Color.CYAN);
        j.setLayout(null);
        
        l40=new JLabel("Enter Your Code ID: ");
        l40.setBounds(50,-8,150,160);
        l40.setForeground(Color.BLACK);
        l40.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        j.add(l40);
        
        jtf27=new JTextField();
        jtf27.setBounds(220,58 ,220, 30);
        j.add(jtf27);
       
        
        jtf28=new JTextArea(5,10);
        jtf28.setBounds(80,180,500,300);
        sp=new JScrollPane(jtf28,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setBounds(80,180,500,300);
        sp.getViewport().setBackground(Color.WHITE);
        sp.getViewport().add(jtf28);
        sp.setVisible(true);
        j.add(sp);
        
        bt13=new JButton("Patient's Requests");
        bt13.setBounds(240,120,150,40);
        bt13.setForeground(Color.white);
        bt13.setBackground(Color.black);
        j.add(bt13);
        
        bt13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent){
                if("1".equals(jtf27.getText())){
                    try{
                   FileReader fr=new FileReader("D_1");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   while(s!=null)
                   {
                       String[] sc=s.split(",");
                       for(int i=1;i<=sc.length;i++)
                       {
                       jtf28.setText("Name-"+sc[0]+"Gender-"+sc[2]+"Age-"+sc[3]+"Problem-"+sc[7]);
                       }
                       break;
                       
                   }
                   
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                        
                    } catch (IOException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    }
       
                }
                if("2".equals(jtf27.getText())){
                    try{
                   FileReader fr=new FileReader("D_2");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   while(s!=null)
                   {
                       String[] sc=s.split(",");
                       for(int i=1;i<=sc.length;i++)
                       {
                       jtf28.setText("Name-"+sc[0]+"Gender-"+sc[2]+"Age-"+sc[3]+"Problem-"+sc[7]);
                       }
                       break;
                       
                   }
                   
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    }
       
                }
                if("3".equals(jtf27.getText())){
                    try{
                   FileReader fr=new FileReader("C_1");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   while(s!=null)
                   {
                       String[] sc=s.split(",");
                       for(int i=1;i<=sc.length;i++)
                       {
                       jtf28.setText("Name-"+sc[0]+"Gender-"+sc[2]+"Age-"+sc[3]+"Problem-"+sc[7]);
                       }
                       break;
                       
                   }
                   
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    }
       
                }
        if("4".equals(jtf27.getText())){
                    try{
                   FileReader fr=new FileReader("C_2");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   while(s!=null)
                   {
                       String[] sc=s.split(",");
                       for(int i=1;i<=sc.length;i++)
                       {
                       jtf28.setText("Name-"+sc[0]+"Gender-"+sc[2]+"Age-"+sc[3]+"Problem-"+sc[7]);
                       }
                       break;
                       
                   }
                   
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    }
       
                }
        if("5".equals(jtf27.getText())){
                    try{
                   FileReader fr=new FileReader("N_1");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   while(s!=null)
                   {
                       String[] sc=s.split(",");
                       for(int i=1;i<=sc.length;i++)
                       {
                       jtf28.setText("Name-"+sc[0]+"Gender-"+sc[2]+"Age-"+sc[3]+"Problem-"+sc[7]);
                       }
                       break;
                       
                   }
                   
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    }
       
                }
        if("6".equals(jtf27.getText())){
                    try{
                   FileReader fr=new FileReader("N_2");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   while(s!=null)
                   {
                       String[] sc=s.split(",");
                       for(int i=1;i<=sc.length;i++)
                       {
                       jtf28.setText("Name-"+sc[0]+"Gender-"+sc[2]+"Age-"+sc[3]+"Problem-"+sc[7]);
                       }
                       break;
                       
                   }
                   
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    }
       
                }
        if("7".equals(jtf27.getText())){
                    try{
                   FileReader fr=new FileReader("OG_1");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   while(s!=null)
                   {
                       String[] sc=s.split(",");
                       for(int i=1;i<=sc.length;i++)
                       {
                       jtf28.setText("Name-"+sc[0]+"Gender-"+sc[2]+"Age-"+sc[3]+"Problem-"+sc[7]);
                       }
                       break;
                       
                   }
                   
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    }
       
                }
        if("8".equals(jtf27.getText())){
                    try{
                   FileReader fr=new FileReader("OG_1");
                   Scanner scr=new Scanner(fr);
                   BufferedReader br=new BufferedReader(fr);
                   String s = br.readLine();
                   while(s!=null)
                   {
                       String[] sc=s.split(",");
                       for(int i=1;i<=sc.length;i++)
                       {
                       jtf28.setText("Name-"+sc[0]+"Gender-"+sc[2]+"Age-"+sc[3]+"Problem-"+sc[7]);
                       }
                       break;
                       
                   }
                   
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(patient_request.class.getName()).log(Level.SEVERE, null, ex);
                    }
       
                }
            }
        
        });
        
           
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
}
    public static void main(String[] args) {
        patient_request pr=new patient_request();
        pr.setResizable(false);
        
    }
}
