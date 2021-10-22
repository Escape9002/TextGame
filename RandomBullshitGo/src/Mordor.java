
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
		}else if(Nr ==2) {
			return mordorName + ": " +"Come back with more water, you can`t even drown yourself in that!";
		}else if (Nr ==3) {
			return mordorName + ": " + "aye, got an item to fight with on you? Got a stick? Throw it up to UrAnus!";
		}else if(Nr == 4){
			return mordorName + ": " +"You don`t feel mortal enough yet. What are you gonna do? Cry?";
		}else {
			return null;
		}
	}
}
