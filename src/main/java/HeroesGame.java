/**
 * Created by gorysko on 10/24/17.
 */

import java.util.Random;

public class HeroesGame {

    abstract static class Character {
        int hp;
        String characterType;
        int[] power;

        abstract void kick(Character character);

        public boolean isAlive() {
            return this.hp > 0;

        }

        public static int randomNumber(int min, int max) {
            Random random = new Random(10);
            int randomNumber = random.ints(min, max).findFirst().getAsInt();
            return randomNumber;
        }

    }

    public static class Hobit extends Character {
        public  Hobit(){
            this.characterType = "Hobit";
            this.hp = 10;
            this.power = new int[] {0, 0};
        }


        public void toCry(){
            System.out.println("Hobbit is crying");
        };

        public void kick(Character character){
            toCry();
        };
    }

    public static class King extends Character {
        public  King(){
            this.characterType = "King";
            this.hp = randomNumber(5, 15);
            this.power = new int[] {5, 15};
        }


        public void kick(Character character) {
            System.out.println(this.characterType + " kicks " + character.characterType);
            int powerOfKick = randomNumber(this.power[0], this.power[1]);
            character.hp -= powerOfKick;
        }
    }

    public static class Knight extends Character{
        public Knight() {
            this.characterType = "Knight";
            this.hp = randomNumber(2, 12);
            this.power = new int[] {2, 12};
        }


        public void kick(Character character) {
            System.out.println(this.characterType + " kicks " + character.characterType);
            int powerOfKick = randomNumber(this.power[0], this.power[1]);
            character.hp -= powerOfKick;
        }
    }

    public static class Elf extends Character {
        public  Elf() {
            this.characterType = "Elf";
            this.hp = 10;
            this.power = new int[] {0, 10};
        }


        public void kick(Character character) {
            System.out.println(this.characterType + " kicks " + character.characterType);
            if (character.power[1] < this.power[1]) {
                character.hp = 0;
            } else {
                character.power[1]--;
            }
        }
    }

    public   Character characterFactory() {
        Character[] characters = new Character[4];
        characters[0] = new Elf();
        characters[1] = new Hobit();
        characters[2] = new King();
        characters[3] = new Knight();
        Random rand = new Random(10);
        int randIndex = rand.nextInt(characters.length);
        return characters[randIndex];

    }

    public static class GameManager {

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

    public static void main(String[] args) {
        HeroesGame heroesGame = new HeroesGame();
        Character characterOne = heroesGame.characterFactory();
        Character characterTwo = heroesGame.characterFactory();
        System.out.println("Fight!");
        GameManager.fight(characterOne, characterTwo);

    }
}
