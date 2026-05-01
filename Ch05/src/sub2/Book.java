package sub2;

public class Book {

	// 속성
	private String title;
	private String author;
	private int copies;
	
	// 생성자
	public Book(String title, String author, int copies) {
		this.title = title;
		this.author = author;
		this.copies = copies;
		
	}
	
	public boolean borrowBook() {
		
		if(copies > 0) {
			copies--;
			return true;
		}else {
			return false;
		}
	}
		
	public void returnBook() {
		copies++;
	}
	
	public void show() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("복사본 : " + copies);
	}
}
