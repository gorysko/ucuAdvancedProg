package heroesGame;

/**
 * Created by gorysko on 10/25/17.
 */
public class Hobit extends Character {
    public Hobit() {
        super();
        this.power = new int[]{0, 0};
        this.characterType = "Hobit";
        this.hp = 10;
    }

    public static void toCry() {
        System.out.print("Crying!");
    }

    @Override
    void kick(Character character) {
        toCry();
    }
}
