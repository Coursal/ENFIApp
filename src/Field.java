import java.io.*;

class Field extends Property
{
    private boolean in_house_dev;
    private boolean farmable;
    
    //constructors
    public Field()
    {
        setAddress("NULL");
        setArea(-1);
        setYear_of_purchase(-1);
	in_house_dev=false;
        farmable=false;
        
        setTax(tax_calculation());
    }
    
    public Field(String ad, int ar, int yop, boolean i, boolean f)
    {
        setAddress(ad);
        setArea(ar);
        setYear_of_purchase(yop);
        in_house_dev=i;
        farmable=f;
        
        setTax(tax_calculation());
    }

    @Override
    public void display()
    {
       System.out.println("--------------Property Info--------------");
       System.out.println("Type: Field");
       System.out.println("Address: " + getAddress());
       System.out.println("Area(Sq m): " + getArea());
       System.out.println("Year of purchase: " + getYear_of_purchase());
       System.out.println("In house development: " + in_house_dev);
       System.out.println("Farmable: " + farmable);
       System.out.println("Property tax: " + getTax());
       System.out.println("-----------------------------------------");
    }

    @Override
    public double tax_calculation()
    {
        double property_tax;

	if(in_house_dev)
            property_tax=0.3*getArea()+70;
	else
            property_tax=0.3*getArea()+250;

	return property_tax;	
    }
    
    @Override
    public void save(String file)
    {
        try
        {
            FileWriter writer = new FileWriter(file,true);
            writer.write("F|" + getAddress() + "|" + getArea() + "|" + getYear_of_purchase() + "|" + in_house_dev + "|" + farmable + "\n");
            writer.close(); 
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    
    //getters and setters
    public boolean getIn_house_dev()
    {
        return in_house_dev;
    }
    
    public void setIn_house_dev(boolean i)
    {
        in_house_dev=i;
    }
    
    
    public boolean getFarmable()
    {
        return farmable;
    }
    
    public void setFarmable(boolean f)
    {
        farmable=f;
    }
}
