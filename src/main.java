import java.util.ArrayList;

public class main
{
    public static void main(String args[])
    {
        Residence r1 = new Residence("Telegrave Ave. 54", 45, 1999, true, 1);
        //r.display();
        Store s1 = new Store("St. Charles Ave. 354", 60, 2005, 5);
        //s.display();
        Field f1 = new Field("Huxley Sq. 3", 1000, 2000, false, true);
        //f.display();
        
        Form mary = new Form("Mary Sue", "1111111111", 2018);
        mary.add_property(r1);
        mary.add_property(s1);
        mary.add_property(f1);
        mary.enfia_sum();
        mary.display();
        mary.backup();
        
        
        Residence r2 = new Residence("Second Str. 35", 65, 2013, false, 0);
        //r.display();
        Store s2 = new Store("Huxley Sq. 15", 90, 2015, 2);
        //s.display();
        
        Form jamal = new Form("Jamal Odom", "2222222222", 2018);
        jamal.add_property(r2);
        jamal.add_property(s2);
        jamal.enfia_sum();
        jamal.display();
        jamal.backup();
        
        ArrayList<String> form_list = new ArrayList<String>();
        form_list.add(mary.getName());
        form_list.add(jamal.getName());

        GUI gui_instance = new GUI(form_list.toArray(new String[0]));
    }
}
