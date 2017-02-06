
public abstract class Decorator implements Soldier {
	Soldier soldier;
	
	public Decorator(Soldier soldier){
		this.soldier=soldier;
	}
	
	
	public double strike(){
		return soldier.strike();
	}
	
	public  void parry(double x){
		soldier.parry(x);
	}

	public boolean isAlive() {
		return soldier.isAlive();
	}

}
