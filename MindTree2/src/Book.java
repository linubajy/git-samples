
//28
public class Book {

	
	Book(){}
	void book_title(String bt)
	{
		System.out.println("Book title:"+ bt);
	}
	void price(double dollar)
	{
		System.out.println("Price : "+dollar);
	}
	void year(int yr)
	{
		System.out.println("Year of publication: "+yr);
	}
	
	void author(String au)
	{
		System.out.println("Author: "+au);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book();
		b.book_title("Robinson Crusoe");
		b.author("Daniel Dofoe");
		b.price(15.50);
		b.year(1719);
		
		b.book_title("Heart of Darkness");
		b.author("Joseph Conrad");
		b.price(12.80);
		b.year(1902);
		
		b.book_title("Beach Music");
		b.author("Pat Conroy");
		b.price(9.50);
		b.year(1996);
		
		
		
		
	}

}
