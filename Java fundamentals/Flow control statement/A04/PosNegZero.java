import java.util.Scanner;
public class PosNegZero
{
    public static void main(String[] args)
    {
        int n;
        
        Scanner s = new Scanner(System.in);
         
        System.out.print("Enter any integer number: ");
        n = s.nextInt();
         
        
        if(n>0)
{
            System.out.println(n + " is POSITIVE NUMBER.");
 }
       else if(n<0)
{
            System.out.println(n + " is NEGATIVE NUMBER.");
}
        else
{
            System.out.println("IT's ZERO.");
         }         
    }
}