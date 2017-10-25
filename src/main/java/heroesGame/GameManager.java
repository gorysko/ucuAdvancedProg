package heroesGame;

/**
 * Created by gorysko on 10/25/17.
 */
public class GameManager {

    public static void fight(Character characterOne, Character characterTwo) {
        System.out.println(characterOne.isAlive());
        System.out.println(characterOne.hp);
        System.out.println(characterOne.characterType);
        System.out.println(characterTwo.isAlive());
        System.out.println(characterTwo.hp);
        System.out.println(characterTwo.characterType);
        while (characterOne.isAlive() || characterTwo.isAlive()) {
            System.out.println("Let the fight beggin!");
            characterOne.kick(characterTwo);
            if (characterTwo.isAlive()) {
                System.out.println(characterTwo.characterType + " is still alive");
                characterTwo.kick((characterOne));
            }
        }
    }
}
