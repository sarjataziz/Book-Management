import java.lang.*;
import java.util.Scanner;

public class Start 
{
	public static void main(String[] args) {

		//------------------------------ Story Book -----------------------------

		Book storyBook1 = new StoryBook("11-00000-11", "Ghost Hunter", "Sarjat Aziz", 300, 100_000, "Story Book");
		Book storyBook2 = new StoryBook("12-00000-22", "Boku no Hero Academia", "Kohei Horikoshi", 100, 100_000_000, "Manga");
		Book storyBook3 = new StoryBook("13-00000-33", "Shingeki no Kyojin", "Hajime Isayama", 250, 60_000_000, "Manga");
		Book storyBook4 = new StoryBook("14-00000-44", "We never learn", "Taishi Tsutsui", 300, 3_000_000, "Manga");
		Book storyBook5 = new StoryBook("15-00000-55", "ABC", "Sarjat Aziz", 300, 1_000, "Story Book");

	   //------------------------------ Text Book -----------------------------


		Book textBook1 = new TextBook("66-88888-66", "Java", "Sarjat Aziz", 300, 100_000, 10);
		Book textBook2 = new TextBook("67-88888-77", "English", "Jnny", 100, 10_000, 100);
		Book textBook3 = new TextBook("68-88888-88", "Bangla", "Kabir", 250, 60_000, 30);
		Book textBook4 = new TextBook("69-88888-99", "Calculus", "Silvanus P. Thompson", 300, 3_000_000, 32);
		Book textBook5 = new TextBook("70-88888-00", "Math", "Sarjat Aziz", 300, 1_000, 13);

		//--------------------------------- Book Shop --------------------------------------------

		BookShop bookShop = new BookShop("AB Store", 100);

		//--------------------------------- Insert Story Book -----------------------------------

		if (bookShop.insertBook(storyBook1)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(storyBook2)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(storyBook3)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(storyBook4)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(storyBook5)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}


		//------------------------------------ Insert Text Book ----------------------------------

		if (bookShop.insertBook(textBook1)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(textBook2)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(textBook3)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(textBook4)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}
		if (bookShop.insertBook(textBook5)) {
			System.out.println("Done.");
		}
		else{
			System.out.println("Not Done.");
		}

  		//----------------------------------------- Show All Books --------------------------------

  		bookShop.showAllBooks();


		//-------------------------------------------- Scarch Book ---------------------------------

		Scanner input = new Scanner(System.in);
		System.out.print("Search Book : ");
		String a = input.nextLine();
		bookShop.searchBook(a);
		
	}

}