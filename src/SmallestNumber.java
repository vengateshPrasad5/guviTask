import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] arg){
//        input 3 variables after one by one
        Scanner obj = new Scanner(System.in);
        System.out.println("enter val 1 : ");
        int a = obj.nextInt();
        System.out.println("enter val 2 : ");
        int b = obj.nextInt();
        System.out.println("enter val 3 : ");
        int c = obj.nextInt();

        int result = smallestNumber(a,b,c);
        System.out.println("Smallest Number is : "+ result);
    }
//    find smallest number function
    private static int smallestNumber(int a, int b, int c){
        if (a<b && a<c){
            return a;
        } else if (b<c && b<a){
            return b;
        } else {
            return c;
        }
    }
}
