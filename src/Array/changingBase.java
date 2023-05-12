package Array;

import java.util.*;
public class changingBase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to change : ");
        int number = sc.nextInt();

        System.out.println("Enter the base of given number");
        int nbase = sc.nextInt();

        System.out.println("Enter the base to  change the number");
        int base = sc.nextInt();

        if(nbase == 10)
        {
            int answer = changeBasetoany(number, base);
            System.out.print(answer);
        }

        else if (nbase != 10)
        {
            int changeResult = changeBaseto10(number, nbase);
            int answer = changeBasetoany(changeResult, base);
            System.out.print(answer);
        }
        sc.close();
    }

    public static int changeBaseto10(int num, int base)
    {
        int ans = 0;
        int multiplier = 1;
        int reminder ;
        while(num != 0)
        {
            reminder = num % 10;
            ans = ans + (reminder*multiplier);
            multiplier = base * multiplier;
            num = num/10;
        }
        return ans;
    }

    public static int changeBasetoany(int num, int base)
    {
        int ans = 0;
        int multiplier = 1;
        int reminder ;
        while(num != 0)
        {
            reminder = num % base;
            ans = ans + (reminder*multiplier);
            multiplier = 10 * multiplier;
            num = num/base;
        }
        return ans;
    }
}
