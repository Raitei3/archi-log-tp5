
public abstract class AbstractSoldier implements Soldier {

	double attack;
	double health;
	double def;

	public AbstractSoldier(){
		health = 10;
		attack = 3;
		def = 2;
	}

	public boolean isAlive(){
		return health>0;
	}
	
}
