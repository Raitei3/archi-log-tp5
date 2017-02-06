
public class SWSword extends Decorator {
	double swordAtt;
	
	public SWSword(Soldier soldier){
		super(soldier);
		swordAtt = 3;
	}
	
	public double strike(){
		return soldier.strike()+swordAtt;
	}
}
