import java.util.Scanner;
class CountDigit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to count the digits ");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		do
		{
			num=num/10;
			count++;
		}
		while(num!=0);
		System.out.println("The number of digits in "+temp+" is "+count);	
	}
}