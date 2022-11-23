package inventory;

public class inventory {
	
	public int total_copies;
	public int new_stocks;
	
	public void addstocks() {
		total_copies += new_stocks; 
	}
	
	//constructor
	public inventory(int total_copies,int new_stocks) {
		this.total_copies = total_copies;
		this.new_stocks = new_stocks;
	}
}
