package heroesGame;

import java.util.Random;


/**
 * Created by gorysko on 10/25/17.
 */
public class Game {
        public  int randomNumber(int min, int max) {
            Random random = new Random(10);
            int randomNumber = random.nextInt((max - min) + 1) + min;
            return randomNumber;
        }

    public Character characterFactory() {
        Character[] characters = new Character[4];
        characters[0] = new Elf();
        characters[1] = new Hobit();
        characters[2] = new King();
        characters[3] = new Knight();
        int randIndex = randomNumber(0, characters.length + 1);
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
