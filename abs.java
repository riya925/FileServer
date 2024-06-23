abstract class shape
{
	abstract void area();
}
abstract class circle extends shape
{
	float rad,area;
	circle(float rad)
	{
		this.rad=rad;
	}
	void area()
	{
		area=(float)((3.14)*rad*rad);
		System.out.println("\n Area : "+area);
	}
	abstract void volume();
}
class cylinder extends circle
{
	float h,v;
	cylinder(float r,float h)
	{
		super(r);
		this.h=h;
	}
	void volume()
	{
		area();
		v=(float)(((3.14)*rad*rad*h)/3);
		System.out.println("\n Volume : "+v);
	}
}
abstract class polygon extends shape
{
	abstract void noofsides();
}
abstract class rect extends polygon
{
	abstract void volume();
}
class rect3d extends rect
{
	int l,b,h,vo,a;
	rect3d(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	void noofsides()
	{
		System.out.println(" 4 sides ");
	}
	void area()
	{
		a=l*b;
		System.out.println("\n Area : "+a);
	}
	void volume()
	{
		vo=l*b*h;
		System.out.println("\n Volume : "+vo);
	}
}
class triangle extends polygon
{
	int len,base,ar;
	triangle(int l,int b)
	{
		len=l;
		base=b;
	}
	void noofsides()
	{
		System.out.println(" 3 sides ");
	}
	void area()
	{
		ar=(len*base)/2;
		System.out.println("\n Area : "+ar);
	}
}
public class abs
{
	public static void main(String[] st)
	{
		shape s;
		circle c;
		polygon p;
		cylinder cy=new cylinder(5f,10f);
		cy.volume();
	
		rect r;
		rect3d re=new rect3d(10,20,30);
		re.area();
		re.volume();
		re.noofsides();
		
		triangle t=new triangle(2,4);
		t.area();
		t.noofsides();
	}
}