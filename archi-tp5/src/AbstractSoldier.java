
public abstract class AbstractSoldier implements Soldier {

	double attack;
	int health;
	double def;

	public AbstractSoldier(){
		health = 10;
		attack = 5;
		def = 2;
	}

	public boolean isAlive(){
		return health>0;
	}
	
	public int getHealth(){
		return this.health;
	}
	
}
