import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {
	
	String result;
	
	Soldier hm;
	Soldier im;
	
	SWShield shieldHm;
	SWSword swordIm;
	
	SWShield SWIm;
	SWSword SWHm;
	
	
	@Before
	public void setUp() throws Exception {
		
		hm = new HorseMan();
		im = new InfantryMan();
		
		shieldHm = new SWShield(hm);
		swordIm = new SWSword(im);
		
		SWIm = new SWShield(swordIm);
		SWHm = new SWSword(shieldHm);
		
		result = "Soldier 1  Won";
	}
	
	
	@Test
	public void test() {
		System.out.println("**hm** porte un coup à **im**");
		im.parry(hm.strike());
		org.junit.Assert.assertEquals(8, im.getHealth());
		System.out.println("**hm** récupère un bouclier et **im** une épée.");
		System.out.println("**im** porte un coup à **hm**");
		shieldHm.parry(swordIm.strike());
		org.junit.Assert.assertEquals(8, shieldHm.getHealth());
		System.out.println("**im** récupère une épée et **hm** un bouclier.");
		System.out.println("**hm** porte un coup à **im**");
		SWIm.parry(SWHm.strike());
		org.junit.Assert.assertEquals(7, SWIm.getHealth());
		System.out.println("**im** porte un coup à **hm**");
		SWHm.parry(SWIm.strike());
		org.junit.Assert.assertEquals(6, SWHm.getHealth());
		String win = fight(SWHm,SWIm);
		System.out.println(win);
		org.junit.Assert.assertEquals(result,win);
		//fail("Not yet implemented");
	}
	
	
	static String fight(Soldier s1, Soldier s2) {
		Soldier attack = s1;
		Soldier defend = s2;
		while (s1.isAlive() && s2.isAlive()) {
			defend.parry(attack.strike());
			Soldier tmpSwap = attack;
			attack = defend;
			defend = tmpSwap;
		}
		if (s1.isAlive())
			return "Soldier 1  Won";
		else
			return"Soldier 2  Won";
	}

}
