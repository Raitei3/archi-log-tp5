
public class SWShield extends Decorator {
	
	private static final int DEFENSE = 2;
	private double SHdurability;
	
	public SWShield(Soldier soldier){
		super(soldier);
		SHdurability = 20;
	}
	
	public void parry(double att){
		if(SHdurability <= 0){
			soldier.parry(att);
		}else{
			SHdurability -= decreaseDurability(att, SHdurability);
			super.parry(att/DEFENSE);
		}
	}

}
