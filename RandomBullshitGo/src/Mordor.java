
public class Mordor extends Entitity {
	int HEALTH, DMG;

	public Mordor(int HEALTH, int DMG) {
		super(HEALTH, DMG);
		this.HEALTH = HEALTH;
		this.DMG = DMG;

	}

	public int accountOfDmg() {
		return DMG;
	}
	
	public String Events(int Nr) {
		if(Nr == 1) {
			return "Why are you here mortal???";
		}else {
			return null;
		}
	}
}
