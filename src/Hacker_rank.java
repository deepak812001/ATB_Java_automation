import java.util.Scanner;

public class Hacker_rank {
    public static void main(String[] args) {

     //Write a program that calculates and displays the letter grade for a given numerical score
        // (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

      // step-1 Find the inputs / outputs
      // Input | score-> (0-100) | data type-> integer
      // output| grade -> datatype-> char
        Scanner sc = new Scanner(System.in);

      System.out.println("enter the score");
      int score = sc.nextInt();
      //char grade ='; // default value of a local variable is a good practice
       char grade ;
        if (score>=90&& score <=100){
          grade = 'A';
      } else if (score>=80&& score <=89) {
          grade = 'B';
      }
       else if (score>=70&& score <=79) {
              grade = 'C';
       }

      else if (score>=33&& score <=69) {
          grade = 'D';
      }
      else if (score>100 || score <=0) {
          grade ='O';
          System.out.println("Lol , you are god level!");
      }
          else {
              grade = 'F';


      }
          System.out.println("your grade is "+ grade);
        // step 2 basic logic
        // if (score >=90 && score<=100 -> return or print grade -A
        // else if (score <=89&& score >= 80 -> return or print grade - B
        // else if (score <=79&& score >= 70 -> return or print grade - C
       //else if (score <=69&& score >= 50 -> return or print grade - D
       // else -> grade->F


    }


   // edge cases

}
