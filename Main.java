import java.util.*;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String nm = "";
        
        System.out.println("Hey,whats your name?");
        nm = sc.nextLine();
        
        if(nm.equals("Bob"))
        {
            System.out.println("Yo Bobby! My Man! Wassup?!");
        }
        else if(nm.equals("Alice"))
        {
            System.out.println("Hey Alice! How's Wonderland girl?!");
        }
        else
        {
             System.out.println("Bye Felicia!");
        }
    }
}
