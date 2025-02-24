import java.util.Scanner;

public class even_or_oddnumber {
    public static void main(String[] args){

        // Create a Program- Take user input
        // Check whether the input is even or odd number

        // Step 1 -  Figure out inputs and output
        // input -  number(int)->  scanner class can be used to take input
        // output -  String -> odd or even println can be used
          Scanner sc = new Scanner (System.in);
          System.out.println("enter a number ");
          int num = sc.nextInt();

        // Step2 - logic Rough
        // num%2 == 0 -> even num - modulus - reminder ==0
        // num%2  !==0 -> odd

        // Step 3 -  logic write
        if (num % 2 == 0) {
        System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();    //Stop taking input now
        //Step 4 - edge cases
        // larger number, other output then integer,- ve handling, decimal number
    }
}
