package section7;

public class EncapsulationMain {
    public static void main(String[] args){
        //player
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        //enhanced player
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 20, "Sword");

        int damage2 = 10;
        enhancedPlayer.loseHealth(damage2);
        System.out.println("Remaining health = " + enhancedPlayer.healthRemaining());

        damage2 = 11;
        enhancedPlayer.loseHealth(damage2);
        System.out.println("Remaining health = " + enhancedPlayer.healthRemaining());

        //challenge
        Printer printer = new Printer(20,true);
        int pages = printer.printPages(5);
        System.out.println(pages);
        pages = printer.printPages(6);
        System.out.println(pages);
    }




}
