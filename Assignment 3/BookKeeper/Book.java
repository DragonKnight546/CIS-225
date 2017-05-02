
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
    private String authorLName;
    private String authorFName;
    private long isbnNum;
    private String title;
    private String publishDate;
    private int pageNum;

    /**
     * Constructor for objects of class Book
     * authorLName: Author's last name
     * authorFName: Author's first name
     * isbnNum: 10 digit ISBN Number
     * title: Title of book
     * publishDate: Date book was publish in mm/dd/yyyy format
     * pageNum: Number of pages in book
     */
    public Book(String authorLName, String authorFName, long isbnNum, String title, String publishDate, int pageNum)
    {
        this.authorLName = authorLName;
        this.authorFName = authorFName;
        if(isbnNum >= 1000000000)
        {
            this.isbnNum = isbnNum;
        }else{
            System.out.println("ERROR: ISBN Number is invalid. Valid ISBN numbers are between 10000000000000 and 9999999999999.");
        }
        this.title = title;
        this.publishDate = publishDate;
        if(pageNum >= 10)
        {
            this.pageNum = pageNum;
        }else{
            System.out.println("ERROR: Page number can not be less then 10.");
        }
    }

    public void setAuthorLName(String authorLName)
    {
        this.authorLName = authorLName;
    }
    
    public String getAuthorLName()
    {
        return authorLName;
    }
    
    public void setAuthorFName(String authorFName)
    {
        this.authorFName = authorFName;
    }
    
    public String getAuthorFName()
    {
        return authorFName;
    }
    
    public void setISBNNum(long isbnNum)
    {
        if(isbnNum >= 1000000000)
        {
            this.isbnNum = isbnNum;
        }else{
            System.out.println("ERROR: ISBN Number is invalid. Valid number are between 10000000000000 and 9999999999999.");
        }
    }
    
    public long getISBNNum()
    {
        return isbnNum;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setPublishDate(String publishDate)
    {
        this.publishDate = publishDate;
    }
    
    public String getPublishDate()
    {
        return publishDate;
    }
    
    public void setPageNum(int pageNum)
    {
        if(pageNum >= 10)
        {
            this.pageNum = pageNum;
        }else{
            System.out.println("ERROR: Page number can not be less then 10.");
        }
    }
    
    public int getPageNum()
    {
        return pageNum;
    }
}
