package com.training.mock;

//public  class  AirthmaticException (Message message) {
//    super(message);
//}
public class object1 {
    public static void main(String[] args) {
        String name = "hello";
        String name2 = new String("hello");
        String name3 = new String("hello");
        String name4 = "holle";
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());
        System.out.println(name4.hashCode());
        System.out.println(name == name2);
        System.out.println(name2 == name3);
        System.out.println(name == name4);
        System.out.println(name.equals(name2));
        System.out.println(name2.equals(name3));


        try{
            throw new ArithmeticException();
//            System.out.println("try");
        }
        catch(ArithmeticException ex){
            System.out.println("Airthmetic exception");
        }
        catch(Exception ex){
            System.out.println("excption");
        }
    }

}
