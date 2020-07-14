public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.name = "Sharjeel";
//	    player.health = 20;
//	    player.weapon = "Sword";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//
//		damage = 11;
//		player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Remaining Health = " + player.healthRemaining());

		EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Sharjeel",50,"Sword");
		System.out.println("Player health is " + enhancedPlayer.getHealth());
    }
}
