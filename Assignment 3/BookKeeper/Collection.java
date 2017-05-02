import java.util.ArrayList;

/**
 * Write a description of class Collection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collection
{
    private ArrayList<Book> books;

    /**
     * Constructor for objects of class Collection
     */
    public Collection()
    {
        books = new ArrayList<>();
    }

    /**
     * Constructor for objects of class Book
     * authorLName: Author's last name
     * authorFName: Author's first name
     * isbnNum: 10 digit ISBN Number
     * title: Title of book
     * publishDate: Date book was publish in mm/dd/yyyy format
     * pageNum: Number of pages in book
     */
    public void addBook(String authorLName, String authorFName, long isbnNum, String title, String publishDate, int pageNum)
    {
        books.add(new Book(authorLName, authorFName, isbnNum, title, publishDate, pageNum));
    }
    
    public void setAuthorLName(int book, String authorLName)
    {
        books.get(book).setAuthorLName(authorLName);
    }
    
    public String getAuthorLName(int book)
    {
        return books.get(book).getAuthorLName();
    }
    
    public void setAuthorFName(int book, String authorFName)
    {
        books.get(book).setAuthorFName(authorFName);
    }
    
    public String getAuthorFName(int book)
    {
        return books.get(book).getAuthorFName();
    }
    
    public void setISBNNum(int book, long isbnNum)
    {
        books.get(book).setISBNNum(isbnNum);
    }
    
    public long getISBNNum(int book)
    {
        return books.get(book).getISBNNum();
    }
    
    public void setTitle(int book, String title)
    {
        books.get(book).setTitle(title);
    }
    
    public String getTitle(int book)
    {
        return books.get(book).getTitle();
    }
    
    public void setPublishDate(int book, String publishDate)
    {
        books.get(book).setPublishDate(publishDate);
    }
    
    public String getPublishDate(int book)
    {
        return books.get(book).getPublishDate();
    }
    
    public void setPageNum(int book, int pageNum)
    {
        books.get(book).setPageNum(pageNum);
    }
    
    public int getpageNum(int book)
    {
        return books.get(book).getPageNum();
    }
}
