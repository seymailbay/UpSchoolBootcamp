import java.awt.Toolkit;
import java.util.Scanner;

public class ReaderTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Author author1 = new Author("Chaucher");
		Author author2 = new Author("Dostoyevski");

		Book book1 = new Book("Canterbury Tales ", author1, 442, BookType.NARRATIVE, 225);
		Book book2 = new Book("Crime and Punishment", author2, 345, BookType.NOVEL, 342);

		/*
		 * book1.title = "Canterbury Tales "; book1.author.author = "Chaucer";
		 * book1.page =442; book1.type = "Novel"; book1.currentPage = 225;
		 */

		Reader reader1 = new Reader("Seyma", 26, "Woman", book1);
		Reader reader2 = new Reader("Batuhan", 14, "Man", book2);

		/*
		 * reader1.name = "Seyma"; reader1.age = 26; reader1.sex = "Woman";
		 */

		while (true) {
			System.out.println("Reader List.....");
			System.out.println("1- " + reader1.name);
			System.out.println("2- " + reader2.name);
			System.out.println();
			System.out.println("Which reader would you like to choose?(Write 1 or 2)");
			int choice = sc.nextInt();

			if (choice == 1) {
				reader1.read(book1);
				break;
			} else if (choice == 2) {
				reader2.read(book2);
				break;
			} else {
				Toolkit.getDefaultToolkit().beep();// This library is added from Stackoverflow :))
				System.out.println("ERROR!!! please write 1 or 2");

			}

		}
		/* System.out.println(reader1.book.author); */
	}

}
