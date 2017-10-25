package heroesGame;

/**
 * Created by gorysko on 10/25/17.
 */


public class King extends Character {
    public King() {
        super();
        Game game = new Game();
        this.hp = game.randomNumber(5, 15);
        this.characterType = "King";
        this.power = new int[]{5, 15};
    }

    @Override
    void kick(Character character) {
        Game game = new Game();

        System.out.println(this.characterType + " kicks " + character.characterType);
        int powerOfKick = game.randomNumber(this.power[0], this.power[1]);
        character.hp -= powerOfKick;
    }
}
