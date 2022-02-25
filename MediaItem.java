package lab4;

public class MediaItem extends Item{
	private int runTime;

	MediaItem(){

	}

	MediaItem(int uID, String title, int no_of_copies, int runTime){
		super(uID, title, no_of_copies);
		this.runTime = runTime;
	}


} 