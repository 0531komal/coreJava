public class Slip4a{
    public static void main(String[] args){
        String str = "hello world";
        for(int i = 0; i < str.length(); i += 2){
            System.out.println(str.charAt(i));
        }
    }
}