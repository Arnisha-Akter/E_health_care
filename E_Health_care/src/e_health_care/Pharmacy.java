
package e_health_care;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class Pharmacy extends JFrame{
    JFrame f;
    JLabel l42,l43,l44,l45,l46,l47;
    JTextField jtf29,jtf30,jtf31,jtf32,jtf33;
    JButton bt14;
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20;
    public Pharmacy(){
        f=new JFrame("Health Care");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(250, 100, 890, 542);
        f.getContentPane().setBackground(Color.CYAN);
        f.setLayout(null);
        
        l42=new JLabel("Medicines");
        l42.setBounds(310,-30,200,120);
        l42.setFont(new Font("Bernard MT Condensed", Font.BOLD, 22));
        f.add(l42);
        
        l43=new JLabel("Delivery Adress:");
        l43.setBounds(570,80,110,30);
        l43.setFont(new Font("Sitka Text", Font.BOLD, 13));
        f.add(l43);
        
        jtf29=new JTextField();
        jtf29.setBounds(680,80,175,30);
        f.add(jtf29);
        
        l44=new JLabel("Name:");
        l44.setBounds(570,130,110,20);
        l44.setFont(new Font("Sitka Text", Font.BOLD, 14));
        f.add(l44);
        
        jtf30=new JTextField();
        jtf30.setBounds(680,130,175,30);
        f.add(jtf30);
        
        l45=new JLabel("Cell No.:");
        l45.setBounds(570,180,110,20);
        l45.setFont(new Font("Sitka Text", Font.BOLD, 14));
        f.add(l45);
        
        jtf31=new JTextField();
        jtf31.setBounds(680,180,175,30);
        f.add(jtf31);
        
        l46=new JLabel("Orders:");
        l46.setBounds(570,220,110,20);
        l46.setFont(new Font("Sitka Text", Font.BOLD, 14));
        f.add(l46);
        
        jtf32=new JTextField();
        jtf32.setBounds(680,220,175,30);
        f.add(jtf32);
        
        l47=new JLabel("Price:");
        l47.setBounds(570,260,110,20);
        l47.setFont(new Font("Sitka Text", Font.BOLD, 14));
        f.add(l47);
        
        jtf33=new JTextField();
        jtf33.setBounds(680,260,175,30);
        f.add(jtf33);
        
        bt14=new JButton("Place Order");
        bt14.setFont(new Font("Arial Narrow", Font.BOLD, 18));
        bt14.setBounds(640,420,120,40);
        f.add(bt14);
        
        JPanel jp = new JPanel();
        jp.setBackground(SystemColor.activeCaption);
	jp.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(192, 192, 192), Color.LIGHT_GRAY));
	jp.setBounds(5, 65, 550, 400);
	f.getContentPane().add(jp);
	jp.setLayout(null);
        
        cb1=new JCheckBox("Hand Sanitizer");
        cb1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb1) {
			String s= "Care-on 200 ml 1 bottle";
			String p= "100 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb1.setBounds(5,10 ,110, 23);
	jp.add(cb1);
        
        cb2=new JCheckBox("Mask");
        cb2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb2) {
			String s= "Mask 1 pac";
                        String p= "200 tk";
			jtf32.setText(s);
			jtf33.setText(p);
			
		}
			}
		});
        cb2.setBounds(120,10 ,90, 23);
	jp.add(cb2);
        
        cb3=new JCheckBox("Napa Extra");
        cb3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb3) {
			String s= "Napa Extra 500 mg+65 mg 1pcs";
                        String p= "10 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb3.setBounds(215,10 ,90, 23);
	jp.add(cb3);

        cb4=new JCheckBox("Paracetamol");
        cb4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb4) {
			String s= "Paracetamol 100 mg 1pcs ";
                        String p= "10 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb4.setBounds(310,10 ,80, 23);
	jp.add(cb4);
        
        cb5=new JCheckBox("Pantonix");
        cb5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb5) {
			String s= "Pantonix 20 mg 1pcs";
                        String p= "8 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb5.setBounds(395,10 ,100, 23);
	jp.add(cb5);
        
        cb6=new JCheckBox("Betafix");
        cb6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb6) {
			String s= "BETAFIX 2.5 mg 1pcs";
                        String p= "25 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb6.setBounds(5,50 ,100, 23);
	jp.add(cb6);
        
        cb7=new JCheckBox("Losectil");
        cb7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb7) {
			String s= "LOSECTIL USP 20 mg 1pcs";
                        String p= "15 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb7.setBounds(110,50 ,100, 23);
	jp.add(cb7);
        
        cb8=new JCheckBox("Natrilix SR");
        cb8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb8) {
			String s= "Natrilix SR 1.5 mg 1pcs";
                        String p= "80 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb8.setBounds(215,50 ,90, 23);
	jp.add(cb8);
        
        cb9=new JCheckBox("Fexo");
        cb9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb9) {
			String s= "Fexo 120 mg 1pcs";
                        String p= "17 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb9.setBounds(310,50 ,80, 23);
	jp.add(cb9);
        
         cb10=new JCheckBox("ORSaline-N");
        cb10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb10) {
			String s= "ORSaline-N 5 pcs";
                        String p= "20 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb10.setBounds(395,50 ,100, 23);
	jp.add(cb10);
        
        cb11=new JCheckBox("MONAS");
        cb11.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb11) {
			String s= "Monas 5 mg 1pcs";
                        String p= "18 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb11.setBounds(5,100 ,100, 23);
	jp.add(cb11);
        
        cb12=new JCheckBox("PARACETAMOL");
        cb12.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb12) {
			String s= "PARACETAMOL BP 500 mg 1pcs";
                        String p= "15 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb12.setBounds(5,100 ,100, 23);
	jp.add(cb12);
        
        cb12=new JCheckBox("Renova");
        cb12.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb12) {
			String s= "RENOVA BP 500 mg 1pcs";
                        String p= "20 tk";
			jtf32.setText(s);
			
		}
			}
		});
        cb12.setBounds(110,100 ,100, 23);
	jp.add(cb12);
        
        cb13=new JCheckBox("Comet");
        cb13.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb13) {
			String s= "COMET EP 850 mg 1pcs";
                        String p= "95 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb13.setBounds(215,100,90, 23);
	jp.add(cb13);
        
        cb14=new JCheckBox("Oral liquid");
        cb14.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb14) {
			String s= "Chloroquine 200 ml 1 bottle";
                        String p= "230 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb14.setBounds(310,100 ,95,23);
	jp.add(cb14);
        
        cb15=new JCheckBox("Opton");
        cb15.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb15) {
			String s= "Opton 20 mg 1pcs";
                        String p= "16 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb15.setBounds(410,100 ,80, 23);
	jp.add(cb15);
        
        cb16=new JCheckBox("Ciprox");
        cb16.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb16) {
			String s= "Ciprox 500 mg 1pcs";
                        String p= "12 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb16.setBounds(5,150,80, 23);
	jp.add(cb16);
        
        cb17=new JCheckBox("Aristomox");
        cb17.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb17) {
			String s= "Aristomox 200 mg 1pcs";
                        String p= "15 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb17.setBounds(90,150,100, 23);
	jp.add(cb17);
        
        cb18=new JCheckBox("Aristomox");
        cb18.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb18) {
			String s= "Aristomox 200 mg 1pcs";
                        String p= "6 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb18.setBounds(195,150,100, 23);
	jp.add(cb18);
        
        cb19=new JCheckBox("Fluclox");
        cb19.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb19) {
			String s= "Fluclox 500 mg 1pcs";
                        String p= "12 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb19.setBounds(300,150,80, 23);
	jp.add(cb19);
        
        cb20=new JCheckBox("Tenil");
        cb20.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb20) {
			String s= "Tenil 3mg 1pcs";
                        String p= "5 tk";
			jtf32.setText(s);
                        jtf33.setText(p);
			
		}
			}
		});
        cb20.setBounds(400,150,100, 23);
	jp.add(cb20);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(cb1);
        bg.add(cb2);
        bg.add(cb3);
        bg.add(cb4);
        bg.add(cb5);
        bg.add(cb6);
        bg.add(cb7);
        bg.add(cb8);
        bg.add(cb9);
        bg.add(cb10);
        bg.add(cb11);
        bg.add(cb12);
        bg.add(cb13);
        bg.add(cb14);
        bg.add(cb15);
        bg.add(cb16);
        bg.add(cb17);
        bg.add(cb18);
        bg.add(cb19);
        bg.add(cb20);
       
        
        JButton bc=new JButton("<= Back");
        bc.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent actionEvent){
            
            E_Health_care e=new E_Health_care();
            f.setVisible(false);
        }
    });
        bc.setForeground(Color.white);
        bc.setBackground(Color.black);
        bc.setBounds(20,10,80,40);
        f.add(bc);
                 
            bt14.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==bt14){
                    if(("".equals(jtf29.getText()) || "".equals(jtf30.getText()) || "".equals(jtf31.getText()) || "".equals(jtf32.getText())|| "".equals(jtf33.getText())))
                    {
                         final JOptionPane pane = new JOptionPane("Order Fail");
                         final JDialog d = pane.createDialog((JFrame)null, "Message");
                         d.setLocation(500,500);
                         d.setVisible(true); 
                    }
                    else{
                        try {
                        FileWriter fw=new FileWriter("pharmacyorders",true);
                        BufferedWriter bw=new BufferedWriter(fw);
                        String p=jtf29.getText();
                        String q=jtf30.getText();
                        String r=jtf31.getText();
                        String s=jtf32.getText();
                        String t=jtf33.getText();
                        bw.write(p+","+q+","+r+","+s+","+t);
                        bw.newLine();
                        bw.close();
                        fw.close();
                        JOptionPane.showMessageDialog(f,"Thanks for your Orders we will inform your confirmation by messege or Email");
   
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                    }
                    
                    
                }
                    
                    
                   
                    
            }
 
        });
             bt14.setForeground(Color.white);
        bt14.setBackground(Color.black);
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
        Pharmacy  ph=new Pharmacy ();
        ph.setResizable(false);
        
    }
    
    
}
