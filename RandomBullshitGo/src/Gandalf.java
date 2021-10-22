
public class Gandalf{
	
	int Nr, HEALTH, DMG;
	String mageName;
	
	public Gandalf(int HEALTH, int DMG, String mageName) {
		this.HEALTH = HEALTH;
		this.DMG = DMG;
		this.mageName = mageName;
		
	}

	public int getNr() {
		return Nr;
	}
	
	public int setNr(int nr) {
		Nr = nr;
		return Nr;
	}
	
	public String Events(int Nr) {
		this.Nr = Nr;
		if(Nr == 1) {
			return mageName + ": " +"Hello there. Do you want a baguette magique?";
		}else if(Nr == 2){
			return mageName + ": " +"Good luck fighting!";
		}else {
			return null;
		}
	}
}
