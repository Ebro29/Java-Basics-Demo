import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterTest {
    /**

     * @author Ebrahim Shahid

     */


    public static void main( String args[] )
    {
            try {
                ArrayList<Character> shapeList = new ArrayList<Character>();
                Scanner reader = new Scanner(System.in);
                System.out.println("Please enter the stats of your character: Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma: (e.g. 70 70 80 90 90 50");
                int a = reader.nextInt();
                int b = reader.nextInt();
                int c = reader.nextInt();
                int d = reader.nextInt();
                int e = reader.nextInt();
                int f = reader.nextInt();
                Character C = new Character(a, b, c, d, e, f);
                System.out.println(C.getStatsTotal());
            }
            catch (InputMismatchException inputMismatchException) {
                System.err.println("Input error, please enter 6 numbers with spaces in between");
            }

    }

}
