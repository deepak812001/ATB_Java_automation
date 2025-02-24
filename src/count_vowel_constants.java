import java.util.Scanner;

public class count_vowel_constants {
    public static void main(String args[]) {

        //write a program to Count vowels and consonants in a String
        // step 1 find input and output
        // input-entered by user ->datatype- String and output- vowels and constatnts.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String str1 = sc.next();
        System.out.println("the given name is " + str1);

        //convert into lower case to handle edge case

        String str = str1.toLowerCase();

        //step2. logic
        int vowelscount = 0;
        int consonantscount = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelscount++;
            } else {
                consonantscount++;
            }




        }
        System.out.println("in the given name total vowels are"+ vowelscount);
        System.out.println("in the given name total consonant are "+ consonantscount);












    }
}
