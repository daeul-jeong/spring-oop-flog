package singleton.scrabble;

import java.util.LinkedList;

public class ScrabbleTest {

    /**
     * Scrabble 단어 리스트를 싱글톤으로 만든다.
     * 첫번째 유저에게 7개 단어를 나누어준다.
     *
     * 단어 리스트를 한번 더 만든다. ( hashCode 같음)
     *
     * 두번째 유저에게 7개 단어 나눠준다.
     * 단어 리스트를 유일한 싱글톤이기때문에 같은 단어 리스트에서 뽑아주는 것.
     */
    public static void main(String[] args){

        // How you create a new instance of Singleton

        Singleton newInstance = Singleton.getInstance();

        // Get unique id for instance object

        System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));

        // Get all of the letters stored in the List

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);

        System.out.println("Player 1: " + playerOneTiles);

        System.out.println(newInstance.getLetterList());

        // Try to make another instance of Singleton
        // This doesn't work because the constructor is private

        // Singleton instanceTwo = new Singleton();

        // Try getting a new instance using getInstance

        Singleton instanceTwo = Singleton.getInstance();

        // Get unique id for the new instance object

        System.out.println("2nd Instance ID: " + System.identityHashCode(instanceTwo));

        // This returns the value of the first instance created

        System.out.println(instanceTwo.getLetterList());

        // Player 2 draws 7 tiles

        LinkedList<String> playerTwoTiles = newInstance.getTiles(7);

        System.out.println("Player 2: " + playerTwoTiles);

        System.out.println(instanceTwo.getLetterList());

    }

}
