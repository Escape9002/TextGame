
public class Gandalf extends Entitity{
	
	int Nr;
	
	public Gandalf(int HEALTH, int DMG) {
		super(HEALTH, DMG);
		
	}

	public int getNr() {
		return Nr;
	}
	
	public int setNr(int nr) {
		Nr = nr;
		return Nr;
	}
	
	public String Events(int Nr) {
		if(Nr == 1) {
			return "Hello there. Do you want a baguette magique?";
		}else if(Nr == 2){
			return "Good luck fighting!";
		}else {
			return null;
		}
	}
}
