import java.util.*;

class numIsZero extends Exception{}

class Slip30a{
    public static void main(String[] args){
        int r, sum = 0, temp;
        int n;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("enter number: ");
            n = sc.nextInt();

            if(n == 0){
                throw new numIsZero();
            }
            else{
                temp = n;

                while(n > 0){
                    r = n % 10;
                    sum = (sum * 10) + r;
                    n = n/10;
                }

                if(temp == sum){
                    System.out.println("palindrome number");
                }
                else{
                    System.out.println("not a palindrome number");
                }
            }
        }
        catch(numIsZero niz){
            System.out.println("number is zero");
        }
        catch(NumberFormatException e){
            System.out.println("invalid number");
        }
        catch(Exception e){}
    }
}