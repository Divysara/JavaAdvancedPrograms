package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class BookExample {

		private String authorname;
		private String bookname;
		private int bookid;
		private String category;
		
		public String getAuthorname() {
			return authorname;
		}
		public void setAuthorname(String authorname) {
			this.authorname = authorname;
		}
		public String getBookname() {
			return bookname;
		}
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		public int getBookid() {
			return bookid;
		}
		public void setBookid(int bookid) {
			this.bookid = bookid;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		@Override
		public String toString() {
			return "BookModel [authorname=" + authorname + ", bookname=" + bookname + ", bookid=" + bookid + ", category="
					+ category + "]";
		}
		public BookExample(String bookname, String authorname, int bookid, String category) {
			super();
			this.authorname = authorname;
			this.bookname = bookname;
			this.bookid = bookid;
			this.category = category;
		}
		public BookExample()
		{

	}
		private List<BookExample> getList(){
			
			return Arrays.asList(new BookExample("Joshua Bloch ","Effective Java",1,"IT"),
					new BookExample("Lauren Beukes","Broken Monsters",2,"Horror"),
					new BookExample("Kathy","Spring",3,"IT"),
					new BookExample("Dr.Seuss","Cat in the hat",4,"kids"),
					new BookExample("Craig Walls","Spring Boot in Action",5,"IT"),
					new BookExample("Jory John","The Couch Potato",6,"kids"));
		}
		public List<BookExample> getByCategory(String category) {
			return getList()
					.stream()
					.filter((book)->book.getCategory().equals(category)).collect(Collectors.toList());
		
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("hi");
			BookExample be = new BookExample();
			List<BookExample> cat = be.getByCategory("kids");
			System.out.println(cat);
		}
	
	}


