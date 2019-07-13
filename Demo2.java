class Demo
{
	int x,y;
	public static void main(String t[])
	{
	Demo d=new Demo();
	d.setA(10,20);
	System.out.println(this);
	System.out.println(d.getA());
	}
	public void setA(int a,int b)
	{
this.x=a;
this.
y=b;

	}
	int getA()
	{
		return  x+y;
	}
}