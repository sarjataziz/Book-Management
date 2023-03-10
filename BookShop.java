 import java.lang.*;

public class BookShop 
{
	private String name;
	private Book[] listOfBooks;

	BookShop()
	{
		//System.out.println();
	}
	BookShop(String name, int sizeOfArray)
	{
		this.name = name;
		this.listOfBooks = new Book[sizeOfArray];
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}


}