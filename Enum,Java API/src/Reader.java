
public class Reader {

	String name;
	int age;
	String sex;
	Book book;

	public Reader(String name, int age, String sex, Book book) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.book = book;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	/*
	 * public static void read(Book book, Reader reader) {
	 * System.out.println(reader.name + "is reading " + book.title); reader.book =
	 * book; }
	 */

	void read(Book book) {
		System.out.println(name + " is reading " + book.title);
	}

}
