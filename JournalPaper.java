package lab4;

public class JournalPaper extends WrittenItem{
	private int yearPub;

	JournalPaper(){

	}

	JournalPaper(int uID, String title, String author, int no_of_copies, int yearPub){
		super(uID, title, author, no_of_copies);

		this.yearPub = yearPub;
	}
} 
