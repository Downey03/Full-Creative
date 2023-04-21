import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int myAge = sc.nextInt();
        try{
            if(checkAge(myAge)){
                System.out.println("Welcome");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkAge(int myAge) throws AgeRestrictedException {
        if(myAge < 18) throw new AgeRestrictedException("Sorry! you are under-aged");
        return true;
    }


}
