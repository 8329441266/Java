import java.util.*;

public class ArraySum {
	public static void main(String[] args) {
		int sum=0;
		int arr[]=new int[8];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 3 array elements");
		for(int i=0;i<8;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<8;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("sum of the 8 array elemts is:"+sum);
	}

}
