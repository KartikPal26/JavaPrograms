import java.util.Scanner;
public class FriendlyPair
{
    public static void main (String[]args)
    {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum1 = getDivisorsSum (num1);
        int sum2 = getDivisorsSum (num2);

        if (sum1 / num1 == sum2 / num2)
            System.out.println (num1 + " & " + num2 + " are friendly pairs");
        else
            System.out.println (num1 + " & " + num2 + " are not friendly pairs");
    }

    static int getDivisorsSum (int n)
    {

        int sum = 0;

        for(int i = 1; i < Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {

                if(i == 1)
                    sum = sum + i;
                else if(i == n/i)
                    sum = sum + i;
                else
                    sum = sum + i + n/i;
            }
            System.out.println(sum);
        }
        return sum;
    }
}