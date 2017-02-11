
public class SWSword extends Decorator {
	private static final int SWORD_ATT = 3;
	private double SWdurability;
	
	public SWSword(Soldier soldier){
		super(soldier);
		SWdurability = 20;
	}
	
	public double strike(){
		if(SWdurability<=0){
			return super.strike();
		}
		SWdurability -= decreaseDurability(super.strike()+SWORD_ATT, SWdurability);
		return super.strike()+SWORD_ATT;
	}
}

