class Residence extends Property
{
    private boolean flat;  
    private int floor;      //the floor of the flat, otherwise -1
    
    
    //constructors
    public Residence()
    {
        setAddress("NULL");
        setArea(-1);
        setYear_of_purchase(-1);
	flat=false;
	floor=-1;
        
        setTax(tax_calculation());
    }
    
    public Residence(String ad, int ar, int yop, boolean fla, int flo)
    {
        setAddress(ad);
        setArea(ar);
        setYear_of_purchase(yop);
	flat=fla;
	floor=flo;
        
        setTax(tax_calculation());
    }

    @Override
    public void display()
    {
       System.out.println("--------------Property Info--------------");
       System.out.println("Type: Residence");
       System.out.println("Address: " + getAddress());
       System.out.println("Area(Sq m): " + getArea());
       System.out.println("Year of purchase: " + getYear_of_purchase());
       
       if(flat)
       {
           System.out.println("Flat: " + flat);
           System.out.println("Floor: " + floor);
       }
       else
           System.out.println("Flat: " + flat);

       System.out.println("Property tax: " + getTax());
       System.out.println("-----------------------------------------");
    }

    @Override
    public void save(String file)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double tax_calculation()
    {
        double property_tax;
	
	if(flat)
		property_tax=1.1*getArea()+5*floor+100;
	else
		property_tax=1.3*getArea()+150;
		
	return property_tax;	
    }
    
    
    //getters and setters
    public boolean getFlat()
    {
        return flat;
    }
    
    public void setFlat(boolean f)
    {
        flat=f;
    }
    
    
    public int getFloor()
    {
        return floor;
    }
    
    public void setFloor(int f)
    {
        floor=f;
    }
}
