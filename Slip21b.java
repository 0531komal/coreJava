import java.io.*;
import java.util.*;

public class Slip21b{
    public static void main(String[] args){
        Hashtable<String, Integer> hash1 = new Hashtable<>();
        Enumeration<String> en;
        int i, n, std, val; 
        String nm, cname, str;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter no. of records: ");
            n = sc.nextInt();
            System.out.println("enter city name & std code: ");
            for(i = 0; i<n; i++){
                cname = sc.next();
                std = sc.nextInt();
                hash1.put(cname, std);
            }
            System.out.println("enter city name to search: ");
            nm = sc.next();

            en = hash1.keys();
            while(en.hasMoreElements()){
                str = en.nextElement();
                val = hash1.get(str);
                if(str.equals(nm)){
                    System.out.println("std code: " +val);
                }
            }

        }
        catch(Exception e){}
    }
}