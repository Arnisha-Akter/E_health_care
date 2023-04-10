
package e_health_care;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
public class p_form extends JFrame{
    JFrame j;
    JButton bt9;
    JLabel l17;
    JLabel l18;
    JLabel l19;
    JLabel l20;
    JLabel l21;
    JLabel l22;
    JLabel l23;
    JLabel l24;
    JLabel l25;
    JLabel l26;
    JLabel l27;
    JTextField jtf10;
    JTextField jtf11;
    JTextField jtf12;
    JTextField jtf13;
    JTextField jtf14;
    JTextField jtf15;
     JTextField jtf17;
    JTextArea jtf16;
    JRadioButton jrb1;
    JRadioButton jrb2;
    JRadioButton jrb3;
   JCheckBox jcb4;
   JCheckBox jcb5;
    JCheckBox jcb6;
    JCheckBox jcb7;
    JCheckBox jcb8;
    JCheckBox jcb9;
    JCheckBox jcb10;
    JCheckBox jcb11;
    JScrollPane sp;
    public p_form(){
        j=new JFrame("Health Care");
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBounds(100,20,1000,1000);
        j.getContentPane().setBackground(Color.CYAN);
        j.setLayout(null);
        
        l17=new JLabel("Fillup the Form Carefully");
        l17.setBounds(290,-80,250,250);
        l17.setFont(new Font("Bernard MT Condensed", Font.BOLD, 22));
        j.add(l17);
        
        l17=new JLabel("Name: ");
        l17.setBounds(50,100,100,30);
        l17.setForeground(Color.BLACK);
        l17.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        j.add(l17);
        
        jtf10=new JTextField();
        jtf10.setBounds(180,100 ,220, 30);
        j.add(jtf10);
        
        l18=new JLabel("Email/Phone: ");
        l18.setBounds(50,160,150,50);
        l18.setForeground(Color.BLACK);
        l18.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        j.add(l18);
        
        jtf11=new JTextField();
        jtf11.setBounds(180,170 ,220, 30);
        j.add(jtf11);
        
        l19=new JLabel("Age: ");
        l19.setBounds(50,220,150,50);
        l19.setForeground(Color.BLACK);
        l19.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        j.add(l19);
        
        jtf12=new JTextField();
        jtf12.setBounds(180,230 ,220, 30);
        j.add(jtf12);
        
        l20=new JLabel("Weight: ");
        l20.setBounds(50,280,150,50);
        l20.setForeground(Color.BLACK);
        l20.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        j.add(l20);
        
        jtf13=new JTextField();
        jtf13.setBounds(180,290 ,220, 30);
        j.add(jtf13);
        
        l19=new JLabel("Height: ");
        l19.setBounds(50,340,150,50);
        l19.setForeground(Color.BLACK);
        l19.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        j.add(l19);
        
        jtf14=new JTextField();
        jtf14.setBounds(180,350 ,220, 30);
        j.add(jtf14);
        
        l20=new JLabel("Address: ");
        l20.setBounds(50,400,150,50);
        l20.setForeground(Color.BLACK);
        l20.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        j.add(l20);
        
        jtf15=new JTextField();
        jtf15.setBounds(180,410 ,220, 30);
        j.add(jtf15);
        
        l19=new JLabel("Gender: ");
        l19.setBounds(50,460,150,50);
        l19.setForeground(Color.BLACK);
        l19.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        j.add(l19);
        
        jtf17=new JTextField();
        jtf17.setBounds(550,470,100,30);
        j.add(jtf17);
        
        JButton bp=new JButton("Pharmacy");
        bp.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent actionEvent){
            
            Pharmacy  ph=new Pharmacy ();
            j.setVisible(false);
        }
    });
         bp.setForeground(Color.white);
        bp.setBackground(Color.black);
        
        bp.setBounds(50,890,120,40);
        j.add(bp);
        
        jrb1=new JRadioButton("Male");
        jrb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jrb1){
                    String g1="Male";
                    jtf17.setText(g1);
                }
            }
            
        });
        jrb1.setBounds(180,470,100,30);
        jrb1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
        j.add(jrb1);
        
        jrb2=new JRadioButton("Female");
        jrb2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jrb2){
                    String g2="Female";
                    jtf17.setText(g2);
                }
            }
            
        });
        jrb2.setBounds(300,470,100,30);
        jrb2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
        j.add(jrb2);
        
        jrb3=new JRadioButton("Other");
        jrb3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jrb3){
                    String g3="Others";
                    jtf17.setText(g3);
                }
            }
            
        });
        jrb3.setBounds(420,470,100,30);
        jrb3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
        j.add(jrb3);
        
        l25=new JLabel("Write Physical Problems Briefly: ");
        l25.setBounds(50,450,350,150);
        l25.setForeground(Color.BLACK);
        l25.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        j.add(l25);
        
        jtf16=new JTextArea(5,10);
        jtf16.setBounds(280,515,460,80);
        sp=new JScrollPane(jtf16,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setBounds(280,515,460,80);
        sp.getViewport().setBackground(Color.WHITE);
        sp.getViewport().add(jtf16);
        sp.setVisible(true);
        j.add(sp);
        
        l20=new JLabel("Choose Doctor: ");
        l20.setBounds(50,610,150,50);
        l20.setForeground(Color.BLACK);
        l20.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        j.add(l20);
        
        l21=new JLabel("Dentist: ");
        l21.setBounds(180,610,150,50);
        l21.setForeground(Color.BLACK);
        l21.setFont(new Font("Arial Narrow", Font.BOLD, 15));
        j.add(l21);
        
        jcb4=new JCheckBox("Dr. Md. Akter Hossain\n" +"B.D.S. (Dhaka Dental College)");
        jcb4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jcb4){
                    try {
                        FileWriter fw=new FileWriter("D_1",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p1=jtf10.getText();
                        String q1=jtf11.getText();
                        String r1=jtf12.getText();
                        String s1=jtf13.getText();
                        String t1=jtf14.getText();
                        String u1=jtf15.getText();
                        String v1=jtf16.getText();
                        String w1=jtf17.getText();
                        bw.write(p1+","+q1+","+w1+","+r1+","+s1+","+t1+","+u1+","+v1);
                        bw.newLine();
                        bw.close();
                        fw.close();
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    
                    
                }
                
            }
            
        });
        
        jcb4.setBounds(230,620,500,25);
        jcb4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        j.add(jcb4);
        
        jcb5=new JCheckBox("Dr. Jahidul Islam\n" +"BDS (Dhaka), PGT (Dhaka)\n" +"Oral & Dental Surgeon");
         jcb5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jcb5){
                    try {
                        FileWriter fw=new FileWriter("D_2",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p2=jtf10.getText();
                        String q2=jtf11.getText();
                        String r2=jtf12.getText();
                        String s2=jtf13.getText();
                        String t2=jtf14.getText();
                        String u2=jtf15.getText();
                        String v2=jtf16.getText();
                        String w2=jtf17.getText();
                        bw.write(p2+","+q2+","+w2+","+r2+","+s2+","+t2+","+u2+","+v2);
                        bw.newLine();
                        bw.close();
                        fw.close();
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    
                    
                }
                
            }
            
        });
        jcb5.setBounds(230,650,500,25);
        jcb5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        j.add(jcb5);
        
        l22=new JLabel("Cardiologist: ");
        l22.setBounds(180,670,150,50);
        l22.setForeground(Color.BLACK);
        l22.setFont(new Font("Arial Narrow", Font.BOLD, 15));
        j.add(l22);
        
        jcb6=new JCheckBox("Dr. Md. Abul Khair\n" +"M.B.B.S (DMC), D-Card (N.I.C.V.D)");
        jcb6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jcb6){
                    try {
                        FileWriter fw=new FileWriter("C_1",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p3=jtf10.getText();
                        String q3=jtf11.getText();
                        String r3=jtf12.getText();
                        String s3=jtf13.getText();
                        String t3=jtf14.getText();
                        String u3=jtf15.getText();
                        String v3=jtf16.getText();
                        String w3=jtf17.getText();
                        bw.write(p3+","+q3+","+w3+","+r3+","+s3+","+t3+","+u3+","+v3);
                        bw.newLine();
                        bw.close();
                        fw.close();
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }      
                    
                }
                
            }
            
        });
        jcb6.setBounds(259,685,500,25);
        jcb6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        j.add(jcb6);
        
        jcb7=new JCheckBox("Dr. M G Azam\n" +"MBBS");
        jcb7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jcb7){
                    try {
                        FileWriter fw=new FileWriter("C_2",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p4=jtf10.getText();
                        String q4=jtf11.getText();
                        String r4=jtf12.getText();
                        String s4=jtf13.getText();
                        String t4=jtf14.getText();
                        String u4=jtf15.getText();
                        String v4=jtf16.getText();
                        String w4=jtf16.getText();
                        bw.write(p4+","+q4+","+w4+","+r4+","+s4+","+t4+","+u4+","+v4);
                        bw.newLine();
                        bw.close();
                        fw.close();
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    
                    
                }
                
            }
            
        });
        jcb7.setBounds(259,715,500,25);
        jcb7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        j.add(jcb7);
        
        l23=new JLabel("Neurologist: ");
        l23.setBounds(180,735,150,50);
        l23.setForeground(Color.BLACK);
        l23.setFont(new Font("Arial Narrow", Font.BOLD, 15));
        j.add(l23);
        
        jcb8=new JCheckBox("Dr. Kazi Mohibur Rahman\n" +"MBBS, MD (Neurology)");
        jcb8.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jcb8){
                    try {
                        FileWriter fw=new FileWriter("N_1",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p5=jtf10.getText();
                        String q5=jtf11.getText();
                        String r5=jtf12.getText();
                        String s5=jtf13.getText();
                        String t5=jtf14.getText();
                        String u5=jtf15.getText();
                        String v5=jtf16.getText();
                        String w5=jtf17.getText();
                        bw.write(p5+","+q5+","+w5+","+r5+","+s5+","+t5+","+u5+","+v5);
                        bw.newLine();
                        bw.close();
                        fw.close();
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    
                    
                }
                
            }
            
        });
        jcb8.setBounds(259,745,500,25);
        jcb8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        j.add(jcb8);
        
        jcb9=new JCheckBox("Dr. A.T.M. Mosharef Hossain\n" +"MBBS, FCPS, FICS\n" +"Neurology Specialists / Neurologist");
        jcb9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jcb9){
                    try {
                        FileWriter fw=new FileWriter("N_2",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p6=jtf10.getText();
                        String q6=jtf11.getText();
                        String r6=jtf12.getText();
                        String s6=jtf13.getText();
                        String t6=jtf14.getText();
                        String u6=jtf15.getText();
                        String v6=jtf16.getText();
                        String w6=jtf17.getText();
                        bw.write(p6+","+q6+","+w6+","+r6+","+s6+","+t6+","+u6+","+v6);
                        bw.newLine();
                        bw.close();
                        fw.close();
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    
                    
                }
                
            }
            
        });
        jcb9.setBounds(259,775,500,25);
        jcb9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        j.add(jcb9);
        
        l24=new JLabel("Obstetricians and Gynecologist: ");
        l24.setBounds(180,795,200,50);
        l24.setForeground(Color.BLACK);
        l24.setFont(new Font("Arial Narrow", Font.BOLD, 15));
        j.add(l24);
        
        jcb10=new JCheckBox("Dr. Dilruba Ferdous\n" +"M.B.B.S, M.S Course (Gynae & Obs.)");
        jcb10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jcb10){
                    try {
                        FileWriter fw=new FileWriter("OG_1",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p7=jtf10.getText();
                        String q7=jtf11.getText();
                        String r7=jtf12.getText();
                        String s7=jtf13.getText();
                        String t7=jtf14.getText();
                        String u7=jtf15.getText();
                        String v7=jtf16.getText();
                        String w7=jtf17.getText();
                        bw.write(p7+","+q7+","+w7+","+r7+","+s7+","+t7+","+u7+","+v7);
                        bw.newLine();
                        bw.close();
                        fw.close();
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    
                    
                }
                
            }
            
        });
        jcb10.setBounds(380,805,460,25);
        jcb10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        j.add(jcb10);
        
        jcb11=new JCheckBox("Professor Dr. Fatema Begum\n"+"M.B.B.S, FCPS (Gynae)");
        jcb11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jcb11){
                    try {
                        FileWriter fw=new FileWriter("OG_2",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p8=jtf10.getText();
                        String q8=jtf11.getText();
                        String r8=jtf12.getText();
                        String s8=jtf13.getText();
                        String t8=jtf14.getText();
                        String u8=jtf15.getText();
                        String v8=jtf16.getText();
                        String w8=jtf17.getText();
                        bw.write(p8+","+q8+","+w8+","+r8+","+s8+","+t8+","+u8+","+v8);
                        bw.newLine();
                        bw.close();
                        fw.close();
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    
                    
                }
                
            }
            
        });
        jcb11.setBounds(380,835,460,25);
        jcb11.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        j.add(jcb11);
        
        ButtonGroup bg1=new ButtonGroup();
        ButtonGroup bg2=new ButtonGroup();
        bg1.add(jrb1);
        bg1.add(jrb2);
        bg1.add(jrb3);
        bg2.add(jcb4);
        bg2.add(jcb5);
        bg2.add(jcb6);
        bg2.add(jcb7);
        bg2.add(jcb8);
        bg2.add(jcb9);
        bg2.add(jcb10);
        bg2.add(jcb11);
   
        
        
        bt9=new JButton("Submit");
        bt9.setFont(new Font("Arial Narrow", Font.BOLD, 14));
        bt9.setBounds(820,890,80,40);
        j.add(bt9);
        
        j.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            if (JOptionPane.showConfirmDialog(j, 
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
        
       
        
        bt9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==bt9){
                    if(("".equals(jtf10.getText()) || "".equals(jtf11.getText()) || "".equals(jtf12.getText()) || "".equals(jtf13.getText())||("".equals(jtf14.getText()) || "".equals(jtf15.getText()) || "".equals(jtf16.getText())|| "".equals(jtf17.getText()))))
                    {
                         final JOptionPane pane = new JOptionPane("Submission Fail");
                         final JDialog d = pane.createDialog((JFrame)null, "Message");
                         d.setLocation(500,500);
                         d.setVisible(true); 
                    }
                   else if(e.getSource()==bt9){
                        jtf10.setText("");
                        jtf11.setText("");
                        jtf12.setText("");
                        jtf13.setText("");
                        jtf14.setText("");
                        jtf15.setText("");
                        jtf16.setText("");
                        jtf17.setText("");
                        JOptionPane.showMessageDialog(j,"Thanks for your request we will inform your confirmation by messege or Email");
                    
                    }
                    
            }
        }
        });
         bt9.setForeground(Color.white);
        bt9.setBackground(Color.black);
    }
    
   public static void main(String[] args) {
    
        p_form pf=new p_form();
        pf.setResizable(false);
        
    }
       
    }
   
