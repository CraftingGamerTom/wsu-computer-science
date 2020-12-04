
public class Printer extends Machines{
private boolean isColor;

public Printer(String name, boolean isColor){
	super(name);
	this.isColor = isColor;
}
public boolean getIsColor(){
	return isColor;
}
}
