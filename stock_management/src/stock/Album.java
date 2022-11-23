package stock;

public class Album {
	private String name,artist;
	private double price;
	private int numberOfcopies;
	
	public void sellCopies(int no){
		if(numberOfcopies>0) {
			numberOfcopies-=no;
			System.out.print("Album Sold");
		}else {System.out.print("Out of Stock");}
	}
	
	public void orderCopies(int num) {
		numberOfcopies += num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getArtists() {
		return artist;
	}
	public void setArtist(String artist){
		this.artist = artist;
	}

	public double getPrice() {
		return price;
	} 
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
		else {
			this.price= 0.0;
		}
	}
	
	public int getNumberOfcopies() {
		return numberOfcopies;
	}
	public void setNumberOfcopies(int numberOfcopies) {
		if(numberOfcopies>0) {
			this.numberOfcopies = numberOfcopies;
		}
		else {
			this.numberOfcopies=0;
		}
	}
	
	
	
}
