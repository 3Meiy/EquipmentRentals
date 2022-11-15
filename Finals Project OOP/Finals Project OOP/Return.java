import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
public class Return extends JFrame
{
    JTextField area = new JTextField();
    JButton but = new JButton();
    JButton but2 = new JButton();
    
    Return(){
        setTitle("Return Equipments");
        setSize(400, 550);
        setLocationRelativeTo(null); // This center the window on the screen
        area = new JTextField("");
        area.setBounds(50,170,380,100);
        add(area);
        
        but = new JButton("Return");
        but.setBounds(150, 285, 80, 30);
        add(but);
        but.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        be(e);
        }
        });
        
        but2= new JButton("Back");
        but2.setBounds(250, 285, 80, 30);
        add(but2);
        but2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        be2(e);
        }
        });
        
        setLayout(null);
        setSize(490, 370);
        setVisible(true);
        
        String custo = "Nico";
        String addre = "Mexico";
        area.setText(custo+" - "+addre);
    }
    public void be(ActionEvent e){
        area.setText(""+" - "+"");
        JOptionPane.showMessageDialog(null, "Equipments Returned");
    }
    public void be2(ActionEvent e){
        this.dispose();
        new MainMenu().show();
    }
    public static void main(String [] args){
        new Return().show();
    }
}
