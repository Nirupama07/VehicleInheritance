package vehicle;
public class engine {
	private String type;
	private int Horsepower;
	
	public engine(String type,int Horsepower){
		this.type=type;
		this.Horsepower=Horsepower;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	public int getHorsepower(){
		return Horsepower;
	}
	public void setHorsepower(int Horsepower){
		this.Horsepower=Horsepower;
	}
}
