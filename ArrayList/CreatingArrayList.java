import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class CreatingArrayList {
    public static void main(String[] args) {

        //Creating a list

        List <Integer> list=new ArrayList<>();

        // System.out.println("Enter the number of elements in the arraylist :");
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        //Adding elements to arraylist using for loop
        for(int i= 0;i<size;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);

        //Adding elements individually

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list);

        //Adding at a specific index

        list.add(1, 4);
        System.out.println(list);

        //Using the set method
        list.set(0, 3);
        System.out.println(list);

        //using the get method

        System.out.println(list.get(1));

        //Using the remove method

        list.remove(0);
        System.out.println(list);

        //size() method

        System.out.println(list.size());

        //Checking whether the list is empty

        System.out.println(list.isEmpty());

        //Traversing the list using for loop

        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //Traversing using enhanced for loop

        for(int num : list)
        {
            System.out.println(num);
        }

        //traversing using iterator

        Iterator <Integer> i= list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }


    }

    
}
