package heroesGame;

/**
 * Created by gorysko on 10/25/17.
 */

import static heroesGame.Game.randomNumber;

public class King extends Character {
    public King() {
        super();
        this.hp = randomNumber(5, 15);
        this.characterType = "King";
        this.power = new int[]{5, 15};
    }

    @Override
    void kick(Character character) {
        System.out.println(this.characterType + " kicks " + character.characterType);
        int powerOfKick = randomNumber(this.power[0], this.power[1]);
        character.hp -= powerOfKick;
    }
}
