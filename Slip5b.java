import java.io.*;

class Slip5b{
    public static void main(String[] args){
        for(int i=0; i<args.length; i++){
            File file = new File(args[i]);
            if(file.isFile()){
                String name = file.getName();
                if(name.endsWith(".txt")){
                    file.delete();
                    System.out.println("file is deleted successfully!" +file);
                }
                else{
                    System.out.println("file name: " +name + "\nfile location: " +file.getAbsolutePath() + "\nfile size: " +file.length() +"bytes");
                }
            }
            else{
                System.out.println(args[i] + "is not a file");
            }
        }
    }
}