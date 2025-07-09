import java.io.*;
import java.util.Scanner;

class invalid_data extends Exception{

}

class Slip9b{
    static int n;

    public static void main(String[] args){
        Scanner d = new Scanner(System.in);

        try{
            System.out.print("1. mobile number:  \n2. pan card number: \nchoose the number: ");
            n = d.nextInt();
            d.nextLine();
            switch(n){
                case 1: 
                System.out.print("enter mobile number: ");
                Long number = d.nextLong();
                if(number.toString().matches("(0/91)?[7-9][0-9]{9}")){
                    System.out.print("your entered mobile number is: " +number+ "\n");
                }
                else{
                    throw new invalid_data();
                }
                break;

                case 2: 
                System.out.print("enter pan card number: ");
                String str = d.nextLine();
                if(str.matches("[A-Z{5}[0-9]{4}[A-Z]{1}")){
                    System.out.println("your entered pan card number is: " +str+ "\n");
                }
                else{
                    throw new invalid_data();
                }
                break;

                default:
                    throw new invalid_data();
            }
        }
        catch(NumberFormatException e){
            System.out.println("invalid data");
        }
        catch(invalid_data pc){
            System.out.println("invalid data");
        }
        catch(Exception e)
        {}
    }
}