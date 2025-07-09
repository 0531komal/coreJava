import java.io.*;
import java.util.*;

class Slip21a{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("old.txt");
        FileWriter fw = new FileWriter("new2.txt");

        try{
            Scanner sc = new Scanner(fr);
            
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                StringBuffer buffer = new StringBuffer(s);
                buffer = buffer.reverse();
                String res = buffer.toString();
                fw.write(res);
            }
        }
        catch(Exception e){}
        fr.close();
        fw.close();
    }
}