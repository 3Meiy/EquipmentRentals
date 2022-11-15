import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.FileWriter;
import java.io.IOException;

public class Printe extends JFrame
{
    JButton but = new JButton();
    
    public Printe(){
    
    setTitle("Print Customer Info");
    setSize(400, 550);
    setLocationRelativeTo(null);
    
    but = new JButton("Print");
    but.setBounds(150, 285, 80, 30);
    add(but);
    
    but.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    be(e);
    }
    });
    
    }
    
    public void be(ActionEvent e){
    String name = "Nico";
    String add = "Mexico";
    try{
        FileWriter w=new FileWriter("Customer.txt",true);
        w.write("Name Of Customer:" +name+ "Address:"+add);
        w.close();
        JOptionPane.showMessageDialog(null,"Success");
        setVisible(false);
    }
    catch(Exception f){
        JOptionPane.showMessageDialog(null,"Error");
        this.dispose();
        new MainMenu().show();
    }
    {}
    }
    public static void main(String [] args){
        new Printe().show();
    }
}
