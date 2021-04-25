import java.util.Scanner;

public class TimeTest {
    /**

     * @author Ebrahim Shahid

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h, m, s;
        System.out.print("Enter number of hours: ");
        h = in.nextInt();
        System.out.print("Enter number of minutes: ");
        m = in.nextInt();
        System.out.print("Enter number of seconds: ");
        s = in.nextInt();
        //This if statement ensures that the time only contains valid numbers and is 24 hour clock
        if(h < 0 || m < 0 || s < 0 || h > 23 || m > 59 || s > 59) {
            System.out.println("Invalid input. please Try again!");
        } else {
            Time t = new Time(h, m, s);
            t.displayTime();
        }
    }

}