
public class SWSword extends Decorator {
	private static final int SWORD_ATT = 3;
	
	public SWSword(Soldier soldier){
		super(soldier, 20);
	}
	
	public double strike(){
		if(_durability<=0){
			return super.strike();
		}
		return super.strike()+SWORD_ATT;
	}
}

