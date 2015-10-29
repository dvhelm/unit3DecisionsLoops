import java.util.Scanner;
public class RewritingLoops
{
//     public static void forToWhile()
//     {
//         int s = 0
//         int i = 1
//         while (i<=10)
//         {
//             s=s+i
//             i++
//         }
//     }
    public static void doToWhile()
    {
        System.out.print("Enter an integer: " );
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = 0;
        double s = 1;
        n++;
        while (s > 0.01)
        {
            s = 1.0/(1+n*n);
            System.out.println(s);
            x = x+s;
            n++;
        }
        
    }
}