
/**
 * Write a description of class WebSite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WebSite
{
    private int design;
    private boolean feature1;
    private boolean feature2;
    private boolean feature3;
    private boolean feature4;
    private boolean feature5;
    private int price;

    /**
     * Constructor for objects of class WebSite
     * design: 0 = Nature, 1 = Tech, 2 = Business, 3 = Music, 4 = Naughty
     * feature1-5: True/False if true feature is added
     */
    public WebSite(int design, boolean feature1, boolean feature2, boolean feature3, boolean feature4, boolean feature5)
    {
        this.design = design;
        this.feature1 = feature1;
        this.feature2 = feature2;
        this.feature3 = feature3;
        this.feature4 = feature4;
        this.feature5 = feature5;
        this.price = 0;
        calcTotal();
        displayTotal();
    }
    
    public void setDesign(int design)
    {
        this.design = design;
        calcTotal();
    }
    
    public int getDesign()
    {
        return design;
    }
    
    public void setFeature1(boolean feature1)
    {
        this.feature1 = feature1;
        calcTotal();
    }
    
    public boolean getFeature1()
    {
        return feature1;
    }
    
    public void setFeature2(boolean feature2)
    {
        this.feature2 = feature2;
        calcTotal();
    }
    
    public boolean getFeature2()
    {
        return feature2;
    }
    
    public void setFeature3(boolean feature3)
    {
        this.feature3 = feature3;
        calcTotal();
    }
    
    public boolean getFeature3()
    {
        return feature3;
    }
    
    public void setFeature4(boolean feature4)
    {
        this.feature4 = feature4;
        calcTotal();
    }
    
    public boolean getFeature4()
    {
        return feature4;
    }
    
    public void setFeature5(boolean feature5)
    {
        this.feature5 = feature5;
        calcTotal();
    }
    
    public boolean getFeature5()
    {
        return feature5;
    }
    
    public int getPrice()
    {
        return price;
    }

    public void calcTotal()
    {
        //Calculate Total if design is Nature
        if (design == 0)
        {
            final int BASE = 300;
            final int FEATURE1 = 10;
            final int FEATURE2 = 15;
            final int FEATURE3 = 20;
            final int FEATURE4 = 25;
            final int FEATURE5 = 30;
            price = price + BASE;
            if (feature1 == true)
            {
                price = price + FEATURE1;
            }
            if (feature2 == true)
            {
                price = price + FEATURE2;
            }
            if (feature3 == true)
            {
                price = price + FEATURE3;
            }
            if (feature4 == true)
            {
                price = price + FEATURE4;
            }
            if (feature5 == true)
            {
                price = price + FEATURE5;
            }
        }else if (design == 1) //Calculate Total if design is Tech
        {
            final int BASE = 350;
            final int FEATURE1 = 20;
            final int FEATURE2 = 30;
            final int FEATURE3 = 40;
            final int FEATURE4 = 50;
            final int FEATURE5 = 60;
            price = price + BASE;
            if (feature1 == true)
            {
                price = price + FEATURE1;
            }
            if (feature2 == true)
            {
                price = price + FEATURE2;
            }
            if (feature3 == true)
            {
                price = price + FEATURE3;
            }
            if (feature4 == true)
            {
                price = price + FEATURE4;
            }
            if (feature5 == true)
            {
                price = price + FEATURE5;
            }
        }else if (design == 2) //Calculate Total if design is Business
        {
            final int BASE = 375;
            final int FEATURE1 = 30;
            final int FEATURE2 = 40;
            final int FEATURE3 = 50;
            final int FEATURE4 = 60;
            final int FEATURE5 = 70;
            price = price + BASE;
            if (feature1 == true)
            {
                price = price + FEATURE1;
            }
            if (feature2 == true)
            {
                price = price + FEATURE2;
            }
            if (feature3 == true)
            {
                price = price + FEATURE3;
            }
            if (feature4 == true)
            {
                price = price + FEATURE4;
            }
            if (feature5 == true)
            {
                price = price + FEATURE5;
            }
        }else if (design == 3) //Calculate Total if design is Music
        {
            final int BASE = 400;
            final int FEATURE1 = 85;
            final int FEATURE2 = 95;
            final int FEATURE3 = 110;
            final int FEATURE4 = 130;
            final int FEATURE5 = 210;
            price = price + BASE;
            if (feature1 == true)
            {
                price = price + FEATURE1;
            }
            if (feature2 == true)
            {
                price = price + FEATURE2;
            }
            if (feature3 == true)
            {
                price = price + FEATURE3;
            }
            if (feature4 == true)
            {
                price = price + FEATURE4;
            }
            if (feature5 == true)
            {
                price = price + FEATURE5;
            }
        }else if (design == 4) //Calculate Total if design is Naughty
        {
            final int BASE = 500;
            final int FEATURE1 = 100;
            final int FEATURE2 = 200;
            final int FEATURE3 = 300;
            final int FEATURE4 = 400;
            final int FEATURE5 = 500;
            price = price + BASE;
            if (feature1 == true)
            {
                price = price + FEATURE1;
            }
            if (feature2 == true)
            {
                price = price + FEATURE2;
            }
            if (feature3 == true)
            {
                price = price + FEATURE3;
            }
            if (feature4 == true)
            {
                price = price + FEATURE4;
            }
            if (feature5 == true)
            {
                price = price + FEATURE5;
            }
        }
    }
    
    public void displayTotal()
    {
        System.out.println("The total cost for this web site is $" + price + ".");
    }
}
