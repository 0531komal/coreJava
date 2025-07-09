import java.util.*;
import java.io.*;

class Slip26a{
    public static void main(String[] agrs) throws IOException{
        char ch;
        FileReader fr = new FileReader("old.txt");
        int c;
        while((c = fr.read()) != -1){
            ch = (char)c;
            if(Character.isDigit(ch) == false && (Character.isSpaceChar(c) == false)){
                System.out.println("ASCII " +ch+ ":" +c);
            }
        }
        fr.close();
    }
}