
public class FaxMachine extends Machines{

	private String faxNum;
	public FaxMachine(String name, String faxNum){
		super(name);
		this.faxNum = faxNum;
	}
	public String getFaxNum(){
		return faxNum;
	}
}
