package heroesGame;

/**
 * Created by gorysko on 10/25/17.
 */

import static heroesGame.Game.randomNumber;

public class Knight  extends Character{
    public Knight() {
        super();
        this.hp = randomNumber(2, 12);
        this.characterType = "Knight";
        this.power = new int[]{2, 12};
    }

    @Override
    void kick(Character character) {
        System.out.println(this.characterType + " kicks " + character.characterType);
        int powerOfKick = randomNumber(this.power[0], this.power[1]);
        character.hp -= powerOfKick;
    }

}
