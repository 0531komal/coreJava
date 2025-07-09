public class Slip3a{
    public static void main(String[] args){
        int num = 370;
        int temp = num;
        int rem, sum = 0;

        while(num > 0){
            rem = num % 10;
            num = num / 10;
            sum = sum + rem*rem*rem;
        }

        if(temp == sum)
            System.out.println("it is an armstrong number");
        else
            System.out.println("it is not an armstrong number");
    }
}