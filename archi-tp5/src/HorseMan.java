
public class HorseMan extends AbstractSoldier {

	
	public HorseMan(){
		super();
	}

	public double strike(){
		return attack;
	}

	public void parry(double att){
		health -= att-def;
	}
}