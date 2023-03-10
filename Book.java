import java.lang.*;

public interface Book
{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;

	public Book()
	{
		//System.out.println();
	}
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName=  authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}
	void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	void setAuthorName(String authorName)
	{
		this.authorName=  authorName;
	}
	void setPrice(double price)
	{
		this.price = price;
	}
	void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	String getIsbn()
	{
		return isbn;
	}
	String getBookTitle()
	{
		return bookTitle;
	}
	String getAuthorName()
	{
		return authorName;
	}
	double getPrice()
	{
		return price;
	}
	int getAvailableQuantity()
	{
		return availableQuantity;
	}
	
	void showDetails();
}