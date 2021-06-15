import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	ArrayList<String> Items = new ArrayList<String>();
	static int HEALTH;
	static int DMG;
	
	Scanner scanner = new Scanner(System.in);
	
	public Player(int HEALTH, int DMG, String firstItem){
		Items.add(firstItem);
		this.HEALTH = HEALTH;
		this.DMG = DMG;
	}	
	
	public int receiveDMG(int DMG) {
		HEALTH = HEALTH - DMG;
		return HEALTH;
	}
	
	public int doDMG() {
		return DMG * Items.size();
	}
	
	public int getDMG() {
		return DMG * Items.size();
	}
	
	public void getItems() {
		for(int i = 0; i < Items.size(); i++) {
			System.out.println("Items: " + Items.get(i));
		}
	}
	
	public int getHEALTH() {
		return HEALTH;
	}
	
	public int choice() {
		System.out.println("------INPUT----------");
		System.out.println("Yes = 1 | No = 2");
		System.out.println("------INPUT----------");
		
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			System.out.println("Yes");
			return 1;
		}else if(choice == 2) {
			System.out.println("No");
			return 2;
		}else{
			return 0;
		}
	}
	
	
	
}
