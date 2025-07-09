import java.io.*;
import java.util.*;

class Slip22b{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println("1. create a file \n2. rename a file \n3. delete a file \n4. display file path");
        System.out.println("enter a file name: ");

        String str = sc.nextLine();
        File file = new File(str);

        System.out.print("choose your option: ");
        int ch = sc.nextInt();
        sc.nextLine();

        switch(ch){
            case 1:
                if(file.createNewFile()){
                    System.out.println("file created: " +file.getName());
                }
                else{
                    System.out.println("file already exists");
                }
                break;
            case 2:
                System.out.print("enter new file name: ");
                String nf = sc.nextLine();
                File nf1 = new File(nf);

                if(file.renameTo(nf1)){
                    System.out.println("file renamed");
                }
                else{
                    System.out.println("file can't be renamed");
                }
                break;
            case 3:
                if(file.delete()){
                    System.out.println("delete the file: " +file.getName());
                }
                else{
                    System.out.println("failed to delete the file");
                }
                break;
            case 4:
                System.out.println("file location: " +file.getAbsolutePath());
                break;
            default:
                System.out.println("please choose the correct option");
                break;
        }
    }
}