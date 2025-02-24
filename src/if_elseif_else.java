import java.util.Scanner;

public class if_elseif_else {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary of Deepak");
        int firstsalary = sc.nextInt();
        System.out.println("enter the salary of rohit");
        int secondsalary = sc.nextInt();

        if (firstsalary>secondsalary){
            System.out.println("dEEPAK SAALARY MORE THAN ROHIT");
        }else if (secondsalary>firstsalary){
            System.out.println("rohit salary more than deepak");
        }else{
            System.out.println("both salary are equal");
        }
sc.close();

    }
}
