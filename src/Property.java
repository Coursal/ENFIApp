abstract class Property
{
    private String address;
    private int area;
    private int year_of_purchase;
    private double tax;
    
    
    //constructors
    public Property()
    {
        address="NULL";
        area=year_of_purchase=-1;
        tax=-1;
    }
    
    public Property(String ad, int ar, int yop)
    {
        address=ad;
        area=ar;
        year_of_purchase=yop;
    }
    
    
    //special methods for each type of property
    public abstract void display();
    public abstract double tax_calculation();
    public abstract void save(String file);     //method to log the property information to a txt file named after the registration number of the applicant
  
    
    //getters and setters
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String ad)
    {
        address=ad;
    }
    
    public int getArea()
    {
        return area;
    }
    
    public void setArea(int ar)
    {
        area=ar;
    }
    
    
    public int getYear_of_purchase()
    {
        return year_of_purchase;
    }
    
    public void setYear_of_purchase(int yop)
    {
        year_of_purchase=yop;
    }
    
    
    public double getTax()
    {
        return tax;
    }
    
    public void setTax(double t)
    {
        tax=t;
    }
}
