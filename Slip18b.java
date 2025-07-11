import java.io.*;

class Slip18b{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("old.txt");
        FileWriter fw = new FileWriter("new.txt");

        int c;

        while((c = fr.read()) != -1){
            if(Character.isDigit(c) == false){
                if(Character.isUpperCase(c)){
                    fw.write(Character.toLowerCase(c));
                } 
                else if(Character.isLowerCase(c)){
                    fw.write(Character.toUpperCase(c));
                }
            } 
            else{
                fw.write("*");
            }
        }
        fr.close();
        fw.close();
    }
}
