public class main
{
    public static void main(String args[])
    {
        Residence r = new Residence("Keratsiniou 54", 45, 1999, true, 1);
        //r.display();
        
        Store s = new Store("St. Charles Ave. 354", 60, 2005, 5);
        //s.display();
        
        Field f = new Field("Huxley Sq. 3", 1000, 2000, false, true);
        //f.display();
        
        Form f1 = new Form("Mary Sue", "1111111111", 2018);
        f1.add_property(r);
        f1.add_property(s);
        f1.add_property(f);
        
        f1.enfia_sum();
        f1.display();
        f1.backup();  
        
<<<<<<< HEAD
        GUI gui_instance = new GUI();       //initialization of the GUI
=======
        GUI gui_instance = new GUI(f1);
>>>>>>> 32eabd26048754d304fe6cfdf270183a883dbeb1
    }
}
