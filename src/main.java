public class main
{
    public static void main(String args[])
    {
        Residence r = new Residence("Keratsiniou 54", 45, 2013, true, 1);
        r.display();
        
        Store s = new Store("Keratsiniou 54", 45, 2013, 5);
        s.display();
        
        Field f = new Field("Keratsiniou 54", 45, 2013, false, true);
        f.display();
    }
}
