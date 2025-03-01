import java.util.Scanner;

public class Practicejavacode {

	//program to find odd or even number
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if (number%2==0) {
			System.out.println("The given number " + number + " is even");
			
		}
		else {
			System.out.println("The given number " + number + " is odd number");
		}
		

	}
*/
	
	
	//check number is prime or not
/*	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		
		if(isPrime(number)) {
			System.out.println("number is prime");
			
		}
		else {
			System.out.println("number is not prime");
			
		}
		
		
		
		
	}
		public static boolean isPrime(int number) {
		
			for (int i=2;i<number;i++)
			{
				if(number%i==0) 
				{
					return false;
				}
				
				
			} return true;
			
			
		
			
		
		}
	
		*/
	
	
/*		
//find fibanocci series		
	public static void main(String[] args) {
		int number = 5;
		int a = 0;
		int b = 1;
		int c;
		for(int i=0;i<number;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
	}
*/
	
	//program for Armstrong number
	/*public static void main(String[] args) {
		
		int a=0,b,num,c;
		
		num = 153;
		c = num;
		while(num>0) {
			b=num%10;
			num=num/10;
			a=a+b*b*b;
		}
		if(a==c) {
			System.out.println("Armstriong num");			
		}
		else{
			System.out.println("not sn Armstriong num");
		}
		
				
		
	}
		
*/
	
	
	//program for number of digits in given number
	
	/*	public static void main (String[] args) {
			int num =12345;
			int count=0;
			while(num>0) {
			
				num=num/10;
				count++;
				
			}
			
			System.out.println(count);
		}
*/		
	
//how to find max and minuimum number in array
	
	/*
	public static void main (String[] args) 
	{
		
		int[] array= {4,22,5,33,8,7};
		
		System.out.println(getMaxNum(array));
	}
	public static int getMaxNum(int[] array)
	{
		int maxnum=array[0];
		for(int i=0;i<array.length;i++) 
		{
				
			if (array[i]>maxnum) 
			{
				maxnum=array[i];
			}
				
	}
			return maxnum;
		
	
		

	}
	
	*/
	 
//sorting of element using bubble sort 
	/*
	
	public static void main (String[] args) 
	{
		int[] array1 = {1,8,7,4,5};
		int num=0;
		for(int i=0;i<array1.length-1;i++) {
			
			for(int j=0;j<array1.length-1-i;j++) 
			{
				if(array1[j]>array1[j+1]) {
					num = array1[j];
					array1[j] = array1[j+1];
					array1[j+1]=num;		
							
					
				}
			}
			
		}
		for(int array:array1) 
		{
		System.out.print(array);
		}
		
	}
*/	
//How to find comm elements in two arrays
	
	public static void main (String[] args) {
		
		
		
		
		//commitinfg in git coedr 
		commimit
		
	}
	
}

