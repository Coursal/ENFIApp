import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.*;

class GUI extends JFrame implements ActionListener
{
    private JFrame frame;
    
    private JPanel home_page;
    private JLabel home_title;
    private JButton insert;
    private JButton mod;
    private JButton cancel;
    private JButton info;
    private JButton exit;
    
    private JPanel insert_page;
    private JLabel insert_title;
    private JLabel year_label;
    private JLabel name_label;
    private JLabel reg_num_label;
    private JTextField name_text;
    private JTextField reg_num_text;
    private JButton insert_button;
    private JButton insert_close;
 
    
    private JPanel info_page;
    private JLabel info_title;
    private JButton info_close;
    
    GUI()
    {
        frame = new JFrame("ENFIApp Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       //////////////////////////////////////////////////////
       //////////home page components initialization/////////
       ////////////////////////////////////////////////////// 
        home_page = new JPanel();
            
            home_page.setLayout(new BoxLayout(home_page, BoxLayout.Y_AXIS));      //each component under the previous one
            
            home_title = new JLabel("ENFIApp", JLabel.CENTER);
            home_title.setAlignmentX(CENTER_ALIGNMENT);
  
            insert = new JButton("Insert new form");
            insert.setAlignmentX(CENTER_ALIGNMENT);
            insert.setMaximumSize(new Dimension(Integer.MAX_VALUE, insert.getMinimumSize().height));    //fill the width of the window
            
            mod = new JButton("Modify existing form");
            mod.setAlignmentX(CENTER_ALIGNMENT);
            mod.setMaximumSize(new Dimension(Integer.MAX_VALUE, mod.getMinimumSize().height));          //fill the width of the window
            
            cancel = new JButton("Cancel existing form");
            cancel.setAlignmentX(CENTER_ALIGNMENT);
            cancel.setMaximumSize(new Dimension(Integer.MAX_VALUE, cancel.getMinimumSize().height));    //fill the width of the window
            
            info = new JButton("Additional info");
            info.setAlignmentX(CENTER_ALIGNMENT);
            info.setMaximumSize(new Dimension(Integer.MAX_VALUE, info.getMinimumSize().height));        //fill the width of the window
            
            exit = new JButton("Exit");
            exit.setAlignmentX(CENTER_ALIGNMENT);
            exit.setMaximumSize(new Dimension(Integer.MAX_VALUE, exit.getMinimumSize().height));        //fill the width of the window
            
            
            insert.addActionListener(this);
            mod.addActionListener(this);
            cancel.addActionListener(this);
            info.addActionListener(this);
            exit.addActionListener(this);

            
            home_page.add(home_title);
            home_page.add(insert);
            home_page.add(mod);
            home_page.add(cancel);
            home_page.add(info);
            home_page.add(exit);
       //////////////////////////////////////////////////////
       //////////////////////////////////////////////////////
       ////////////////////////////////////////////////////// 
        
       
       //////////////////////////////////////////////////////
       ////////insert page components initialization/////////
       ////////////////////////////////////////////////////// 
       insert_page = new JPanel();
       
            insert_page.setLayout(new BoxLayout(insert_page, BoxLayout.Y_AXIS));      //each component under the previous one
       
            insert_title = new JLabel("Insert new form", JLabel.CENTER);
            insert_title.setAlignmentX(CENTER_ALIGNMENT);
            
            year_label = new JLabel("Year: " + String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
            year_label.setAlignmentX(CENTER_ALIGNMENT);
            year_label.setMaximumSize(new Dimension(Integer.MAX_VALUE, year_label.getMinimumSize().height)); 
            
            name_label = new JLabel("Name: ");
            name_label.setAlignmentX(CENTER_ALIGNMENT);
            name_label.setMaximumSize(new Dimension(Integer.MAX_VALUE, name_label.getMinimumSize().height)); 
            
            name_text = new JTextField();
            name_text.setAlignmentX(CENTER_ALIGNMENT);
            name_text.setMaximumSize(new Dimension(Integer.MAX_VALUE, name_text.getMinimumSize().height)); 
            
            reg_num_label = new JLabel("Registration number: ");
            reg_num_label.setAlignmentX(CENTER_ALIGNMENT);
            reg_num_label.setMaximumSize(new Dimension(Integer.MAX_VALUE, reg_num_label.getMinimumSize().height)); 
            
            reg_num_text = new JTextField();
            reg_num_text.setAlignmentX(CENTER_ALIGNMENT);
            reg_num_text.setMaximumSize(new Dimension(Integer.MAX_VALUE, reg_num_text.getMinimumSize().height)); 
               
            insert_button = new JButton("Insert");
            insert_button.setAlignmentX(CENTER_ALIGNMENT);
            insert_button.setMaximumSize(new Dimension(Integer.MAX_VALUE, insert_button.getMinimumSize().height));        //fill the width of the window
            
            insert_close = new JButton("Back to Menu");
            insert_close.setAlignmentX(CENTER_ALIGNMENT);
            insert_close.setMaximumSize(new Dimension(Integer.MAX_VALUE, insert_close.getMinimumSize().height));        //fill the width of the window
            insert_close.addActionListener(this);
  
            
            
            insert_page.add(insert_title);
            insert_page.add(year_label);
            insert_page.add(name_label);
            insert_page.add(name_text);
            insert_page.add(reg_num_label);
            insert_page.add(reg_num_text);
            insert_page.add(insert_button);
            insert_page.add(insert_close);
            
            
 
       //////////////////////////////////////////////////////
       //////////////////////////////////////////////////////
       ////////////////////////////////////////////////////// 
        
        
       //////////////////////////////////////////////////////
       //////////info page components initialization/////////
       ////////////////////////////////////////////////////// 
       info_page = new JPanel();
       
            info_page.setLayout(new BoxLayout(info_page, BoxLayout.Y_AXIS));      //each component under the previous one
       
            info_title = new JLabel("Additional Info", JLabel.CENTER);
            info_title.setAlignmentX(CENTER_ALIGNMENT);
            
  
            info_close = new JButton("Back to Menu");
            info_close.setAlignmentX(CENTER_ALIGNMENT);
            info_close.setMaximumSize(new Dimension(Integer.MAX_VALUE, info_close.getMinimumSize().height));        //fill the width of the window
            info_close.addActionListener(this);
            
            
            info_page.add(info_title);
            info_page.add(info_close);
       //////////////////////////////////////////////////////
       //////////////////////////////////////////////////////
       ////////////////////////////////////////////////////// 
        
       frame.add(home_page);
       frame.add(insert_page);
       frame.add(info_page);
       
       frame.setLayout(new BorderLayout());
       frame.setContentPane(home_page); 
       frame.pack();
       frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == insert)
        {
            frame.remove(home_page);
            frame.setContentPane(insert_page);
        }
        else if(e.getSource() == info)
        {
            frame.remove(home_page);
            frame.setContentPane(info_page);
        }
        else if(e.getSource() == insert_close)
        {
            frame.remove(insert_page);
            frame.setContentPane(home_page);
        }
        else if(e.getSource() == info_close)
        {
            frame.remove(info_page);
            frame.setContentPane(home_page);
        }
        else if(e.getSource() == exit)
        {
            frame.dispose();
        }
        
        
        
        
        frame.revalidate();
        frame.repaint();
    }
}
