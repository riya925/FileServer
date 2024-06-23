public class AddDyn
{
public static void main(String []s)
{
int sum=0,a,i;
for(i=0;i<s.length;i++)
{
a=Integer.parseInt(s[i]);
sum+=a;
}

System.out.println("\n\n"+sum);
}
}