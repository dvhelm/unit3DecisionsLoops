import java.util.Scanner;
public class Substring
{
    public static void substring()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = s.next();
        int wLength = word.length();
        
        int counter  = 0;
        
        for (int i = 1;
            i<=wLength;
            i++)
            {
                for (int pos = 0;
                    pos<=wLength-i;
                    pos++)
                    {
                        System.out.println(word.substring(pos,pos+i));
                        
                    }
                    
            }
    }
}
