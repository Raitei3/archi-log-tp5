
public class SWShield extends Decorator {
	
	double defend;
	
	public SWShield(Soldier soldier){
		super(soldier);
		defend =2;
	}
	
	public void parry(double att){
		soldier.parry(att/2);
	}

}
