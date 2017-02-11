
public class SWSword extends Decorator {
	private static final int SWORD_ATT = 3;
	private double SWdurability;
	
	public SWSword(Soldier soldier){
		super(soldier);
	}
	
	public double strike(){
		if(SWdurability<=0){
			return super.strike();
		}
		//System.out.println(super.strike()+SWORD_ATT);
		SWdurability -= decreaseDurability(super.strike()+SWORD_ATT, SWdurability);
		return super.strike()+SWORD_ATT;
	}
}

