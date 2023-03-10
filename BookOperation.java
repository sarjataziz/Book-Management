import java.lang.*;

public class BookOperation
{
	public void addQuantity(int amount)
	{
		if (amount > 0) {
			availableQuantity += amount;
		}
		else{
			System.out.println("You can't able to add.");
		}
	}
	public void sellQuantity(int amount)
	{
		if (amount > 0 && availableQuantity > 0 && amount <= availableQuantity) {
			availableQuantity += amount;
		}
		else{
			System.out.println("You can't able to add.");
		}
	}
}