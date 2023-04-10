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

public class d_account extends JFrame{
    JFrame j;
    JLabel l32;
    JLabel l33;
    JLabel l34;
    JLabel l35;
    JLabel l36;
    JLabel l37;
    JLabel l38;
    JLabel l39;
    JTextField jtf20;
    JTextField jtf21;
    JTextField jtf22;
    JTextField jtf23;
    JTextField jtf24;
    JTextField jtf25;
    JTextField jtf26;
    JButton bt12;
    public d_account(){
        j=new JFrame("Health Care");
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBounds(100,80,730,900);
        j.getContentPane().setBackground(Color.CYAN);
        j.setLayout(null);
        
        l32=new JLabel("Create Account");
        l32.setBounds(250,10,180,80);
        l32.setFont(new Font("Bernard MT Condensed", Font.BOLD, 22));
        j.add(l32);
        
        l33=new JLabel("Doctor ID: ");
        l33.setBounds(80,100,150,50);
        l33.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l33.setForeground(Color.BLACK);
        j.add(l33);
        
        jtf20=new JTextField();
        jtf20.setBounds(230,110 ,220, 30);
        j.add(jtf20);
        
        l34=new JLabel("Name: ");
        l34.setBounds(80,190,150,50);
        l34.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l34.setForeground(Color.BLACK);
        j.add(l34);
        
        jtf21=new JTextField();
        jtf21.setBounds(230,200 ,220, 30);
        j.add(jtf21);
        
        l35=new JLabel("Mobile: ");
        l35.setBounds(80,280,150,50);
        l35.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l35.setForeground(Color.BLACK);
        j.add(l35);
        
        jtf22=new JTextField();
        jtf22.setBounds(230,290 ,220, 30);
        j.add(jtf22);
        
        l36=new JLabel("Email: ");
        l36.setBounds(80,380,150,50);
        l36.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l36.setForeground(Color.BLACK);
        j.add(l36);
        
        jtf23=new JTextField();
        jtf23.setBounds(230,390 ,220, 30);
        j.add(jtf23);
        
        l37=new JLabel("Degree: ");
        l37.setBounds(80,480,180,50);
        l37.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l37.setForeground(Color.BLACK);
        j.add(l37);
        
        jtf24=new JTextField();
        jtf24.setBounds(230,490 ,220, 30);
        j.add(jtf24);
        
        l38=new JLabel("Password: ");
        l38.setBounds(80,580,180,50);
        l38.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l38.setForeground(Color.BLACK);
        j.add(l38);
        
        jtf25=new JTextField();
        jtf25.setBounds(230,590 ,220, 30);
        j.add(jtf25);
       
        l39=new JLabel("Confirm Password: ");
        l39.setBounds(80,680,180,50);
        l39.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        l39.setForeground(Color.BLACK);
        j.add(l39);
        
        jtf26=new JTextField();
        jtf26.setBounds(230,690 ,220, 30);
        j.add(jtf26);
        
        bt12=new JButton("Sign Up");
        bt12.setBounds(380,750,80,40);
        j.add(bt12);
        
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
        
        bt12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                if(("".equals(jtf20.getText()) || "".equals(jtf21.getText()) || "".equals(jtf22.getText()) || "".equals(jtf23.getText())||"".equals(jtf24.getText())) || (jtf25.getText() == null ? jtf26.getText() != null : !jtf25.getText().equals(jtf26.getText())) )
                {
                    JOptionPane.showMessageDialog(j," SignUp Fail");
                }
                else {
                    try {
                        FileWriter fw=new FileWriter("doctoraccount",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p=jtf20.getText();
                        String q=jtf21.getText();
                        String r=jtf22.getText();
                        String s=jtf23.getText();
                        String t=jtf24.getText();
                        String u=jtf25.getText();
                        bw.write(p+","+q+","+r+","+s+","+t+","+u);
                        bw.newLine();
                        bw.close();
                        fw.close();
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    JOptionPane.showMessageDialog(j,"SignUp Sucess");
                     Doctor_login dl=new Doctor_login();
                     //Patient_login.main(null);
                     j.setVisible(false);
                    
                }
            }
            
        });
         bt12.setForeground(Color.white);
        bt12.setBackground(Color.black);
    }
   
    public static void main(String[] args) {
        d_account  da=new d_account ();
        da.setResizable(false);
        
    }
    
}