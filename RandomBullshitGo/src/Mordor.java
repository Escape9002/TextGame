
public class Mordor{
	int HEALTH, DMG, Nr;
	String mordorName;

	public Mordor(int HEALTH, int DMG, String mordorName) {
		this.HEALTH = HEALTH;
		this.DMG = DMG;
		this.mordorName = mordorName;

	}

	public int accountOfDmg() {
		return DMG;
	}
	
	public String Events(int Nr) {
		this.Nr = Nr;
		if(Nr == 1) {
			return mordorName + ": " +"Why are you here mortal???";
		}else {
			return null;
		}
	}
}
