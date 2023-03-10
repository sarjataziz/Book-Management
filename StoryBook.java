import java.lang.*;

public class StoryBook implements Book 
{
	private String category;

	StoryBook()
	{
		//System.out.println();
	}
	StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
	{
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.category = category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getCategory()
	{
		return category;
	}

	public void showDetails()
	{
		super.showDetails();
		System.out.println("Book's Category            : " +category + ".");
		System.out.println();
		System.out.println("*************************************************************");
		System.out.println();
	}
}