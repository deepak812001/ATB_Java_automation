package ex_user_defined_function;

public class user_defined_one {
    public static void main(String[] args) {
      //greet();
       String s=funstr();
       System.out.println(s);
    }
    // 1. without Parameteres and with out return type
    static void greet(){
        System.out.println("this is function greet");
    }
    //2. without parameters but with return type.
    static String funstr(){
        return" hi, How are you function 2";
    }
}

