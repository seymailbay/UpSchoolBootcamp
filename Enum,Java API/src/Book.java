
public class Book {
	Author author;
	String title;
	int page;
	BookType type;
	int currentPage;

	public Book(String title, Author author, int page, BookType type, int currentPage) {
		super();
		this.author = author;
		this.title = title;
		this.page = page;
		this.type = type;
		this.currentPage = currentPage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public BookType getType() {
		return type;
	}

	public void setType(BookType type) {
		this.type = type;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

}
