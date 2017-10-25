package heroesGame;


import static heroesGame.Game.randomNumber;

/**
 * Created by gorysko on 10/25/17.
 */
abstract class Character {
        int hp;
        String characterType;
        int[] power;

    public Character() {
    }

    abstract void kick(Character character);

    public boolean isAlive() {
            return this.hp > 0;
        }



}
