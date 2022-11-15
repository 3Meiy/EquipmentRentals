import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainMenu extends JFrame{
    JLabel m = new JLabel();
    JButton eq = new JButton();
    JButton c = new JButton();
    JButton re = new JButton();
    JButton l = new JButton();
    JButton p = new JButton();
    
    public MainMenu(){
        setTitle("Equipment Rentals");
        setSize(400, 550);
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();
        setLocationRelativeTo(null); // This center the window on the screen
        getContentPane().setBackground(Color.WHITE);
        
        //LABELS
        m.setText("EQUIPMENT RENTALS");
        m.setBounds(80,0,350,50); 
        m.setFont(new Font("Calibri", Font.PLAIN, 24)); //Sets Font and Text Size
        getContentPane().add(m, gridConstraints);
        
        //BUTTONS
        eq.setText("Equipments");
        eq.setBounds(110,50,150,50);
        getContentPane().add(eq, gridConstraints);
        
        eq.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        eq(e);
        }
        });
        
        c.setText("Customer");
        c.setBounds(110,110,150,50);
        getContentPane().add(c, gridConstraints);
        
        c.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        customer(e);
        }
        });
        
        re.setText("Return");
        re.setBounds(110,170,150,50);
        getContentPane().add(re, gridConstraints);
        
        re.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        re(e);
        }
        });
        
        p.setText("Print");
        p.setBounds(110,230,150,50);
        getContentPane().add(p, gridConstraints);
        p.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        pe(e);
        }
        });
        
        l.setText("Logout");
        l.setBounds(110,290,150,50);
        getContentPane().add(l, gridConstraints);
        
        l.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        l(e);
        }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(null);
    }
    public void eq(ActionEvent e){
        new EquipmentOp().show();
        this.dispose();
    }
    public void l(ActionEvent e){
        new LoginInfo().show();
        this.dispose();
    }
    public void customer(ActionEvent e){
        new Customer().show();
        this.dispose();
    }
    public void re(ActionEvent e){
        new Return().show();
        this.dispose();
    }
    public void pe(ActionEvent e){
        new Printe().show();
        this.dispose();
    }
    public static void main(String [] args){
        new MainMenu().show();
    }
}

