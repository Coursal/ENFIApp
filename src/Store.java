class Store extends Property
{
    private int location_level;      //1-5 value for the most valuable location
    
    
    //constructors
    public Store()
    {
        setAddress("NULL");
        setArea(-1);
        setYear_of_purchase(-1);
	location_level=-1;
        
        setTax(tax_calculation());
    }
    
    public Store(String ad, int ar, int yop, int l)
    {
        setAddress(ad);
        setArea(ar);
        setYear_of_purchase(yop);
        
        if(l<1 || l>5)              //in case of wrong location level input, auto-set it to 1
            location_level=1;
        else
            location_level=l;
        
        setTax(tax_calculation());
    }

    @Override
    public void display()
    {
       System.out.println("--------------Property Info--------------");
       System.out.println("Type: Store");
       System.out.println("Address: " + getAddress());
       System.out.println("Area(Sq m): " + getArea());
       System.out.println("Year of purchase: " + getYear_of_purchase());
       System.out.println("Location level: " + location_level);
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

	property_tax=2*getArea()+200*location_level;

	return property_tax;	
    }
    
    
    //getters and setters
    public int getLocation_level()
    {
        return location_level;
    }
    
    public void setLocation_level(int l)
    {
        location_level=l;
    }
}
