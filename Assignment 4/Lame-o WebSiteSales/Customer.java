
public class Customer
{
    // instance variables - replace the example below with your own
    private String lName;
    private String fName;
    private String companyName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNum;
    

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String lName, String fName, String companyName, String address, String city, String state, int zip, String phoneNum)
    {
        this.lName = lName;
        this.fName = fName;
        this.companyName = companyName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNum = phoneNum;
    }

    
    public void setLName(String lName)
    {
        this.lName = lName;
    }
    
    public String getLName()
    {
        return lName;
    }
    
    public void setFName(String fName)
    {
        this.fName = fName;
    }
    
    public String getFName()
    {
        return fName;
    }
    
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    
    public String getCompanyName()
    {
        return companyName;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public String getState()
    {
        return state;
    }
    
    public void setZip(int zip)
    {
        this.zip = zip;
    }
    
    public int getZip()
    {
        return zip;
    }
    
    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }
    
    public String getPhoneNum()
    {
        return phoneNum;
    }
}
