import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.FileWriter;

public class Customer extends JFrame implements ActionListener{
    JLabel title, cus, add, log;
    JFileChooser fc;
    JButton b, b1, b2;
    JTextField cust, addt, area;
    Socket s;
    int i;

    Customer() {
        super("Client");
        
        title = new JLabel("CUSTOMER INFORMATION");
        title.setBounds(100,0,350,50);
        setSize(400, 550);
        title.setFont(new Font("Calibri", Font.PLAIN, 24));
        setLocationRelativeTo(null); // This center the window on the screen
        add(title);
        
        cust = new JTextField(); 
        cust.setBounds(150, 50, 190, 30);
        add(cust);
        
        addt = new JTextField();
        addt.setBounds(150, 100, 190, 30);
        add(addt);
        
        add = new JLabel("Customer Address:");
        add.setBounds(30,100,190,30);
        add(add);

        cus = new JLabel("Customer Name:");
        cus.setBounds(40, 50, 190, 30);
        add(cus);
        
        b = new JButton("Upload");
        b.setBounds(360, 70, 80, 30);
        add(b);
        b.addActionListener(this);
        
        b1 = new JButton("Save");
        b1.setBounds(100, 285, 80, 30);
        add(b1);
        b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        saveAction(e);
        }
        });
        
        b2= new JButton("Back");
        b2.setBounds(300, 285, 80, 30);
        add(b2);
        b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        be(e);
        }
        });
        
        log = new JLabel("Customer Log:");
        log.setBounds(50,120,100,80);
        add(log);
        
        area = new JTextField("");
        area.setBounds(50,170,380,100);
        add(area);
        
        setLayout(null);
        setSize(490, 370);
        setVisible(true);
        
 
    }
    public void actionPerformed(ActionEvent e) {
        String custo = cust.getText();
        String addre = addt.getText();
        
        area.setText(custo+" - "+addre);
    }
    public void be(ActionEvent e){
        this.dispose();
        new MainMenu().show();
    }
    public void saveAction(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Information Saved.");
        this.dispose();
        new MainMenu().show();
    }
    public static void main(String... d) {
        new Customer();
    }
}