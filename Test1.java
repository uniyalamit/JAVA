class Test1{
 int a  = 42;
   
	public static void main(String[] args) {
	   Test1 t1 = new Test1();
	   t1.show();
	}
	public void show(){
		int a = 56;
	 System.out.println("a =" + a + "b =" + this.a);
	}
	
}