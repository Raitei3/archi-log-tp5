
public class SWShield extends Decorator {
	
	private static final int DEFENSE = 2;
	
	public SWShield(Soldier soldier){
		super(soldier, 20);
	}
	
	public void parry(double att){
		if(_durability <= 0){
			soldier.parry(att);
		}else{
		super.parry(att/DEFENSE);
		}
	}

}
