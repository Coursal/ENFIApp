public class main
{
    public static void main(String args[])
    {
        Residence r = new Residence("Keratsiniou 54", 45, 2013, true, 1);
        //r.display();
        
        Store s = new Store("Keratsiniou 54", 45, 2013, 5);
        //s.display();
        
        Field f = new Field("Keratsiniou 54", 45, 2013, false, true);
        //f.display();
        
        Form f1 = new Form("Mary Sue", "1111111111", 2018);
        f1.add_property(r);
        f1.add_property(s);
        f1.add_property(f);
        f1.enfia_sum();
        f1.display();
        
    }
}
