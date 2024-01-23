import java.util.Scanner;

public class BellowedPattern {
    public static void main(String[] args){
        //Get number for pattern
        System.out.println("Enter Number : ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        for (int i = num; i >= 1; i--) {     // outer loop handles the row
            for (int j = num; j >= 1; j--) { // inner loop handles the column
                if (j > i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
