
public abstract class Decorator implements Soldier {
	protected Soldier soldier;
	//protected double _durability;
	
	public Decorator(Soldier soldier){
		this.soldier=soldier;
		//this._durability=durability;
	}
	
	
	public double strike(){
		//decreaseDurability(soldier.strike());
		return soldier.strike();
	}
	
	public  void parry(double x){
		soldier.parry(x);
		//decreaseDurability(x);
	}

	public boolean isAlive() {
		return soldier.isAlive();
	}
	
	public int getHealth(){
		return soldier.getHealth();
	}
	
	public double decreaseDurability(double damages,double durability){
		return 12*(Math.min(durability, damages) / durability);
	}

}
