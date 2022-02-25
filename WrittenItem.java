package lab4;

public abstract class WrittenItem extends Item{
	private String author;

	WrittenItem(){
		super();
	}

	WrittenItem(int uId, String title, String author, int no_of_copies){
		super(uId, title, no_of_copies);
		this.author = author;
	}

	@Override
	public String toString() {
		super.toString();
		return "WrittenItem [author=" + author + "]";
	}
} 
