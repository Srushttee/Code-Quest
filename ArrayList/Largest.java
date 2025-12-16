import java.util.*;
public class Largest {

    public static void main(String[] args) {
        
        List <Integer> list =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial size of list :");

        int size=sc.nextInt();

        for(int i=0;i<size;i++)
        {
            list.add(sc.nextInt());
        }

        int max = list.get(0);
        for(int num : list)
        {
            if(num>max)
            {
                max=num;
            }
        }

        System.out.println("Largest element : "+max);
    }
    
}
