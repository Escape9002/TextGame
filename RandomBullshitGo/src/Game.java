
public class Game {

	public static void main(String[] args) {
		
		Player player = new Player(200, 2, "Hand");
		Gandalf mage = new Gandalf(100, 10);
		Mordor enemie = new Mordor(100, 20);

		
		for (int i = 0; i < 50; i++) {
			System.out.println(mage.Events(1));

			if (player.choice() == 1) {
				player.Items.add("Stick");
			} else if (player.choice() == 2) {
				if (player.Items.size() > 0)
					player.Items.remove(player.Items.size() - 1);
			}
			
			enemie.Events(1);
			System.out.println("RRRRRRRRRRUUUNNNNNNIIIINNNNNGGGGGG");
		}

	}
}