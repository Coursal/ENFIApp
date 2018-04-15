import java.util.ArrayList;
import java.util.List;

class Form
{
    private String name;
    private String reg_num;
    private int year_of_submission;
    private List<Property> property_list = new ArrayList<Property>();
    private double enfia;
    
    
    //constructors
    public Form()
    {
        name=reg_num="NULL";
        year_of_submission=-1;
        enfia=-1;
    }
    
    public Form(String n, String r, int yos)
    {
        name=n;
        reg_num=r;
        year_of_submission=yos;
    }
    
    public void display()
    {
        System.out.println("****************Form Info****************");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + reg_num);
        System.out.println("Year of submission: " + year_of_submission);
        System.out.println("ENFIA: " + enfia);
        System.out.println();
        for(Property listed_property:property_list)
            listed_property.display();
        System.out.println();
        System.out.println("*****************************************");
    }
    
    public void backup()                        ////method to log all the properties' information to a txt file named after the registration number of the applicant
    {
        String form_file=reg_num+".txt";
        
        for(Property listed_property:property_list)
            listed_property.save(form_file);
    }
    
    public void enfia_sum()
    {
        for(Property listed_property:property_list)
            enfia+=listed_property.tax_calculation();
    }
    
    public void add_property(Property p)
    {
        property_list.add(p);
    }
    
    public void remove_property(Property p)
    {
        property_list.remove(p);
    }
    
    public void clear_properties()
    {
        property_list.clear();
    }
    
    
    //getters and setters
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name=n;
    }
    
    
    public String getReg_num()
    {
        return reg_num;
    }
    
    public void setReg_num(String r)
    {
        reg_num=r;
    }
    
    
    public int getYear_of_submission()
    {
        return year_of_submission;
    }
    
    public void setYear_of_submission(int yos)
    {
        year_of_submission=yos;
    }
    
    
    public double getEnfia()
    {
        return enfia;
    }
    
    public void setEnfia(double e)
    {
        enfia=e;
    }
}
