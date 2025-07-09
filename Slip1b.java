import java.io.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

public class Slip1b{
    public static void main(String[] args){
        FileInputStream instream = null;
        FileOutputStream outstream = null;

        try{
            File infile = new File("C:\\Users\\DELL\\Documents\\java\\old.txt");
            File outfile = new File("C:\\Users\\DELL\\Documents\\java\\output.txt");

            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);

            InputStreamReader isReader = new InputStreamReader(instream);
            BufferedReader reader = new BufferedReader(isReader);
            StringBuffer sb = new StringBuffer();

            String str;
            byte[] buffer = new byte[1024];
            int length;

            while((str = reader.readLine()) != null){
                sb.append(str);
            }

            for(int i=0; i<sb.length(); i++){
                char c = sb.charAt(i);
                if(Character.isDigit(c)){
                    String newfile = String.valueOf(c);
                    byte[] out = newfile.getBytes();
                    System.out.print(newfile);
                    outstream.write(out);
                }
            }
            System.out.print('\n');
        }
        catch(IOException e){
            e.printStackTrace();
        }
            
    }
}