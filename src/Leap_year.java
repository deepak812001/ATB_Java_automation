import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
              //take  input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year ");
        int Leapyear = sc.nextInt();

        // step 2 logic
        // year is divisble by 4 and is  year is century year it will be divisble by 100 and should be divisble by 400 then it wil
        // be leap year


        if (Leapyear % 400 == 0) {

            System.out.println(Leapyear + "it is a leapyear");
        } else if (Leapyear % 100 == 0) {

            System.out.println(Leapyear + "it is not a leap year");

        } else if (Leapyear % 4 == 0) {

            System.out.println(Leapyear + "it is a leap year");

        } else {

            System.out.println(" it is not leap year");
        }


    }
}
