import java.lang.*;

public class TextBook implements Book
{
	private int standerd;

	TextBook()
	{
		//System.out.println();
	}
	TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standerd)
	{
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.standerd = standerd;
	}
	public void setStanderd(int standerd)
	{
		this.standerd = standerd;
	}
	public int getStanderd()
	{
		return standerd;
	}

	public void showDetails()
	{
		super.showDetails();
		System.out.println("Book's Standerd            : " +standerd + ".");
		System.out.println();
		System.out.println("*************************************************************");
		System.out.println();
	}
}