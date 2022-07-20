
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
		}else if(Nr == 3){
			return mageName + ": " + "WOW, you really did it! I bet he never was impaled like that before! \n You wanna continue this journey?";
		}else if(Nr == 4){
			return mageName + ": " + "In that case, you can already got right into that totally undangerous black and gloomy forest, I need a second of rest for doing nothing!";
		}else if(Nr == 5){
			return mageName +": " + "Then chill with me right here, in this dark and gloomy forest! Is veryyy safe here, ain`t it?";
		}
		else {
			return null;
		}
	}
}
