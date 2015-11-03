import java.util.Scanner;
public class Diamond
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the side legth for the diamond");
        double sideLength = scan.nextDouble();
        for( double row = 0;
        row < sideLength;
        row++)
        {
            for( double spaces = 0;
            spaces < sideLength-row-1;
            spaces++)
            {
                System.out.print(" ");
            }
            for (double stars=0;
            stars<row*2+1;
            stars++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for( double row =sideLength-2;
        row>=0;
        row--)
        {
            for(double spaces = 0;
            spaces<sideLength-row-1;
            spaces++)
            {
                System.out.print(" ");
            }
            for (double stars = 0;
            stars < row*2+1;
            stars++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}