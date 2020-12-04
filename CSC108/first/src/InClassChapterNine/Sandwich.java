package InClassChapterNine;

public class Sandwich extends Food{
	private double price;
public Sandwich(String name, double price){
	super(name);
	this.price = price;
}
public double getPrice(){
	return price;
}
}
