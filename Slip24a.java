import java.io.*;

class Slip24a{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("old.txt");
        FileWriter fw = new FileWriter("out.txt");

        int c, letter = 0, spaces = 0, num = 0, other = 0;
        while((c = fr.read())!= -1){
            if(Character.isDigit(c)){
                num++;
            }
            else if(Character.isLetter(c)){
                letter++;
            }
            else if(Character.isSpaceChar(c)){
                spaces++;
            }
            else{
                other++;
            }
        }

        fw.write("number: " +num+ "\nletter: " +letter+ "\nspaces: " +spaces+ "\nspecial characters: " +other);

        fr.close();
        fw.close();
    }
}