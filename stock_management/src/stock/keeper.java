package stock;

public class keeper {
	private String name;
	
	keeper(String name) {
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void manageAlbum(Album album,String artist,String name,double price,int numberOfcopies,int no, int num) {
		//Defining States & behaviors for album
		album.setName(name);
		album.setArtist(artist);
		album.setPrice(price);
		album.setNumberOfcopies(numberOfcopies);
		album.sellCopies(no);
		album.orderCopies(num);
		
		//Printing the values
		System.out.println("This Album was Managed by: "+this.name);
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("Album Name: "+ album.getName());
		System.out.println("Album artist is: "+ album.getArtists());
		System.out.println("Album price: "+ album.getPrice());
		System.out.println("Number of copies available: "+ album.getNumberOfcopies());
	}
}
