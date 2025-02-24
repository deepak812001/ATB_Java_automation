package ex_10_for_loop;

public class fizz_buzz {
    public static void main(String args[]){
        // create a fizz bzzWrite a program that prints numbers from 1 to 100.
        //    However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
        //    For numbers that are multiples of both 3 and 5, print "FizzBuzz." *\
        //
        //  \\ step 1- find the input and output
        //  \\ input ->data type  -> integer and output ->data type -> string


        //Scanner sc = new.Scanner(System.in);
       // System.out.println("enter the number");
       // int number=sc.nextInt();

        for(int i=1; i<100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBUZZ");

            } else if (i%3==0) {
                System.out.println("FIZZ");

            } else if (i%5==0){
                System.out.println("bUZZ");
            }
            else{
                System.out.println(i);
            }
        }



    }
}
