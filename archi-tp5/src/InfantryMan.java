
public class InfantryMan extends AbstractSoldier  {

		
	public InfantryMan(){
		super();
	}
	
	public double strike(){
		return attack * Math.log(1+health);
	}
	
	public void parry(double att){
		health -= att-Math.sqrt(1+health);
	}
}
