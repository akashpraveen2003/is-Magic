package is_Magic;

import java.util.Scanner;

/*
	  Given a number A, check if it is a magic number or not.
	
	A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. 
	If the single digit comes out to be 1, then the number is a magic number.
	

	Input 1:
	
	A = 83557
	
	Input 2:
	
	A = 1291
	
	
	Output 1:
	1
	
	Output 2:
	0
	
 */
public class Is_Magic {
	
	private static int is_magic(int n,int sum) {
		// TODO Auto-generated method stub
		
		if(sum<=9 && n==0)			// if the final sum becomes one digit
		{
			if(sum==1)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		if(n>0)						// while n>0 , find the sum of the number
		{
		sum+=n%10;
		}
		else						// if n==0, then we assign the current sum to n
		{		
			n=sum;
			sum=n%10;
		}
		return is_magic(n/10,sum);	
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(is_magic(n,0));
	}
}

/*
	Efficient way for calculating this is by o(1) space and time complexity
	
	Check if the number is divisible by 9 and gives 1 as remainder or not
	
	Cause 1 and 10 gives "1" remainder when divided by 9
	

*/
		

