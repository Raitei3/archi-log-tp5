
public class Main {
	
	public static void main(String[] args){
	Soldier hm = new HorseMan();
	Soldier im = new InfantryMan();
	im.parry(hm.strike());
	System.out.println(im.getHealth());
	SWShield shieldHm = new SWShield(hm);
	SWSword swordIm = new SWSword(im);
	shieldHm.parry(swordIm.strike());
	System.out.println(shieldHm.getHealth());
	//fight(hm,im);
		
		
	}
	
	static void fight(Soldier s1, Soldier s2) {
		Soldier attack = s1;
		Soldier defend = s2;
		while(s1.isAlive() && s2.isAlive()) {
			defend.parry(attack.strike());
			Soldier tmpSwap = attack;
			attack = defend;
			defend = tmpSwap;
		}
		if (s1.isAlive()) 
			System.out.println("Soldier 1  Won");
		else
			System.out.println("Soldier 2  Won");
	}
}



