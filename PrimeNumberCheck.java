import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args)
    {
        int num, i, count=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = scanner.nextInt();


        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }

        if(count==0)
            System.out.println("\nIt is a Prime Number.");
        else
            System.out.println("\nIt is not a Prime Number.");
    }
}
