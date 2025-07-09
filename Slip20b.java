import java.util.*;

public class Slip20b{
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("CPP");
        ll.add("JAVA");
        ll.add("Python");
        ll.add("PHP");

        System.out.println("display content using iterator: ");
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("display content using list iterator: ");
        ListIterator<String> lit = ll.listIterator();
        while(lit.hasNext()){
            lit.next();
        }

        while(lit.hasPrevious()){
            System.out.println(" " +lit.previous());
        }
    }
}