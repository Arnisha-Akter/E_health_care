package e_health_care;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class p_account extends JFrame{
    JFrame j;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JLabel l11;
    JLabel l12;
    JTextField jtf4;
    JTextField jtf5;
    JTextField jtf6;
    JTextField jtf7;
    JTextField jtf8;
    JTextField jtf9;
    JButton bt3;
    public p_account(){
        j=new JFrame("Health Care");
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBounds(100,80,730,770);
        j.getContentPane().setBackground(Color.CYAN);
        j.setLayout(null);
        
        l6=new JLabel("Create Account");
        l6.setBounds(250,10,180,80);
        l6.setFont(new Font("Bernard MT Condensed", Font.BOLD, 22));
        j.add(l6);
        
        l7=new JLabel("Patient ID: ");
        l7.setBounds(80,100,150,50);
        l7.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l7.setForeground(Color.BLACK);
        j.add(l7);
        
        jtf4=new JTextField();
        jtf4.setBounds(230,110 ,220, 30);
        j.add(jtf4);
        
        l8=new JLabel("Name: ");
        l8.setBounds(80,190,150,50);
        l8.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l8.setForeground(Color.BLACK);
        j.add(l8);
        
        jtf5=new JTextField();
        jtf5.setBounds(230,200 ,220, 30);
        j.add(jtf5);
        
        l9=new JLabel("Mobile: ");
        l9.setBounds(80,280,150,50);
        l9.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l9.setForeground(Color.BLACK);
        j.add(l9);
        
        jtf6=new JTextField();
        jtf6.setBounds(230,290 ,220, 30);
        j.add(jtf6);
        
        l10=new JLabel("Email: ");
        l10.setBounds(80,380,150,50);
        l10.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l10.setForeground(Color.BLACK);
        j.add(l10);
        
        jtf7=new JTextField();
        jtf7.setBounds(230,390 ,220, 30);
        j.add(jtf7);
        
        l11=new JLabel("Password: ");
        l11.setBounds(80,480,180,50);
        l11.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l11.setForeground(Color.BLACK);
        j.add(l11);
        
        jtf8=new JTextField();
        jtf8.setBounds(230,490 ,220, 30);
        j.add(jtf8);
        
        l12=new JLabel("Confirm Password: ");
        l12.setBounds(80,580,180,50);
        l12.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l12.setForeground(Color.BLACK);
        j.add(l12);
        
        jtf9=new JTextField();
        jtf9.setBounds(230,590 ,220, 30);
        j.add(jtf9);
       
        bt3=new JButton("Sign Up");
        bt3.setBounds(380,650,80,40);
        j.add(bt3);
        
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
        
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                if(("".equals(jtf4.getText()) || "".equals(jtf5.getText()) || "".equals(jtf6.getText()) || "".equals(jtf7.getText())) || (jtf8.getText() == null ? jtf9.getText() != null : !jtf8.getText().equals(jtf9.getText())) )
                {
                    JOptionPane.showMessageDialog(j," SignUp Fail");
                }
                else {
                    try {
                        FileWriter fw=new FileWriter("patient account",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p=jtf4.getText();
                        String q=jtf5.getText();
                        String r=jtf6.getText();
                        String s=jtf7.getText();
                        String t=jtf8.getText();
                        bw.write(p+","+q+","+r+","+s+","+t);
                        bw.newLine();
                        bw.close();
                        fw.close();
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    JOptionPane.showMessageDialog(j,"SignUp Sucess");
                     Patient_login pl=new Patient_login();
                     //Patient_login.main(null);
                     j.setVisible(false);
                    
                }
            }
            
        });
         bt3.setForeground(Color.white);
        bt3.setBackground(Color.black);
    }
   
    public static void main(String[] args) {
        p_account pa=new p_account();
        pa.setResizable(false);
        
    }
    
}