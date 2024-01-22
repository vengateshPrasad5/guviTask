public class GenerateNumber {
    public static void main(String[] args){

//      generate 10 to 50 using for loop

        for(int i=10 ; i <= 50 ; i+= 5) {
            System.out.println("using for loop " + i);
        }

//    generate 10 to 50 using while loop

     int j = 10;

     while(j <= 50) {
        System.out.println("using while loop "+ j);
        j += 5;
    }
}
}
