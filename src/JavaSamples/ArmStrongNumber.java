package JavaSamples;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) 
	{
        int n, count = 0, a, rem, temp, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = s.nextInt();
        a = n;
        temp = n;
        while(a > 0)
        {
            a = a / 10;
            count++;
        }
        while(n > 0)
        {
            rem = n % 10;
            sum = (int) (sum+Math.pow(rem, count));
            n = n / 10;
        }
        if(sum == temp)
        {
            System.out.println(temp+ " is an Armstrong number");
        }
        else
        {
            System.out.println(temp+ " is not an Armstrong number");
        }    
    
		

	}

}
