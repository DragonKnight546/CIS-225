
/**
 * Calculate price of desk based on dimentions, wood type, and drawer count.
 * 
 * @author: Zack Keating 
 * @version 2.7.2017.1
 */ 
public class RickHammer
{
    private int wood;
    private int drawers;
    private int width;
    private int length;
    private int total;

    /**
     * Constructor for objects of class RickHammer
     * Wood: 0 = Pine, 1 = Mahogany, 2 = Oak
     * Drawers: Number of drawers in desk
     * Width: Width in inches
     * Length: length in inches
     */
    public RickHammer(int tempWood, int tempDrawers, int tempWidth, int tempLength)
    {
        wood = tempWood;
        drawers = tempDrawers;
        width = tempWidth;
        length = tempLength;
        total = 0;
        calcTotal();
    }

    public void setWood(int tempWood)
    {
        wood = tempWood;
        calcTotal();
    }
    
    public int getWood()
    {
        return wood;
    }
    
    public void setDrawers(int tempDrawers)
    {
        drawers = tempDrawers;
        calcTotal();
    }
    
    public int getDrawers()
    {
        return drawers;
    }
    
    public void setWidth(int tempWidth)
    {
        width = tempWidth;
        calcTotal();
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public void setLength(int tempLength)
    {
        length = tempLength;
        calcTotal();
    }
    
    public int getLength()
    {
        return length;
    }
    
    public void calcTotal()
    {
        final int BASE_COST = 200;
        final int LARGE_COST = 50;
        final int MAHOGANY_COST = 150;
        final int OAK_COST = 125;
        final int DRAWER_COST = 30;
        if ((width * length) >= 750) {
            if (wood == 1){
                total = BASE_COST + LARGE_COST + MAHOGANY_COST + (drawers * DRAWER_COST);
            }else if (wood == 2){
                total = BASE_COST + LARGE_COST + OAK_COST + (drawers * DRAWER_COST);
            }else{
                total = BASE_COST + LARGE_COST + (drawers * DRAWER_COST);
            }
        } else {
            if (wood == 1){
                total = BASE_COST + MAHOGANY_COST + (drawers * DRAWER_COST);
            }else if (wood == 2){
                total = BASE_COST + OAK_COST + (drawers * DRAWER_COST);
            }else{
                total = BASE_COST + (drawers * DRAWER_COST);
            }
     }
    }
}
