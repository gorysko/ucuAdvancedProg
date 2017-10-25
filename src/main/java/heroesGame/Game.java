package heroesGame;

import java.util.Random;

/**
 * Created by gorysko on 10/25/17.
 */
public class Game {
        public static int randomNumber(int min, int max) {
            Random random = new Random(10);
            int randomNumber = random.ints(min, max).findFirst().getAsInt();
            return randomNumber;
        }

    public Character characterFactory() {
        Character[] characters = new Character[4];
        characters[0] = new Elf();
        characters[1] = new Hobit();
        characters[2] = new King();
        characters[3] = new Knight();
        Random rand = new Random(10);
        int randIndex = rand.nextInt(characters.length);
        return characters[randIndex];

    }

    public static void main(String[] args) {
        Game heroesGame = new Game();
        Character characterOne = heroesGame.characterFactory();
        Character characterTwo = heroesGame.characterFactory();
        System.out.println("Fight!");
        GameManager.fight(characterOne, characterTwo);
    }
}
