package heroesGame;

/**
 * Created by gorysko on 10/25/17.
 */
public class Elf extends Character {

    public Elf() {
        super();
        this.hp = 10;
        this.characterType = "Elf";
        this.power = new int[]{0, 10};
    }

    @Override
    void kick(Character character) {
            System.out.println(this.characterType + " kicks " + character.characterType);
            if (character.power[1] < this.power[1]) {
                character.hp = 0;
            } else {
                character.power[1]--;
            }
        }
    }
