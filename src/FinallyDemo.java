import java.util.Scanner;

public class finallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numerator and denominator :");
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        try {
            int result = numerator/denominator;
            System.out.println("result = "+result);
        } catch (Exception e) {
            System.out.println("error :"+e.getMessage());
        } finally{
            System.out.println("finally block executed");
        }
    }
}
