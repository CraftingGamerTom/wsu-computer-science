package InClassChapterNine;

public class Salad extends Food{
private double price;
private double weight;

public Salad(String name, double price, double weight){
	super(name);
	this.price = price;
	this.weight = weight;
}

@Override
public double getPrice(){
	return price*weight;
}
public double getWeight(){
	return weight;
}
}
