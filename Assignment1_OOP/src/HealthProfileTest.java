import java.util.Scanner;

public class HealthProfileTest {

    /**

     * @author Ebrahim Shahid

     */

    public static void main(String[] args) {

// TODO Auto-generated method stub

        HealthProfile profile=new HealthProfile(null, null, 0, 0, 0, 0, 0, null);

        @SuppressWarnings("resource")

        Scanner input=new Scanner(System.in);

        //Prompt for input of first name, last name, and DOB
        System.out.print("Enter Your First and Last name with spaces : ");
        String fn=input.next();
        profile.setFirstname(fn);
        String ln=input.next();
        profile.setSecondname(ln);
        System.out.print("Enter Date of Birth with Spaces eg 12 01 1988 : ");

        int day=input.nextInt();
        int month=input.nextInt();
        int year=input.nextInt();
        profile.setDOB(day,month,year);
        //prompt for height and weight
        System.out.print("Enter Height (Inches only) and Weight (Pounds) with Spaces : ");

        int height=input.nextInt();
        profile.setHeight(height);
        int weight=input.nextInt();
        profile.setWeight(weight);

        //Prompt for Gender
        System.out.print("Specify Gender: Male or Female : ");
        String gen=input.next();
        profile.setGender(gen);

        //Output of health profile based on input given
        System.out.println("\nHealth Profile");
        System.out.println("\n----------------");
        System.out.printf("\n%s %s %s","Patient Name ",profile.getFirstname(),profile.getSecondname());
        System.out.printf("\n%s %s","DOB : ",profile.getDOB());
        System.out.printf("\n%s %s","Gender : ",profile.getGender());
        System.out.printf("\n%s %s","Age : ",profile.age()+" years");
        System.out.printf("\n%s %.2f ","BMI : ",profile.BMI());
        System.out.printf("\n%s %.2f","MaxHeartRate : ",profile.MaxHeartRate());
        System.out.printf("\n%s %.2f","TargetHeartRate : ",profile.TargetHeartRate());

    }

}