import java.util.*;

public class array
{
	public static void main(String[] args)
	{
		int n,i;
		int s=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("\n ENTER THE SIZE OF ARRAY : ");
		n=scan.nextInt();
		
		int a[]=new int[n];
		for(i=0;i<a.length;i++)
		{
			System.out.print("\n ENTER THE ELEMENTS OF ARRAY : ");
			a[i]=scan.nextInt();	
		}	
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		/*for(int x:a)
		{
			System.out.println(x);
		}*/
		for(i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		System.out.println(" SUM IS : "+s);
		int m1=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]<m1)
			{
				m1=a[i];
			}
		}
		System.out.println(" MINIMUM NO IS : "+m1);
		int m2=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>m2)
			{
				m2=a[i];
			}
		}
		System.out.println(" MAXIMUM NO IS : "+m2);
	}
}
		