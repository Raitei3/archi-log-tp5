
public abstract class Decorator implements Soldier {
	protected Soldier soldier;
	protected double _durability;
	
	public Decorator(Soldier soldier, double durability){
		this.soldier=soldier;
		this._durability=durability;
	}
	
	
	public double strike(){
		decreaseDurability(soldier.strike());
		return soldier.strike();
	}
	
	public  void parry(double x){
		soldier.parry(x);
		decreaseDurability(x);
	}

	public boolean isAlive() {
		return soldier.isAlive();
	}
	
	public int getHealth(){
		return soldier.getHealth();
	}
	
	public void decreaseDurability(double damages){
		_durability =12*(Math.min(_durability, damages) / _durability);
	}

}
