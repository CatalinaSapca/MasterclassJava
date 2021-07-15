package section7;

public class EnhancedPlayer {
    private String name;
    private int hitPoints;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if(hitPoints>0 && hitPoints <=100)
            this.hitPoints = hitPoints;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0)
            System.out.println("Player knocked out.");
    }

    public int healthRemaining(){
        return this.hitPoints;
    }
}
