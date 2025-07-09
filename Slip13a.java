import java.util.*;

class Slip13a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements: ");

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter the elements of array list collection: ");
        for(int i = 0; i<n; i++){
            int ele = sc.nextInt();
            list.add(ele);
        }

        System.out.println("original array list: " +list);
        Collections.reverse(list);
        System.out.println("reversed array list: " +list);

    }
}