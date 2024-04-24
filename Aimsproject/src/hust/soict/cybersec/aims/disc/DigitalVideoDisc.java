package hust.soict.cybersec.aims.disc;

public class DigitalVideoDisc{
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public boolean isMatch(String title) {
		return this.title == title;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return this.id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public String toString() {
		return (Integer.toString(this.id) + ".DVD - " + this.title + " - " + this.category + 
				" - " + this.director + " - " + Integer.toString(this.length) + ": " +
				Float.toString(this.cost) + " $\n"
				);
	}
	public boolean equals(Object obj) {
		if (obj instanceof DigitalVideoDisc) {
			return this.isMatch(((DigitalVideoDisc) obj).getTitle());
		}
		else {
			return false;
		}
	}
}