
public class Game {

public static void FuckYourTimeManagement(int timeToFuckingSleep) {
		
		try {
		    Thread.sleep(timeToFuckingSleep * 1000);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}
	}

	public static void main(String[] args) {
		
		int rounds = 1;
		
		
		Player player = new Player(200, 2, "Hand");
		Gandalf mage = new Gandalf(100, 10, "Gandalf");
		Mordor enemie = new Mordor(100, 20, "Odorf");

		
		for (int i = 0; i < rounds; i++) {
			System.out.println(mage.Events(1));
			//FuckYourTimeManagement(1);

			if (player.choice() == 1) {
				player.Items.add("Stick");
				System.out.println(mage.Events(2));
				//FuckYourTimeManagement(1);
			} else if (player.choice() == 2) {
				System.out.println(mage.Events(2));
				//FuckYourTimeManagement(1);
			}
			
			//FuckYourTimeManagement(1);
			System.out.println("You walk towards you obliteration");
			//FuckYourTimeManagement(1);
			
			System.out.println(enemie.Events(1));
			
			//FuckYourTimeManagement(1);
			
			System.out.println(enemie.Events(4));
			
			FuckYourTimeManagement(1);
			
			if (player.choice() == 1) {
				System.out.println(enemie.Events(2));
				//	FuckYourTimeManagement(1);
			} else if (player.choice() == 2) {
				System.out.println(enemie.Events(3));
				//	FuckYourTimeManagement(1);
			}
			
		}
	}
	
	
}