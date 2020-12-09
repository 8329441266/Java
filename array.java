import java.util.*;

public class Basic {
	public static void main(String[] args) {
		int arr[]=new int[10];
		System.out.println("enter the array elements");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		
	}

}
