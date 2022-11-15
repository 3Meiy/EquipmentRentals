import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EquipmentOp extends JFrame
{
    Choice c = new Choice();
    JButton b = new JButton();
    JButton ca = new JButton();
    JButton se = new JButton();
    JButton co = new JButton();
    JLabel fe = new JLabel();
    JLabel m = new JLabel();
    
    
        public EquipmentOp(){
        setTitle("Equipment List");
        getContentPane().setLayout(new GridBagLayout());
        setSize(400, 550);
        setLocationRelativeTo(null); // This center the window on the screen
        GridBagConstraints gridConstraints = new GridBagConstraints();
        
        //LABELS
        m.setText("EQUIPMENT RENTALS");
        m.setBounds(90,0,350,50);
        m.setFont(new Font("Calibri", Font.PLAIN, 24));
        getContentPane().add(m, gridConstraints);
        
        fe.setText("Equipment Selected: ");
        fe.setBounds(80,150,500,20);
        getContentPane().add(fe, gridConstraints);
        
        //CHOICE METHOD
        c.setBounds(100,100,170,170);
        c.add("-");
        c.add("Heavy Equipment");
        c.add("Car Equipment");
        c.add("Kitchen Equipment");
        
        //BUTTONS
        ca.setText("Back");
        ca.setBounds(190,130,80,20);
        getContentPane().add(ca, gridConstraints);
        
        ca.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            ca(e);
        }
        });
        
        se.setText("Select");
        se.setBounds(100,130,80,20);
        getContentPane().add(se, gridConstraints);
        
        se.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            se(e);
        }
        });
        
        co.setText("Confirm");
        co.setBounds(145,170,80,20);
        getContentPane().add(co, gridConstraints);
        
        co.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            co(e);
        }
        });
         
        add(c);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420,400);
        setLayout(null);
    }
    public void ca(ActionEvent e){
            new MainMenu().show();
            this.dispose();
    }
    public void se(ActionEvent e){
            String data = "Equipment Selected: "+ c.getItem(c.getSelectedIndex());   
            fe.setText(data);    
    }
    public void co(ActionEvent e){
            String data = c.getItem(c.getSelectedIndex());
            if (fe.getText().equals("Equipment Selected: -")){
                JOptionPane.showMessageDialog(null, "You have selected Nothing");
            }
            if (fe.getText().equals("Equipment Selected: Heavy Equipment")){
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(null, "You have selected Heavy Equipments");
                this.dispose();
                new HeavyEquipment().show();
            }
            if (fe.getText().equals("Equipment Selected: Car Equipment")){
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(null, "You have selected Car Equipments");
                this.dispose();
                new CarEquipment().show();
            }
            if (fe.getText().equals("Equipment Selected: Kitchen Equipment")){
                JOptionPane.showMessageDialog(null, "You have selected Kitchen Equipments");
                this.dispose();
                new KitchenEquipment().show();
            }
    }
    public static void main(String [] args){
        new EquipmentOp().show();
    }
}