package lab4;

public abstract class Item {
	private int uID;
	private String title;
	private int no_of_copies;

	Item(){

	}

	Item(int uID, String title, int no_of_copies){
		this.uID = uID;
		this.title = title;
		this.no_of_copies = no_of_copies;
	}

	@Override
	public String toString() {
		return "Item [uID=" + uID + ", title=" + title + ", no_of_copies=" + no_of_copies + "]";
	}

	public int getuID() {
		return uID;
	}

	public void setuID(int uID) {
		this.uID = uID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNo_of_copies() {
		return no_of_copies;
	}

	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}


} 