import java.util.Scanner;

public class CalculatePayable {
    public  static void main (String[] args){
        System.out.println("Enter amount : ");
        Scanner obj = new Scanner(System.in);
        float amount = obj.nextFloat();

        float finalAmount = afterDiscount(amount);

        System.out.println("Amount after discount : "+ String.format("%.2f",finalAmount) ); // restrict the decimal value to 2
    }
//    function for checking and apply discount
    private static float afterDiscount(float a){
        if (a < 500){
            return a; // no discount
        } else if( 500 <= a && 1000 >= a){
            return (float) (a * 0.9); // 10% discount
        } else {
            return (float) (a * 0.8); // 20& discount
        }
    }
}
