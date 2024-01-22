import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
//        Enter input value

        System.out.println("Enter Input: ");
        Scanner obj  = new Scanner(System.in);
        int userInput = obj.nextInt();

//        find the given number positive or negative

        if(userInput %2 == 0){
            System.out.println("Entered value " + userInput + " is even");
        } else {
            System.out.println("Entered value " + userInput + " is odd");
        }
    }
}
