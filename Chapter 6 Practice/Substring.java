import java.util.Scanner;
public class Substring
{
    public static void substring()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = s.next();
        int wLength = word.length();
        
        int counter  = 1;
        
        for (int i  = 0;
        i < wLength;
        i++)
        {
            System.out.println(word.substring(i,wLength-counter));
        }
    }
}
