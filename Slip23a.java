import java.io.*;
import java.util.*;

public class Slip23a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("enter file name: ");
            String str = sc.nextLine();
            File file = new File(str);

            if(file.isHidden()){
                System.out.println("file is hidden");
            }
            else{
                System.out.println("file location: " +file.getAbsolutePath());
            }
        }
        catch(Exception e){}
    }
}