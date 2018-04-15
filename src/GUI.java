import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class GUI extends JFrame implements ActionListener
{
    private JFrame frame;
    
    private JPanel home_page;
    
    private JLabel name;
    private JLabel reg_num;
    private JLabel yos;
    private JLabel enfia;
    
    GUI(Form f)
    {
        frame = new JFrame("ENFIApp Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        home_page = new JPanel();
        
        name = new JLabel(f.getName());
        reg_num = new JLabel(f.getReg_num());
        yos = new JLabel(String.valueOf(f.getYear_of_submission()));
        enfia = new JLabel(String.valueOf(f.getEnfia()));
        
        name.setBounds(70,30,200,30);
        reg_num.setBounds(70,60,200,30);
        yos.setBounds(70,90,200,30);
        enfia.setBounds(70,120,200,30);
        
        home_page.add(name);
        home_page.add(reg_num);
        home_page.add(yos);
        home_page.add(enfia);
        
        frame.setContentPane(home_page);
        frame.setSize(300,300);                  
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
