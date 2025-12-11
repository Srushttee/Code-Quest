import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList<>();
        //System.out.println("Enter the elements in the array :");
         arraylist.add(10);
         arraylist.add(11);
         arraylist.add(12);

         arraylist.remove(2);

         arraylist.set(1, 12);
         arraylist.get(1);

        System.out.println(arraylist.get(0));
    }
    
}
