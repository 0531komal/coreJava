import java.io.*;

class Slip8b{
    public static void main(String[] args){
        File file = new File("C:\\Users\\DELL\\Documents\\java");
        File [] fl = file.listFiles((d, f)-> f.toLowerCase().endsWith(".txt"));
        
        for(File f: fl){
            System.out.println(f.getName());
        }
    }
}