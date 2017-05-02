import java.util.ArrayList;

public class Interface
{
    private ArrayList<Customer> customers;
    private ArrayList<WebSite> webSites;

    /**
     * Constructor for objects of class Interface
     */
    public Interface()
    {
        customers = new ArrayList<>();
        webSites = new ArrayList<>();
    }

    public void addCustomer(String lName, String fName, String companyName, String address, String city, String state, int zip, String phoneNum)
    {
        customers.add(new Customer(lName, fName, companyName, address, city, state, zip, phoneNum));
    }
    
    public void addWebSite(int design, boolean feature1, boolean feature2, boolean feature3, boolean feature4, boolean feature5)
    {
        webSites.add(new WebSite(design, feature1, feature2, feature3, feature4, feature5));
    }
    
    //Customer methoids
    public void setLName(int who, String lName)
    {
        customers.get(who).setLName(lName);
    }
    
    public String getLName(int who)
    {
        return customers.get(who).getLName();
    }
    
    public void setFName(int who, String fName)
    {
        customers.get(who).setFName(fName);
    }
    
    public String getFName(int who)
    {
        return customers.get(who).getFName();
    }
    
    public void setCompanyName(int who, String companyName)
    {
        customers.get(who).setCompanyName(companyName);
    }
    
    public String getCompanyName(int who)
    {
        return customers.get(who).getCompanyName();
    }
    
    public void setAddress(int who, String address)
    {
        customers.get(who).setAddress(address);
    }
    
    public String getAddress(int who)
    {
        return customers.get(who).getAddress();
    }
    
    public void setCity(int who, String city)
    {
        customers.get(who).setCity(city);
    }
    
    public String getCity(int who)
    {
        return customers.get(who).getCity();
    }
    
    public void setState(int who, String state)
    {
        customers.get(who).setState(state);
    }
    
    public String getState(int who)
    {
        return customers.get(who).getState();
    }
    
    public void setZip(int who, int zip)
    {
        customers.get(who).setZip(zip);
    }
    
    public int getZip(int who)
    {
        return customers.get(who).getZip();
    }
    
    public void setPhoneNum(int who, String phoneNum)
    {
        customers.get(who).setPhoneNum(phoneNum);
    }
    
    public String getPhoneNum(int who)
    {
        return customers.get(who).getPhoneNum();
    }
    
    //WebSite Methoids
    public void setDesign(int site, int design)
    {
        webSites.get(site).setDesign(design);
    }
    
    public int getDesign(int site)
    {
        return webSites.get(site).getDesign();
    }
    
    public void setFeature1(int site, boolean feature1)
    {
        webSites.get(site).setFeature1(feature1);
    }
    
    public boolean getFeature1(int site)
    {
        return webSites.get(site).getFeature1();
    }
    
    public void setFeature2(int site, boolean feature2)
    {
        webSites.get(site).setFeature2(feature2);
    }
    
    public boolean getFeature2(int site)
    {
        return webSites.get(site).getFeature2();
    }
    
    public void setFeature3(int site, boolean feature3)
    {
        webSites.get(site).setFeature3(feature3);
    }
    
    public boolean getFeature3(int site)
    {
        return webSites.get(site).getFeature3();
    }
    
    public void setFeature4(int site, boolean feature4)
    {
        webSites.get(site).setFeature4(feature4);
    }
    
    public boolean getFeature4(int site)
    {
        return webSites.get(site).getFeature4();
    }
    
    public void setFeature5(int site, boolean feature5)
    {
        webSites.get(site).setFeature5(feature5);
    }
    
    public boolean getFeature5(int site)
    {
        return webSites.get(site).getFeature5();
    }
    
    public int getPrice(int site)
    {
        return webSites.get(site).getPrice();
    }

    public void calcTotal(int site)
    {
        webSites.get(site).calcTotal();
    }
    
    private void displayTotal(int site)
    {
        webSites.get(site).displayTotal();
    }
    
    public void printBill(int site, int who)
    {
        String lName = customers.get(who).getLName();
        String fName = customers.get(who).getFName();
        int price = webSites.get(site).getPrice();
        System.out.println("Thank you " + fName + " " + lName + " for using Web Site Sales by Lame-O.");
        System.out.println("Your total for this order is $" + price + ".");
    }
}
