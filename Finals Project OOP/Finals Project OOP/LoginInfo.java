import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LoginInfo extends JFrame{
    JButton logButton = new JButton();
    JButton cancelButton = new JButton();
    
    JLabel userN = new JLabel();
    JLabel passW = new JLabel();
    JLabel success = new JLabel();
    JLabel label = new JLabel();
    
    JPanel panel = new JPanel();
    
    Choice c = new Choice();
    
    JTextField userNa = new JTextField();
    JPasswordField passWo = new JPasswordField();
    
    public LoginInfo(){
        setTitle("Admin Console");
        setSize(400, 550);
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();
        setLocationRelativeTo(null); // This center the window on the screen
        
        //Labels
        userN.setText("Username:");
        gridConstraints.gridx=0;
        gridConstraints.gridy=0;
        getContentPane().add(userN, gridConstraints);
        
        passW.setText("Password:");
        gridConstraints.gridx=0;
        gridConstraints.gridy=1;
        getContentPane().add(passW, gridConstraints);
        
        //Fields
        userNa.setText("");
        userNa.setColumns(15);
        gridConstraints.gridx=1;
        gridConstraints.gridy=0;
        getContentPane().add(userNa, gridConstraints);
        
        passWo.setText("");
        passWo.setColumns(15);
        gridConstraints.gridx=1;
        gridConstraints.gridy=1;
        getContentPane().add(passWo, gridConstraints);
        //Button
        logButton.setText("Login");
        gridConstraints.gridx=0;
        gridConstraints.gridy=3;
        getContentPane().add(logButton, gridConstraints);
        
        logButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        logPerformance(e);
        }
        });
        
        cancelButton.setText("Cancel");
        gridConstraints.gridx=1;
        gridConstraints.gridy=3;
        getContentPane().add(cancelButton, gridConstraints);
        
        cancelButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        canPerformance(e);
        }
        });
        
        setSize(500,150);
    }
    
    public static void main(String [] args){
        new LoginInfo().show();
    }
    
    public void logPerformance(ActionEvent e){
    String user = userNa.getText();
    String password = passWo.getText();
    if(user.equals("Nico") && password.equals("123")){
        if(e.getSource()==logButton) {
        JOptionPane.showMessageDialog(null, "Login Successful");
        this.dispose();
        new MainMenu().show();

    }
    }else
    JOptionPane.showMessageDialog(null,"Username/Password Incorrect");
    }
    public void canPerformance(ActionEvent e){
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(null, "Thank you");
        System.exit(0);
    }
}