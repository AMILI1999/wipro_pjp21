import java.util.Scanner;
public class Values 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        long x = sc.nextLong();   
        long y = sc.nextLong();               
        long num = 0;            
        long count = 0;                                   
        for (num = x; x <= num && num <= y; num++) {                                                    
            if (num % 2 == 0 | num % 3 == 0 | num % 5 == 0) {
                count = count + 1;                                        
            }               
        }
        System.out.println(count);        
    }
}