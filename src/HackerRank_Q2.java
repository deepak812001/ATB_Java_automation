import java.util.Scanner;

public class HackerRank_Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF SIDE 1:");
        double side1 = sc.nextDouble();
        System.out.println("ENTER THE LENGTH OF SIDE 2:");
        double side2 = sc.nextDouble();
        System.out.println("ENTER THE LENGTH OF SIDE 3:");
        double side3 = sc.nextDouble();
        
        if (side1==side2&&side1==side3&&side2==side3){
            System.out.println("triangle is Equilateral");
        } else if (side1 ==side2 || side1==side3 || side2==side3) {
            System.out.println("triangle is isosceles");
        }
        else{
            System.out.println("triangle is scalene");
        }


    }





}
