import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
public class KitchenEquipment extends JFrame implements ChangeListener, ActionListener{
    JButton select = new JButton();
    JButton back = new JButton();
    JButton confirm = new JButton();
    
    JLabel l,l2,l3,l4,list;
    JSlider s;
    Choice item = new Choice();
    
    JCheckBox i1,i2,i3,i4,i5,i6,i7,i8;
    JCheckBox [] items = new JCheckBox[]{i1,i2,i3,i4,i5,i6,i7,i8};
    
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    public KitchenEquipment(){
        setTitle("Select Equipment");
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        l = new JLabel("CAR EQUIPMENT LISTS");
        l.setFont(new Font("Serif", Font.PLAIN, 26));
        p1.add(l);
        
        i1 = new JCheckBox("Weighing Scale");
        i1.addActionListener(this);
        i2 = new JCheckBox("Meat Grinder");
        i2.addActionListener(this);
        i3 = new JCheckBox("Blender");
        i3.addActionListener(this);
        i4 = new JCheckBox("Boiler");
        i4.addActionListener(this);
        i5 = new JCheckBox("Oven Toaster");
        i5.addActionListener(this);
        i6 = new JCheckBox("Deep Fryer");
        i6.addActionListener(this);
        i7 = new JCheckBox("Pressure Cooker");
        i7.addActionListener(this);
        i8 = new JCheckBox("Beverage Dispenser");
        i8.addActionListener(this);
        
        p2.add(i1);p2.add(i2);p2.add(i3);p2.add(i4);
        p2.add(i5);p2.add(i6);p2.add(i7);p2.add(i8);
        
        l4 = new JLabel("Total Cost of Equipment: ");
        l4.setFont(new Font("Serif", Font.ITALIC, 16));     
        p2.add(l4);
        
        s = new JSlider(JSlider.HORIZONTAL, 1, 7, 1);
        s.addChangeListener(this);
        s.setMajorTickSpacing(1);
        s.setMinorTickSpacing(1);
        s.setPaintTicks(true);
        s.setPaintLabels(true);
        s.setFont(new Font("Serif", Font.PLAIN, 14));     
        p2.add(s);
        
        l2 = new JLabel("Days: ");
        l2.setFont(new Font("Serif", Font.ITALIC, 16));     
        p2.add(l2);
        
        confirm.setText("Confirm");
        confirm.setFont(new Font("Serif", Font.PLAIN, 16));    
        p2.add(confirm);
        
        confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                confirm(e);
            }
        });
        
        p2.setAlignmentX(Component.CENTER_ALIGNMENT);
        p2.setPreferredSize(new Dimension(250, 500));
        p2.setMaximumSize(new Dimension(250, 500));
        
        select.setText("Select");
        select.setFont(new Font("Serif", Font.PLAIN, 16)); 
        p3.add(select);
        
        select.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                select(e);
            }
        });
        
        back.setText("Back");
        back.setFont(new Font("Serif", Font.PLAIN, 16)); 
        p3.add(back);
        
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                back(e);
            }
        });
    
        items = new JCheckBox[] {i1, i2, i3, i4, i5, i6,i7,i8};
        
        getContentPane().add(p1, BorderLayout.PAGE_START);
        getContentPane().add(p2, BorderLayout.CENTER);
        getContentPane().add(p3, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,400);  
        setVisible(true);  
    }
    
    public void actionPerformed(ActionEvent e){
        final int[] prices = {1500, 1000, 750, 500, 500, 750, 1250, 800};
        int total = 0;
        int day = s.getValue();
        for(int i = 0; i < items.length; i++) {
            if(items[i].isSelected()) {
                total += prices[i];
            }
        }
        String totalCost = String.valueOf(total*day);
        l4.setText("Total Cost of Equipment: "+ totalCost);
    }

    public void stateChanged(ChangeEvent e) {
        int getS = s.getValue();
        String days = ""+ getS;
        l2.setText("Days: "+ days);
    }
    
    public void confirm(ActionEvent e){
        int day = s.getValue();
        final int[] prices = {1500, 1000, 750, 500, 500, 750, 1250, 800};
        int total = 0;
        for(int i = 0; i < items.length; i++) {
            if(items[i].isSelected()) {
                total += prices[i];
            }
        }
        if(day == 1){
            String totalCost = String.valueOf(total);
            l4.setText("Total Cost of Equipment: "+ totalCost);
        }
        else if (day == 2){
            String totalCost = String.valueOf(total*day);
            l4.setText("Total Cost of Equipment: "+ totalCost);
        }
        else if (day == 3){
            String totalCost = String.valueOf(total*day);
            l4.setText("Total Cost of Equipment: "+ totalCost);
        }
        else if (day == 4){
            String totalCost = String.valueOf(total*day);
            l4.setText("Total Cost of Equipment: "+ totalCost);
        }
        else if (day == 5){
            String totalCost = String.valueOf(total*day);
            l4.setText("Total Cost of Equipment: "+ totalCost);
        }
        else if (day == 6){
            String totalCost = String.valueOf(total*day);
            l4.setText("Total Cost of Equipment: "+ totalCost);
        }
        else if (day == 7){
            String totalCost = String.valueOf(total*day);
            l4.setText("Total Cost of Equipment: "+ totalCost);
        }
    }
    
    public void select(ActionEvent e){
        int day = s.getValue();
        final String[] equipment = {"Weighing Scale, ","Meat Grinder, ","Blender, ","Boiler, ",
        "Oven Toaster, ","Deep Fryer, ","Pressure Cooker, ","Beverage Dispenser, "};
        final int[] prices = {1500, 1000, 750, 500, 500, 750, 1250, 800};
        int total = 0;
        String eq = "\n";
        for(int i = 0; i < items.length; i++) {
            if(items[i].isSelected()) {
                total += prices[i];
            }
        }
        
        for(int i = 0; i < items.length; i++) {
            if(items[i].isSelected()) {
                eq += equipment[i];
            }
        }
        int days = s.getValue(); //identifies which day is selected
        int totalCost = total*days;
        JOptionPane.showMessageDialog(null,"Days: " +days + "\nEquipment Selected: "+ eq +"\nTotal Cost: "+totalCost);

    }
    
    public void back(ActionEvent e){
        new EquipmentOp().show();
        this.dispose();
    }
    
    public static void main(String [] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new KitchenEquipment().show();
                }
        });
    }
}
