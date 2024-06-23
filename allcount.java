public class allcount
{
	public static void main(String[] st)
	{
		int up=0,l=0,s=0,dig=0,sc=0;
		String s1=st[0];
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);	
			if(ch>=65 && ch<=90)
				up++;
			else if(ch>=97 && ch<=122)
				l++;
			else if(ch==32)
				s++;
			else if(ch>=48 && ch<=57)
				dig++;
			else
				sc++;
		}
		System.out.println("\n Upper case is : "+up);
		System.out.println("\n Lower case is : "+l);
		System.out.println("\n Space is : "+s);
		System.out.println("\n Digits is : "+dig);
		System.out.println("\n Special character is : "+sc);
	}
}
		